package kr.co.himedia.loop03;

//Quiz) 1 ~ 10까지의 수 중 3의 배수를 개수를 구하여 출력하세요. 
public class ContinueTest02 {
	
	public static void main(String[] args) {
		
		int num;
		int count = 0;
		
		for(num = 1; num <= 10; num++) {
			if(num % 3 != 0) continue; 
				count++;
			}
			
			System.out.println(count);
		
		
		System.out.println("----------------------------------------");
		for(num = 1; num <= 10; num++) {
			if(num % 3 == 0) 
				count++;
		}
			
			System.out.println(count);
			
		
	}
}
