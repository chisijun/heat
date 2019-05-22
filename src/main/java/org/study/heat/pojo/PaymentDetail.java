package org.study.heat.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_payment_detail")
public class PaymentDetail {
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
     * 缴费单
     */
    @Column(name = "payment_no")
    private String paymentNo;

    /**
     * 房间Id
     */
    @Column(name = "room_id")
    private Long roomId;

    /**
     * 房间名称 **小区**栋**单元**房间
     */
    @Column(name = "room_name")
    private String roomName;

    /**
     * 房间类型
     */
    @Column(name = "room_type")
    private BigDecimal roomType;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 房间面积
     */
    private Float acreage;

    /**
     * 费用
     */
    private BigDecimal fee;

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
     * 获取缴费单
     *
     * @return payment_no - 缴费单
     */
    public String getPaymentNo() {
        return paymentNo;
    }

    /**
     * 设置缴费单
     *
     * @param paymentNo 缴费单
     */
    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    /**
     * 获取房间Id
     *
     * @return room_id - 房间Id
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * 设置房间Id
     *
     * @param roomId 房间Id
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取房间名称 **小区**栋**单元**房间
     *
     * @return room_name - 房间名称 **小区**栋**单元**房间
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * 设置房间名称 **小区**栋**单元**房间
     *
     * @param roomName 房间名称 **小区**栋**单元**房间
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * 获取房间类型
     *
     * @return room_type - 房间类型
     */
    public BigDecimal getRoomType() {
        return roomType;
    }

    /**
     * 设置房间类型
     *
     * @param roomType 房间类型
     */
    public void setRoomType(BigDecimal roomType) {
        this.roomType = roomType;
    }

    /**
     * 获取单价
     *
     * @return price - 单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置单价
     *
     * @param price 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取房间面积
     *
     * @return acreage - 房间面积
     */
    public Float getAcreage() {
        return acreage;
    }

    /**
     * 设置房间面积
     *
     * @param acreage 房间面积
     */
    public void setAcreage(Float acreage) {
        this.acreage = acreage;
    }

    /**
     * 获取费用
     *
     * @return fee - 费用
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置费用
     *
     * @param fee 费用
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
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