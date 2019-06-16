package org.study.heat.pojo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.study.heat.base.BaseEntity;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Table(name = "t_payment")
public class Payment {
    /**
     * 缴费单
     */
    @Id
    @Column(name = "payment_no")
    private String paymentNo;

    /**
     * 缴费单-年
     */
    @Column(name = "payment_year")
    private String paymentYear;

    /**
     * 用户Id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 面积
     */
    private Float acreage;

    /**
     * 优惠Id
     */
    @Column(name = "coupon_id")
    private Long couponId;
    
    /**
     * 折扣比例
     */
    private Float discount;

    /**
     * 实际费用
     */
    @Column(name = "actFee")
    private BigDecimal actfee;

    /**
     * 减免费用
     */
    @Column(name = "redFee")
    private BigDecimal redfee;

    /**
     * 缴纳费用
     */
    private BigDecimal fee;

    /**
     * 是否支付 0-待支付 1-已支付
     */
    @Column(name = "is_pay")
    private Integer isPay;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 0-现金 1-支付宝 2-微信 3-银联
     */
    @Column(name = "pay_type")
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
    @Column(name = "creator_id")
    private Long creatorId;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdTime;

    /**
     * 最近操作人
     */
    @Column(name = "last_operator")
    private String lastOperator;

    /**
     * 最后操作人ID
     */
    @Column(name = "last_operator_id")
    private Long lastOperatorId;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    
}