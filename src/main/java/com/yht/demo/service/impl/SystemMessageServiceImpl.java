package com.yht.demo.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yht.demo.common.BaseService;
import com.yht.demo.entity.dto.PushMessageReceiveDTO;
import com.yht.demo.entity.dto.SysMessageReturnDTO;
import com.yht.demo.entity.dto.SysMessageReceiveDTO;
import com.yht.demo.entity.model.SystemMessage;
import com.yht.demo.mapper.SystemConfigMapper;
import com.yht.demo.mapper.SystemMessageMapper;
import com.yht.demo.service.ISystemMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.yht.demo.common.push.Demo.sendAndroidBroadcast;

@Service
public class SystemMessageServiceImpl extends BaseService implements ISystemMessageService {

    @Autowired
    private SystemMessageMapper systemMessageMapper;
    @Autowired
    private SystemConfigMapper systemConfigMapper;

    @Override
    public void pushSystemMessage(PushMessageReceiveDTO pushMessageReceiveDTO) {
        String UMENG_ANDROID_APPKEY = "5c80ee1920365789380015e3";//systemConfigMapper.getValueByKey("UMENG_ANDROID_APPKEY");
        String UMENG_ANDROID_APP_MASTER_SECRET = "widglfxrgqpzungqmyww4oymvfrugolt";//systemConfigMapper.getValueByKey("UMENG_ANDROID_APP_MASTER_SECRET");
        String UMENG_IOS_APPKEY = systemConfigMapper.getValueByKey("UMENG_IOS_APPKEY");
        String UMENG_IOS_APP_MASTER_SECRET = systemConfigMapper.getValueByKey("UMENG_IOS_APP_MASTER_SECRET");

        //保存到数据库
        SystemMessage systemMessage = new SystemMessage();
        systemMessage.setTitle(pushMessageReceiveDTO.getTitle());
        systemMessage.setIcon(pushMessageReceiveDTO.getIcon());
        systemMessage.setProductUrl(pushMessageReceiveDTO.getProductUrl());
        systemMessage.setContent(pushMessageReceiveDTO.getContent());
        systemMessage.setCreateTime(new Date());
        String[] clientNames = pushMessageReceiveDTO.getClientNames().split(",");
        for (String clientName : clientNames) {
            systemMessage.setClientName(clientName);
            systemMessageMapper.insert(systemMessage);
        }

        try {
            sendAndroidBroadcast(UMENG_ANDROID_APPKEY, UMENG_ANDROID_APP_MASTER_SECRET, pushMessageReceiveDTO);
        }catch (Exception e){
            log.info("pushSystemMessage=============" + e.getMessage());
        }
    }

    @Override
    public IPage<SysMessageReturnDTO> getSystemMessageList(SysMessageReceiveDTO sysMessageReceiveDTO) {
        Page page = new Page();
        page.setCurrent(sysMessageReceiveDTO.getPageNum());
        page.setSize(sysMessageReceiveDTO.getPageSize());
        IPage<SysMessageReturnDTO> systemMessageDtoIPage = systemMessageMapper.getSystemMessageList(page, sysMessageReceiveDTO);
        return systemMessageDtoIPage;
    }

}
