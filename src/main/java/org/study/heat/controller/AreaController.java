/**  
 * @Title: AreaController.java
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
import org.study.heat.dto.AreaQueryDto;
import org.study.heat.pojo.Area;
import org.study.heat.pojo.User;
import org.study.heat.service.AreaService;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: AreaController 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
@RestController
@RequestMapping("/area")
public class AreaController {

	@Resource
	private AreaService areaService;
	
	/**
	 * @Description: 保存小区信息
	 * @param @param login
	 * @param @param area
	 * @param @return   
	 * @return JsonResult  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	@Authorization
	@PostMapping("/save")
	public JsonResult saveArea(@CurrentUser User login, Area area) {
		
		Integer result = areaService.saveArea(area, login);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * @Description: 根据Id删除小区信息
	 * @param @param id
	 * @param @return   
	 * @return JsonResult  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	@Authorization
	@PostMapping("/deleteById/{id}")
	public JsonResult deleteAreaById(@PathVariable Long id) {
		
		Integer result = areaService.deleteAreaById(id);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result); 
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * @Description: 分页查询小区信息
	 * @param @param areaQueryDto
	 * @param @return   
	 * @return JsonResult  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	@Authorization
	@PostMapping("/queryListWithPage")
	public JsonResult queryAreaListWithPage(AreaQueryDto areaQueryDto) {
		
		PageInfo pageInfo = areaService.queryAreaListWithPage(areaQueryDto);
		
		return new JsonResult(true, "操作成功", pageInfo);
	}
	
}
