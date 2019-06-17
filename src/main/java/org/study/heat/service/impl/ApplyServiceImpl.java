/**  
 * @Title: ApplyServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.study.heat.base.BaseService;
import org.study.heat.base.Constant;
import org.study.heat.dao.ApplyMapper;
import org.study.heat.dao.RoomMapper;
import org.study.heat.dao.UserMapper;
import org.study.heat.dto.ApplyQueryDto;
import org.study.heat.enums.ApplyTypeEnum;
import org.study.heat.pojo.Apply;
import org.study.heat.pojo.Room;
import org.study.heat.pojo.User;
import org.study.heat.service.ApplyService;
import org.study.heat.utils.PublicUtil;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName: ApplyServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Service
public class ApplyServiceImpl extends BaseService<Apply> implements ApplyService {

	@Resource
	private ApplyMapper applyDao;
	
	@Resource
	private RoomMapper roomDao;
	
	@Resource
	private UserMapper userDao;
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.ApplyService#saveApply(org.study.heat.pojo.Apply, org.study.heat.pojo.User)
	 */
	@Override
	public Integer saveApply(Apply apply, User login) {
		// TODO Auto-generated method stub
		apply.setUpdateInfo(login);
		
		// 校验房子是否存在
		Room room = roomDao.selectByPrimaryKey(apply.getRoomId());
		if (PublicUtil.isEmpty(room)) {
			throw new RuntimeException("房子不存在.");
		}
		
		// 校验用户是否存在
		User user = userDao.selectByPrimaryKey(apply.getUserId());
		if (PublicUtil.isEmpty(user)) {
			throw new RuntimeException("用户不存在.");
		}
		
		apply.setUserName(user.getUserName());
		
		System.out.println("applyType = " + apply.getApplyType());
		switch (apply.getApplyType()) {
			case Constant.APPLY_TYPE_STRONG :
				room.setHeatType(3);
				roomDao.updateByPrimaryKeySelective(room);
				break;
		}
		
		return applyDao.insertSelective(apply);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.ApplyService#updateApply(org.study.heat.pojo.Apply, org.study.heat.pojo.User)
	 */
	@Override
	public Integer updateApply(Apply apply, User login) {
		// TODO Auto-generated method stub
		
		apply.setUpdateInfo(login);
		
		Apply applyQuery = applyDao.selectByPrimaryKey(apply.getId());
		if (PublicUtil.isEmpty(applyQuery)) {
			throw new RuntimeException("该停栓复热不存在");
		}
		
		// 校验房子是否存在
		Room room = roomDao.selectByPrimaryKey(applyQuery.getRoomId());
		if (PublicUtil.isEmpty(room)) {
			throw new RuntimeException("房子不存在.");
		}
		
		switch (applyQuery.getStat()) {
			case Constant.APPLY_STAT_START :
				apply.setStat(Constant.APPLY_STAT_START_OK);
				// 复热 - 4
				room.setHeatType(4);
				roomDao.updateByPrimaryKeySelective(room);
				break;
			case Constant.APPLY_STAT_STOP :
				apply.setStat(Constant.APPLY_STAT_STOP_OK);
				// 报停 -2
				room.setHeatType(2);
				roomDao.updateByPrimaryKeySelective(room);
				break;
		}
		
		return applyDao.updateByPrimaryKeySelective(apply);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.ApplyService#queryApplyListWithPage(org.study.heat.dto.ApplyQueryDto)
	 */
	@Override
	public PageInfo queryApplyListWithPage(ApplyQueryDto applyQueryDto) {
		// TODO Auto-generated method stub
		
		PageHelper.startPage(applyQueryDto.getPageNum(), applyQueryDto.getPageSize());
		List<Apply> applyList = applyDao.queryApplyListWithPage(applyQueryDto);
		
		return new PageInfo<>(applyList);
	}

}
