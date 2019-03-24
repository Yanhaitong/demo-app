package com.yht.demo.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel(value = "推送参数")
@Data
public class PushMessageReceiveDTO {

    @ApiModelProperty(name = "title", value = "推送标题", required = true)
    private String title;

    @ApiModelProperty(name = "content", value = "推送内容", required = true)
    private String content;

    @ApiModelProperty(name = "icon", value = "图标url", required = true)
    private String icon;

    @ApiModelProperty(name = "productUrl", value = "项目外链url", required = true)
    private String productUrl;

    @ApiModelProperty(name = "clientNames", value = "多个客户端名称，逗号隔开", required = true)
    private String clientNames;

}
