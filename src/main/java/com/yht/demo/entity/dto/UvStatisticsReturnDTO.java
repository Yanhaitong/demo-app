package com.yht.demo.entity.dto;

import java.util.Date;

/**
 * UV统计返回值
 */
public class UvStatisticsReturnDTO {

    /**
     * 产品标题
     */
    private String title;
    /**
     * 产品图片url
     */
    private String icon;
    /**
     * 用户点击的链接
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UvStatistics{" +
                ", title=" + title +
                ", icon=" + icon +
                ", productUrl=" + productUrl +
                ", createTime=" + createTime +
                "}";
    }
}
