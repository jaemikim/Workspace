package kr.co.himedia.decision02;

import java.util.Scanner;

public class IfElseTest03 {

	public static void main(String[] args) {
		
		/*
		 *  Quiz1)
		 *  정수 1개를 입력 받아 짝수인지 홀수 인지를 판단하는 프로그램을 작성하시오
		 *  	- 정수를 입력하세요 :
		 *        짝수입니다.
		 *      
		 *      - 정수를 입력하세요 :
		 *        홀수입니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
//		System.out.print("정수를 입력하세요 : ");
//		int num2 = scan.nextInt();	
		
		if (num % 2 == 0 ) {
			System.out.println(num + "은 짝수입니다.");
		} else {
			System.out.println(num + "은 훌수입니다.");
		}
		
		System.out.println();
		
		/*
		 * Quiz2. 입력 받은 수가 12의 배수인지를 출력하는 코드를 작성하시오.
		 */
		
		System.out.print("정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		
		if (num2 % 12 == 0 ) {
			System.out.println(num2 + "은 12의 배수입니다.");
		} else {
			System.out.println(num2 + "은 12의 배수가 아닙니다.");
		}
		
		/*
		 * Quiz3. 년도를 입력받아서 해당 년도가 윤년이지 아닌지를 판단하여 출력하는 프로그램을 작성하시오.
		 * 		  - 윤년 : 4의 배수인년도 이거나(100으로 나누어 떨어지는 년도 제외하고) 400 배수인 년도
		 * 
		 * 	if (id.equals(ADMIN_ID) && pw.equals(ADMIN_PASSWORD)) {
			System.out.println("관리자 로그인 성공");
		} else {
			System.out.println("로글인 실패");
		}
			
		 * 
		 */
		System.out.println();
		
		System.out.print("년도를 입력하세요 : ");
		int num3 = scan.nextInt();
		
		if ((num3 % 4 == 0 && num3 % 100 != 0) || (num3 % 400 == 0)) {
			System.out.println(num3 + "은 윤년입니다.");
		} else {
			System.out.println(num3 + "은 윤년이 아닙니다.");
		}
		
		scan.close();
	}
}
