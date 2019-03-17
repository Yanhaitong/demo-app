package com.yht.demo.service.impl;

import com.yht.demo.mapper.LoanProductClassifyMapper;
import com.yht.demo.service.ILoanProductClassifyService;
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
