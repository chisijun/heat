package org.study.heat.dao;

import java.util.List;

import org.study.heat.dto.BuildingQueryDto;
import org.study.heat.pojo.Building;
import org.study.heat.vo.BuildingVo;

import tk.mybatis.mapper.common.Mapper;

public interface BuildingMapper extends Mapper<Building> {

	/**
	 * @Description: 分页查询楼栋信息
	 * @param @param buildingQueryDto
	 * @param @return   
	 * @return List<BuildingVo>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	List<BuildingVo> queryBuildingListWithPage(BuildingQueryDto buildingQueryDto);
}