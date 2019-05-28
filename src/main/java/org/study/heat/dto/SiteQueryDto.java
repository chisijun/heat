/**  
 * @Title: SiteQueryDto.java
 * @Package org.study.heat.dto
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.dto;

import lombok.Data;

import org.study.heat.base.BaseQuery;

/**
 * ClassName: SiteQueryDto 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Data
public class SiteQueryDto extends BaseQuery {

	private String siteName;
	
}
