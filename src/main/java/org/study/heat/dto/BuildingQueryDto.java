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

	private String siteName;
	
	private String areaName; 
	
	private String buildingNo;
	
	private String buildingName;
	
}
