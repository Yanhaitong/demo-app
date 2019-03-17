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
 * UV统计表
 * </p>
 *
 * @author
 * @since 2019-03-06
 */
@TableName("uv_statistics")
public class UvStatistics extends Model<UvStatistics> {

    private static final long serialVersionUID = 1L;

    /**
     * id主键
     */
    @TableId(value = "id_", type = IdType.AUTO)
    private Integer id;
    /**
     * 操作的用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 产品id
     */
    @TableField("product_info_id")
    private Integer productInfoId;
    /**
     * 产品标题
     */
    @TableField("title_")
    private String title;
    /**
     * 产品图片url
     */
    @TableField("icon_")
    private String icon;
    /**
     * 用户点击的链接
     */
    @TableField("product_url")
    private String productUrl;
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
     * 是否删除（0:未删除  1:已删除）
     */
    @TableField("del_flag")
    private Integer delFlag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(Integer productInfoId) {
        this.productInfoId = productInfoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
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
        return "UvStatistics{" +
                ", id=" + id +
                ", userId=" + userId +
                ", productInfoId=" + productInfoId +
                ", title=" + title +
                ", icon=" + icon +
                ", productUrl=" + productUrl +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", delFlag=" + delFlag +
                "}";
    }
}
