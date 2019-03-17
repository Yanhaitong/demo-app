package com.yht.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yht.demo.entity.model.SystemConfig;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-03-04
 */
public interface SystemConfigMapper extends BaseMapper<SystemConfig> {

    String getValueByKey(String key);
}
