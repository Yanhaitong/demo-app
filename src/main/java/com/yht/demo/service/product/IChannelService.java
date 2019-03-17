package com.yht.demo.service.product;

import com.yht.demo.entity.model.product.Channel;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IChannelService {

  void addChannel(Channel channel);

  List<String> getSysChannelList();

}
