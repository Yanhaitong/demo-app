package com.yht.demo.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="获取产品列表参数")
public class ProductListReceiveDTO {

    @ApiModelProperty(name = "clientName", value = "客户端名称", required = true)
    private String clientName;
    @ApiModelProperty(name = "channelName", value = "渠道名称", required = true)
    private String channelName;
    @ApiModelProperty(name = "pageNum", value = "当前页数", required = true)
    private Integer pageNum;
    @ApiModelProperty(name = "pageSize", value = "每页数量", required = true)
    private Integer pageSize;


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

    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum= pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize= pageSize;
    }


}
