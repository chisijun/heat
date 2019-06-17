package org.study.heat.dao;

import java.util.List;

import org.study.heat.dto.ApplyQueryDto;
import org.study.heat.pojo.Apply;

import tk.mybatis.mapper.common.Mapper;

public interface ApplyMapper extends Mapper<Apply> {

	/**
	 * @Description: TODO
	 * @param @param applyQueryDto
	 * @param @return   
	 * @return List<Apply>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月17日
	 */
	List<Apply> queryApplyListWithPage(ApplyQueryDto applyQueryDto);
}