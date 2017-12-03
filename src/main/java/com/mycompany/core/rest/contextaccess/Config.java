package com.mycompany.core.rest.contextaccess;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	B b(){
		return new B();
	}
	
	
	@Bean
	A a(B b){
		return new A(b);
	}
	
	@Bean
	C c(B b){
		return new C(b);
	}
	
	
	@Bean
	ApplicationContextProvider applicationContextProvder(){
		return new ApplicationContextProvider();
	}
	
}
