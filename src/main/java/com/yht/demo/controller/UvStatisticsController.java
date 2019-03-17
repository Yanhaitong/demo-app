package com.yht.demo.controller;

import com.yht.demo.common.BaseController;
import com.yht.demo.common.Result;
import com.yht.demo.entity.dto.ProductListReceiveDTO;
import com.yht.demo.entity.dto.UvStatisticsReceiveDTO;
import com.yht.demo.service.IUvStatisticsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("统计相关")
@RestController
    @RequestMapping("/statistics")
public class UvStatisticsController extends BaseController {

    @Autowired
    private IUvStatisticsService uvStatisticsService;

    @PostMapping("/addUVClick")
    @ApiOperation(value = "UV点击保存")
    public Result addUVClick(@ModelAttribute UvStatisticsReceiveDTO uvStatisticsReceiveDTO) {
        Result result = uvStatisticsService.addUVClick(uvStatisticsReceiveDTO);
        return result;
    }

    @PostMapping("/getUserClickProductList")
    @ApiOperation(value = "获取用户点击UV列表")
    public Result getUserClickProductList(@RequestParam String token, @ModelAttribute ProductListReceiveDTO productListReceiveDTO) {
        Result result = uvStatisticsService.getUserClickProductList(token, productListReceiveDTO);
        return result;
    }

}
