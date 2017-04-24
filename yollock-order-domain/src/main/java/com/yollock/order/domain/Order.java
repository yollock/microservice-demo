package com.yollock.order.domain;

import java.util.Date;

/**
 * Order：order实体类
 * 
 * @author yollock
 * @version 2017-4-19 10:04:43
 * 
 */
public class Order implements java.io.Serializable  {

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
    private Date createTime; 
    /** 修改人 */
    private String updateUser; 
    /** 修改时间 */
    private Date updateTime; 
    /** 是否有效  0：无效，1：有效 */
    private Integer yn; 
    
    public Long getId(){
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

    public Integer getOrderType(){
        return orderType;
    }
        
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
    
    public String getOrderTypeName(){
        return orderTypeName;
    }
        
    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName;
    }
    
    public String getCreateUser(){
        return createUser;
    }
        
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    
    public Date getCreateTime(){
        return createTime;
    }
        
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public String getUpdateUser(){
        return updateUser;
    }
        
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
    
    public Date getUpdateTime(){
        return updateTime;
    }
        
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public Integer getYn(){
        return yn;
    }
        
    public void setYn(Integer yn) {
        this.yn = yn;
    }
}
