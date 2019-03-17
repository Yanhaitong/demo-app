package com.yht.demo.service.user.impl;

import com.yht.demo.common.BaseService;
import com.yht.demo.entity.model.user.UserManager;
import com.yht.demo.mapper.user.UserManagerMapper;
import com.yht.demo.service.user.IUserManagerService;
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
