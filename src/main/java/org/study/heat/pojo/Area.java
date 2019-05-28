package org.study.heat.pojo;

import java.util.Date;

import javax.persistence.*;

import org.study.heat.base.BaseEntity;

import lombok.Data;

@Data
@Table(name = "t_area")
public class Area extends BaseEntity {

    /**
     * 小区名称
     */
    @Column(name = "area_name")
    private String areaName;

    /**
     * 站点Id
     */
    @Column(name = "site_id")
    private Long siteId;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

}