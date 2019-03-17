package com.yht.demo.entity.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * 后台管理查询appUV统计参数
 */
public class SysManageUVReceiveDTO {

    @ApiModelProperty(name = "startTime", value = "开始时间", required = false)
    private String startTime;
    @ApiModelProperty(name = "endTime", value = "结束时间", required = false)
    private String endTime;
    @ApiModelProperty(name = "clientName", value = "客户端名称", required = false)
    private String clientName;
    @ApiModelProperty(name = "channelName", value = "渠道名称", required = false)
    private String channelName;
    @ApiModelProperty(name = "pageNum", value = "当前页数", required = true)
    private Integer pageNum;
    @ApiModelProperty(name = "pageSize", value = "每页数量", required = true)
    private Integer pageSize;

    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
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