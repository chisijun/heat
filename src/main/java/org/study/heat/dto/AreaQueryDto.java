/**  
 * @Title: AreaQueryDto.java
 * @Package org.study.heat.dto
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.dto;

import org.study.heat.base.BaseQuery;

import lombok.Data;

/**
 * ClassName: AreaQueryDto 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Data
public class AreaQueryDto extends BaseQuery {

	/**
	 * 热站Id
	 */
	private Long siteId;
	
	/**
	 * 小区名称
	 */
	private String areaName;
	
	/**
	 * 热站名称
	 */
	private String siteName;
	
}
