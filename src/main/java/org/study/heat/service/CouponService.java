/**  
 * @Title: CouponService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.service;

import org.study.heat.base.IService;
import org.study.heat.dto.CouponQueryDto;
import org.study.heat.pojo.Coupon;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: CouponService 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
public interface CouponService extends IService<Coupon> {

	/**
	 * @Description: 分页查询优惠信息
	 * @param @param couponQueryDto
	 * @param @return   
	 * @return PageInfo  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	PageInfo queryCouponListWithPage(CouponQueryDto couponQueryDto);

	/**
	 * @Description: TODO
	 * @param @param coupon
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	Integer saveCoupon(Coupon coupon);

	/**
	 * @Description: TODO
	 * @param @param id
	 * @param @return   
	 * @return Integer  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	Integer deleteCouponById(Long id);

}
