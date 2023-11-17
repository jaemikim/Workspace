package kr.co.himedia.review;

public class PolyTest {

	public static void main(String[] args) {
		//Upcasting으로 객체 생성
		//상속관계, 재정의(Override), 동적바인딩
		//상위클래스가 동일한 메시지로 하위클래슬 서로 다르게 동작시키는 객체지향 원리
		Animal ani = new Dog();
		ani.eat(); 			//실행시점에서 사용될(호출될) 메서드가 결정되는 바인딩(동적바인딩)
		
		ani = new Cat();
		ani.eat();  	    //Override(재정의) : 동적바인딩
							//Overloading(오버로딩: 정적바인딩 - 컴파일 시점에서 사용될 메서드가 결정되는 바인딩 
		((Cat)ani).night();
		
		
	}
}
