package com.example.nacosproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosPropertiesMsgApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =  SpringApplication.run(NacosPropertiesMsgApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("nacos.val");
        String userAge = applicationContext.getEnvironment().getProperty("nacos.val");
        System.out.println("nacos.val :"+userName+"; nacos.val: "+userAge);
    }

}
