package com.yc.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.yc.blog.web.LoginInterceptor;

@SpringBootApplication
@Controller
@MapperScan("com.yc")
public class BlogSpringbootApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(BlogSpringbootApplication.class, args);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor())
		.addPathPatterns("/toedit")
		.addPathPatterns("/comment");
	}
	
	
	
}
