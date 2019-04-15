package com.shenruan.service.impl;

import com.shenruan.service.ProcessService;

/**
 * @author gaoxu
 * @date 2019-04-15 17:12
 * @description ... 类
 */
public class ProcessServiceImpl implements ProcessService {
    @Override
    public String createProcess(String name) {
        System.out.println("服务003创建工艺："+name);
        return "服务003";
    }
}
