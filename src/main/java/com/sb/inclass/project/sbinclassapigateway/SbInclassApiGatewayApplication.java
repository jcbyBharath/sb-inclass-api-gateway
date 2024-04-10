package com.sb.inclass.project.sbinclassapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableDiscoveryClient
public class SbInclassApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbInclassApiGatewayApplication.class, args);
	}

}
