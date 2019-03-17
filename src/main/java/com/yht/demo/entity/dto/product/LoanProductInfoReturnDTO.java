package com.yht.demo.entity.dto.product;

/**
 * 产品详情的返回值
 */
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExplainLabel() {
        return explainLabel;
    }

    public void setExplainLabel(String explainLabel) {
        this.explainLabel = explainLabel;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getInterestRateType() {
        return interestRateType;
    }

    public void setInterestRateType(String interestRateType) {
        this.interestRateType = interestRateType;
    }

    public String getApplyCondition() {
        return applyCondition;
    }

    public void setApplyCondition(String applyCondition) {
        this.applyCondition = applyCondition;
    }

    public String getNeedDatum() {
        return needDatum;
    }

    public void setNeedDatum(String needDatum) {
        this.needDatum = needDatum;
    }

    public String getLoanAmountScope() {
        return loanAmountScope;
    }

    public void setLoanAmountScope(String loanAmountScope) {
        this.loanAmountScope = loanAmountScope;
    }

    public String getLoanTimeScope() {
        return loanTimeScope;
    }

    public void setLoanTimeScope(String loanTimeScope) {
        this.loanTimeScope = loanTimeScope;
    }

    public String getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(String applyNum) {
        this.applyNum = applyNum;
    }

    public String getObtainTime() {
        return obtainTime;
    }

    public void setObtainTime(String obtainTime) {
        this.obtainTime = obtainTime;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIsHide() {
        return isHide;
    }

    public void setIsHide(String isHide) {
        this.isHide = isHide;
    }

}