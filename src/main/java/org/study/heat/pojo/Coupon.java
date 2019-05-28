package org.study.heat.pojo;

import java.util.Date;

import javax.persistence.*;

import org.study.heat.base.BaseEntity;

import lombok.Data;

@Data
@Table(name = "t_coupon")
public class Coupon extends BaseEntity {

    /**
     * 有效期开始
     */
    @Column(name = "period_start")
    private String periodStart;

    /**
     * 有效期结束
     */
    @Column(name = "period_end")
    private String periodEnd;

    /**
     * 减免比例
     */
    private Integer discount;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

}