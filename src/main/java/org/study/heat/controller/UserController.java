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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.study.heat.annotation.Authorization;
import org.study.heat.annotation.CurrentUser;
import org.study.heat.common.JsonResult;
import org.study.heat.pojo.User;

/**
 * ClassName: UserController 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月15日
 */
@Controller
@RequestMapping("/user")
public class UserController {

	/**
	 * 查看个人信息
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Authorization
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public JsonResult user(@CurrentUser User login) {
		
		return new JsonResult(true, "个人信息查询成功", login);
	}
}
