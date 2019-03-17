package com.yht.demo.service.product.impl;

import com.yht.demo.entity.model.product.Channel;
import com.yht.demo.mapper.product.ChannelMapper;
import com.yht.demo.service.product.IChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelServiceImpl implements IChannelService {

    @Autowired
    private ChannelMapper channelMapper;

    @Override
    public void addChannel(Channel channel) {
        channelMapper.insert(channel);
    }

    @Override
    public List<String> getSysChannelList() {
        return channelMapper.getSysChannelList();
    }
}
