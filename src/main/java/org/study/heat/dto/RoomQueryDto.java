/**  
 * @Title: RoomQueryDto.java
 * @Package org.study.heat.dto
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.dto;

import lombok.Data;

import org.study.heat.base.BaseQuery;

/**
 * ClassName: RoomQueryDto 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Data
public class RoomQueryDto extends BaseQuery {

	private Long siteId;
	
	private String siteName;
	
	private Long areaId;
	
	private String areaName;
	
	private Long buildingId;
	
	private String buildingName;
	
	private String roomName;
	
}
