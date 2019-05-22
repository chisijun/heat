package org.study.heat.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

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
    private String userId;

    /**
     * 面积
     */
    private Float acreage;

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
    private Date updateTime;

    /**
     * 获取缴费单
     *
     * @return payment_no - 缴费单
     */
    public String getPaymentNo() {
        return paymentNo;
    }

    /**
     * 设置缴费单
     *
     * @param paymentNo 缴费单
     */
    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    /**
     * 获取缴费单-年
     *
     * @return payment_year - 缴费单-年
     */
    public String getPaymentYear() {
        return paymentYear;
    }

    /**
     * 设置缴费单-年
     *
     * @param paymentYear 缴费单-年
     */
    public void setPaymentYear(String paymentYear) {
        this.paymentYear = paymentYear;
    }

    /**
     * 获取用户Id
     *
     * @return user_id - 用户Id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户Id
     *
     * @param userId 用户Id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取面积
     *
     * @return acreage - 面积
     */
    public Float getAcreage() {
        return acreage;
    }

    /**
     * 设置面积
     *
     * @param acreage 面积
     */
    public void setAcreage(Float acreage) {
        this.acreage = acreage;
    }

    /**
     * 获取折扣比例
     *
     * @return discount - 折扣比例
     */
    public Float getDiscount() {
        return discount;
    }

    /**
     * 设置折扣比例
     *
     * @param discount 折扣比例
     */
    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    /**
     * 获取实际费用
     *
     * @return actFee - 实际费用
     */
    public BigDecimal getActfee() {
        return actfee;
    }

    /**
     * 设置实际费用
     *
     * @param actfee 实际费用
     */
    public void setActfee(BigDecimal actfee) {
        this.actfee = actfee;
    }

    /**
     * 获取减免费用
     *
     * @return redFee - 减免费用
     */
    public BigDecimal getRedfee() {
        return redfee;
    }

    /**
     * 设置减免费用
     *
     * @param redfee 减免费用
     */
    public void setRedfee(BigDecimal redfee) {
        this.redfee = redfee;
    }

    /**
     * 获取缴纳费用
     *
     * @return fee - 缴纳费用
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置缴纳费用
     *
     * @param fee 缴纳费用
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 获取是否支付 0-待支付 1-已支付
     *
     * @return is_pay - 是否支付 0-待支付 1-已支付
     */
    public Integer getIsPay() {
        return isPay;
    }

    /**
     * 设置是否支付 0-待支付 1-已支付
     *
     * @param isPay 是否支付 0-待支付 1-已支付
     */
    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取0-现金 1-支付宝 2-微信 3-银联
     *
     * @return pay_type - 0-现金 1-支付宝 2-微信 3-银联
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置0-现金 1-支付宝 2-微信 3-银联
     *
     * @param payType 0-现金 1-支付宝 2-微信 3-银联
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取创建人ID
     *
     * @return creator_id - 创建人ID
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建人ID
     *
     * @param creatorId 创建人ID
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取最近操作人
     *
     * @return last_operator - 最近操作人
     */
    public String getLastOperator() {
        return lastOperator;
    }

    /**
     * 设置最近操作人
     *
     * @param lastOperator 最近操作人
     */
    public void setLastOperator(String lastOperator) {
        this.lastOperator = lastOperator;
    }

    /**
     * 获取最后操作人ID
     *
     * @return last_operator_id - 最后操作人ID
     */
    public Long getLastOperatorId() {
        return lastOperatorId;
    }

    /**
     * 设置最后操作人ID
     *
     * @param lastOperatorId 最后操作人ID
     */
    public void setLastOperatorId(Long lastOperatorId) {
        this.lastOperatorId = lastOperatorId;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}