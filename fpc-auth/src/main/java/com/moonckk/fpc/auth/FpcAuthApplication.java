package com.moonckk.fpc.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Classname FpcAuthApplication
 * @Description 认证模块启动类
 * @Date 2023/2/14 13:19
 * @Created by moonckk
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.moonckk.fpc")
public class FpcAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(FpcAuthApplication.class, args);
    }
}
