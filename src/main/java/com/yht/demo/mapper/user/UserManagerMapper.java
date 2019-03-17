package com.yht.demo.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yht.demo.entity.model.user.User;
import com.yht.demo.entity.model.user.UserManager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 后台管理用户表 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-03-02
 */
@Mapper
public interface UserManagerMapper extends BaseMapper<User> {

    UserManager login(@Param("account") String account, @Param("password") String password);
}
