/**  
 * @Title: UserController.java
 * @Package org.study.heat.controller
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月15日
 */
package org.study.heat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: UserController 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月15日
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	public String login() {
		
		
		return "admin_index";
	}
	
	@RequestMapping("/show")
	public String show() {	
		
		return "show";
	}
	
	@ResponseBody
	@RequestMapping("/test")
	public String test() {
		
		return "test";
	}
}
