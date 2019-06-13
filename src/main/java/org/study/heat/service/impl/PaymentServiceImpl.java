/**  
 * @Title: PaymentServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.study.heat.base.BaseService;
import org.study.heat.dao.PaymentMapper;
import org.study.heat.dao.TicketMapper;
import org.study.heat.dto.PaymentQueryDto;
import org.study.heat.dto.TicketQueryDto;
import org.study.heat.pojo.Payment;
import org.study.heat.pojo.Ticket;
import org.study.heat.service.PaymentService;
import org.study.heat.vo.PaymentVo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName: PaymentServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Service
public class PaymentServiceImpl extends BaseService<Payment> implements PaymentService {

	@Resource
	private PaymentMapper paymentDao;
	
	@Resource
	private TicketMapper ticketDao;
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.PaymentService#savePayment(org.study.heat.pojo.Payment)
	 */
	@Override
	public Integer savePayment(Payment payment) {
		// TODO Auto-generated method stub
		
		
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.PaymentService#queryPaymentListWithPage(org.study.heat.dto.PaymentQueryDto)
	 */
	@Override
	public PageInfo queryPaymentListWithPage(PaymentQueryDto paymentQueryDto) {
		// TODO Auto-generated method stub
		
		PageHelper.startPage(paymentQueryDto.getPageNum(), paymentQueryDto.getPageSize());
		
		List<PaymentVo> paymentVoList = paymentDao.queryPaymentListWithPage(paymentQueryDto);
		
		return new PageInfo<>(paymentVoList);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.PaymentService#queryTicketListWithPage(org.study.heat.dto.TicketQueryDto)
	 */
	@Override
	public PageInfo queryTicketListWithPage(TicketQueryDto ticketQueryDto) {
		// TODO Auto-generated method stub
		PageHelper.startPage(ticketQueryDto.getPageNum(), ticketQueryDto.getPageSize());
		
		List<Ticket> ticketList = ticketDao.queryTicketListWithPage(ticketQueryDto);
		
		return new PageInfo<>(ticketList);
	}

}
