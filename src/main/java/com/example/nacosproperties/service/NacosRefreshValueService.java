package com.example.nacosproperties.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * @author kangchen
 * @date 2025/6/26 18:27
 */
@Service
@RefreshScope
//@NacosPropertySource(dataId = "nacosdemo", type = ConfigType.PROPERTIES, autoRefreshed = true)
public class NacosRefreshValueService {
    @Value(value = "${nacos.val:0}")
    private String nacosVal;

    public String getNacosVal() {
        return nacosVal;
    }

    @Tool(name = "获取变量改变的值")
    public String getNacosVal2() {
        return nacosVal;
    }
}
