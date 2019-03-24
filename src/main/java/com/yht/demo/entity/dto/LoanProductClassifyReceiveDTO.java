package com.yht.demo.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="获取分类产品列表参数")
@Data
public class LoanProductClassifyReceiveDTO {

    @ApiModelProperty(name = "classifyId", value = "分类id", required = true)
    private String classifyId;

    @ApiModelProperty(name = "clientName", value = "客户端名称", required = true)
    private String clientName;

    @ApiModelProperty(name = "channelName", value = "渠道名称", required = true)
    private String channelName;

    @ApiModelProperty(name = "pageNum", value = "当前页数", required = true)
    private Integer pageNum;

    @ApiModelProperty(name = "pageSize", value = "每页数量", required = true)
    private Integer pageSize;

}
