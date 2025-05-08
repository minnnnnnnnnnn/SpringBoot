package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		// 1. Spring Context 시작 - 
		// Spring Context에서 Bean을 관리
		
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2. Spring Context가 관리할 것
		// HelloWorldConfiguration - @Configuration
		// name - @Bean
		
		
		// 3. Spring이 관리하는 Bean 검색
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("address"));



	}

}
