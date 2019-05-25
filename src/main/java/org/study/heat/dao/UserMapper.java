package org.study.heat.dao;

import org.study.heat.pojo.User;

import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {

	/**
	 * @Description: TODO
	 * @param @param loginName
	 * @param @return   
	 * @return User  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月25日
	 */
	User selectByLoginName(String loginName);
}