package com.HashWolf2.hashwolf2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.HashWolf2.hashwolf2.Repository")
@SpringBootApplication
public class Hashwolf2Application {

	public static void main(String[] args) {
		SpringApplication.run(Hashwolf2Application.class, args);
	}

}
