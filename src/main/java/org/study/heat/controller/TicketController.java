/**  
 * @Title: TicketController.java
 * @Package org.study.heat.controller
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
package org.study.heat.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.study.heat.annotation.Authorization;
import org.study.heat.common.JsonResult;
import org.study.heat.dto.PaymentQueryDto;
import org.study.heat.dto.TicketQueryDto;
import org.study.heat.pojo.Ticket;
import org.study.heat.service.PaymentService;
import org.study.heat.service.TicketService;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: TicketController 
 * @Description: 票据管理
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
	@Resource
	private PaymentService paymentService;
	
	@Authorization
	@PostMapping("/save")
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
	@Authorization
	@RequestMapping(value = "/queryListWithPage", method = RequestMethod.POST)
	public JsonResult queryTicketListWithpage(TicketQueryDto ticketQueryDto) {
		
		PageInfo pageInfo = ticketService.queryTicketListWithPage(ticketQueryDto);
		
		return new JsonResult(true, "操作成功", pageInfo);
	}

}
