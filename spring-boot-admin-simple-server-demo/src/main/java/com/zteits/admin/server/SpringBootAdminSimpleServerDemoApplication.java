package com.zteits.admin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminSimpleServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminSimpleServerDemoApplication.class,
                args);
    }
}
