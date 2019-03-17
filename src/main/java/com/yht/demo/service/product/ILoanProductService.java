package com.yht.demo.service.product;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yht.demo.entity.dto.product.LoanProductAdvertisingReturnDTO;
import com.yht.demo.entity.dto.product.LoanProductClassifyReceiveDTO;
import com.yht.demo.entity.dto.product.LoanProductInfoReturnDTO;
import com.yht.demo.entity.dto.product.ProductListReceiveDTO;
import com.yht.demo.entity.model.product.LoanProduct;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Transactional
public interface ILoanProductService {

  void addProduct(LoanProduct loanProduct);

  IPage<LoanProductInfoReturnDTO> getAllProductList(ProductListReceiveDTO productListReceiveDTO);

  IPage<LoanProductInfoReturnDTO> getClassifyProductList(LoanProductClassifyReceiveDTO loanProductClassifyReceiveDTO);

  LoanProductInfoReturnDTO getLoanProductDetails(String loanProductId);

  IPage<LoanProduct> getLoanProductList(Integer pageNum, Integer pageSize);

  Map<String, Object> getProductHomePageList(String clientName, String channelName, String version, String clientType);

  LoanProductAdvertisingReturnDTO getStartAdvertising(String clientName, String channelName);


}
