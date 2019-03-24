package com.yht.demo.entity.dto;

import lombok.Data;

/**
 * 产品详情的返回值
 */
@Data
public class LoanProductInfoReturnDTO {

    /**
     * 产品id
     */
    private String id;
    /**
     * 产品标题
     */
    private String title;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 产品描述
     */
    private String description;
    /**
     * 产品说明
     */
    private String explainLabel;
    /**
     * 产品排序
     */
    private String sort;
    /**
     * 贷款利率
     */
    private String interestRate;
    /**
     * 贷款利率类型（0:日利率 1:月利率 2:年利率）
     */
    private String interestRateType;
    /**
     * 申请条件
     */
    private String applyCondition;
    /**
     * 所需资料
     */
    private String needDatum;
    /**
     * 贷款金额范围
     */
    private String loanAmountScope;
    /**
     * 贷款期限范围
     */
    private String loanTimeScope;
    /**
     * 申请人数
     */
    private String applyNum;
    /**
     * 下款时间
     */
    private String obtainTime;
    /**
     * 图标链接地址
     */
    private String iconUrl;
    /**
     * 外部链接地址
     */
    private String url;
    /**
     * 是否隐藏
     */
    private String isHide;

}
