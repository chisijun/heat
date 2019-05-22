package org.study.heat.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_room")
public class Room {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 热站名称
     */
    @Column(name = "room_no")
    private String roomNo;

    /**
     * 热站名称
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
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建人ID
     */
    @Column(name = "creator_id")
    private Long creatorId;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 最近操作人
     */
    @Column(name = "last_operator")
    private String lastOperator;

    /**
     * 最后操作人ID
     */
    @Column(name = "last_operator_id")
    private Long lastOperatorId;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取热站名称
     *
     * @return room_no - 热站名称
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * 设置热站名称
     *
     * @param roomNo 热站名称
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    /**
     * 获取热站名称
     *
     * @return room_name - 热站名称
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * 设置热站名称
     *
     * @param roomName 热站名称
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * 获取单元
     *
     * @return unit_no - 单元
     */
    public Integer getUnitNo() {
        return unitNo;
    }

    /**
     * 设置单元
     *
     * @param unitNo 单元
     */
    public void setUnitNo(Integer unitNo) {
        this.unitNo = unitNo;
    }

    /**
     * 获取楼层
     *
     * @return floor_no - 楼层
     */
    public Integer getFloorNo() {
        return floorNo;
    }

    /**
     * 设置楼层
     *
     * @param floorNo 楼层
     */
    public void setFloorNo(Integer floorNo) {
        this.floorNo = floorNo;
    }

    /**
     * 获取楼栋Id
     *
     * @return building_id - 楼栋Id
     */
    public Long getBuildingId() {
        return buildingId;
    }

    /**
     * 设置楼栋Id
     *
     * @param buildingId 楼栋Id
     */
    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    /**
     * 获取房间类型
     *
     * @return room_type - 房间类型
     */
    public Long getRoomType() {
        return roomType;
    }

    /**
     * 设置房间类型
     *
     * @param roomType 房间类型
     */
    public void setRoomType(Long roomType) {
        this.roomType = roomType;
    }

    /**
     * 获取户型
     *
     * @return house_type - 户型
     */
    public String getHouseType() {
        return houseType;
    }

    /**
     * 设置户型
     *
     * @param houseType 户型
     */
    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    /**
     * 获取面积
     *
     * @return acreage - 面积
     */
    public Float getAcreage() {
        return acreage;
    }

    /**
     * 设置面积
     *
     * @param acreage 面积
     */
    public void setAcreage(Float acreage) {
        this.acreage = acreage;
    }

    /**
     * 获取供热状态 0-不供热 1-供热 2-报停 3-强停 4-复热
     *
     * @return heat_type - 供热状态 0-不供热 1-供热 2-报停 3-强停 4-复热
     */
    public Integer getHeatType() {
        return heatType;
    }

    /**
     * 设置供热状态 0-不供热 1-供热 2-报停 3-强停 4-复热
     *
     * @param heatType 供热状态 0-不供热 1-供热 2-报停 3-强停 4-复热
     */
    public void setHeatType(Integer heatType) {
        this.heatType = heatType;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取创建人ID
     *
     * @return creator_id - 创建人ID
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建人ID
     *
     * @param creatorId 创建人ID
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取最近操作人
     *
     * @return last_operator - 最近操作人
     */
    public String getLastOperator() {
        return lastOperator;
    }

    /**
     * 设置最近操作人
     *
     * @param lastOperator 最近操作人
     */
    public void setLastOperator(String lastOperator) {
        this.lastOperator = lastOperator;
    }

    /**
     * 获取最后操作人ID
     *
     * @return last_operator_id - 最后操作人ID
     */
    public Long getLastOperatorId() {
        return lastOperatorId;
    }

    /**
     * 设置最后操作人ID
     *
     * @param lastOperatorId 最后操作人ID
     */
    public void setLastOperatorId(Long lastOperatorId) {
        this.lastOperatorId = lastOperatorId;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}