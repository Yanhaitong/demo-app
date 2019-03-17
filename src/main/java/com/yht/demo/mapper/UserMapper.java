package com.yht.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yht.demo.entity.dto.H5RegisterInfoReceiveDTO;
import com.yht.demo.entity.dto.SysManageUVReturnDTO;
import com.yht.demo.entity.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-03-02
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User getUserDetails(@Param("mobileNo") String mobileNo, @Param("clientName") String clientName);

    IPage<SysManageUVReturnDTO> getH5UserRegster(@Param("page") Page page, @Param("h5RegisterInfoReceiveDTO") H5RegisterInfoReceiveDTO h5RegisterInfoReceiveDTO);
}
