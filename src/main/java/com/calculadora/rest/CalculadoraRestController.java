package com.calculadora.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.corp.calculator.TracerImpl;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraRestController {
	
	TracerImpl tracer=new TracerImpl();
	
	@GetMapping(value="/sumar/{op1}/{op2}")
	public Double sumar(@PathVariable("op1") Double op1, @PathVariable("op2") Double op2) {
		Double res=op1 + op2;
		tracer.trace(op1 + " + " + op2 + " = " + res);
		return res;		
	}
	
	@GetMapping(value="/restar/{op1}/{op2}")
	public Double restar(@PathVariable("op1") Double op1, @PathVariable("op2") Double op2) {
		Double res=op1 -op2;
		tracer.trace(op1 + " - " + op2 + " = " + res);
		return res;
	}
}
