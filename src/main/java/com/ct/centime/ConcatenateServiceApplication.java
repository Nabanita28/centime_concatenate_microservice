package com.ct.centime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConcatenateServiceApplication {

	//http://localhost:8761/swagger-ui/index.html
	public static void main(String[] args) {
		SpringApplication.run(ConcatenateServiceApplication.class, args);
	}

}
