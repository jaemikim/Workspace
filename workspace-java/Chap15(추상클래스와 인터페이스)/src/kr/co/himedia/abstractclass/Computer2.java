package kr.co.himedia.abstractclass;

public abstract class Computer2 {

	public void display() {};
	public void typing() {};
	
	
	public void trunOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void trunOff() {
		System.out.println("전원은 끕니다.");
	}
}


//abstract 선언을 해야 추상메서드가 된다 - public abstract class Computer 
// public abstract class Computer2 - abstract 추상클래스로 선언된거라 객체를 생성 할 수 없다.
