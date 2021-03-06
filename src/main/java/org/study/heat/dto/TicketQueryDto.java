/**  
 * @Title: TicketQueryDto.java
 * @Package org.study.heat.dto
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.dto;

import org.study.heat.base.BaseQuery;

import lombok.Data;

/**
 * ClassName: TicketQueryDto 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Data
public class TicketQueryDto extends BaseQuery {

	/**
	 * 单号
	 */
	private String paymentNo;
	
	/**
	 * 姓名
	 */
	private String userName;
	
	/**
	 * 房子名称
	 */
	private String roomName;
	
}
