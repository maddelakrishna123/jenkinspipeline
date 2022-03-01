package com.ms.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeeservicesApplication {

	public static void main(String[] args) {
		log.info("Started Building");
		SpringApplication.run(EmployeeservicesApplication.class, args);
	}

}
