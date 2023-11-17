package kr.co.himedia.decision;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		
		//Quiz1
		//x의 값이 0보다 큰 경우에만 "양수입니다." 출력하시오.
		
		int x = 10;
		
		if(x > 0) {
			System.out.println("양수입니다.");
		}
		/*
		 * Quiz2
		 * 정수 1개를 입력 받아 입력된 수가 7의 배수인지 출력하시오.
		 *  - 정수를 입력하세요 : 14
		 *    14은(는) 7의 배수입니다.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		
		if (num1 % 7 == 0) {
			//System.out.println("7의 배수입니다.");
			System.out.println("num1 = " + num1 + "은 7의 배수입니다.");
		} else {
			System.out.println("num1 = " + num1 + "의 배수가 아닙니다.");
		}
		
		System.out.println();
		/*
		 * Quiz3
		 * 나이를 입력 받아 19세 이상이면 성인임을 출력하는 코드를 작성하시오
		 */
		System.out.print("나이를 입력하세요 : ");
		int num2 = scan.nextInt();
		
		if (num2 >= 19) {
			//System.out.println("7의 배수입니다.");
			System.out.println("num2 = " + num2 + "세는 성인입니다.");
		} 
		
		scan.close();
	}
}
