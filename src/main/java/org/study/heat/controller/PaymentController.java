/**  
 * @Title: PaymentController.java
 * @Package org.study.heat.controller
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
package org.study.heat.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.study.heat.annotation.Authorization;
import org.study.heat.common.JsonResult;
import org.study.heat.dto.OnlinePayDto;
import org.study.heat.dto.PaymentQueryDto;
import org.study.heat.dto.TicketQueryDto;
import org.study.heat.entity.TokenModel;
import org.study.heat.pojo.Payment;
import org.study.heat.service.PaymentDetaiService;
import org.study.heat.service.PaymentService;
import org.study.heat.service.TokenManager;
import org.study.heat.utils.alipay.AliPayConfig;
import org.study.heat.utils.alipay.AlipayTrade;
import org.study.heat.vo.PaymentDetailVo;

import com.github.pagehelper.PageInfo;


/**
 * ClassName: PaymentController 
 * @Description: 缴费管理
 * @author chisj chisj@foxmail.com
 * @date 2019年5月22日
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Resource
	private TokenManager tokenManager;
	
	@Resource
	private PaymentService paymentService;
	
	@Resource
	private PaymentDetaiService paymentDetaiService;
	
	@Authorization
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public JsonResult savePayment(Payment payment) {
		
		Integer result = paymentService.savePayment(payment);
		if (result < 1) {
			return new JsonResult(false, "操作失败", result);
		}
		
		return new JsonResult(true, "操作成功", result);
	}
	
	/**
	 * 查询缴费单
	 */
	@Authorization
	@RequestMapping(value = "/queryListWithPage", method = RequestMethod.POST)
	public JsonResult queryPaymentListWithPage(PaymentQueryDto paymentQueryDto) {
		
		//PageInfo pageInfo = paymentService.queryPaymentListWithPage(paymentQueryDto);
		if (paymentService == null) {
			System.out.println("=====chisj:paymentService is null");
		}
		System.out.println("=====chisj:paymentService is not null");
		PageInfo pageInfo = paymentService.queryTicketListWithPage(new TicketQueryDto());
		
		return new JsonResult(true, "操作成功", null);
	}
	
	@Authorization
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public JsonResult test(PaymentQueryDto paymentQueryDto) {
		
		//PageInfo pageInfo = paymentService.queryPaymentListWithPage(paymentQueryDto);
		if (paymentService == null) {
			System.out.println("=====chisj:paymentService is null");
		}
		System.out.println("=====chisj:paymentService is not null");
		PageInfo pageInfo = paymentService.queryTicketListWithPage(new TicketQueryDto());
		
		return new JsonResult(true, "操作成功", null);
	}
	
	/**
	 * 票据列表
	 */
	@Authorization
	@PostMapping("/queryTicketListWithPage")
	private JsonResult queryTicketListWithPage() {
		
		//PageInfo pageInfo = ticketService.queryTicketListWithPage(ticketQueryDto);
		if (paymentService == null) {
			System.out.println("=====chisj:paymentService is null");
		}
		System.out.println("=====chisj:paymentService is not null");
		PageInfo pageInfo = paymentService.queryTicketListWithPage(new TicketQueryDto());
		
		return new JsonResult(true, "操作成功", pageInfo);
	}
	
	/**
	 * 查询缴费单详情
	 */
	@Authorization
	@RequestMapping(value = "/queryPaymentDetailByPaymentNo/{paymentNo}", method = RequestMethod.POST)
	public JsonResult queryPaymentDetailByPaymentNo(@PathVariable String paymentNo) {
		
		PaymentDetailVo paymentDetailVo = paymentDetaiService.queryPaymentDetailByPaymentNo(paymentNo);
		
		return new JsonResult(true, "操作成功", paymentDetailVo);
	}
	
	/**
	 * 在线支付
	 */
	@RequestMapping(value = "/onlinePay")
	public void onlinePay(HttpServletResponse response, HttpServletRequest request, OnlinePayDto onlinePayDto)
					throws ServletException, IOException {
		/* 返回上传结果 */
        response.setCharacterEncoding("UTF-8");
        /* 解决文件上传跨域问题 */
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("origin"));
        response.setContentType("text/html;charset=" + AliPayConfig.CHARSET);
        
		boolean result = true;
		String form = null;
	
        TokenModel model = tokenManager.getToken(onlinePayDto.getToken());
	    if (!tokenManager.checkToken(model)) {
	        //如果token验证失败
	        result = false;
	        
	    }
        
        if (!result) {
        	/* 返回错误信息 */
            JSONObject jsObject =JSONObject.fromObject(new JsonResult(false, "在线支付参数检验失败", "token校验失败"));
            //form = new String(jsObject.toString().getBytes("ISO-8859-1"),"UTF-8");
            form = jsObject.toString();
        } else {
        	// String orderId = UtilDate.getOrderNum();
        	if (onlinePayDto.getPayType().equals(1)) {
        		// 暂不处理银联支付
        		
        		// 银联支付
        		//UnionPayTrade unionPayTrade = new UnionPayTrade();
                //Map<String,String> paramMap = new HashMap<String,String>();
                //paramMap.put("txnAmt", param.getTotalAmount() + "00");  //交易金额，单位分，不要带小数点
                //paramMap.put("orderId", orderId);
                // 订单超时时间。
        		// 超过此时间后，除网银交易外，其他交易银联系统会拒绝受理，提示超时。 跳转银行网银交易如果超时后交易成功，会自动退款，大约5个工作日金额返还到持卡人账户。
        		// 此时间建议取支付时的北京时间加15分钟。
        		// 超过超时时间调查询接口应答origRespCode不是A6或者00的就可以判断为失败。
                //paramMap.put("payTimeout", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date().getTime() + 15 * 60 * 1000));
                //form = unionPayTrade.tokenOpen(paramMap, null);
        	}
        	if (onlinePayDto.getPayType().equals(2)) {
        		// 支付宝支付
        		AlipayTrade alipayTrade = new AlipayTrade();
        		Map<String,String> paraMap = new HashMap<String,String>();
        		paraMap.put("out_trade_no", "20190610");	// 订单号
        		paraMap.put("total_amount", onlinePayDto.getTotalAmount().toString());	// 充值金额
                paraMap.put("subject","供暖费款项");		// 名称
                /**
                 *  所有支付接口开始计时都是订单创建开始计时，不同接口对于timeout_express计时方式是不同的。 
  				 *  取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 
  				 *  该参数数值不接受小数点， 如 1.5h，可转换为 90m。 
  				 *  如果不设置该参数默认15天订单关闭 
                 */
                paraMap.put("timeout_express", "15m");	// 过期时间
                if (StringUtils.isNotBlank(onlinePayDto.getRemark())) {
                	paraMap.put("body", onlinePayDto.getRemark());	// 备注
                } else {
                	paraMap.put("body", "暂无付款说明");
                }
                paraMap.put("product_code", "QUICK_WAP_PAY");	// 支付方式
                form = alipayTrade.TradeWapPayRequest(paraMap);
        	}
        	// 创建支付工单
//            PayOrder payOrder = new PayOrder();
//            payOrder.setOrderId(orderId);
//            payOrder.setBody(param.getBody());
//            payOrder.setAmount(param.getTotalAmount().toString());
//            payOrder.setUserId(model.getUserId());
//            payOrder.setForm(form);
//            payOrderService.payOrderCreat(payOrder);
        }
		
        response.getWriter().write(form); //直接将完整的表单html输出到页面
        response.getWriter().flush();
        response.getWriter().close();
	}
	
	/**
	 * 阿里在线支付成功处理
	 */
	@RequestMapping(value = "/aliPayNotify")
	public void aliPayNotify(HttpServletResponse response, HttpServletRequest request) {
		
		Map<String,String> params = new HashMap<String,String>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			//乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
			//valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
			params.put(name, valueStr);
		}
		
