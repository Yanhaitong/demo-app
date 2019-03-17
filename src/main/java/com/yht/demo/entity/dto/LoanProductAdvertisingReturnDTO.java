package com.yht.demo.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;

/**
 * 产品广告信息的返回值
 */
public class LoanProductAdvertisingReturnDTO {

    /**
     * 产品id
     */
    private String productId;
    /**
     * 产品外链url
     */
    private String productUrl;
    /**
     * 封面图url
     */
    @TableField("cover_")
    private String cover;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

}
