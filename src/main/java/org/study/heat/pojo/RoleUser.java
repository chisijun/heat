package org.study.heat.pojo;

import javax.persistence.*;

import lombok.Data;

@Data
@Table(name = "t_role_user")
public class RoleUser {
	
    @Id
    @Column(name = "role_id")
    private Long roleId;

    @Id
    @Column(name = "user_id")
    private Long userId;
}