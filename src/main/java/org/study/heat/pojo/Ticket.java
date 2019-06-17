package org.study.heat.pojo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import org.study.heat.base.BaseEntity;

import lombok.Data;

@Data
@Table(name = "t_ticket")
public class Ticket extends BaseEntity {

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
     * 开票日期
     */
    @Column(name = "ticket_date")
    private String ticketDate;
    
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
}