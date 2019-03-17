package com.yht.demo.service.product.impl;

import com.yht.demo.mapper.product.LoanProductClassifyMapper;
import com.yht.demo.service.product.ILoanProductClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LoanProductClassifyServiceImpl implements ILoanProductClassifyService {

    @Autowired
    private LoanProductClassifyMapper loanProductClassifyMapper;

    @Override
    public List<Map<String, String>> getSysProductClassifyList() {
        return loanProductClassifyMapper.getSysProductClassifyList();

    }
}
