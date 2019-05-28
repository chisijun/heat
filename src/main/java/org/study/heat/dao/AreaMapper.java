package org.study.heat.dao;

import java.util.List;

import org.study.heat.dto.AreaQueryDto;
import org.study.heat.pojo.Area;
import org.study.heat.vo.AreaVo;

import tk.mybatis.mapper.common.Mapper;

public interface AreaMapper extends Mapper<Area> {

	/**
	 * @Description: 分页查询小区信息
	 * @param @param areaQueryDto
	 * @param @return   
	 * @return List<AreaVo>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	List<AreaVo> queryAreaListWithPage(AreaQueryDto areaQueryDto);
}