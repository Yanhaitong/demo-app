package com.yht.demo.mapper.product;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yht.demo.entity.model.product.Client;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 客户端表 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-03-02
 */
@Repository
public interface ClientMapper extends BaseMapper<Client> {

  List<String> getSysClientList();
}
