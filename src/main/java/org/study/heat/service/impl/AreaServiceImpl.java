/**  
 * @Title: AreaServiceImpl.java
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
import org.study.heat.dao.AreaMapper;
import org.study.heat.dao.BuildingMapper;
import org.study.heat.dto.AreaQueryDto;
import org.study.heat.pojo.Area;
import org.study.heat.pojo.Building;
import org.study.heat.pojo.Site;
import org.study.heat.pojo.User;
import org.study.heat.service.AreaService;
import org.study.heat.service.SiteService;
import org.study.heat.utils.PublicUtil;
import org.study.heat.vo.AreaVo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName: AreaServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Slf4j
@Service
@Transactional
public class AreaServiceImpl extends BaseService<Area> implements AreaService {
	
	@Resource
	private AreaMapper areaDao;
	
	@Resource
	private SiteService siteService;
	
	@Resource
	private BuildingMapper buildingDao;
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.AreaService#saveArea(org.study.heat.pojo.Area, org.study.heat.pojo.User)
	 */
	@Override
	public Integer saveArea(Area area, User login) {
		// TODO Auto-generated method stub
		area.setUpdateInfo(login);
		
		// 校验小区站点是否存在
		if (PublicUtil.isNotEmpty(area.getSiteId())) {
			Site site = siteService.selectByKey(area.getSiteId());
			if (PublicUtil.isEmpty(site)) {
				throw new RuntimeException("供热站点不存在.");
			}
		}
		
		if (area.isNew()) {
			return areaDao.insertSelective(area);
		} else {
			return areaDao.updateByPrimaryKey(area);
		}
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.AreaService#deleteAreaById(java.lang.Long)
	 */
	@Override
	public Integer deleteAreaById(Long id) {
		// TODO Auto-generated method stub
		
		// 是否有楼栋正在使用该小区
		Building building = new Building();
		building.setAreaId(id);
		int count = buildingDao.selectCount(building);
		if (count > 0) {
			throw new RuntimeException("该小区正在使用.");
		}
		
		return areaDao.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.AreaService#queryAreaListWithPage(org.study.heat.dto.AreaQueryDto)
	 */
	@Override
	public PageInfo queryAreaListWithPage(AreaQueryDto areaQueryDto) {
		// TODO Auto-generated method stub
		
		PageHelper.startPage(areaQueryDto.getPageNum(), areaQueryDto.getPageSize());
		List<AreaVo> areaVoList = areaDao.queryAreaListWithPage(areaQueryDto);
		
		return new PageInfo<>(areaVoList);
	}

	
	
}
