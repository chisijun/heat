/**  
 * @Title: OnlinePayDto.java
 * @Package org.study.heat.dto
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.dto;

import java.math.BigDecimal;

import lombok.Data;

/**
 * ClassName: OnlinePayDto 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Data
public class OnlinePayDto {

	/**
	 * 缴费单
	 */
	private String paymentNo;
	
	/**
	 * 用户token
	 */
	private String token;
	
	/**
	 * 支付方式
	 */
	private Integer payType;
	
	/**
	 * 支付金额
	 */
	private BigDecimal totalAmount;
	
	/**
	 * 优惠劵Id
	 */
	private Long couponId;
	
	/**
	 * 备注
	 */
	private String body;
}
