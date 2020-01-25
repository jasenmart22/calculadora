package com.calculadora;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.corp.calculator.TracerImpl;

@Configuration
public class TracerConfig {
	
	@Bean
	public TracerImpl tracer(){
		TracerImpl tracer=new TracerImpl();
		return tracer;
	}

}
