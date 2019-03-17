package com.yht.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yht.demo.entity.dto.LoanProductAdvertisingReturnDTO;
import com.yht.demo.entity.model.LoanProductAdvertising;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 产品广告配置表 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-03-08
 */
public interface LoanProductAdvertisingMapper extends BaseMapper<LoanProductAdvertising> {

    List<LoanProductAdvertisingReturnDTO> getHomePageAdvertisingList(@Param("clientName") String clientName, @Param("channelName") String channelName, @Param("type") Integer type);

    LoanProductAdvertisingReturnDTO getStartAdvertising(@Param("clientName") String clientName, @Param("channelName") String channelName);
}
