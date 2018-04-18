package com.zteits.admin.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootAdminEurekaClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminEurekaClientDemoApplication.class, args);
	}
}
