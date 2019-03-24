package com.yht.demo.service;

import com.yht.demo.entity.dto.UserReceiveDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserService {

    void sendVerificationCode(String mobileNo, String clientName);

    String verifyCodeLoginOrRegister(UserReceiveDTO userDto);

    void loginOut(String mobileNo);
}
