/**  
 * @Title: PaymentVo.java
 * @Package org.study.heat.vo
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.vo;

import java.util.List;

import lombok.Data;

import org.study.heat.base.BaseVo;

/**
 * ClassName: PaymentVo 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Data
public class PaymentVo extends BaseVo {

	private List<PaymentDetailVo> paymentDetailList;
	
}
