package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		System.out.println("master");
		System.out.println("branch1");
		System.out.println("-- branch2 --");
		System.out.println("... branch2 ...");
		
		System.out.println("test commit");
		
	}
}
