/**  
 * @Title: CouponQueryDto.java
 * @Package org.study.heat.dto
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.dto;

import lombok.Data;

import org.study.heat.base.BaseEntity;
import org.study.heat.utils.TimeUtils;

/**
 * ClassName: CouponQueryDto 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Data
public class CouponQueryDto extends BaseEntity {

	private String currentTime = TimeUtils.getNowTime();
	
}
