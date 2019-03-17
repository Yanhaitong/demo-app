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
 * 产品分类表
 * </p>
 *
 * @author
 * @since 2019-03-02
 */
@TableName("loan_product_classify")
public class LoanProductClassify extends Model<LoanProductClassify> {

    private static final long serialVersionUID = 1L;

    /**
     * id主键
     */
    @TableId(value = "id_", type = IdType.AUTO)
    private Integer id;
    /**
     * 客户端名称
     */
    @TableField("client_name")
    private String clientName;
    /**
     * 分类标题
     */
    @TableField("title_")
    private String title;
    /**
     * 分类图标url
     */
    @TableField("icon_")
    private String icon;
    /**
     * 列表页背景图url
     */
    @TableField("background_url")
    private String backgroundUrl;
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

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
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

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
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
        return "LoanProductClassify{" +
                ", id=" + id +
                ", clientName=" + clientName +
                ", title=" + title +
                ", icon=" + icon +
                ", backgroundUrl=" + backgroundUrl +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", delFlag=" + delFlag +
                "}";
    }
}
