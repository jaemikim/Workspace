package kr.co.himedia.review;

public class ObjectCastingTest {

	public static void main(String[] args) {
		// Animal  -> Dog, Cat
		Animal ani = new Dog();  // 업케스팅
		ani.eat();
		
		ani = new Cat();		 // 업캐스팅
		ani.eat();
		
//		Cat c = (Cat)ani;		 // 다운캐스팅
//		c.night();
		
		((Cat)ani).night();   	 // 다운캐스팅
		
		
	}
}
