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
	User selectUserById(Integer userId);

}
