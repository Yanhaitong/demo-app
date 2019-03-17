package com.yht.demo.service.product;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yht.demo.entity.dto.product.PushMessageReceiveDTO;
import com.yht.demo.entity.dto.product.SysMessageReturnDTO;
import com.yht.demo.entity.dto.product.SysMessageReceiveDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ISystemMessageService {

    IPage<SysMessageReturnDTO> getSystemMessageList(SysMessageReceiveDTO sysMessageReceiveDTO);

    void pushSystemMessage(PushMessageReceiveDTO pushMessageReceiveDTO);

}
