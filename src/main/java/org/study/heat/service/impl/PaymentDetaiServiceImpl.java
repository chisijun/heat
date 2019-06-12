/**  
 * @Title: PaymentDetaiServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.service.impl;

import org.springframework.stereotype.Service;
import org.study.heat.base.BaseService;
import org.study.heat.pojo.PaymentDetail;
import org.study.heat.service.PaymentDetaiService;
import org.study.heat.vo.PaymentDetailVo;

/**
 * ClassName: PaymentDetaiServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Service
public class PaymentDetaiServiceImpl extends BaseService<PaymentDetail> implements PaymentDetaiService {

	/* (non-Javadoc)
	 * @see org.study.heat.service.PaymentDetaiService#queryPaymentDetailByPaymentNo(java.lang.String)
	 */
	@Override
	public PaymentDetailVo queryPaymentDetailByPaymentNo(String paymentNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
