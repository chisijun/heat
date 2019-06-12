/**  
 * @Title: TicketController.java
 * @Package org.study.heat.controller
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
package org.study.heat.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.heat.common.JsonResult;
import org.study.heat.dto.TicketQueryDto;
import org.study.heat.pojo.Ticket;
import org.study.heat.service.TicketService;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: TicketController 
 * @Description: 票据管理
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
@RestController
@RequestMapping("/apply")
public class TicketController {

	@Resource
	private TicketService ticketService;
	
	private JsonResult saveTicket(Ticket ticket) {
		
		Integer result = ticketService.saveTicket(ticket);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * 票据列表
	 */
	private JsonResult queryTicketListWithPage(TicketQueryDto ticketQueryDto) {
		
		PageInfo pageInfo = ticketService.queryTicketListWithPage(ticketQueryDto);
		
		return new JsonResult(true, "操作成功", pageInfo);
	}

}
