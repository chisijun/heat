package org.study.heat.dao;

import java.util.List;

import org.study.heat.dto.PaymentQueryDto;
import org.study.heat.pojo.Payment;
import org.study.heat.vo.PaymentVo;

import tk.mybatis.mapper.common.Mapper;

public interface PaymentMapper extends Mapper<Payment> {

	/**
	 * @Description: TODO
	 * @param @param paymentQueryDto
	 * @param @return   
	 * @return List<PaymentVo>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月13日
	 */
	List<PaymentVo> queryPaymentListWithPage(PaymentQueryDto paymentQueryDto);
}