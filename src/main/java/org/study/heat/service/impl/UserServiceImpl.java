/**  
 * @Title: UserServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月16日
 */
package org.study.heat.service.impl;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.study.heat.base.BaseService;
import org.study.heat.dao.UserMapper;
import org.study.heat.pojo.User;
import org.study.heat.service.UserService;
import org.study.heat.utils.MD5;

/**
 * ClassName: UserServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月16日
 */
@Service("userService")
public class UserServiceImpl extends BaseService<User> implements UserService {

	@Resource
	private UserMapper userMapper;
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#selectUserById(java.lang.Integer)
	 */
	@Override
	public User selectUserById(Long userId) {
		// TODO Auto-generated method stub
		
		return userMapper.selectByPrimaryKey(userId);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public User login(String loginName, String password) throws Exception {
		// TODO Auto-generated method stub
		if (loginName == null || password == null) {
            throw new RuntimeException("参数传递异常");
        }

        if (StringUtils.isBlank(loginName)) {
            throw new RuntimeException("请输入用户名！");
        }

        if (StringUtils.isBlank(password)) {
            throw new RuntimeException("请输入密码！");
        }

        // 密码加密 
        /** 
         * 通过手机号码校验 
         * */
        password = MD5.getMd5().getMD5ofStr(password);
        User user = userMapper.selectByLoginName(loginName);

        if (user== null) {
            throw new RuntimeException("用户名不存在.");
        }
        
        System.out.println("user = " + user);
        
        System.out.println("password = " + password);
        System.out.println("pwd = " + user.getLoginPwd());
        if (!password.equals(user.getLoginPwd())) {
        	throw new RuntimeException("密码错误.");
        }
        
        return user;
	}

}
