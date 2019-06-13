/**  
 * @Title: PaymentService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月2日
 */
package org.study.heat.service;

import org.study.heat.base.IService;
import org.study.heat.dto.PaymentQueryDto;
import org.study.heat.dto.TicketQueryDto;
import org.study.heat.pojo.Payment;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: PaymentService 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月2日
 */
public interface PaymentService extends IService<Payment> {

	/**
	 * @Description: 保存缴费单
	 * @param @param payment
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月2日
	 */
	Integer savePayment(Payment payment);

	/**
	 * @Description: TODO
	 * @param @param paymentQueryDto
	 * @param @return   
	 * @return PageInfo  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	PageInfo queryPaymentListWithPage(PaymentQueryDto paymentQueryDto);

	/**
	 * @Description: TODO
	 * @param @param ticketQueryDto
	 * @param @return   
	 * @return PageInfo  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月13日
	 */
	PageInfo queryTicketListWithPage(TicketQueryDto ticketQueryDto);
	
}
