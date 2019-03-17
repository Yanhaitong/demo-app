package com.yht.demo.entity.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="接收用户登录参数")
public class UserReceiveDTO {

    @ApiModelProperty(name = "borrowingAmountStart", value = "贷款金额开始（元）", required = false)
    private String borrowingAmountStart;

    @ApiModelProperty(name = "borrowingAmountEnd", value = "贷款金额结束（元）", required = false)
    private String borrowingAmountEnd;

    @ApiModelProperty(name = "borrowingTimeStart", value = "贷款时间开始(月份)", required = false)
    private String borrowingTimeStart;

    @ApiModelProperty(name = "borrowingTimeEnd", value = "贷款时间结束（月份）", required = false)
    private String borrowingTimeEnd;

    @ApiModelProperty(name = "mobileNo", value = "手机号", required = true)
    private String mobileNo;

    @ApiModelProperty(name = "clientName", value = "客户端姓名", required = true)
    private String clientName;

    @ApiModelProperty(name = "channelName", value = "渠道名称", required = true)
    private String channelName;

    @ApiModelProperty(name = "version", value = "系统版本号", required = true)
    private String version;

    @ApiModelProperty(name = "clientType", value = "客户端类型（0:ios 1:android）", required = true)
    private Integer clientType;

    @ApiModelProperty(name = "code", value = "验证码", required = true)
    private String code;


    public String getBorrowingAmountStart() {
        return borrowingAmountStart;
    }
    public void setBorrowingAmountStart(String borrowingAmountStart) {
        this.borrowingAmountStart = borrowingAmountStart;
    }

    public String getBorrowingAmountEnd() {
        return borrowingAmountEnd;
    }
    public void setBorrowingAmountEnd(String borrowingAmountEnd) {
        this.borrowingAmountEnd = borrowingAmountEnd;
    }

    public String getBorrowingTimeStart() {
        return borrowingTimeStart;
    }
    public void setBorrowingTimeStart(String borrowingTimeStart) {
        this.borrowingTimeStart = borrowingTimeStart;
    }

    public String getBorrowingTimeEnd() {
        return borrowingTimeEnd;
    }
    public void setBorrowingTimeEnd(String borrowingTimeEnd) {
        this.borrowingTimeEnd = borrowingTimeEnd;
    }

    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getChannelName() {
        return channelName;
    }
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getClientType() {
        return clientType;
    }
    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}
