package kr.co.himedia.review;

public class PolyMethodArgTypeTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		PolyMethodArgTypeTest.display(dog);
		
		Cat cat = new Cat();
		PolyMethodArgTypeTest.display(cat);
	}
	
	
	
	public static void display(Animal ani) {   //다형성 인수 적용
		ani.eat();
		if (ani instanceof Cat) {
			((Cat)ani).night();			
		}
		
		//Cat 타입으로 받은 경우에만 night() 호출 가능

	}
}
