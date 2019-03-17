package com.yht.demo.entity.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 渠道表
 * </p>
 *
 * @author 
 * @since 2019-03-02
 */
@TableName("channel_")
public class Channel extends Model<Channel> {

    private static final long serialVersionUID = 1L;

    /**
     * id主键
     */
    @TableId(value = "id_", type = IdType.AUTO)
    private Integer id;
    /**
     * 渠道名称
     */
    @TableField("name_")
    private String name;
    /**
     * 是否在使用（0:未使用 1:在使用）
     */
    @TableField("inuse_")
    private Integer inuse;
    /**
     * 分类名称
     */
    @TableField("classify_")
    private String classify;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInuse() {
        return inuse;
    }

    public void setInuse(Integer inuse) {
        this.inuse = inuse;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
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
        return "Channel{" +
        ", id=" + id +
        ", name=" + name +
        ", inuse=" + inuse +
        ", classify=" + classify +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", delFlag=" + delFlag +
        "}";
    }
}
