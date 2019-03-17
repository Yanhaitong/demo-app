package com.yht.demo.service.user;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yht.demo.entity.dto.product.H5RegisterInfoReceiveDTO;
import com.yht.demo.entity.dto.product.SysManageUVReturnDTO;
import com.yht.demo.entity.dto.user.UserReceiveDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserService {

  IPage<SysManageUVReturnDTO> getH5UserRegster(H5RegisterInfoReceiveDTO h5RegisterInfoReceiveDTO);

  void sendVerificationCode(String mobileNo, String clientName);

  String verifyCodeLoginOrRegister(UserReceiveDTO userDto);

  void loginOut(String mobileNo);
}
