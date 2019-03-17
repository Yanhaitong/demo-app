package com.yht.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yht.demo.common.Result;
import com.yht.demo.entity.dto.LoanProductInfoReturnDTO;
import com.yht.demo.entity.model.LoanProductInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
public interface ILoanProductInfoService {

  void addLoanProductInfo(LoanProductInfo loanProductInfo);

  IPage<LoanProductInfoReturnDTO> getLoanProductInfoList(Integer pageNum, Integer pageSize);

  List<Map<String, String>> getSysProductList();

  void hiddenOrShowProduct(String productId, String isHide);

  void updateLoanProduct(LoanProductInfo loanProductInfo);

  Result uploadCredentials(String bucket);
}
