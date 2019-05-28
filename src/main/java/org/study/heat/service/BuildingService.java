/**  
 * @Title: BuildingService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.service;

import org.study.heat.base.IService;
import org.study.heat.dto.BuildingQueryDto;
import org.study.heat.pojo.Building;
import org.study.heat.pojo.User;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: BuildingService 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
public interface BuildingService extends IService<Building> {

	/**
	 * @Description: 保存楼栋信息
	 * @param @param building
	 * @param @param login
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	Integer saveBuilding(Building building, User login);

	/**
	 * @Description: 根据Id删除楼信息
	 * @param @param id
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	Integer deleteBuildingById(Long id);

	/**
	 * @Description: 分页查询楼栋信息
	 * @param @param buildingQueryDto
	 * @param @return   
	 * @return PageInfo  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	PageInfo queryBuildingListWithPage(BuildingQueryDto buildingQueryDto);

}
