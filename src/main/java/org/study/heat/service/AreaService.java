/**  
 * @Title: AreaService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.service;

import org.study.heat.base.IService;
import org.study.heat.dto.AreaQueryDto;
import org.study.heat.pojo.Area;
import org.study.heat.pojo.User;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: AreaService 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
public interface AreaService extends IService<Area> {

	/**
	 * @Description: 保存小区信息
	 * @param @param area
	 * @param @param login
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	Integer saveArea(Area area, User login);

	/**
	 * @Description: 根据Id删除小区信息
	 * @param @param id
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	Integer deleteAreaById(Long id);

	/**
	 * @Description: 分页查询小区信息
	 * @param @param areaQueryDto
	 * @param @return   
	 * @return PageInfo  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	PageInfo queryAreaListWithPage(AreaQueryDto areaQueryDto);

	
	
}
