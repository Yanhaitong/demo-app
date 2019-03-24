package com.yht.demo.service.impl;

import com.yht.demo.common.BaseService;
import com.yht.demo.common.sender.SMSUtils;
import com.yht.demo.common.utils.MD5Util;
import com.yht.demo.entity.dto.UserReceiveDTO;
import com.yht.demo.entity.model.User;
import com.yht.demo.mapper.SystemConfigMapper;
import com.yht.demo.mapper.UserMapper;
import com.yht.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class UserServiceImpl extends BaseService implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SystemConfigMapper systemConfigMapper;

    @Override
    public void sendVerificationCode(String mobileNo, String clientName) {
        String smsContent = systemConfigMapper.getValueByKey("SMS" + clientName);
        SMSUtils.sendVerifyLoginSMS(mobileNo, smsContent);
    }

    @Override
    public String verifyCodeLoginOrRegister(UserReceiveDTO userDto) {

        //redis保存token对应的手机号(永久)
        String token = MD5Util.md5Encrypt32Upper(UUID.randomUUID().toString());
        stringRedisTemplate.opsForValue().set(token, userDto.getMobileNo());

        //数据库操作
        User user = userMapper.getUserDetails(userDto.getMobileNo(), userDto.getClientName());
        if (user == null) {
            //保存用户信息
            User userNew = new User();
            userNew.setMobileNo(userDto.getMobileNo());
            userNew.setAccount(userDto.getMobileNo());
            userNew.setClientName(userDto.getClientName());
            userNew.setChannelName(userDto.getChannelName());
            userNew.setVersion(userDto.getVersion());
            userNew.setCreateTime(new Date());
            userNew.setLoginTime(new Date());
            userNew.setClientType(userDto.getClientType());
            userMapper.insert(userNew);
        } else {
            user.setVersion(userDto.getVersion());
            user.setChannelName(userDto.getChannelName());
            user.setUpdateTime(new Date());
            userMapper.updateById(user);
        }
        return token;
    }


    @Override
    public void loginOut(String token) {
        String mobileNo = stringRedisTemplate.opsForValue().get(token);
        stringRedisTemplate.delete("SMS" + mobileNo);
        stringRedisTemplate.delete(token);
    }

}
