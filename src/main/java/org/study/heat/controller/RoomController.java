/**  
 * @Title: RoomController.java
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
import org.study.heat.dto.RoomQueryDto;
import org.study.heat.dto.SiteQueryDto;
import org.study.heat.pojo.Room;
import org.study.heat.pojo.Site;
import org.study.heat.pojo.User;
import org.study.heat.service.RoomService;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: RoomController 
 * @Description: 房间管理
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
@RestController
@RequestMapping("/room")
public class RoomController {

	@Resource
	private RoomService roomService;
	
	/**
	 * @Description: 添加房间
	 * @param @param login
	 * @param @param room
	 * @param @return   
	 * @return JsonResult  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	@Authorization
	@PostMapping("/save")
	public JsonResult saveRoom(@CurrentUser User login, Room room) {
		
		Integer result = roomService.saveRoom(room, login);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * @Description: 删除房间
	 * @param @param id
	 * @param @return   
	 * @return JsonResult  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	@Authorization
	@PostMapping("/deleteById/{id}")
	public JsonResult deleteRoomById(@PathVariable Long id) {
		
		Integer result = roomService.deleteRoomById(id);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result); 
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * @Description: 分页查询房间
	 * @param @param roomQueryDto
	 * @param @return   
	 * @return JsonResult  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	@Authorization
	@PostMapping("/queryListWithPage")
	public JsonResult queryRoomListWithPage(RoomQueryDto roomQueryDto) {
		
		PageInfo pageInfo = roomService.queryRoomListWithPage(roomQueryDto);
		
		return new JsonResult(true, "操作成功", pageInfo);
	}
	
	/**
	 * 查询没有入住的房子
	 */
	public JsonResult queryNotCheckInRoomList() {
		
		return new JsonResult(true, "操作成功", 1);
	}
}
