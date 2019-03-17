package com.yht.demo.controller.product;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yht.demo.common.BaseController;
import com.yht.demo.common.Result;
import com.yht.demo.entity.dto.product.PushMessageReceiveDTO;
import com.yht.demo.entity.dto.product.SysMessageReturnDTO;
import com.yht.demo.entity.dto.product.SysMessageReceiveDTO;
import com.yht.demo.service.product.ISystemMessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("系统消息")
@RestController
@RequestMapping("/systemMessage")
public class SysMessageController extends BaseController {

    @Autowired
    private ISystemMessageService systemMessageService;


    @PostMapping("/pushSystemMessage")
    @ApiOperation(value = "推送系统消息")
    public Result pushSystemMessage(@ModelAttribute PushMessageReceiveDTO pushMessageReceiveDTO) {
        systemMessageService.pushSystemMessage(pushMessageReceiveDTO);
        return Result.success("发送成功！");
    }

    @PostMapping("/getSystemMessageList")
    @ApiOperation(value = "获取系统消息列表")
    public Result getSystemMessageList(@ModelAttribute SysMessageReceiveDTO sysMessageReceiveDTO) {
        IPage<SysMessageReturnDTO> systemMessageList = systemMessageService.getSystemMessageList(sysMessageReceiveDTO);
        return Result.success(systemMessageList);
    }

}
