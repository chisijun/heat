/**  
 * @Title: CouponServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.study.heat.base.BaseService;
import org.study.heat.dao.CouponMapper;
import org.study.heat.dto.CouponQueryDto;
import org.study.heat.pojo.Coupon;
import org.study.heat.pojo.Payment;
import org.study.heat.service.CouponService;
import org.study.heat.service.PaymentService;
import org.study.heat.vo.CouponVo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName: CouponServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Slf4j
@Service
@Transactional
public class CouponServiceImpl extends BaseService<Coupon> implements CouponService {
	
	@Resource
	private CouponMapper couponDao;
	
	@Resource
	private PaymentService PaymentService;
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.CouponService#queryCouponListWithPage(org.study.heat.dto.CouponQueryDto)
	 */
	@Override
	public PageInfo queryCouponListWithPage(CouponQueryDto couponQueryDto) {
		// TODO Auto-generated method stub
		
		PageHelper.startPage(couponQueryDto.getPageNum(), couponQueryDto.getPageSize());
		List<CouponVo> couponVoList = couponDao.queryCouponListWithPage(couponQueryDto);
		
		return new PageInfo<>(couponVoList);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.CouponService#saveCoupon(org.study.heat.pojo.Coupon)
	 */
	@Override
	public Integer saveCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		
		if (coupon.isNew()) {
			return couponDao.insertSelective(coupon);
		} else {
			// 校验是否在使用
			Payment payment = new Payment();
			payment.setCouponId(coupon.getId());
			int count = PaymentService.selectCount(payment);
			if (count > 0) {
				throw new RuntimeException("优惠券正在使用中");
			}
			
			return couponDao.updateByPrimaryKeySelective(coupon);
		}
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.CouponService#deleteCouponById(java.lang.Long)
	 */
	@Override
	public Integer deleteCouponById(Long id) {
		// TODO Auto-generated method stub
		
		// 校验是否在使用
		Payment payment = new Payment();
		payment.setCouponId(id);
		int count = PaymentService.selectCount(payment);
		if (count > 0) {
			throw new RuntimeException("优惠券正在使用中");
		}
		
		return couponDao.deleteByPrimaryKey(id);
	}

	
	
}
