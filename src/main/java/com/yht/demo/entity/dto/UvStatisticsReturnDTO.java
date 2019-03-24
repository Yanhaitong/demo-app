package com.yht.demo.entity.dto;

import lombok.Data;

import java.util.Date;

/**
 * UV统计返回值
 */
@Data
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

}
