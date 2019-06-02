/**  
 * @Title: PaymentService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月2日
 */
package org.study.heat.service;

import org.study.heat.base.IService;
import org.study.heat.pojo.Payment;

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
	
}
