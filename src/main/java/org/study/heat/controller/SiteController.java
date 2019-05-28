/**  
 * @Title: SiteController.java
 * @Package org.study.heat.controller
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
package org.study.heat.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.heat.annotation.Authorization;
import org.study.heat.annotation.CurrentUser;
import org.study.heat.common.JsonResult;
import org.study.heat.dto.SiteQueryDto;
import org.study.heat.enums.StatusEnum;
import org.study.heat.pojo.Site;
import org.study.heat.pojo.User;
import org.study.heat.service.SiteService;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: SiteController 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
@RestController
@RequestMapping("/site")
public class SiteController {

	@Resource
	private SiteService siteService;
	
	@Authorization
	@PostMapping("/save")
	public JsonResult siteSave(@CurrentUser User login, Site site) {
		
		Integer result = siteService.saveSite(site, login);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	@Authorization
	@PostMapping("/deleteById/{id}")
	public JsonResult deleteSiteById(@PathVariable Long id) {
		
		Integer result = siteService.deleteSiteById(id);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result); 
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	@Authorization
	@PostMapping("/queryListWithPage")
	public JsonResult querySiteListWithPage(SiteQueryDto siteQueryDto) {
		
		PageInfo pageInfo = siteService.querySiteListWithPage(siteQueryDto);
		
		return new JsonResult(true, "操作成功", pageInfo);
	}
}
