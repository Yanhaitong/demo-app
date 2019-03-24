package com.yht.demo.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "UV点击参数")
@Data
public class UvStatisticsReceiveDTO {

    @ApiModelProperty(name = "token", value = "token", required = true)
    private String token;

    @ApiModelProperty(name = "productId", value = "产品id", required = true)
    private String productId;

    @ApiModelProperty(name = "clientName", value = "客户端名称", required = true)
    private String clientName;

    @ApiModelProperty(name = "channelName", value = "渠道名称", required = true)
    private String channelName;

}
