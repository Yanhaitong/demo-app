package com.yht.demo.service.impl;

import com.yht.demo.entity.model.Client;
import com.yht.demo.mapper.ClientMapper;
import com.yht.demo.service.IClientService;
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