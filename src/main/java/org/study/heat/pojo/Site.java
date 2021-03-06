package org.study.heat.pojo;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

import org.study.heat.base.BaseEntity;

@Data
@Table(name = "t_site")
public class Site extends BaseEntity {
	
    /**
     * 热站名称
     */
    @Column(name = "site_name")
    private String siteName;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

}