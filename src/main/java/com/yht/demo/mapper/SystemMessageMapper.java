package com.yht.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yht.demo.entity.dto.SysMessageReturnDTO;
import com.yht.demo.entity.dto.SysMessageReceiveDTO;
import com.yht.demo.entity.model.SystemMessage;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 系统消息列表 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-03-07
 */
public interface SystemMessageMapper extends BaseMapper<SystemMessage> {

    IPage<SysMessageReturnDTO> getSystemMessageList(@Param("page") Page page, @Param("sysMessageReceiveDTO") SysMessageReceiveDTO sysMessageReceiveDTO);
}
