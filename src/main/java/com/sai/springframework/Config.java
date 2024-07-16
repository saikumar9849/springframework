package com.sai.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sai.test")
public class Config {
	
//	@Bean
//	public Car getCar() {
//		return new Car();
//	}
//	
//	@Bean
//	public Tyre getTyre() {
//		return new Tyre();
//	}
}
