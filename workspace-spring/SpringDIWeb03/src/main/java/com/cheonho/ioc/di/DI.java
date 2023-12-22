package com.cheonho.ioc.di;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
class Door {}
@Component("engine") class Engine {}
@Component class TurboEngine extends Engine {}
@Component class SuperEngine extends Engine {}

@Component
class Car {
	@Value("block") String color;
	@Value("200") int oil;
//	@Autowired
//	@Qualifier("superEngine")  // 이름으로 검색 
	Engine engine;
//	@Autowired
	Door[] doors;
	
	public Car() {}

	@Autowired
	public Car(@Value("red") String color, @Value("100") int oil, Engine engine, Door[] doors) {
		super();
		this.color = color;
		this.oil = oil;
		this.engine = engine;
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", oil=" + oil + ", engine=" + engine + ", doors=" + Arrays.toString(doors)
				+ "]";
	}
		
	
}

public class DI {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("config.xml");
		//Car car = ac.getBean("car", Car.class);    // 타입을 지정해서 이름으로 검색(형변환 안해도 됨_
		Car car = (Car)ac.getBean("car");            // 이름으로 빈 검색
		
		Engine engine = (Engine)ac.getBean("superEngine");
		
		System.out.println("car = " + car);
		System.out.println("engine = " + engine);
	}
	
}
