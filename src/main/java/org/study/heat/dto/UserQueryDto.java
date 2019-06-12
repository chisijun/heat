/**  
 * @Title: UserQueryDto.java
 * @Package org.study.heat.dto
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.dto;

import lombok.Data;

import org.study.heat.base.BaseEntity;

/**
 * ClassName: UserQueryDto 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Data
public class UserQueryDto extends BaseEntity {

	/**
	 * 用户姓名
	 */
	private String userName;
	
	/**
	 * 用户类型
	 */
	private String type;
	
}
