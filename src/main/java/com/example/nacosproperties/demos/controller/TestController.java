package com.example.nacosproperties.demos.controller;

import com.example.nacosproperties.service.NacosRefreshValueService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangchen
 * @date 2024/9/18 17:25
 */
@RestController
public class TestController {
    @Resource
    private NacosRefreshValueService nacosRefreshValueService;

    @GetMapping("/get")
    public String get() {
        return nacosRefreshValueService.getNacosVal();
    }
}
