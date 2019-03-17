package com.yht.demo.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 产品基础信息表
 * </p>
 *
 * @author
 * @since 2019-03-08
 */
@TableName("loan_product_info")
public class LoanProductInfo extends Model<LoanProductInfo> {

  private static final long serialVersionUID = 1L;
  /**
   * 申请条件
   */
  @TableField("apply_condition")
  private String applyCondition;
  /**
   * 申请人数
   */
  @TableField("apply_num")
  private String applyNum;
  /**
   * 创建时间
   */
  @TableField("create_time")
  private Date createTime;
  /**
   * 删除标记（0:未删除 1:已删除）
   */
  @TableField("del_flag")
  private Integer delFlag;
  /**
   * 产品描述
   */
  @TableField("description_")
  private String description;
  /**
   * 产品说明
   */
  @TableField("explain_label")
  private String explainLabel;
  /**
   * 图标链接地址
   */
  @TableField("icon_url")
  private String iconUrl;
  /**
   * 主键
   */
  @TableId(value = "id_", type = IdType.AUTO)
  private Integer id;
  /**
   * 贷款利率
   */
  @TableField("interest_rate")
  private String interestRate;
  /**
   * 贷款利率类型（0:日利率 1:月利率 2:年利率）
   */
  @TableField("interest_rate_type")
  private Integer interestRateType;
  /**
   * 是否隐藏
   */
  @TableField("is_hide")
  private Integer isHide;
  /**
   * 贷款金额范围
   */
  @TableField("loan_amount_scope")
  private String loanAmountScope;
  /**
   * 贷款期限范围
   */
  @TableField("loan_time_scope")
  private String loanTimeScope;
  /**
   * 产品名称
   */
  @TableField("name_")
  private String name;
  /**
   * 所需资料
   */
  @TableField("need_datum")
  private String needDatum;
  /**
   * 下款时间
   */
  @TableField("obtain_time")
  private String obtainTime;
  /**
   * 产品排序
   */
  @TableField("sort_")
  private Integer sort;
  /**
   * 产品标题
   */
  @TableField("title_")
  private String title;
  /**
   * 更新时间
   */
  @TableField("update_time")
  private Date updateTime;
  /**
   * 产品url
   */
  @TableField("url_")
  private String url;

  public String getApplyCondition() {
    return applyCondition;
  }

  public void setApplyCondition(String applyCondition) {
    this.applyCondition = applyCondition;
  }

  public String getApplyNum() {
    return applyNum;
  }

  public void setApplyNum(String applyNum) {
    this.applyNum = applyNum;
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

  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(String interestRate) {
    this.interestRate = interestRate;
  }

  public Integer getInterestRateType() {
    return interestRateType;
  }

  public void setInterestRateType(Integer interestRateType) {
    this.interestRateType = interestRateType;
  }

  public Integer getIsHide() {
    return isHide;
  }

  public void setIsHide(Integer isHide) {
    this.isHide = isHide;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNeedDatum() {
    return needDatum;
  }

  public void setNeedDatum(String needDatum) {
    this.needDatum = needDatum;
  }

  public String getObtainTime() {
    return obtainTime;
  }

  public void setObtainTime(String obtainTime) {
    this.obtainTime = obtainTime;
  }

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "LoanProductInfo{" +
        ", id=" + id +
        ", title=" + title +
        ", name=" + name +
        ", description=" + description +
        ", explainLabel=" + explainLabel +
        ", sort=" + sort +
        ", interestRate=" + interestRate +
        ", interestRateType=" + interestRateType +
        ", applyCondition=" + applyCondition +
        ", needDatum=" + needDatum +
        ", loanAmountScope=" + loanAmountScope +
        ", loanTimeScope=" + loanTimeScope +
        ", applyNum=" + applyNum +
        ", obtainTime=" + obtainTime +
        ", iconUrl=" + iconUrl +
        ", isHide=" + isHide +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", delFlag=" + delFlag +
        "}";
  }

  @Override
  protected Serializable pkVal() {
    return this.id;
  }


}
