package com.cheonho.ioc.di03;

import java.util.Arrays;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cheonho.ioc.di03.Car.SysInfo;

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
	@Resource(name = "turboEngine")        //byName 검색함 
	Engine engine;
	@Autowired
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
	
	@Component
	@PropertySource("setting.properties")
	class SysInfo{
		@Value("${autosaveDir}")
		String autosaveDir;

		@Value("${autosaveInterval}")
		int autosaveInterval;
		
		@Value("${autosave}")
		boolean autosave;
		
		//사용자 운영체제 이름 불러오기
		@Value("#{systemProperties['os.name']}")
		String osName;
		@Value("#{systemProperties['java.class.path']}")
		String javaClassPath;
		
		@Override
		public String toString() {
			return "SysInfo [autosaveDir=" + autosaveDir + ", autosaveInterval=" + autosaveInterval + ", autosave="
					+ autosave + ", osName=" + osName + ", javaClassPath=" + javaClassPath + "]";
		}
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", oil=" + oil + ", engine=" + engine + ", doors=" + Arrays.toString(doors)
				+ "]";
	}	
}

public class DI {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("config3.xml");
		//Car car = ac.getBean("car", Car.class);    // 타입을 지정해서 이름으로 검색(형변환 안해도 됨_
		Car car = (Car)ac.getBean("car");            // 이름으로 빈 검색
		
		Engine engine = (Engine)ac.getBean("turboEngine");
		
		System.out.println("car = " + car);
		System.out.println("engine = " + engine);
		
		System.out.println();
		System.out.println("" + ac.getBean(SysInfo.class));
		
		System.out.println();
		Map<String, String> map = System.getenv();
		System.out.println("map = " + map);
		
		System.out.println();
		System.out.println("System.getProperties() = " + System.getProperties());
	}
	
}
