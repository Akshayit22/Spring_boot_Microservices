package com.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolServiceApplication.class, args);
		System.out.println("School services is Running ......");
	}

}
