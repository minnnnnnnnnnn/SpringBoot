package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// record = 게터 세터 생성자 없이 클래스 생성 가능
record Person (String name, int age) { };
record Address (String firstLine, String city) { };

@Configuration
public class HelloWorldConfiguration {
	
	
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 25;
	}

	@Bean
	public Person person() {
		return new Person("Ravi", 24);
	}
	
	@Bean
	public Address address() {
		return new Address("busan", "gaya");
	}
	
}
