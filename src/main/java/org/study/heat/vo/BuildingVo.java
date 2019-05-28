/**  
 * @Title: BuildingVo.java
 * @Package org.study.heat.vo
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.vo;

import lombok.Data;

import org.study.heat.base.BaseVo;

/**
 * ClassName: BuildingVo 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Data
public class BuildingVo extends BaseVo {

	private String buildingNo;
	
	private String buildingName;
	
	private Integer unitSize;
	
	private Integer floorSize;
	
	private Long areaId;
	
	private String areaName;
	
	private Long siteId;
	
	private String siteName;

	private String status;
	
	private String remark;

}
