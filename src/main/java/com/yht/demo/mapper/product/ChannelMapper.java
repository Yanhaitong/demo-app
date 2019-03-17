package com.yht.demo.mapper.product;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yht.demo.entity.model.product.Channel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 渠道表 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-03-02
 */
@Repository
public interface ChannelMapper extends BaseMapper<Channel> {

  List<String> getSysChannelList();
}
