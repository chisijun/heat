/**  
 * @Title: RoomService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.service;

import java.util.List;

import org.study.heat.base.IService;
import org.study.heat.dto.RoomQueryDto;
import org.study.heat.pojo.Room;
import org.study.heat.pojo.User;
import org.study.heat.vo.RoomTotal;
import org.study.heat.vo.RoomVo;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: RoomService 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
public interface RoomService extends IService<Room> {

	/**
	 * @Description: 保存房间信息
	 * @param @param room
	 * @param @param login
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	Integer saveRoom(Room room, User login);

	/**
	 * @Description: 删除房间信息
	 * @param @param id
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	Integer deleteRoomById(Long id);

	/**
	 * @Description: 分页查询房间信息
	 * @param @param roomQueryDto
	 * @param @return   
	 * @return PageInfo  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	PageInfo queryRoomListWithPage(RoomQueryDto roomQueryDto);

	/**
	 * @Description: 绑定用户和房子
	 * @param @param room	房子信息
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月2日
	 */
	Integer buildingRoomUser(Room room);

	/**
	 * @Description: TODO
	 * @param @return   
	 * @return List<RoomVo>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	List<RoomVo> queryUserRoomListByUserId(Long userId);

	/**
	 * @Description: TODO
	 * @param @param room
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	Integer checkOut(Room room);

	/**
	 * @Description: TODO
	 * @param @return   
	 * @return List<Room>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月12日
	 */
	List<RoomVo> queryNotCheckInRoomList();

	/**
	 * @Description: TODO
	 * @param @param id
	 * @param @return   
	 * @return RoomVo  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月12日
	 */
	RoomVo queryRoomById(Long id);

	/**
	 * @Description: TODO
	 * @param @return   
	 * @return List<RoomTotal>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月18日
	 */
	List<RoomTotal> queryRoomTotal();
	
}
