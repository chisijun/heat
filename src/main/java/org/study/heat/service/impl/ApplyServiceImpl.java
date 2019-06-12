/**  
 * @Title: ApplyServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.study.heat.base.BaseService;
import org.study.heat.dao.ApplyMapper;
import org.study.heat.dto.ApplyQueryDto;
import org.study.heat.pojo.Apply;
import org.study.heat.pojo.User;
import org.study.heat.service.ApplyService;

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
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.ApplyService#saveApply(org.study.heat.pojo.Apply, org.study.heat.pojo.User)
	 */
	@Override
	public Integer saveApply(Apply apply, User login) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.ApplyService#updateApply(org.study.heat.pojo.Apply, org.study.heat.pojo.User)
	 */
	@Override
	public Integer updateApply(Apply apply, User login) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.ApplyService#queryApplyListWithPage(org.study.heat.dto.ApplyQueryDto)
	 */
	@Override
	public PageInfo queryApplyListWithPage(ApplyQueryDto applyQueryDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
