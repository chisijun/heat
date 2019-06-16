package org.study.heat.pojo;

import lombok.Data;
import org.study.heat.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "t_payment_detail")
public class PaymentDetail extends BaseEntity {

    /**
     * 缴费单
     */
    @Column(name = "payment_no")
    private String paymentNo;

    /**
     * 房间Id
     */
    @Column(name = "room_id")
    private Long roomId;

    /**
     * 房间名称 **小区**栋**单元**房间
     */
    @Column(name = "room_name")
    private String roomName;

    /**
     * 房间类型
     */
    @Column(name = "room_type")
    private Long roomType;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 房间面积
     */
    private Float acreage;

    /**
     * 费用
     */
    private BigDecimal fee;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

}