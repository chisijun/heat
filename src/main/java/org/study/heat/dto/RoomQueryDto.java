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

	/**
	 * 热站Id
	 */
	private Long siteId;
	
	/**
	 * 热站名称
	 */
	private String siteName;
	
	/**
	 * 小区Id
	 */
	private Long areaId;
	
	/**
	 * 小区名称
	 */
	private String areaName;
	
	/**
	 * 楼栋Id
	 */
	private Long buildingId;
	
	/**
	 * 楼栋名称
	 */
	private String buildingName;
	
	/**
	 * 房间名称
	 */
	private String roomName;
	
}
