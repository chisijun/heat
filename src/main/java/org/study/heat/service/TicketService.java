/**  
 * @Title: TicketService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月2日
 */
package org.study.heat.service;

import org.study.heat.base.IService;
import org.study.heat.dto.TicketQueryDto;
import org.study.heat.pojo.Ticket;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: TicketService 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月2日
 */
public interface TicketService extends IService<Ticket> {

	/**
	 * @Description: 生成票据
	 * @param @param ticket
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月2日
	 */
	Integer saveTicket(Ticket ticket);

	/**
	 * @Description: TODO
	 * @param @param ticketQueryDto
	 * @param @return   
	 * @return PageInfo  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	PageInfo queryTicketListWithPage(TicketQueryDto ticketQueryDto);
}
