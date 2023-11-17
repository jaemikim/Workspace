package kr.co.himedia.loop;

public class ForTest05 {

	public static void main(String[] args) {
		
//		for(int i=1; i <= 10; i++) {
//		System.out.print(i + " ");
//		}
		
		/*
		 * Quiz) 알파벳 대문자와 아스키 코드 값을 출력하시오.
		 * 	A:65
		 *  B:66
		 *  C:67
		 *  ...
		 *  Z:90
		 */
		
		//char ch = 'A';
		
		for(char i= 'A'; i <= 'Z'; i++) {
			
			System.out.println(i + ":" + (int)i);
			}
		
		System.out.println();
		
		for(int i= 65; i <= 90; i++) {
			
			System.out.println((char)i + ":" + i);
			}
		
		
		System.out.println();
		
		for(char j= 'a'; j <= 'z'; j++) {
			
			System.out.println(j + ":" + (int)j);
			}
		
		
	}
}
