package kr.co.himedia.loop;

public class ForTest04 {

	public static void main(String[] args) {
		
		// 2의 배수를 출력하시오
		// 초기식 생략
	//	int sum = 0;
		
//		for(int i = 0; i < 10; i++) {			
//			sum = i * 2;			
//			System.out.println(sum);
//		}
		
		
		System.out.println("------------------------------------");
		
		// 초기식 생략
		int sum = 0;
		
		for(; sum<10; sum++) {
			if(sum % 2 == 0) {
				System.out.println(sum + " ");
			}
		}
		
		System.out.println("------------------------------------");
		
		// 초기식, 증감식 생략
		sum = 0;
		
		for( ; sum < 10; ) {		   
			if(sum % 2 == 0) {
				System.out.println(sum + " ");
			}
			sum++;
		}
		
		System.out.println("------------------------------------");
		
		for(int j=0; j<10; j=j+2) {
			System.out.println(j + " ");
		}
		
	}
}
