package kr.co.himedia.review.review03;

public class ObjectPolyParaTest {

	public static void main(String[] args) {
		A a = new A();
		display(a);
		
		B b = new B();
		display(b);
	}

	private static void display(Object obj) {
		if(obj instanceof A)
			((A)obj).printHi();
		else 
			((B)obj).pringHi();
	}
}
