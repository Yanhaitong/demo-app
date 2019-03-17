package com.yht.demo.service.user;

import com.yht.demo.entity.model.user.UserManager;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserManagerService {

  UserManager login(String account, String password);
}
