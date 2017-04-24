package com.yollock.order.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 简单示例, 生产中, 可能要继承功能类, 扩展
 */
public class OrderRequest implements java.io.Serializable {

    /** 序列化标识 */
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;
    /** 订单号 */
    private String orderNo;
    /** 订单类型 */
    private Integer orderType;
    /** 订单类型名称 */
    private String orderTypeName;
    /** 创建人 */
    private String createUser;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /** 修改人 */
    private String updateUser;
    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    /** 是否有效  0：无效，1：有效 */
    private Integer yn;
    /** 开始时间 */
    private Date startTime;
    /** 结束时间 */
    private Date endTime;

    public OrderRequest() {
    }

    public OrderRequest(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getOrderTypeName() {
        return orderTypeName;
    }

    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
