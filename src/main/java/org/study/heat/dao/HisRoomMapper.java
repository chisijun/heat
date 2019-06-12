package org.study.heat.dao;

import java.util.List;

import org.study.heat.dto.HisRoomQueryDto;
import org.study.heat.pojo.HisRoom;
import org.study.heat.vo.HisRoomVo;

import tk.mybatis.mapper.common.Mapper;

public interface HisRoomMapper extends Mapper<HisRoom> {

	/**
	 * @Description: TODO
	 * @param @param hisRoomQueryDto
	 * @param @return   
	 * @return List<HisRoomVo>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	List<HisRoomVo> queryHisCheckInListWithPage(HisRoomQueryDto hisRoomQueryDto);
}