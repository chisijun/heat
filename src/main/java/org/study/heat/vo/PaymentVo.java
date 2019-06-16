/**  
 * @Title: PaymentVo.java
 * @Package org.study.heat.vo
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;

import org.springframework.format.annotation.DateTimeFormat;
import org.study.heat.base.BaseVo;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * ClassName: PaymentVo 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Data
public class PaymentVo {

	/**
     * 缴费单
     */
    @Id
    private String paymentNo;

    /**
     * 缴费单-年
     */
    private String paymentYear;

    /**
     * 用户Id
     */
    private Long userId;
    
    private String userName;

    /**
     * 面积
     */
    private Float acreage;

    /**
     * 优惠Id
     */
    private Long couponId;
    
    /**
     * 折扣比例
     */
    private Float discount;

    /**
     * 实际费用
     */
    private BigDecimal actfee;

    /**
     * 减免费用
     */
    private BigDecimal redfee;

    /**
     * 缴纳费用
     */
    private BigDecimal fee;

    /**
     * 是否支付 0-待支付 1-已支付
     */
    private Integer isPay;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 0-现金 1-支付宝 2-微信 3-银联
     */
    private Integer payType;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;
    
    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建人ID
     */
    private Long creatorId;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdTime;

    /**
     * 最近操作人
     */
    private String lastOperator;

    /**
     * 最后操作人ID
     */
    private Long lastOperatorId;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
	
	private List<PaymentDetailVo> paymentDetailList;
	
}
