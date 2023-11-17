package kr.co.himedia.review02;

public class AbstractClassTest {

	public static void main(String[] args) {
		/*
		 * 추상클래스는 단독으로 객체 생성 불가함 
		 * 추상클래스는 부모의 역할을 할수 있음
		 */
		
		//Animal ani = new Animal();   //Cannot instantiate (객체 생성불가함)
		Animal ani = new Dog();
		ani.eat();
		ani.move();
		
		ani = new Cat();
		ani.eat();
		ani.move();
		((Cat)ani).night();
		
	}
}
