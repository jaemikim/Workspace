package com.cheonho.ac.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class Car {}
class Engine {}
class Door {}

public class SpringDITest {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("config.xml");
		Car car = (Car)ac.getBean("car");        		  // by Name 
		Car car2 = (Car)ac.getBean("car");        		  // by Name
		Car car3 = ac.getBean("car", Car.class);  		  // by Name
		Engine engine = (Engine)ac.getBean("engine");     // by Name
		Door door = (Door)ac.getBean("door");             // by Name
		
		System.out.println("car = " + car);
		System.out.println("car2 = " + car2);
		System.out.println("car3 = " + car3);
		System.out.println("engine = " + engine);
		System.out.println("door = " + door);
		
	}
}
