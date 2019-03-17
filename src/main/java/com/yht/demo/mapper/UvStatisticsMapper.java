package com.yht.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yht.demo.entity.dto.SysManageUVReceiveDTO;
import com.yht.demo.entity.dto.SysManageUVReturnDTO;
import com.yht.demo.entity.dto.UvStatisticsReturnDTO;
import com.yht.demo.entity.model.UvStatistics;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * UV统计表 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-03-06
 */
public interface UvStatisticsMapper extends BaseMapper<UvStatistics> {

    IPage<UvStatisticsReturnDTO> getUserClickProductList(@Param("page") Page page, @Param("userId") Integer userId);

    UvStatistics getUvStatisticsByProductId(@Param("productId") String productId);

    IPage<SysManageUVReturnDTO> getAppUvStatistics(@Param("page") Page page, @Param("sysManageUVReceiveDTO") SysManageUVReceiveDTO sysManageUVReceiveDTO);
}
