/**  
 * @Title: SiteVo.java
 * @Package org.study.heat.vo
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.vo;

import org.study.heat.base.BaseVo;

import lombok.Data;

/**
 * ClassName: SiteVo 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Data
public class SiteVo extends BaseVo {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 8009165865526122683L;
	
	private String siteName;
	
	private String remark;
	
}
