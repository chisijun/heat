/**  
 * @Title: HisRoomQueryDto.java
 * @Package org.study.heat.dto
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.dto;

import org.study.heat.base.BaseQuery;

import lombok.Data;

/**
 * ClassName: HisRoomQueryDto 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Data
public class HisRoomQueryDto extends BaseQuery {

	/**
	 * 用户姓名
	 */
	private String userName;
	
}
