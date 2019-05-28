/**  
 * @Title: SiteService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.service;

import org.study.heat.base.IService;
import org.study.heat.dto.SiteQueryDto;
import org.study.heat.pojo.Site;
import org.study.heat.pojo.User;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: SiteService 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
public interface SiteService extends IService<Site> {

	/**
	 * @Description: TODO
	 * @param @param site
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	Integer saveSite(Site site, User user);

	/**
	 * @Description: TODO
	 * @param @param id
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	Integer deleteSiteById(Long id);

	/**
	 * @Description: TODO
	 * @param @param siteQueryDto
	 * @param @return   
	 * @return PageInfo  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	PageInfo querySiteListWithPage(SiteQueryDto siteQueryDto);

}
