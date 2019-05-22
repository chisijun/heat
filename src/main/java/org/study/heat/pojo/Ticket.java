package org.study.heat.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_ticket")
public class Ticket {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 缴费单
     */
    @Column(name = "payment_no")
    private String paymentNo;

    /**
     * 发票号码
     */
    @Column(name = "ticket_no")
    private Long ticketNo;

    /**
     * 发票代码
     */
    @Column(name = "ticket_code")
    private String ticketCode;

    /**
     * 购买方
     */
    private String purchaser;

    /**
     * 购买方-纳税人识别号
     */
    @Column(name = "p_taxpayer_code")
    private String pTaxpayerCode;

    /**
     * 购买方-地址&电话
     */
    @Column(name = "p_address_phone")
    private String pAddressPhone;

    /**
     * 购买方-银行&账户
     */
    @Column(name = "p_bank_account")
    private String pBankAccount;

    /**
     * 销售方
     */
    private String seller;

    /**
     * 销售方-纳税人识别号
     */
    @Column(name = "s_taxpayer_code")
    private String sTaxpayerCode;

    /**
     * 销售方-地址&电话
     */
    @Column(name = "s_address_phone")
    private String sAddressPhone;

    /**
     * 销售方-银行&账户
     */
    @Column(name = "s_bank_account")
    private String sBankAccount;

    /**
     * 金额
     */
    private BigDecimal fee;

    /**
     * 税率 13%
     */
    @Column(name = "tax_rate")
    private Integer taxRate;

    /**
     * 税额
     */
    @Column(name = "tax_fee")
    private BigDecimal taxFee;

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
     * 获取ID
     *
     * @return id - ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

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
     * 获取发票号码
     *
     * @return ticket_no - 发票号码
     */
    public Long getTicketNo() {
        return ticketNo;
    }

    /**
     * 设置发票号码
     *
     * @param ticketNo 发票号码
     */
    public void setTicketNo(Long ticketNo) {
        this.ticketNo = ticketNo;
    }

    /**
     * 获取发票代码
     *
     * @return ticket_code - 发票代码
     */
    public String getTicketCode() {
        return ticketCode;
    }

    /**
     * 设置发票代码
     *
     * @param ticketCode 发票代码
     */
    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    /**
     * 获取购买方
     *
     * @return purchaser - 购买方
     */
    public String getPurchaser() {
        return purchaser;
    }

    /**
     * 设置购买方
     *
     * @param purchaser 购买方
     */
    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    /**
     * 获取购买方-纳税人识别号
     *
     * @return p_taxpayer_code - 购买方-纳税人识别号
     */
    public String getpTaxpayerCode() {
        return pTaxpayerCode;
    }

    /**
     * 设置购买方-纳税人识别号
     *
     * @param pTaxpayerCode 购买方-纳税人识别号
     */
    public void setpTaxpayerCode(String pTaxpayerCode) {
        this.pTaxpayerCode = pTaxpayerCode;
    }

    /**
     * 获取购买方-地址&电话
     *
     * @return p_address_phone - 购买方-地址&电话
     */
    public String getpAddressPhone() {
        return pAddressPhone;
    }

    /**
     * 设置购买方-地址&电话
     *
     * @param pAddressPhone 购买方-地址&电话
     */
    public void setpAddressPhone(String pAddressPhone) {
        this.pAddressPhone = pAddressPhone;
    }

    /**
     * 获取购买方-银行&账户
     *
     * @return p_bank_account - 购买方-银行&账户
     */
    public String getpBankAccount() {
        return pBankAccount;
    }

    /**
     * 设置购买方-银行&账户
     *
     * @param pBankAccount 购买方-银行&账户
     */
    public void setpBankAccount(String pBankAccount) {
        this.pBankAccount = pBankAccount;
    }

    /**
     * 获取销售方
     *
     * @return seller - 销售方
     */
    public String getSeller() {
        return seller;
    }

    /**
     * 设置销售方
     *
     * @param seller 销售方
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }

    /**
     * 获取销售方-纳税人识别号
     *
     * @return s_taxpayer_code - 销售方-纳税人识别号
     */
    public String getsTaxpayerCode() {
        return sTaxpayerCode;
    }

    /**
     * 设置销售方-纳税人识别号
     *
     * @param sTaxpayerCode 销售方-纳税人识别号
     */
    public void setsTaxpayerCode(String sTaxpayerCode) {
        this.sTaxpayerCode = sTaxpayerCode;
    }

    /**
     * 获取销售方-地址&电话
     *
     * @return s_address_phone - 销售方-地址&电话
     */
    public String getsAddressPhone() {
        return sAddressPhone;
    }

    /**
     * 设置销售方-地址&电话
     *
     * @param sAddressPhone 销售方-地址&电话
     */
    public void setsAddressPhone(String sAddressPhone) {
        this.sAddressPhone = sAddressPhone;
    }

    /**
     * 获取销售方-银行&账户
     *
     * @return s_bank_account - 销售方-银行&账户
     */
    public String getsBankAccount() {
        return sBankAccount;
    }

    /**
     * 设置销售方-银行&账户
     *
     * @param sBankAccount 销售方-银行&账户
     */
    public void setsBankAccount(String sBankAccount) {
        this.sBankAccount = sBankAccount;
    }

    /**
     * 获取金额
     *
     * @return fee - 金额
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置金额
     *
     * @param fee 金额
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 获取税率 13%
     *
     * @return tax_rate - 税率 13%
     */
    public Integer getTaxRate() {
        return taxRate;
    }

    /**
     * 设置税率 13%
     *
     * @param taxRate 税率 13%
     */
    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 获取税额
     *
     * @return tax_fee - 税额
     */
    public BigDecimal getTaxFee() {
        return taxFee;
    }

    /**
     * 设置税额
     *
     * @param taxFee 税额
     */
    public void setTaxFee(BigDecimal taxFee) {
        this.taxFee = taxFee;
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