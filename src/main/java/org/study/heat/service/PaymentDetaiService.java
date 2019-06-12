/**  
 * @Title: PaymentDetaiService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.service;

import org.study.heat.base.IService;
import org.study.heat.pojo.PaymentDetail;
import org.study.heat.vo.PaymentDetailVo;

/**
 * ClassName: PaymentDetaiService 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
public interface PaymentDetaiService extends IService<PaymentDetail> {

	/**
	 * @Description: TODO
	 * @param @param paymentNo
	 * @param @return   
	 * @return PaymentDetailVo  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	PaymentDetailVo queryPaymentDetailByPaymentNo(String paymentNo);

}
