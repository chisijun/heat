/**  
 * @Title: TicketServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.service.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.study.heat.base.BaseService;
import org.study.heat.dao.PaymentMapper;
import org.study.heat.dao.TicketMapper;
import org.study.heat.dto.TicketQueryDto;
import org.study.heat.pojo.Payment;
import org.study.heat.pojo.Ticket;
import org.study.heat.service.TicketService;
import org.study.heat.utils.PublicUtil;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName: TicketServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Slf4j
@Service("ticketService")
@Transactional
public class TicketServiceImpl extends BaseService<Ticket> implements TicketService {

	@Resource
	private TicketMapper ticketDao;
	
	@Resource
	private PaymentMapper paymentDao;
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.TicketService#saveTicket(org.study.heat.pojo.Ticket)
	 */
	@Override
	public Integer saveTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		
		// 校验缴费单是否存在
		Payment payment = paymentDao.selectByPrimaryKey(ticket.getPaymentNo());
		if (PublicUtil.isEmpty(payment)) {
			throw new RuntimeException("缴费单不存在");
		}
		
		// 校验缴费单是否已经入库
		Ticket ticketQuery = new Ticket();
		ticketQuery.setPaymentNo(ticket.getPaymentNo());
		int count = ticketDao.selectCount(ticketQuery);
		if (count > 0) {
			throw new RuntimeException("缴费单已经入库");
		}
		
		BigDecimal taxFee = ticket.getFee().multiply(new BigDecimal(ticket.getTaxRate())).divide(new BigDecimal(100)).setScale(2);
		ticket.setTaxFee(taxFee);
		
		return ticketDao.insertSelective(ticket);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.TicketService#queryTicketListWithPage(org.study.heat.dto.TicketQueryDto)
	 */
	@Override
	public PageInfo queryTicketListWithPage(TicketQueryDto ticketQueryDto) {
		// TODO Auto-generated method stub
		
		PageHelper.startPage(ticketQueryDto.getPageNum(), ticketQueryDto.getPageSize());
		
		List<Ticket> ticketList = ticketDao.queryTicketListWithPage(ticketQueryDto);
		
		return new PageInfo<>(ticketList);
	}

}
