package com.yht.demo.controller.product;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yht.demo.common.BaseController;
import com.yht.demo.common.Result;
import com.yht.demo.entity.dto.product.*;
import com.yht.demo.entity.model.product.Channel;
import com.yht.demo.entity.model.product.Client;
import com.yht.demo.entity.model.product.LoanProduct;
import com.yht.demo.entity.model.product.LoanProductInfo;
import com.yht.demo.entity.model.user.UserManager;
import com.yht.demo.service.product.*;
import com.yht.demo.service.user.IUserManagerService;
import com.yht.demo.service.user.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("后台管理")
@RequestMapping("/sysManager")
@RestController
public class SysManagerController extends BaseController {

    @Autowired
    private IClientService clientService;
    @Autowired
    private IChannelService channelService;
    @Autowired
    private IUserService userService;
    @Autowired
    private IUvStatisticsService uvStatisticsService;
    @Autowired
    private IUserManagerService userManagerService;
    @Autowired
    private ILoanProductInfoService loanProductInfoService;
    @Autowired
    private ILoanProductService loanProductService;

    @PostMapping("/getLoanProductList")
    @ApiOperation(value = "获取产品列表")
    public Result getLoanProductList(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        IPage<LoanProduct> loanProductIPage = loanProductService.getLoanProductList(pageNum, pageSize);
        return Result.success(loanProductIPage);
    }

    @PostMapping("/getAPPStatistics")
    @ApiOperation(value = "获取appUV统计")
    public Result getAppUvStatistics(@ModelAttribute SysManageUVReceiveDTO sysManageUVReceiveDTO) {
        IPage<SysManageUVReturnDTO> manageUVStatisticsDtoIPage = uvStatisticsService.getAppUvStatistics(sysManageUVReceiveDTO);
        return Result.success(manageUVStatisticsDtoIPage);
    }

    @PostMapping("/getH5UserRegster")
    @ApiOperation(value = "获取H5用户注册数据（推广使用）")
    public Result getH5UserRegster(@ModelAttribute H5RegisterInfoReceiveDTO h5RegisterInfoReceiveDTO) {
        IPage<SysManageUVReturnDTO> mapIPage = userService.getH5UserRegster(h5RegisterInfoReceiveDTO);
        return Result.success(mapIPage);
    }

    @PostMapping("/login")
    @ApiOperation(value = "后台管理登录")
    public Result login(@RequestParam String account, @RequestParam String password) {
        UserManager userManager = userManagerService.login(account, password);
        if (userManager == null){
            return Result.error(500, "无此用户！");
        }
        return Result.success(userManager);
    }


    @PostMapping("/addLoanProductInfo")
    @ApiOperation(value = "新增产品信息")
    public void addLoanProductInfo(@ModelAttribute LoanProduct loanProduct) {
        //Integer loanProductId = loanProductService.addLoanProduct(loanProduct);
        /*for (String url : urlList) {
            LoanProductUrl loanProductUrl = new LoanProductUrl();
            loanProductUrl.setProductId(loanProductId);
            loanProductUrl.setUrl(url);
            loanProductUrlService.addLoanProductUrl(loanProductUrl);
        }*/
    }

    @PostMapping("/addLoanProduct")
    @ApiOperation(value = "新增产品")
    public Result addLoanProduct(@ModelAttribute LoanProductInfo loanProductInfo) {
        loanProductInfoService.addLoanProductInfo(loanProductInfo);
        return Result.success("成功");
    }

    @PostMapping("/updateLoanProduct")
    @ApiOperation(value = "更新产品")
    public Result updateLoanProduct(@ModelAttribute LoanProductInfo loanProductInfo) {
        loanProductInfoService.updateLoanProduct(loanProductInfo);
        return Result.success("成功");
    }

    @PostMapping("/hiddenOrShowProduct")
    @ApiOperation(value = "隐藏或显示产品")
    public Result hiddenOrShowProduct(@RequestParam String productId, @RequestParam String isHide) {
        loanProductInfoService.hiddenOrShowProduct(productId, isHide);
        return Result.success("成功");
    }

    @PostMapping("/getLoanProductInfoList")
    @ApiOperation(value = "获取产品信息列表")
    public Result getLoanProductInfoList(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        IPage<LoanProductInfoReturnDTO> loanProductInfoReturnDTOIPage = loanProductInfoService.getLoanProductInfoList(pageNum, pageSize);
        return Result.success(loanProductInfoReturnDTOIPage);
    }

    @PostMapping("/addClient")
    @ApiOperation(value = "新增客户端")
    public void addClient(@ModelAttribute Client client) {
        clientService.addClient(client);
    }

    @PostMapping("/addChannel")
    @ApiOperation(value = "新增渠道")
    public void addChannel(@ModelAttribute Channel channel) {
        channelService.addChannel(channel);
    }

    @PostMapping("/uploadCredentials")
    @ApiOperation(value = "获取上传凭证")
    public Result uploadCredentials(@RequestParam String bucket) {
        return loanProductInfoService.uploadCredentials(bucket);
    }


}
