package com.yht.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yht.demo.common.BaseController;
import com.yht.demo.common.Result;
import com.yht.demo.entity.dto.LoanProductClassifyReceiveDTO;
import com.yht.demo.entity.dto.LoanProductAdvertisingReturnDTO;
import com.yht.demo.entity.dto.LoanProductInfoReturnDTO;
import com.yht.demo.entity.dto.ProductListReceiveDTO;
import com.yht.demo.service.ILoanProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api("贷款产品")
@RestController
@RequestMapping("/loanProduct")
public class LoanProductController extends BaseController {

    @Autowired
    private ILoanProductService loanProductService;


    @PostMapping("/getProductHomePageList")
    @ApiOperation(value = "获取首页产品列表")
    public Result getProductHomePageList(@RequestParam String clientName, @RequestParam String channelName, @RequestParam String version, @RequestParam String clientType) {
        Map<String, Object> map = loanProductService.getProductHomePageList(clientName, channelName, version, clientType);
        return Result.success(map);
    }

    @PostMapping("/getAllProductList")
    @ApiOperation(value = "获取全部产品列表")
    public Result getAllProductList(@ModelAttribute ProductListReceiveDTO productListReceiveDTO) {
        IPage<LoanProductInfoReturnDTO> loanProductAllList = loanProductService.getAllProductList(productListReceiveDTO);
        return Result.success(loanProductAllList);
    }

    @PostMapping("/getClassifyProductList")
    @ApiOperation(value = "获取分类产品列表")
    public Result getClassifyProductList(@ModelAttribute LoanProductClassifyReceiveDTO loanProductClassifyReceiveDTO) {
        IPage<LoanProductInfoReturnDTO> loanProductDtoList = loanProductService.getClassifyProductList(loanProductClassifyReceiveDTO);
        return Result.success(loanProductDtoList);
    }

    //@PostMapping("/getLoanProductDetails")
    @ApiOperation(value = "获取产品详情")
    public Result getLoanProductDetails(@RequestParam String loanProductId) {
        LoanProductInfoReturnDTO loanProductDto = loanProductService.getLoanProductDetails(loanProductId);
        return Result.success(loanProductDto);
    }

    @PostMapping("/getStartAdvertising")
    @ApiOperation(value = "获取启动广告图")
    public Result getStartAdvertising(@RequestParam String clientName, @RequestParam String channelName) {
        LoanProductAdvertisingReturnDTO loanProductDto = loanProductService.getStartAdvertising(clientName, channelName);
        return Result.success(loanProductDto);
    }
}
