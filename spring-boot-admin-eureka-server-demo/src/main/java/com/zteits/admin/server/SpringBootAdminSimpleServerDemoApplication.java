package com.zteits.admin.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class SpringBootAdminSimpleServerDemoApplication {

    private static final Logger logger = LoggerFactory
            .getLogger(SpringBootAdminSimpleServerDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminSimpleServerDemoApplication.class,
                args);
        logger.info("Application is in place!");
    }
}
