package com.yht.demo.entity.dto;

import lombok.Data;

/**
 * 产品分类信息的返回值
 */
@Data
public class LoanProductClassifyReturnDto {
    /**
     * 分类id
     */
    private String classifyId;
    /**
     * 分类标题
     */
    private String title;
    /**
     * 分类图标url
     */
    private String icon;
    /**
     * 列表页背景图url
     */
    private String backgroundUrl;

}
