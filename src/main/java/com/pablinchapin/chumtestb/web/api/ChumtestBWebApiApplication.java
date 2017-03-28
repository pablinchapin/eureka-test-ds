package com.pablinchapin.chumtestb.web.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class ChumtestBWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChumtestBWebApiApplication.class, args);
	}
}
