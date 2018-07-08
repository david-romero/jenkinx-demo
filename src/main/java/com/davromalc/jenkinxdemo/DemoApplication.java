package com.davromalc.jenkinxdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		log.info("Running Demo with jenkins X");
		SpringApplication.run(DemoApplication.class, args);
	}
}
