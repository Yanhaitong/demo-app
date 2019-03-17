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
 * 产品广告配置表
 * </p>
 *
 * @author 
 * @since 2019-03-08
 */
@TableName("loan_product_advertising")
public class LoanProductAdvertising extends Model<LoanProductAdvertising> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id_", type = IdType.AUTO)
    private Integer id;
    /**
     * 产品信息id
     */
    @TableField("product_info_id")
    private Integer productInfoId;
    /**
     * 贷款产品url
     */
    @TableField("icon_")
    private String icon;
    /**
     * 封面图url
     */
    @TableField("cover_")
    private String cover;
    /**
     * 广告位置（0:启动图， 1:首页弹框， 2:首页轮播图）
     */
    @TableField("type_")
    private Integer type;
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
     * 删除标记（0:未删除 1:已删除）
     */
    @TableField("del_flag")
    private Integer delFlag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(Integer productInfoId) {
        this.productInfoId = productInfoId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        return "LoanProductAdvertising{" +
        ", id=" + id +
        ", productInfoId=" + productInfoId +
        ", icon=" + icon +
        ", cover=" + cover +
        ", type=" + type +
        ", clientName=" + clientName +
        ", channelName=" + channelName +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", delFlag=" + delFlag +
        "}";
    }
}
