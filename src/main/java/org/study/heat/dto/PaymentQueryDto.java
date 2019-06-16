/**  
 * @Title: PaymentQueryDto.java
 * @Package org.study.heat.dto
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.dto;

import lombok.Data;

import org.study.heat.base.BaseQuery;

/**
 * ClassName: PaymentQueryDto 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Data
public class PaymentQueryDto extends BaseQuery {

	/**
	 * 缴费单号
	 */
	private String paymentNo;
	
	/**
	 * 用户姓名
	 */
	private String userName;
	
	/**
	 * 用户Id
	 */
	private Long userId;
	
	/**
	 * 缴费年份
	 */
	private Long paymentYear;
	
	/**
	 * 是否支付
	 */
	private Integer isPay;
	
}
