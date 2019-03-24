package com.yht.demo.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "查询系统消息参数")
@Data
public class SysMessageReceiveDTO {

    @ApiModelProperty(name = "clientName", value = "客户端名称", required = true)
    private String clientName;

    @ApiModelProperty(name = "pageNum", value = "当前页数", required = true)
    private Integer pageNum;

    @ApiModelProperty(name = "pageSize", value = "每页数量", required = true)
    private Integer pageSize;

}
