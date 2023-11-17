package kr.co.himedia.operator02;

import java.util.Scanner;

/*
 * 입력 1 : 7
 * 입력 2 : 9
 */
public class ConditionOperTest03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.err.println("입력 받은 두 수중 큰 수를 출력하세요\n");
		
//		System.out.print("숫자를 입력합니다 : ");
//		int num1 = scan.nextInt();	
//		int num2 = scan.nextInt();	
//		
//		int grade = (num1 > num2) ? num1 : num2;	
//		System.out.println("큰 수 출력 : " + grade);	
		
		System.out.print("입력 1  : ");
		int num1 = scan.nextInt();
		System.out.print("입력 2  : ");
		int num2 = scan.nextInt();	
		
		int grade = (num1 > num2) ? num1 : num2;	
		System.out.println("큰 수 출력 : " + grade);	
		scan.close();
	}
}
