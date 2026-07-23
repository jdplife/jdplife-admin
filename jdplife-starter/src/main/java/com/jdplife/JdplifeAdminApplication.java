package com.jdplife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * jdplife Admin 启动类
 */
@SpringBootApplication
@EnableScheduling
public class JdplifeAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdplifeAdminApplication.class, args);
    }
}
