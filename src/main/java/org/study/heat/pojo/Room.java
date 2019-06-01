package org.study.heat.pojo;

import java.util.Date;

import javax.persistence.*;

import org.study.heat.base.BaseEntity;

import lombok.Data;

@Data
@Table(name = "t_room")
public class Room extends BaseEntity {

    /**
     * 房间编号
     */
    @Column(name = "room_no")
    private String roomNo;

    /**
     * 房间名称
     */
    @Column(name = "room_name")
    private String roomName;

    /**
     * 单元
     */
    @Column(name = "unit_no")
    private Integer unitNo;

    /**
     * 楼层
     */
    @Column(name = "floor_no")
    private Integer floorNo;

    /**
     * 楼栋Id
     */
    @Column(name = "building_id")
    private Long buildingId;

    /**
     * 房间类型
     */
    @Column(name = "room_type")
    private Long roomType;

    /**
     * 户型
     */
    @Column(name = "house_type")
    private String houseType;

    /**
     * 面积
     */
    private Float acreage;

    /**
     * 供热状态 0-不供热 1-供热 2-报停 3-强停 4-复热
     */
    @Column(name = "heat_type")
    private Integer heatType;

    /**
     * 用户Id
     */
    @Column(name = "user_id")
    private String userId;
    
    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

}