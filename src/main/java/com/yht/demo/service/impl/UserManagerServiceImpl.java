package com.yht.demo.service.impl;

import com.yht.demo.common.BaseService;
import com.yht.demo.entity.model.UserManager;
import com.yht.demo.mapper.UserManagerMapper;
import com.yht.demo.service.IUserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagerServiceImpl extends BaseService implements IUserManagerService {

    @Autowired
    private UserManagerMapper userManagerMapper;

    @Override
    public UserManager login(String account, String password) {
        return userManagerMapper.login(account, password);
    }
}
