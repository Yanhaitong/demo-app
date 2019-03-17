package com.yht.demo.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UV点击参数")
public class UvStatisticsReceiveDTO {

    @ApiModelProperty(name = "token", value = "token", required = true)
    private String token;
    @ApiModelProperty(name = "productId", value = "产品id", required = true)
    private String productId;
    @ApiModelProperty(name = "clientName", value = "客户端名称", required = true)
    private String clientName;
    @ApiModelProperty(name = "channelName", value = "渠道名称", required = true)
    private String channelName;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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


}
