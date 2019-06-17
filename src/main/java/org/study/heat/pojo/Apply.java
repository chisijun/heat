package org.study.heat.pojo;

import java.util.Date;

import javax.persistence.*;

import org.study.heat.base.BaseEntity;

import lombok.Data;

@Data
@Table(name = "t_apply")
public class Apply extends BaseEntity {

    /**
     * 用户Id
     */
    @Column(name = "user_id")
    private Long userId;
    
    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 房间Id
     */
    @Column(name = "room_id")
    private Long roomId;
    
    /**
     * 房间名称
     */
    @Column(name = "room_name")
    private String roomName;

    /**
     * 类型 0-报停 1-强停 2-复热
     */
    @Column(name = "apply_type")
    private Integer applyType;

    /**
     * 0 - 报停申请 1 - 报停完成 2 - 强停完成 3 - 复热申请 4 - 复热完成
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