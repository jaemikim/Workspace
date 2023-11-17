package kr.co.himedia.variable02;

public class VariableTest {
	
	public static void main(String[] args) {
		
		/*
		 * 변수 himedia에 10을 저장하고 himedia에 저장된 값을
		 * 변수 hellomedia에 저장하고
		 * 변수 hellomedia에 10을 곱하여 변수 hihimedia에 저장하시오.
		 * hihimediar 값을 출력하시오.
		 */
		
		var himedia = 10;
		var hellomedia = himedia;
		var hihimedia = hellomedia * 10;
		
		System.out.println(hihimedia);
		
		/*
		 * sum이라는 변수에 1부터 5까지의 수를 누적해서 출력하시오
		 * 초기화 : 변수를 만들고 난 후 연산을 하기 전에 값을 저장하는 행위
		 */
		
		var sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;	
		
		System.out.println("sum = " + sum);	
		
		// x=10, y=20을 저장하고 변수의 값을 서로 교환하여서 출력하시오. 
		
		var x = 10;
		var y = 20;
		System.out.println("x = " + x + "," + " Y = " + y);
		
		int tmp;
		tmp = y;
		y = x;
		x = tmp;
		
//		System.out.println("X = " + x);
//		System.out.println("Y = " + y);
		System.out.println("x = " + x + "," + " Y = " + y);
	}

}
