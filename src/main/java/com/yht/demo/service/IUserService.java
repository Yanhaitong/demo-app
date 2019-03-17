package com.yht.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yht.demo.entity.dto.H5RegisterInfoReceiveDTO;
import com.yht.demo.entity.dto.SysManageUVReturnDTO;
import com.yht.demo.entity.dto.UserReceiveDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserService {

  IPage<SysManageUVReturnDTO> getH5UserRegster(H5RegisterInfoReceiveDTO h5RegisterInfoReceiveDTO);

  void sendVerificationCode(String mobileNo, String clientName);

  String verifyCodeLoginOrRegister(UserReceiveDTO userDto);

  void loginOut(String mobileNo);
}
