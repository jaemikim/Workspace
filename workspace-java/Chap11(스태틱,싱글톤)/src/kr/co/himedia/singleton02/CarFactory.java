package kr.co.himedia.singleton02;

// 싱글톤 패턴 작성
public class CarFactory {

	private CarFactory() {}
	
	private static CarFactory instance = new CarFactory(); 
	
	public static CarFactory getInstance() {   //메서드 
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	public Car cratCar() {
		Car car = new Car();
		return car;
	}
}
