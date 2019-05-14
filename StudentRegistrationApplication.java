package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
@EnableAutoConfiguration
@SpringBootApplication
public class StudentRegistrationApplication {

	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(StudentRegistrationApplication.class);
	 }
	public static void main(String[] args) {
		SpringApplication.run(StudentRegistrationApplication.class, args);
	}

}
