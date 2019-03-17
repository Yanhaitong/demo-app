package com.yht.demo.service.product;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
public interface ILoanProductClassifyService {

  List<Map<String, String>> getSysProductClassifyList();

}
