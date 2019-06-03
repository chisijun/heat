/**  
 * @Title: BuildingQueryDto.java
 * @Package org.study.heat.dto
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.dto;

import lombok.Data;

import org.study.heat.base.BaseQuery;

/**
 * ClassName: BuildingQueryDto 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Data
public class BuildingQueryDto extends BaseQuery {

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
	 * 楼栋编号
	 */
	private String buildingNo;
	
	/**
	 * 楼栋名称
	 */
	private String buildingName;
	
}
