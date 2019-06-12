/**  
 * @Title: HisRoomServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.study.heat.base.BaseService;
import org.study.heat.dao.HisRoomMapper;
import org.study.heat.dto.HisRoomQueryDto;
import org.study.heat.pojo.HisRoom;
import org.study.heat.service.HisRoomService;
import org.study.heat.vo.HisRoomVo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName: HisRoomServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Service
public class HisRoomServiceImpl extends BaseService<HisRoom> implements HisRoomService {

	@Resource
	private HisRoomMapper hisRoomDato;
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.HisRoomService#queryHisCheckInListWithPage(org.study.heat.dto.HisRoomQueryDto)
	 */
	@Override
	public PageInfo queryHisCheckInListWithPage(HisRoomQueryDto hisRoomQueryDto) {
		// TODO Auto-generated method stub
		
		PageHelper.startPage(hisRoomQueryDto.getPageNum(), hisRoomQueryDto.getPageSize());
		List<HisRoomVo> hisRoomVoList = hisRoomDato.queryHisCheckInListWithPage(hisRoomQueryDto);
		
		return new PageInfo<>(hisRoomVoList);
	}

	
	
}
