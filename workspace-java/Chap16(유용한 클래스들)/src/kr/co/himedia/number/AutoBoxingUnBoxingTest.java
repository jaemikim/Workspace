package kr.co.himedia.number;

public class AutoBoxingUnBoxingTest {

	public static void main(String[] args) {
		
		// 오토 박싱 - 레퍼 클래스의 참조 변수(왼쪽)에 기본 자료형 값이 대입됨. 
		Integer iObj = 10;  //왼쪽(기준)은 객체, 오른쪽은 값
		Double dObj = 3.14;
		
		// 오토 언박싱 - 래퍼 클래스형 참조변수를 기본 자료형의 변수에 대입됨.
		int num1 = iObj;
		double num2 = dObj;
		
		System.out.println(num1 + ", " + iObj);
		System.out.println(num2 + ", " + dObj);
	}
}
