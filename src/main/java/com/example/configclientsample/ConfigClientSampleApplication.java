package com.example.configclientsample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController("/")
@Slf4j
public class ConfigClientSampleApplication {

	@Value("${message}")
	String message;

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientSampleApplication.class, args);
	}

	@GetMapping("config-client/sayHi")
	public  String sayHi(){
		log.info("Hi Called");
		return message;
	}

}
