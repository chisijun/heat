/**  
 * @Title: UserService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月16日
 */
package org.study.heat.service;

import org.study.heat.base.IService;
import org.study.heat.pojo.User;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: UserService 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月16日
 */
public interface UserService extends IService<User> {

	/**
	 * @Description: TODO
	 * @param @param currentUserId
	 * @param @return   
	 * @return User  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月23日
	 */
	User selectUserById(Long userId);

	/**
     * 用户登录
     * @param phone
     * @param password
     * @return
     * @throws Exception
     */
    public User login(String name, String password) throws Exception;
	
    /**
     * @Description: 用户列表分页查询
     * @param @param userQueryDto
     * @param @return   
     * @return PageInfo  
     * @throws
     * @author chisj chisj@foxmail.com
     * @date 2019年6月2日
     */
    //PageInfo queryUserListWithPage(UserQueryDto userQueryDto);
}
