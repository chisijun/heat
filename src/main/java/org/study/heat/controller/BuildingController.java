/**  
 * @Title: BuildingController.java
 * @Package org.study.heat.controller
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
package org.study.heat.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.heat.annotation.Authorization;
import org.study.heat.annotation.CurrentUser;
import org.study.heat.common.JsonResult;
import org.study.heat.dto.BuildingQueryDto;
import org.study.heat.pojo.Building;
import org.study.heat.pojo.User;
import org.study.heat.service.BuildingService;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: BuildingController 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
@RestController
@RequestMapping("/building")
public class BuildingController {

	@Resource
	private BuildingService buildingService;
	
	/**
	 * @Description: 保存楼栋信息
	 * @param @param login
	 * @param @param building
	 * @param @return   
	 * @return JsonResult  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	@Authorization
	@PostMapping("/save")
	public JsonResult saveBuilding(@CurrentUser User login, Building building) {
		
		Integer result = buildingService.saveBuilding(building, login);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * @Description: 根据Id删除楼栋信息
	 * @param @param id
	 * @param @return   
	 * @return JsonResult  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	@Authorization
	@PostMapping("/deleteById/{id}")
	public JsonResult deleteBuildingById(@PathVariable Long id) {
		
		Integer result = buildingService.deleteBuildingById(id);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * @Description: 分页查询楼栋信息
	 * @param @param buildingQueryDto
	 * @param @return   
	 * @return JsonResult  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	@Authorization
	@PostMapping("/queryListWithPage")
	public JsonResult queryBuildingListWithPage(BuildingQueryDto buildingQueryDto) {
		
		PageInfo pageInfo = buildingService.queryBuildingListWithPage(buildingQueryDto);
		
		return new JsonResult(true, "操作成功", pageInfo); 
	}

	@Authorization
	@PostMapping("/queryById/{id}")
	public JsonResult queryBuildingById(@PathVariable Long id) {

		Building building = buildingService.selectByKey(id);

		return new JsonResult(true, "操作成功", building);
	}
}
