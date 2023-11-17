package kr.co.himedia.singleton02;


public class CarFactoryTest {

	public static void main(String[] args) {

		CarFactory carFactory = CarFactory.getInstance();
		CarFactory carFactory1 = CarFactory.getInstance();
		Car car1 =  carFactory.cratCar();
		Car car2 =  carFactory.cratCar();
		
		System.out.println(car1.getCarNumber());
		System.out.println(car2.getCarNumber());	
		
		System.out.println(car1 == car2); //false
		//System.out.println();
		System.out.println(System.identityHashCode(car1));
		System.out.println(System.identityHashCode(car2));
		
		System.err.println(carFactory);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(carFactory == carFactory1); //true
	}
}

//2104457164