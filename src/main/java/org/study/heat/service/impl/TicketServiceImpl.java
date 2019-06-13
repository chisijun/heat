/**  
 * @Title: TicketServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.study.heat.base.BaseService;
import org.study.heat.dao.TicketMapper;
import org.study.heat.dto.TicketQueryDto;
import org.study.heat.pojo.Ticket;
import org.study.heat.service.TicketService;

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
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.TicketService#saveTicket(org.study.heat.pojo.Ticket)
	 */
	@Override
	public Integer saveTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		
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
