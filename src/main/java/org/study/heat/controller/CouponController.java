/**  
 * @Title: CouponController.java
 * @Package org.study.heat.controller
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
package org.study.heat.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.heat.annotation.Authorization;
import org.study.heat.common.JsonResult;
import org.study.heat.dto.CouponQueryDto;
import org.study.heat.dto.SiteQueryDto;
import org.study.heat.pojo.Coupon;
import org.study.heat.service.CouponService;
import org.study.heat.utils.TimeUtils;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: CouponController 
 * @Description: 优惠管理
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
@RestController
@RequestMapping("/coupon")
public class CouponController {

	@Resource
	private CouponService couponService;
	
	@Authorization
	@PostMapping("/save")
	public JsonResult saveCoupon(Coupon coupon) {
		
		Integer result = couponService.saveCoupon(coupon);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	@Authorization
	@PostMapping("/deleteById/{id}")
	public JsonResult deleteCouponById(@PathVariable Long id) {
		
		Integer result = couponService.deleteCouponById(id);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	@Authorization
	@PostMapping("/queryListWithPage")
	public JsonResult queryCouponListWithPage(CouponQueryDto couponQueryDto) {
		
		PageInfo pageInfo = couponService.queryCouponListWithPage(couponQueryDto);
		
		return new JsonResult(true, "操作成功", pageInfo);
	}
	
	@Authorization
	@PostMapping("/queryUsableListWithPage")
	public JsonResult queryUsableCouponListWithPage(CouponQueryDto couponQueryDto) {
		
		couponQueryDto.setCurrentTime(TimeUtils.getNowTime());
		
		PageInfo pageInfo = couponService.queryCouponListWithPage(couponQueryDto);
		
		return new JsonResult(true, "操作成功", pageInfo);
	}
	
}
