/**  
 * @Title: RoomTypeQueryDto.java
 * @Package org.study.heat.dto
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月16日
 */
package org.study.heat.dto;

import lombok.Data;

import org.study.heat.base.BaseQuery;

/**
 * ClassName: RoomTypeQueryDto 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月16日
 */
@Data
public class RoomTypeQueryDto extends BaseQuery {

	/**
	 * 
	 */
	private String roomTypeName;
	
	private String id;
	
}
