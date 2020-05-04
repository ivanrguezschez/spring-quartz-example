package com.irs.springquartzexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Cargando contexto de spring");
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-quartz-example.xml");
		System.out.println("Contexto de spring cargado");
	}
}
