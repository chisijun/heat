package org.study.heat.dao;

import java.util.List;

import org.study.heat.dto.RoomQueryDto;
import org.study.heat.pojo.Room;
import org.study.heat.vo.RoomTotal;
import org.study.heat.vo.RoomVo;

import tk.mybatis.mapper.common.Mapper;

public interface RoomMapper extends Mapper<Room> {

	/**
	 * @Description: 房间分页查询
	 * @param @param roomQueryDto
	 * @param @return   
	 * @return List<RoomVo>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	List<RoomVo> queryRoomListWithPage(RoomQueryDto roomQueryDto);

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
	 * @param @return   
	 * @return List<RoomTotal>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月18日
	 */
	List<RoomTotal> queryRoomTotal();
}