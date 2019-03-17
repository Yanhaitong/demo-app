package com.yht.demo.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 产品配置表
 * </p>
 *
 * @author 
 * @since 2019-03-08
 */
@TableName("loan_product")
public class LoanProduct extends Model<LoanProduct> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id_", type = IdType.AUTO)
    private Integer id;
    /**
     * 产品基本信息id
     */
    @TableField("product_info_id")
    private Integer productInfoId;
    /**
     * 产品分类id
     */
    @TableField("classify_id")
    private Integer classifyId;
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
     * 是否推荐（0:否 1:是）
     */
    @TableField("is_recommend")
    private Integer isRecommend;
    /**
     * 是否精选（0:否 1:是）
     */
    @TableField("is_carefully_select")
    private Integer isCarefullySelect;
    /**
     * 是否最新产品（0:否 1:是）
     */
    @TableField("is_latest_product")
    private Integer isLatestProduct;
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

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
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

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getIsCarefullySelect() {
        return isCarefullySelect;
    }

    public void setIsCarefullySelect(Integer isCarefullySelect) {
        this.isCarefullySelect = isCarefullySelect;
    }

    public Integer getIsLatestProduct() {
        return isLatestProduct;
    }

    public void setIsLatestProduct(Integer isLatestProduct) {
        this.isLatestProduct = isLatestProduct;
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
        return "LoanProduct{" +
        ", id=" + id +
        ", productInfoId=" + productInfoId +
        ", classifyId=" + classifyId +
        ", clientName=" + clientName +
        ", channelName=" + channelName +
        ", isRecommend=" + isRecommend +
        ", isCarefullySelect=" + isCarefullySelect +
        ", isLatestProduct=" + isLatestProduct +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", delFlag=" + delFlag +
        "}";
    }
}
