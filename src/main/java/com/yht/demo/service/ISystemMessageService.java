package com.yht.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yht.demo.entity.dto.PushMessageReceiveDTO;
import com.yht.demo.entity.dto.SysMessageReturnDTO;
import com.yht.demo.entity.dto.SysMessageReceiveDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ISystemMessageService {

    IPage<SysMessageReturnDTO> getSystemMessageList(SysMessageReceiveDTO sysMessageReceiveDTO);

    void pushSystemMessage(PushMessageReceiveDTO pushMessageReceiveDTO);

}
