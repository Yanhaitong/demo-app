package com.yht.demo.controller.product;

import com.yht.demo.common.BaseController;
import com.yht.demo.common.Result;
import com.yht.demo.entity.model.product.LoanProduct;
import com.yht.demo.service.product.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Api("后台产品管理")
@RequestMapping("/sysProduct")
@RestController
public class SysProductController extends BaseController {

  @Autowired
  private IChannelService channelService;
  @Autowired
  private IClientService clientService;
  @Autowired
  private ILoanProductClassifyService loanProductClassifyService;
  @Autowired
  private ILoanProductInfoService loanProductInfoService;
  @Autowired
  private ILoanProductService loanProductService;

  @PostMapping("/addProduct")
  @ApiOperation(value = "添加产品配置")
  public Result addProduct(@ModelAttribute LoanProduct loanProduct) {
    loanProductService.addProduct(loanProduct);
    return Result.success("成功");
  }


  @PostMapping("/getSysChannelList")
  @ApiOperation(value = "获取渠道列表")
  public Result getSysChannelList() {
    List<String> channelList = channelService.getSysChannelList();
    return Result.success(channelList);
  }


  @PostMapping("/getSysClientList")
  @ApiOperation(value = "获取客户端列表")
  public Result getSysClientList() {
    List<String> clientList = clientService.getSysClientList();
    return Result.success(clientList);
  }


  @PostMapping("/getSysProductClassifyList")
  @ApiOperation(value = "获取产品分类列表")
  public Result getSysProductClassifyList() {
    List<Map<String, String>> loanProductNameList = loanProductClassifyService.getSysProductClassifyList();
    return Result.success(loanProductNameList);
  }


  @PostMapping("/getSysProductList")
  @ApiOperation(value = "获取系统产品信息列表")
  public Result getSysProductList() {
    List<Map<String, String>> loanProductNameList = loanProductInfoService.getSysProductList();
    return Result.success(loanProductNameList);
  }


}
