package com.yht.demo.mapper.product;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yht.demo.entity.dto.product.LoanProductClassifyReceiveDTO;
import com.yht.demo.entity.dto.product.LoanProductInfoReturnDTO;
import com.yht.demo.entity.dto.product.ProductListReceiveDTO;
import com.yht.demo.entity.model.product.LoanProduct;
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

  List<LoanProductInfoReturnDTO> getCarefullySelectList(@Param("clientName") String clientName, @Param("channelName") String channelName);

  IPage<LoanProductInfoReturnDTO> getClassifyProductList(@Param("page") Page page, @Param("loanProductClassifyReceiveDTO") LoanProductClassifyReceiveDTO loanProductClassifyReceiveDTO);

  List<LoanProductInfoReturnDTO> getLatestProductList(@Param("clientName") String clientName, @Param("channelName") String channelName);

  LoanProductInfoReturnDTO getLoanProductDetails(@Param("loanProductId") String loanProductId);

  IPage<LoanProduct> getLoanProductList(Page page);

  List<LoanProductInfoReturnDTO> getRecommendToDayList(@Param("clientName") String clientName, @Param("channelName") String channelName);

}
