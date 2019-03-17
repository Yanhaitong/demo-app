package com.yht.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yht.demo.entity.dto.LoanProductAdvertisingReturnDTO;
import com.yht.demo.entity.dto.LoanProductClassifyReceiveDTO;
import com.yht.demo.entity.dto.LoanProductInfoReturnDTO;
import com.yht.demo.entity.dto.ProductListReceiveDTO;
import com.yht.demo.entity.model.LoanProduct;
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
