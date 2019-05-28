package org.study.heat.dao;

import java.util.List;

import org.study.heat.dto.SiteQueryDto;
import org.study.heat.pojo.Site;

import tk.mybatis.mapper.common.Mapper;

public interface SiteMapper extends Mapper<Site> {

	/**
	 * @Description: TODO
	 * @param @param siteQueryDto
	 * @param @return   
	 * @return List<Site>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	List<Site> querySiteListWithPage(SiteQueryDto siteQueryDto);
}