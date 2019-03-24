package com.yht.demo.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="接收用户登录参数")
@Data
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

}
