package kr.co.himedia.method;

public class MethodMakeTest {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		int result = add(a, b);
		System.out.println("result = " + result);
	}
	
	public static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}
}
// 정의 하고 호출한다.  값이 복사해서 다른 메서드에 대입