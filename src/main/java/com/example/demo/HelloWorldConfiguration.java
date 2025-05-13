package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// record = 게터 세터 생성자 없이 클래스 생성 가능
record Person (String name, int age, Address address) { };
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
		return new Person("Ravi", 24, new Address("seoul", "kangnam"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); // name, age
	}
	
	@Bean // 기존의 Bean으로 새로운 Bean을 만듬
	public Person person3Parameters(String name, int age, Address address3) { 
		// name, age, address2
		return new Person(name, age, address3); // name, age
	}
	
	@Bean(name = "address2") // 사용자 이름 지정 가능
	public Address address() {
		return new Address("busan", "gaya");
	}
	
	@Bean(name = "address3") // 사용자 지정
	public Address address3() {
		return new Address("incheon", "good");
	}
	
}
