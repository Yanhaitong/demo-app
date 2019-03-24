package com.yht.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import com.yht.demo.common.Constant;
import com.yht.demo.common.Result;
import com.yht.demo.entity.dto.LoanProductInfoReturnDTO;
import com.yht.demo.entity.model.LoanProductInfo;
import com.yht.demo.mapper.LoanProductInfoMapper;
import com.yht.demo.service.ILoanProductInfoService;
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
