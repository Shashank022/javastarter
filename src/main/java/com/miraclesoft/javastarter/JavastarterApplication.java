package com.miraclesoft.javastarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JavastarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavastarterApplication.class, args);
	}

}
