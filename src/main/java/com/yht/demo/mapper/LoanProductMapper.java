package com.yht.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yht.demo.entity.dto.LoanProductClassifyReceiveDTO;
import com.yht.demo.entity.dto.LoanProductInfoReturnDTO;
import com.yht.demo.entity.dto.ProductListReceiveDTO;
import com.yht.demo.entity.model.LoanProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 产品配置表 Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-03-02
 */
public interface LoanProductMapper extends BaseMapper<LoanProduct> {

  IPage<LoanProductInfoReturnDTO> getAllProductList(@Param("page") Page page, @Param("productListReceiveDTO") ProductListReceiveDTO productListReceiveDTO);

  IPage<LoanProductInfoReturnDTO> getClassifyProductList(@Param("page") Page page, @Param("loanProductClassifyReceiveDTO") LoanProductClassifyReceiveDTO loanProductClassifyReceiveDTO);

  List<LoanProductInfoReturnDTO> getLatestProductList(@Param("clientName") String clientName, @Param("channelName") String channelName);

  LoanProductInfoReturnDTO getLoanProductDetails(@Param("loanProductId") String loanProductId);

  List<LoanProductInfoReturnDTO> getRecommendToDayList(@Param("clientName") String clientName, @Param("channelName") String channelName);

}
