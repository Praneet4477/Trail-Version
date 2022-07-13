package com.example.JavaRestAPI_Task1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class JavaRestApiTask1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaRestApiTask1Application.class, args);
	}

}
