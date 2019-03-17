package com.yht.demo.mapper;

import com.yht.demo.entity.dto.LoanProductClassifyReturnDto;
import com.yht.demo.entity.model.LoanProductClassify;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 产品分类表 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-03-02
 */
@Repository
public interface LoanProductClassifyMapper extends BaseMapper<LoanProductClassify> {

    List<LoanProductClassifyReturnDto> getProductClassifyList(String clientId);

  List<Map<String, String>> getSysProductClassifyList();
}
