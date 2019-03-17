package com.yht.demo.service.user.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yht.demo.common.BaseService;
import com.yht.demo.common.sender.SMSUtils;
import com.yht.demo.common.utils.MD5Util;
import com.yht.demo.entity.dto.product.H5RegisterInfoReceiveDTO;
import com.yht.demo.entity.dto.product.SysManageUVReturnDTO;
import com.yht.demo.entity.dto.user.UserReceiveDTO;
import com.yht.demo.entity.model.user.User;
import com.yht.demo.mapper.product.SystemConfigMapper;
import com.yht.demo.mapper.user.UserMapper;
import com.yht.demo.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Service
public class UserServiceImpl extends BaseService implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SystemConfigMapper systemConfigMapper;

    @Override
    public IPage<SysManageUVReturnDTO> getH5UserRegster(H5RegisterInfoReceiveDTO h5RegisterInfoReceiveDTO) {
        Page page = new Page();
        page.setCurrent(h5RegisterInfoReceiveDTO.getPageNum());
        page.setSize(h5RegisterInfoReceiveDTO.getPageSize());
        if (!StringUtils.isEmpty(h5RegisterInfoReceiveDTO.getEndTime())){
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date sDate = sdf.parse(h5RegisterInfoReceiveDTO.getEndTime());
                Calendar c = Calendar.getInstance();
                c.setTime(sDate);
                c.add(Calendar.DAY_OF_MONTH, 1);
                sDate = c.getTime();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                h5RegisterInfoReceiveDTO.setEndTime(sdf1.format(sDate));
            }catch (Exception e){
                log.error("日期加一天========" + e.getMessage());
            }

        }
        return userMapper.getH5UserRegster(page, h5RegisterInfoReceiveDTO);
    }

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
        if (user == null){
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
        }else {
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
