package org.study.heat.pojo;

import java.util.Date;

import javax.persistence.*;

import org.study.heat.base.BaseEntity;

import lombok.Data;

@Data
@Table(name = "t_his_room")
public class HisRoom extends BaseEntity {

    /**
     * 角色编码
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色名称
     */
    @Column(name = "room_id")
    private Long roomId;

    /**
     * 入住时间
     */
    @Column(name = "check_in")
    private Date checkIn;

    /**
     * 搬出时间
     */
    @Column(name = "check_out")
    private Date checkOut;

    /**
     * 在住状态 1-在住 2-迁出
     */
    private Integer stat;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

}