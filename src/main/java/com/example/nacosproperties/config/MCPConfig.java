package com.example.nacosproperties.config;

import com.example.nacosproperties.service.NacosRefreshValueService;
import com.example.nacosproperties.service.WeatherService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kangchen
 * @date 2025/6/27 13:11
 */
@Configuration
public class MCPConfig {
    @Bean
    public ToolCallbackProvider weatherTools(WeatherService weatherService, NacosRefreshValueService nacosRefreshValueService) {
        MethodToolCallbackProvider.Builder builder = MethodToolCallbackProvider.builder()
                .toolObjects(weatherService, nacosRefreshValueService);
        return builder.build();
    }
}
