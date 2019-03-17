package com.yht.demo.entity.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-03-04
 */
@TableName("sms_config")
public class SystemConfig extends Model<SystemConfig> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("id_")
    private Integer id;
    /**
     * key
     */
    @TableField("key_")
    private String key;
    /**
     * 短信内容
     */
    @TableField("value_")
    private String value;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        return "SystemConfig{" +
        ", id=" + id +
        ", key=" + key +
        ", value=" + value +
        ", createTime=" + createTime +
        ", delFlag=" + delFlag +
        "}";
    }
}
