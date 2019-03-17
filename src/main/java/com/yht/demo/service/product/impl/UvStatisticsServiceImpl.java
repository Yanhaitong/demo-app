package com.yht.demo.service.product.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yht.demo.common.BaseService;
import com.yht.demo.common.Result;
import com.yht.demo.entity.dto.product.*;
import com.yht.demo.entity.model.user.User;
import com.yht.demo.entity.model.product.UvStatistics;
import com.yht.demo.mapper.product.LoanProductMapper;
import com.yht.demo.mapper.user.UserMapper;
import com.yht.demo.mapper.product.UvStatisticsMapper;
import com.yht.demo.service.product.IUvStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UvStatisticsServiceImpl extends BaseService implements IUvStatisticsService {

    @Autowired
    private UvStatisticsMapper uvStatisticsMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LoanProductMapper loanProductMapper;


    @Override
    public IPage<SysManageUVReturnDTO> getAppUvStatistics(SysManageUVReceiveDTO sysManageUVReceiveDTO) {
        Page page = new Page();
        page.setCurrent(sysManageUVReceiveDTO.getPageNum());
        page.setSize(sysManageUVReceiveDTO.getPageSize());
        IPage<SysManageUVReturnDTO> sysManageUVReturnIPage = uvStatisticsMapper.getAppUvStatistics(page, sysManageUVReceiveDTO);
        return sysManageUVReturnIPage;
    }

    @Override
    public Result addUVClick(UvStatisticsReceiveDTO uvStatisticsReceiveDTO) {

        String mobileNo = stringRedisTemplate.opsForValue().get(uvStatisticsReceiveDTO.getToken());
        User userDetails = userMapper.getUserDetails(mobileNo, uvStatisticsReceiveDTO.getClientName());
        if (userDetails == null) {
            return Result.error(500, "用户不存在！");
        }

        LoanProductInfoReturnDTO loanProductDetails = loanProductMapper.getLoanProductDetails(uvStatisticsReceiveDTO.getProductId());
        UvStatistics uvStatisticsResult = uvStatisticsMapper.getUvStatisticsByProductId(uvStatisticsReceiveDTO.getProductId());
        if (uvStatisticsResult == null && loanProductDetails != null) {
            UvStatistics uvStatistics = new UvStatistics();
            uvStatistics.setUserId(userDetails.getId());
            uvStatistics.setProductUrl(loanProductDetails.getUrl());
            uvStatistics.setTitle(loanProductDetails.getTitle());
            uvStatistics.setIcon(loanProductDetails.getIconUrl());
            uvStatistics.setProductInfoId(Integer.valueOf(uvStatisticsReceiveDTO.getProductId()));
            uvStatistics.setCreateTime(new Date());
            uvStatisticsMapper.insert(uvStatistics);
            return Result.success("保存成功");
        } else {
            return Result.success("已经保存");
        }
    }

    @Override
    public Result getUserClickProductList(String token, ProductListReceiveDTO productListReceiveDTO) {

        String mobileNo = stringRedisTemplate.opsForValue().get(token);
        User userDetails = userMapper.getUserDetails(mobileNo, productListReceiveDTO.getClientName());
        if (userDetails != null) {
            Page page = new Page();
            page.setCurrent(productListReceiveDTO.getPageNum());
            page.setSize(productListReceiveDTO.getPageSize());
            IPage<UvStatisticsReturnDTO> uvStatisticsIPage = uvStatisticsMapper.getUserClickProductList(page, userDetails.getId());
            return Result.success(uvStatisticsIPage);
        } else {
            return Result.error(500, "获取失败，用户不存在！");
        }
    }

}
