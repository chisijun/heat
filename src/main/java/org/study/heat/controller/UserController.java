/**  
 * @Title: UserController.java
 * @Package org.study.heat.controller
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月15日
 */
package org.study.heat.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.study.heat.annotation.Authorization;
import org.study.heat.annotation.CurrentUser;
import org.study.heat.common.JsonResult;
import org.study.heat.dto.HisRoomQueryDto;
import org.study.heat.dto.ModifyPwdDto;
import org.study.heat.dto.UserQueryDto;
import org.study.heat.dto.UserRoomDto;
import org.study.heat.pojo.User;
import org.study.heat.service.HisRoomService;
import org.study.heat.service.RoomService;
import org.study.heat.service.UserService;
import org.study.heat.vo.RoomVo;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: UserController 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月15日
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@Resource
	private RoomService roomService;
	
	@Resource
	private HisRoomService hisRoomService;
	
	/**
	 * 查看个人信息
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Authorization
	@RequestMapping(method = RequestMethod.GET)
	public JsonResult user(@CurrentUser User login) {
		
		return new JsonResult(true, "个人信息查询成功", login);
	}
	
	/**
	 * 保存用户
	 */
	@Authorization
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public JsonResult saveUser(@CurrentUser User login, User user) {
		
		Integer result = userService.saveUser(user, login);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * 删除用户
	 */
	@Authorization
	@RequestMapping(value = "/deleteById/{id}", method = RequestMethod.POST)
	public JsonResult deleteUserById(@PathVariable Long id) {
		
		Integer result = userService.deleteUserById(id);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	@Authorization
	@RequestMapping(value = "/modifyPwd", method = RequestMethod.POST)
	public JsonResult modifyPwd(@CurrentUser User login, ModifyPwdDto modifyPwdDto) {
		
		Integer result = userService.modifyPwd(modifyPwdDto, login);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * 查询用户列表
	 */
	@Authorization
	@RequestMapping(value = "/queryListWithPage", method = RequestMethod.POST)
	public JsonResult queryUserListWithPage(UserQueryDto userQueryDto) {
		
		PageInfo pageInfo = userService.queryUserListWithPage(userQueryDto);
		
		return new JsonResult(true, "操作成功", pageInfo);
	}
	
	/**
	 * 查询用户房子列表
	 */
	@Authorization
	@RequestMapping(value = "/queryRoomListByUserId/{userId}", method = RequestMethod.POST)
	public JsonResult queryUserRoomListByUserId(@PathVariable Long userId) {
		
		List<RoomVo> roomVoList = roomService.queryUserRoomListByUserId(userId);
		
		return new JsonResult(true, "操作成功", roomVoList);
	}
	
	/**
	 * 用户入住
	 */
	@Authorization
	@RequestMapping(value = "/checkIn", method = RequestMethod.POST)
	public JsonResult checkIn(@CurrentUser User login, UserRoomDto userRoomDto) {
		
		Integer result = userService.checkIn(userRoomDto, login);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * 用户搬出
	 */
	@Authorization
	@RequestMapping(value = "/checkOut", method = RequestMethod.POST)
	public JsonResult checkOut(@CurrentUser User login, UserRoomDto userRoomDto) {
		
		Integer result = userService.checkOut(userRoomDto, login);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * 历史入住记录
	 */
	@Authorization
	@RequestMapping(value = "/queryHisCheckInListWithPage", method = RequestMethod.POST)
	public JsonResult queryHisCheckInListWithPage(HisRoomQueryDto hisRoomQueryDto) {
		
		PageInfo pageInfo = hisRoomService.queryHisCheckInListWithPage(hisRoomQueryDto);
		
		return new JsonResult(true, "操作成功", pageInfo);
	}
}
