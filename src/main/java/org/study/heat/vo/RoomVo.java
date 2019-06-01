/**  
 * @Title: RoomVo.java
 * @Package org.study.heat.vo
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.vo;

import javax.persistence.Column;

import lombok.Data;

import org.study.heat.base.BaseVo;

/**
 * ClassName: RoomVo 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Data
public class RoomVo extends BaseVo {

	/**
     * 热站名称
     */
    private String roomNo;

    /**
     * 热站名称
     */
    private String roomName;

    /**
     * 单元
     */
    private Integer unitNo;

    /**
     * 楼层
     */
    private Integer floorNo;

    /**
     * 楼栋Id
     */
    private Long buildingId;

    /**
     * 房间类型
     */
    private Long roomType;

    /**
     * 户型
     */
    private String houseType;

    /**
     * 面积
     */
    private Float acreage;

    /**
     * 供热状态 0-不供热 1-供热 2-报停 3-强停 4-复热
     */
    private Integer heatType;

    /**
     * 用户Id
     */
    private String userId;
    
    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;
	
    /**
     * 热站名称
     */
    private String siteName;
    
    /**
     * 小区名称
     */
    private String areaName;

    /**
     * 楼栋编号
     */
    private String buildingNo;

    /**
     * 楼栋名称
     */
    private String buildingName;
    
}
