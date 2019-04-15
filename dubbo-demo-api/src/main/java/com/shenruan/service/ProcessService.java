package com.shenruan.service;

/**
 * @author gaoxu
 * @date 2019-04-11 16:13
 * @description 工艺服务接口
 */
public interface ProcessService {

    /**
     * 创建工艺
     * @param name  工艺名称
     * @return
     */
    public String createProcess(String name);

}