//		PayOrder payOrder = payOrderService.getPayOrder(params.get("out_trade_no"));
//		if (payOrder != null) {
//			Record record = new Record();
//			record.setAcceptAccount(params.get("seller_email"));
//			record.setAcceptName("小禾科技");
//			record.setAmount(Integer.parseInt(payOrder.getAmount()));
//			record.setOrderNo(params.get("out_trade_no"));
//			record.setPayAccount(params.get("buyer_logon_id"));
//			record.setPayDate(TimeUtils.getNowTime()); // params.get("gmt_payment")
//			record.setPayType("支付宝在线支付");
//			record.setRemark(payOrder.getBody());
//			record.setUserId(payOrder.getUserId());
//			recordService.addRecord(record);
//		}
		
		System.out.println("aliPayNotify params = " + params.toString());
	}
	
	/**
	 * 银联在线支付成功处理
	 */
	@RequestMapping(value = "/unionPayNotify")
	public void unionPayNotify(HttpServletResponse response, HttpServletRequest request) {
		Map<String,String> params = new HashMap<String,String>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			//乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
			//valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
			params.put(name, valueStr);
		}
		
//		PayOrder payOrder = payOrderService.getPayOrder(params.get("orderId"));
//		if (payOrder != null) {
//			Record record = new Record();
//			record.setAcceptAccount(params.get("merId"));
//			record.setAcceptName("小禾科技");
//			record.setAmount(Integer.parseInt(payOrder.getAmount()));
//			record.setOrderNo(params.get("orderId"));
//			record.setPayAccount(params.get("accNo"));
//			record.setPayDate(TimeUtils.getNowTime());
//			record.setPayType("银联在线支付");
//			record.setRemark(payOrder.getBody());
//			record.setUserId(payOrder.getUserId());
//			recordService.addRecord(record);
//		}
		
		System.out.println("unionPayNotify params = " + params.toString());
		
	}
}
