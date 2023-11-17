package kr.co.himedia.operator;

public class ArithmeticOperTest02 {
	
	public static void main(String[] args) {
		
		// 나누기와 나머지 연산자 활용해서 정수의 자릿수를 구하시오.
		
		int digit = 3625;
		
		System.out.println(digit % 10);
		System.out.println(digit / 10 % 10);
		System.out.println(digit / 100 % 10);
        System.out.println(digit / 1000 % 10);
        
        int num = 2579;
        if(num%2 == 0)
        	System.out.println("짝수입니다.");
        else
        	System.out.println("홀수입니다.");
	}

}
