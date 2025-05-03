package com.eugene;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CalorieTrackerAppApplication {

	public static void main(String[] args) {
		System.out.println("app is running");
		SpringApplication.run(CalorieTrackerAppApplication.class, args);
	}

}
