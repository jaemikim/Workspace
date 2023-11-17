package kr.co.himedia.review02;

// 추상클래스 (블완전한 클래스)
public abstract class Animal /* extends Object */ {

	
//	public void eat() {
//		System.out.println("먹는다.");  //일반적, 추상적
//	}
	
	public abstract void eat(); //추상메서드(불완전한 메서드) : 메서드의 구현부가 없음
								// 반드시 자식이 완전하게(재정의) 해야 함
	public void move() {
		System.out.println("이동한다");
	}
}
