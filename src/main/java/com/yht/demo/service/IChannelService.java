package com.yht.demo.service;

import com.yht.demo.entity.model.Channel;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IChannelService {

  void addChannel(Channel channel);

  List<String> getSysChannelList();

}
