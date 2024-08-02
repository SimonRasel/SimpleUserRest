package com.example.UserRest;

import org.springframework.boot.SpringApplication;

public class TestUserRestApplication {

	public static void main(String[] args) {
		SpringApplication.from(UserRestApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
