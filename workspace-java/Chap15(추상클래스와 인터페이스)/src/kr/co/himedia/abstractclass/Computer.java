package kr.co.himedia.abstractclass;

public abstract class Computer {

	abstract void display();
	abstract void typing();
	
	
	public void trunOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void trunOff() {
		System.out.println("전원은 끕니다.");
	}
}


//abstract 선언을 해야 추상메서드가 된다 - public abstract class Computer 
