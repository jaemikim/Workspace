package kr.co.himedia.loop05;

import java.util.Scanner;

/*
 *Quiz)
 *	메시지를 입력하세요.
 * 	프로그램을 종료하려면, q를 입력하시요.
 * 	> 하이미디어
 * 	임력받은 메시지 : 하이미디어
 *  >천호역
 *  입력받은 메시지 : 천호역
 *  >q
 *  입력받은 메시지 : q
 *  프로그램을 종료합니다. 
 */
public class DoWhileTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메시지를 입려하세요.");
		System.out.println("프로그램을 종료하려면, q를 입력하시요.");
		//String mes = scan.nextLine();
		
		String mes = null;			
		
		do {
			System.out.print("> ");
			mes = scan.nextLine();
			
			System.out.println("입력받은 메시지 : " + mes);
						
		} while (!mes.equals("q"));
		
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
				//boolena a.equals(b) !mes.equals('q')
	}
}
