package com.qnvip;	

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qnvip.dao")
public class WebBaseApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebBaseApplication.class, args);
	}
}
