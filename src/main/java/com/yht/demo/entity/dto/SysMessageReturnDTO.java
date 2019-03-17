package com.yht.demo.entity.dto;

import java.util.Date;

/**
 * 系统消息列表返回值
 */
public class SysMessageReturnDTO {
    /**
     * 推送标题
     */
    private String title;
    /**
     * 推送内容
     */
    private String content;
    /**
     * 封面url
     */
    private String icon;
    /**
     * 项目外链url
     */
    private String productUrl;
    /**
     * 创建时间
     */
    private Date createTime;


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon= icon;
    }

    public String getProductUrl() {
        return productUrl;
    }
    public void setProductUrl(String productUrl) {
        this.productUrl= productUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime= createTime;
    }

}
