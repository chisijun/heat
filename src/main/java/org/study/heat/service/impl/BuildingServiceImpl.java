/**  
 * @Title: BuildingServiceImpl.java
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
import org.study.heat.dto.BuildingQueryDto;
import org.study.heat.enums.StatusEnum;
import org.study.heat.pojo.Area;
import org.study.heat.pojo.Building;
import org.study.heat.pojo.Room;
import org.study.heat.pojo.User;
import org.study.heat.service.AreaService;
import org.study.heat.service.BuildingService;
import org.study.heat.utils.PublicUtil;
import org.study.heat.vo.BuildingVo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName: BuildingServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Slf4j
@Service
@Transactional
public class BuildingServiceImpl extends BaseService<Building> implements BuildingService {
	
	@Resource
	private BuildingMapper buildingDao;
	
	@Resource
	private AreaService areaService;
	
	@Resource
	private RoomMapper roomDao;
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.BuildingService#saveBuilding(org.study.heat.pojo.Building, org.study.heat.pojo.User)
	 */
	@Override
	public Integer saveBuilding(Building building, User login) {
		// TODO Auto-generated method stub
		building.setUpdateInfo(login);

		if (PublicUtil.isNotEmpty(building.getAreaId())) {
			// 校验小区是否存在
			Area area = areaService.selectByKey(building.getAreaId());
			if (PublicUtil.isEmpty(area)) {
				throw new RuntimeException("该小区不存在.");
			}
		}
		
		if (building.isNew()) {
			building.setStatus(StatusEnum.ENABLE.getType());
			return buildingDao.insertSelective(building);
		} else {
			return buildingDao.updateByPrimaryKeySelective(building);
		}
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.BuildingService#deleteBuildingById(java.lang.Long)
	 */
	@Override
	public Integer deleteBuildingById(Long id) {
		// TODO Auto-generated method stub
		
		// 校验是否有房间在使用
		Room room = new Room();
		room.setBuildingId(id);
		int count = roomDao.selectCount(room);
		if (count > 0) {
			throw new RuntimeException("该楼栋正在使用.");
		}
		
		return buildingDao.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.BuildingService#queryBuildingListWithPage(org.study.heat.dto.BuildingQueryDto)
	 */
	@Override
	public PageInfo queryBuildingListWithPage(BuildingQueryDto buildingQueryDto) {
		// TODO Auto-generated method stub
		
		PageHelper.startPage(buildingQueryDto.getPageNum(), buildingQueryDto.getPageSize());
		List<BuildingVo> buildingVoList = buildingDao.queryBuildingListWithPage(buildingQueryDto);
		
		return new PageInfo<>(buildingVoList);
	}
}
