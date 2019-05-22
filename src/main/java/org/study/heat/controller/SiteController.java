/**  
 * @Title: SiteController.java
 * @Package org.study.heat.controller
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
package org.study.heat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.study.heat.pojo.Site;

/**
 * ClassName: SiteController 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
@Controller
@RequestMapping("/user")
public class SiteController {

	@PostMapping("/save")
	public String siteSave(Site site) {
		
		
		
		
		return "site";
	}
	
}
