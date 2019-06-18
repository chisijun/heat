/**  
 * @Title: ApplyController.java
 * @Package org.study.heat.controller
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
package org.study.heat.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.heat.annotation.Authorization;
import org.study.heat.annotation.CurrentUser;
import org.study.heat.base.Constant;
import org.study.heat.common.JsonResult;
import org.study.heat.dto.ApplyQueryDto;
import org.study.heat.enums.ApplyTypeEnum;
import org.study.heat.pojo.Apply;
import org.study.heat.pojo.User;
import org.study.heat.service.ApplyService;
import org.study.heat.vo.ApplyTotal;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: ApplyController 
 * @Description: 停栓复热管理
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
@RestController
@RequestMapping("/apply")
public class ApplyController {

	@Resource
	private ApplyService applyService;
	
	/**
	 * 报停申请
	 */
	@Authorization
	@PostMapping("/stop")
	public JsonResult applyStop(@CurrentUser User login, Apply apply) {
		
		apply.setApplyType(Constant.APPLY_TYPE_STOP);
		apply.setStat(Constant.APPLY_STAT_STOP);
		Integer result = applyService.saveApply(apply, login);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * 复热申请
	 */
	@Authorization
	@PostMapping("/start")
	public JsonResult applyStart(@CurrentUser User login, Apply apply) {
		
		apply.setApplyType(Constant.APPLY_TYPE_START);
		apply.setStat(Constant.APPLY_STAT_START);
		Integer result = applyService.saveApply(apply, login);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * 强停
	 */
	@Authorization
	@PostMapping("/strong")
	public JsonResult StrongStop(@CurrentUser User login, Apply apply) {
		
		apply.setApplyType(Constant.APPLY_TYPE_STRONG);
		apply.setStat(Constant.APPLY_STAT_STRONG);
		Integer result = applyService.saveApply(apply, login);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * 审批
	 */
	@Authorization
	@PostMapping("/approval")
	public JsonResult approval(@CurrentUser User login, Apply apply) {
		
		Integer result = applyService.updateApply(apply, login);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * 查询列表
	 */
	@Authorization
	@PostMapping("/queryListWithPage")
	public JsonResult queryApplyListWithPage(ApplyQueryDto applyQueryDto) {
		
		PageInfo pageInfo = applyService.queryApplyListWithPage(applyQueryDto);
		
		return new JsonResult(true, "操作成功", pageInfo);
	}
	
	@Authorization
	@PostMapping("/queryTotal")
	public JsonResult queryApplyTotal() {
		
		List<ApplyTotal> applyTotalList = applyService.queryApplyTotal();
		
		return new JsonResult(true, "操作成功", applyTotalList);
	}
}
