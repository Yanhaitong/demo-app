package com.yht.demo.service.product;

import com.yht.demo.entity.model.product.Client;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IClientService {

    void addClient(Client client);

  List<String> getSysClientList();
}
