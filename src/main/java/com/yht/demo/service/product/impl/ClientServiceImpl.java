package com.yht.demo.service.product.impl;

import com.yht.demo.entity.model.product.Client;
import com.yht.demo.mapper.product.ClientMapper;
import com.yht.demo.service.product.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public void addClient(Client client) {
        clientMapper.insert(client);
    }

    @Override
    public List<String> getSysClientList() {
        return clientMapper.getSysClientList();
    }

}