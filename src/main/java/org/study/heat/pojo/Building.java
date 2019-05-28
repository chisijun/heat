package org.study.heat.pojo;

import java.util.Date;

import javax.persistence.*;

import org.study.heat.base.BaseEntity;

import lombok.Data;

@Data
@Table(name = "t_building")
public class Building extends BaseEntity {

    /**
     * 热站名称
     */
    @Column(name = "building_no")
    private String buildingNo;

    /**
     * 热站名称
     */
    @Column(name = "building_name")
    private String buildingName;

    /**
     * 单元
     */
    @Column(name = "unit_size")
    private Integer unitSize;

    /**
     * 楼层
     */
    @Column(name = "floor_size")
    private Integer floorSize;

    /**
     * 小区Id
     */
    @Column(name = "area_id")
    private Long areaId;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;
}