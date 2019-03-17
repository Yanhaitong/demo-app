package com.yht.demo.service.product.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yht.demo.common.BaseService;
import com.yht.demo.entity.dto.product.*;
import com.yht.demo.entity.model.product.LoanProduct;
import com.yht.demo.mapper.product.LoanProductAdvertisingMapper;
import com.yht.demo.mapper.product.LoanProductClassifyMapper;
import com.yht.demo.mapper.product.LoanProductMapper;
import com.yht.demo.mapper.product.SystemConfigMapper;
import com.yht.demo.service.product.ILoanProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoanProductServiceImpl extends BaseService implements ILoanProductService {

    @Autowired
    private LoanProductClassifyMapper loanProductClassifyMapper;
    @Autowired
    private LoanProductMapper loanProductMapper;
    @Autowired
    private LoanProductAdvertisingMapper loanProductAdvertisingMapper;
    @Autowired
    private SystemConfigMapper systemConfigMapper;

    @Override
    public Map<String, Object> getProductHomePageList(String clientName, String channelName, String version, String clientType) {

        //分类
        List<LoanProductClassifyReturnDto> productClassifyList = loanProductClassifyMapper.getProductClassifyList(clientName);

        //今日推荐
        List<LoanProductInfoReturnDTO> recommendToDayList = loanProductMapper.getRecommendToDayList(clientName, channelName);

        //最新口子
        List<LoanProductInfoReturnDTO> latestProductList = loanProductMapper.getLatestProductList(clientName, channelName);

        //精选贷款
        //List<LoanProductInfoReturnDTO> carefullySelectList = loanProductMapper.getCarefullySelectList(clientName, channelName);

        //banner轮播图
        List<LoanProductAdvertisingReturnDTO> homePageBannerList = loanProductAdvertisingMapper.getHomePageAdvertisingList(clientName, channelName, 1);

        //首页广告弹框
        List<LoanProductAdvertisingReturnDTO> homePagePopUpList = loanProductAdvertisingMapper.getHomePageAdvertisingList(clientName, channelName, 2);

        //客户端类型（0：ios   1：android），用来判断系统升级
        Map<String, Object> appUpgradeMap = new HashMap<>();
        appUpgradeMap.put("upgradeType", 0);
        if ("0".equals(clientType)){//ios更新

        }else if ("1".equals(clientType)){//android更新
            String sysVersion = systemConfigMapper.getValueByKey("android-" + clientName + "-VERSION");
            try {
                if (compareVersion(sysVersion, version) > 0){
                    String title = systemConfigMapper.getValueByKey("android-" + clientName + "-TITLE");
                    String url = systemConfigMapper.getValueByKey("android-" + clientName + "-URL");
                    String upgradeType = systemConfigMapper.getValueByKey("android-" + clientName + "-UPGRADETYPE");

                    appUpgradeMap.put("sysVersion", sysVersion);
                    appUpgradeMap.put("title", title);
                    appUpgradeMap.put("url", url);
                    appUpgradeMap.put("upgradeType", upgradeType);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Map<String, Object> mapResult = new HashMap();
        mapResult.put("productClassifyList", productClassifyList);
        mapResult.put("recommendToDayList", recommendToDayList);
        mapResult.put("latestProductList", latestProductList);
        //mapResult.put("carefullySelectList", carefullySelectList);
        mapResult.put("homePageBannerList", homePageBannerList);
        mapResult.put("homePagePopUpList", homePagePopUpList);
        mapResult.put("appUpgrade", appUpgradeMap);
        return mapResult;
    }

    @Override
    public void addProduct(LoanProduct loanProduct) {
        loanProductMapper.insert(loanProduct);
    }

    @Override
    public IPage<LoanProductInfoReturnDTO> getAllProductList(ProductListReceiveDTO productListReceiveDTO) {
        Page page = new Page();
        page.setCurrent(productListReceiveDTO.getPageNum());
        page.setSize(productListReceiveDTO.getPageSize());
        IPage<LoanProductInfoReturnDTO> loanProductDtoIPage = loanProductMapper.getAllProductList(page, productListReceiveDTO);
        return loanProductDtoIPage;
    }

    @Override
    public LoanProductInfoReturnDTO getLoanProductDetails(String loanProductId) {
        LoanProductInfoReturnDTO loanProductDto = loanProductMapper.getLoanProductDetails(loanProductId);
        return loanProductDto;
    }

    @Override
    public IPage<LoanProduct> getLoanProductList(Integer pageNum, Integer pageSize) {
        Page page = new Page();
        page.setCurrent(pageNum);
        page.setSize(pageSize);
        IPage<LoanProduct> loanProductIPage = loanProductMapper.getLoanProductList(page);
        return loanProductIPage;
    }

    @Override
    public LoanProductAdvertisingReturnDTO getStartAdvertising(String clientName, String channelName) {
        LoanProductAdvertisingReturnDTO homePageAdvertising = loanProductAdvertisingMapper.getStartAdvertising(clientName, channelName);
        return homePageAdvertising;
    }

    @Override
    public IPage<LoanProductInfoReturnDTO> getClassifyProductList(LoanProductClassifyReceiveDTO loanProductClassifyReceiveDTO) {
        Page page = new Page();
        page.setCurrent(loanProductClassifyReceiveDTO.getPageNum());
        page.setSize(loanProductClassifyReceiveDTO.getPageSize());
        IPage<LoanProductInfoReturnDTO> loanProductDtoIPage = loanProductMapper.getClassifyProductList(page, loanProductClassifyReceiveDTO);
        return loanProductDtoIPage;
    }


    /**
     * 比较版本号的大小,前者大则返回一个正数,后者大返回一个负数,相等则返回0
     * @param version1
     * @param version2
     * @return
     */
    private static int compareVersion(String version1, String version2) throws Exception {
        if (version1 == null || version2 == null) {
            throw new Exception("compareVersion error:illegal params.");
        }
        String[] versionArray1 = version1.split("\\.");//注意此处为正则匹配，不能用"."；
        String[] versionArray2 = version2.split("\\.");
        int idx = 0;
        int minLength = Math.min(versionArray1.length, versionArray2.length);//取最小长度值
        int diff = 0;
        while (idx < minLength
                && (diff = versionArray1[idx].length() - versionArray2[idx].length()) == 0//先比较长度
                && (diff = versionArray1[idx].compareTo(versionArray2[idx])) == 0) {//再比较字符
            ++idx;
        }
        //如果已经分出大小，则直接返回，如果未分出大小，则再比较位数，有子版本的为大；
        diff = (diff != 0) ? diff : versionArray1.length - versionArray2.length;
        return diff;
    }

}
