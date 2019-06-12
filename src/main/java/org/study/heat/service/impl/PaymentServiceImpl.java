/**  
 * @Title: PaymentServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.study.heat.base.BaseService;
import org.study.heat.dao.PaymentMapper;
import org.study.heat.dto.PaymentQueryDto;
import org.study.heat.pojo.Payment;
import org.study.heat.service.PaymentService;

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
		return null;
	}

}
