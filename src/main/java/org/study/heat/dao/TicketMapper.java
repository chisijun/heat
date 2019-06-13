package org.study.heat.dao;

import java.util.List;

import org.study.heat.dto.TicketQueryDto;
import org.study.heat.pojo.Ticket;

import tk.mybatis.mapper.common.Mapper;

public interface TicketMapper extends Mapper<Ticket> {

	/**
	 * @Description: TODO
	 * @param @param ticketQueryDto
	 * @param @return   
	 * @return List<Ticket>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月13日
	 */
	List<Ticket> queryTicketListWithPage(TicketQueryDto ticketQueryDto);
}