package com.yc.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@MapperScan("com.yc")
public class BlogSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogSpringbootApplication.class, args);
	}
	
}
