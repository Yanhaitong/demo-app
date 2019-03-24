package com.yht.demo.entity.dto;

import lombok.Data;

/**
 * 产品广告信息的返回值
 */
@Data
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
    private String cover;

}
