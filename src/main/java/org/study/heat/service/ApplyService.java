/**  
 * @Title: ApplyService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月2日
 */
package org.study.heat.service;

import java.util.List;

import org.study.heat.base.IService;
import org.study.heat.dto.ApplyQueryDto;
import org.study.heat.pojo.Apply;
import org.study.heat.pojo.User;
import org.study.heat.vo.ApplyTotal;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: ApplyService 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月2日
 */
public interface ApplyService extends IService<Apply> {

	/**
	 * @Description: TODO
	 * @param @param apply
	 * @param @param login
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	Integer saveApply(Apply apply, User login);

	/**
	 * @Description: TODO
	 * @param @param apply
	 * @param @param login
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	Integer updateApply(Apply apply, User login);

	/**
	 * @Description: TODO
	 * @param @param applyQueryDto
	 * @param @return   
	 * @return PageInfo  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	PageInfo queryApplyListWithPage(ApplyQueryDto applyQueryDto);

	/**
	 * @Description: TODO
	 * @param @return   
	 * @return List<ApplyTotal>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月18日
	 */
	List<ApplyTotal> queryApplyTotal();

}
