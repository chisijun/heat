package org.study.heat.dao;

import java.util.List;

import org.study.heat.dto.CouponQueryDto;
import org.study.heat.pojo.Coupon;
import org.study.heat.vo.CouponVo;

import tk.mybatis.mapper.common.Mapper;

public interface CouponMapper extends Mapper<Coupon> {

	/**
	 * @Description: 优惠券分页查询
	 * @param @param couponQueryDto
	 * @param @return   
	 * @return List<CouponVo>  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年5月28日
	 */
	List<CouponVo> queryCouponListWithPage(CouponQueryDto couponQueryDto);
}