package com.yht.demo.service.product.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import com.yht.demo.common.Constant;
import com.yht.demo.common.Result;
import com.yht.demo.entity.dto.product.LoanProductInfoReturnDTO;
import com.yht.demo.entity.model.product.LoanProductInfo;
import com.yht.demo.mapper.product.LoanProductInfoMapper;
import com.yht.demo.service.product.ILoanProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoanProductInfoServiceImpl implements ILoanProductInfoService {

    @Autowired
    private LoanProductInfoMapper loanProductInfoMapper;

    @Override
    public void addLoanProductInfo(LoanProductInfo loanProductInfo) {
        loanProductInfo.setCreateTime(new Date());
        loanProductInfoMapper.insert(loanProductInfo);
    }

    @Override
    public IPage<LoanProductInfoReturnDTO> getLoanProductInfoList(Integer pageNum, Integer pageSize) {
        Page page = new Page();
        page.setCurrent(pageNum);
        page.setSize(pageSize);
        IPage<LoanProductInfoReturnDTO> loanProductInfoReturnDTOIPage = loanProductInfoMapper.getLoanProductInfoList(page);
        return loanProductInfoReturnDTOIPage;
    }

    @Override
    public List<Map<String, String>> getSysProductList() {
        return loanProductInfoMapper.getSysProductList();
    }

    @Override
    public void hiddenOrShowProduct(String productId, String isHide) {
        loanProductInfoMapper.hiddenOrShowProduct(productId, isHide);
    }

    @Override
    public void updateLoanProduct(LoanProductInfo loanProductInfo) {
        loanProductInfo.setUpdateTime(new Date());
        loanProductInfoMapper.updateById(loanProductInfo);
    }

    @Override
    public Result uploadCredentials(String bucket) {

        // 密钥配置
        Auth auth = Auth.create(Constant.QINIU_ACCESS_KEY, Constant.QINIU_SECRET_KEY);

        // 要上传的空间
        if (bucket == null || "".equals(bucket.trim())) {
            bucket = Constant.QINIU_ICON_BUCKET;
        }

        //上传到七牛后保存的文件名
        String fileName = bucket + "_" + System.currentTimeMillis() + ".png";

        //上传到七牛云的token
        String uploadToken = auth.uploadToken(bucket, fileName, 30, new StringMap());
        Map<String, Object> map = new HashMap<>();
        map.put("uploadToken", uploadToken);
        map.put("fileName", fileName);

        return Result.success(map);
    }
}
