package com.yht.demo.service;

import com.yht.demo.entity.model.UserManager;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserManagerService {

  UserManager login(String account, String password);
}
