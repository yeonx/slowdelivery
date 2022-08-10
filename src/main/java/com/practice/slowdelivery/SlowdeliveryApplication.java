package com.practice.slowdelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class SlowdeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlowdeliveryApplication.class, args);
	}

}
