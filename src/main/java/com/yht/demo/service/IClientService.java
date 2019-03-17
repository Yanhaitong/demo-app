package com.yht.demo.service;

import com.yht.demo.entity.model.Client;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IClientService {

    void addClient(Client client);

  List<String> getSysClientList();
}
