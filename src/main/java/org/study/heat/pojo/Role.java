package org.study.heat.pojo;

import javax.persistence.*;

import lombok.Data;

import org.study.heat.base.BaseEntity;

@Data
@Table(name = "t_role")
public class Role extends BaseEntity {
	
    /**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 2035631706016749560L;

    /**
     * 角色编码
     */
    @Column(name = "role_code")
    private String roleCode;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

}