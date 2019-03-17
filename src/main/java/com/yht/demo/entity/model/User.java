package com.yht.demo.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author 
 * @since 2019-03-02
 */
@TableName("user_")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id_", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户姓名
     */
    @TableField("name_")
    private String name;
    /**
     * 账号
     */
    @TableField("account_")
    private String account;
    /**
     * 密码
     */
    @TableField("password_")
    private String password;
    /**
     * 客户端类型（0:ios 1:android）
     */
    @TableField("client_type")
    private Integer clientType;
    /**
     * 移动手机号
     */
    @TableField("mobile_no")
    private String mobileNo;
    /**
     * 客户端名称
     */
    @TableField("client_name")
    private String clientName;
    /**
     * 渠道名称
     */
    @TableField("channel_name")
    private String channelName;
    /**
     * 版本号
     */
    @TableField("version_")
    private String version;
    /**
     * 最后登录时间
     */
    @TableField("login_time")
    private Date loginTime;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 是否删除（0:未删除 1:已删除）
     */
    @TableField("del_flag")
    private Integer delFlag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", name=" + name +
        ", account=" + account +
        ", password=" + password +
        ", mobileNo=" + mobileNo +
        ", clientName=" + clientName +
        ", channelName=" + channelName +
        ", version=" + version +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", delFlag=" + delFlag +
        "}";
    }
}
