/**  
 * @Title: SiteServiceImpl.java
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
import org.study.heat.dao.SiteMapper;
import org.study.heat.dto.SiteQueryDto;
import org.study.heat.enums.StatusEnum;
import org.study.heat.pojo.Area;
import org.study.heat.pojo.Site;
import org.study.heat.pojo.User;
import org.study.heat.service.SiteService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName: SiteServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Slf4j
@Service
@Transactional
public class SiteServiceImpl extends BaseService<Site> implements SiteService {
	
	@Resource
	private SiteMapper siteDao;
	
	@Resource
	private AreaMapper areaDao;
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.SiteService#siteSave(org.study.heat.pojo.Site)
	 */
	@Override
	public Integer saveSite(Site site, User user) {
		
		site.setUpdateInfo(user);
		
		// TODO Auto-generated method stub
		if (site.isNew()) {
			site.setStatus(StatusEnum.ENABLE.getType());
			return siteDao.insertSelective(site);
		} else {
			return siteDao.updateByPrimaryKeySelective(site);
		}
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.SiteService#deleteSiteById(java.lang.Long)
	 */
	@Override
	public Integer deleteSiteById(Long id) {
		// TODO Auto-generated method stub
		// 校验是否正在使用
		Area areaQuery = new Area();
		areaQuery.setSiteId(id);
		int count = areaDao.selectCount(areaQuery);
		if (count > 0) {
			throw new RuntimeException("该热站正在使用.");
		}
		
		return siteDao.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.SiteService#querySiteListWithPage(org.study.heat.dto.SiteQueryDto)
	 */
	@Override
	public PageInfo querySiteListWithPage(SiteQueryDto siteQueryDto) {
		// TODO Auto-generated method stub
		
		PageHelper.startPage(siteQueryDto.getPageNum(), siteQueryDto.getPageSize());
		List<Site> siteList = siteDao.querySiteListWithPage(siteQueryDto);
		
		return new PageInfo<>(siteList);
	}

}
