package kr.co.himedia.loop02;

import java.util.Scanner;

/*
 * 구구단을 출력합니다.
 * 몇 단부터 출력할까요? : (입력 3)
 * 끝 단은 얼만인가요?	  (입력 5)
 * 
 * ========================== 3단 ===================
 * 3*1 ~~~
 * ========================== 4단 ===================
 * 4*1 ~~~
 * ========================== 5단 ===================
 * 5*1 ~~~
 */
public class NestedLoopTest03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구구단을 출력합니다.");
		System.out.print("몇 단부터 출력할까요? ");
		int start = scan.nextInt();
		
		if(start > 1 && start <10) {
			
			System.out.print("끝 단은 출력할까요? ");
			int end = scan.nextInt();
			
			
			for( ; start <= end ; start++) {				
				System.out.println(" ========================== "+ start +"단 ===================");
				for(int j = 1; j < 10; j++) {
					System.out.println(start + "*" + j + " = " +(start*j));
				}
			}
			
			
		} else {
			System.out.println("숫자를 잘못입력했습니다.");
		}
		scan.close();
		
	}
}
