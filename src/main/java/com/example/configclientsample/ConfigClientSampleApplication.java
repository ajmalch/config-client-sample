package com.example.configclientsample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController("/")
public class ConfigClientSampleApplication {

	@Value("${message}")
	String message;

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientSampleApplication.class, args);
	}

	@GetMapping("sayHi")
	public  String sayHi(){
		return message;
	}

}
