/**  
 * @Title: UserService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月16日
 */
package org.study.heat.service;

import org.study.heat.base.IService;
import org.study.heat.dto.ModifyPwdDto;
import org.study.heat.dto.UserQueryDto;
import org.study.heat.dto.UserRoomDto;
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
	 * @Description: TODO
	 * @param @param user
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	Integer saveUser(User user, User login);
	
    /**
     * @Description: 用户列表分页查询
     * @param @param userQueryDto
     * @param @return   
     * @return PageInfo  
     * @throws
     * @author chisj chisj@foxmail.com
     * @date 2019年6月2日
     */
    PageInfo queryUserListWithPage(UserQueryDto userQueryDto);

	/**
	 * @Description: TODO
	 * @param @param id
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	Integer deleteUserById(Long id);

	/**
	 * @Description: TODO
	 * @param @param modifyPwdDto
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	Integer modifyPwd(ModifyPwdDto modifyPwdDto, User login);

	/**
	 * @Description: TODO
	 * @param @param userRoomDto
	 * @param @param login
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	Integer checkIn(UserRoomDto userRoomDto, User login);

	/**
	 * @Description: TODO
	 * @param @param userRoomDto
	 * @param @param login
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	Integer checkOut(UserRoomDto userRoomDto, User login);
}
