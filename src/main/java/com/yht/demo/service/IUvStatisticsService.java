package com.yht.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yht.demo.common.Result;
import com.yht.demo.entity.dto.ProductListReceiveDTO;
import com.yht.demo.entity.dto.SysManageUVReceiveDTO;
import com.yht.demo.entity.dto.SysManageUVReturnDTO;
import com.yht.demo.entity.dto.UvStatisticsReceiveDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUvStatisticsService {

    Result addUVClick(UvStatisticsReceiveDTO uvStatisticsReceiveDTO);

    Result getUserClickProductList(String token, ProductListReceiveDTO productListReceiveDTO);

    IPage<SysManageUVReturnDTO> getAppUvStatistics(SysManageUVReceiveDTO sysManageUVReceiveDTO);
}
