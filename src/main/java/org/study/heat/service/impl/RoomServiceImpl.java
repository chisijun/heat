/**  
 * @Title: RoomServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.study.heat.base.BaseService;
import org.study.heat.dao.BuildingMapper;
import org.study.heat.dao.RoomMapper;
import org.study.heat.dao.UserRoomMapper;
import org.study.heat.dto.RoomQueryDto;
import org.study.heat.enums.StatusEnum;
import org.study.heat.pojo.Building;
import org.study.heat.pojo.Room;
import org.study.heat.pojo.User;
import org.study.heat.pojo.UserRoom;
import org.study.heat.service.RoomService;
import org.study.heat.utils.PublicUtil;
import org.study.heat.vo.RoomVo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName: RoomServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Slf4j
@Service
@Transactional
public class RoomServiceImpl extends BaseService<Room> implements RoomService {
	
	@Resource
	private RoomMapper roomDao;
	
	@Resource
	private UserRoomMapper userRoomDao;
	
	@Resource
	private BuildingMapper buildingDao;
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.RoomService#saveRoom(org.study.heat.pojo.Room, org.study.heat.pojo.User)
	 */
	@Override
	public Integer saveRoom(Room room, User login) {
		// TODO Auto-generated method stub
		
		room.setUpdateInfo(login);
		
		if (PublicUtil.isNotEmpty(room.getBuildingId())) {
			Building building = buildingDao.selectByPrimaryKey(room.getBuildingId());
			if (PublicUtil.isEmpty(building)) {
				throw new RuntimeException("该楼栋不存在.");
			}
		}
		
		if (room.isNew()) {
			room.setStatus(StatusEnum.ENABLE.getType());
			return roomDao.insertSelective(room);
		} else {
			return roomDao.updateByPrimaryKeySelective(room);
		}
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.RoomService#deleteRoomById(java.lang.Long)
	 */
	@Override
	public Integer deleteRoomById(Long id) {
		// TODO Auto-generated method stub
		
		// 校验是否已经和用户绑定了
		Room room = roomDao.selectByPrimaryKey(id);
		if (PublicUtil.isEmpty(room)) {
			// 房间不存在
			throw new RuntimeException("该房间不存在.");
		}
		
		if (PublicUtil.isNotEmpty(room.getUserId())) {
			// 该房子有住户了
			throw new RuntimeException("该房间已经入住.");
		}
		
		return roomDao.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.RoomService#queryRoomListWithPage(org.study.heat.dto.RoomQueryDto)
	 */
	@Override
	public PageInfo queryRoomListWithPage(RoomQueryDto roomQueryDto) {
		// TODO Auto-generated method stub
		
		PageHelper.startPage(roomQueryDto.getPageNum(), roomQueryDto.getPageSize());
		List<RoomVo> roomVoList = roomDao.queryRoomListWithPage(roomQueryDto);
		
		return new PageInfo<>(roomVoList);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.RoomService#buildingRoomUser(org.study.heat.pojo.Room)
	 */
	@Override
	public Integer buildingRoomUser(Room room) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.RoomService#queryUserRoomListByUserId()
	 */
	@Override
	public List<RoomVo> queryUserRoomListByUserId(Long userId) {
		// TODO Auto-generated method stub
		
		RoomQueryDto roomQueryDto = new RoomQueryDto();
		roomQueryDto.setUserId(userId);
		
		return roomDao.queryRoomListWithPage(roomQueryDto);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.RoomService#checkOut(org.study.heat.pojo.Room)
	 */
	@Override
	public Integer checkOut(Room room) {
		// TODO Auto-generated method stub
		room.setUserId(null);
		
		return roomDao.updateByPrimaryKey(room);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.RoomService#queryNotCheckInRoomList()
	 */
	@Override
	public List<RoomVo> queryNotCheckInRoomList() {
		// TODO Auto-generated method stub
		
		return roomDao.queryNotCheckInRoomList();
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.RoomService#queryRoomById(java.lang.Long)
	 */
	@Override
	public RoomVo queryRoomById(Long id) {
		// TODO Auto-generated method stub
		
		RoomQueryDto roomQueryDto = new RoomQueryDto();
		roomQueryDto.setId(id);
		
		List<RoomVo> roomVoList = roomDao.queryRoomListWithPage(roomQueryDto);
		
		return roomVoList.get(0);
	}

	
	
}
