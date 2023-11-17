package kr.co.himedia.abstractclass02;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void starCar() {
		System.out.println("시동을 겹니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	
	// 오버라이드는 하면 된다. 순차적으로 적용되어야 한다. 
	final public void run() {
		starCar();
		drive();
		stop();
		turnOff();
	}
}
