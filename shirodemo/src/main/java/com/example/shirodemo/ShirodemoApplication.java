package com.example.shirodemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.shirodemo.mapper")
public class ShirodemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShirodemoApplication.class, args);
	}
}
