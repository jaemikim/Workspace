package kr.co.himedia.loop04;

/*Quiz) 1~100사이의 5와 7의 배수를 출력하고 해당 개수도 출력하시오 (5와 7의 공배수) = > 35, 70
 *  35
 *  70
 *  count:2
 */
public class WhileTest02 {

	public static void main(String[] args) {
		
		int sum = 0;
		int count = 0;
		
		while((sum++) <= 100) {
			if((sum % 5 == 0) && (sum % 7 == 0)) {				
				count ++;	
			System.out.println(sum);}
		}
		
		System.out.println("count : " + count);
		
		
		System.out.println("--------------------------------------------------");
		
		sum = 0;
		count = 0;
		
		while((sum++) <= 100) {
			if(sum % 5 != 0) continue;
			if(sum % 7 != 0) continue;				
				count ++;
		System.out.println(sum);
		}
		System.out.println("count : " + count);
		
		
		System.out.println("--------------------------------------------------");
		
		sum = 0;
		count = 0;
		
		while((sum++) <= 100) {
			if((sum % 5 != 0) || (sum % 7 != 0)) continue;
				count ++;
				System.out.println(sum);
		}
			System.out.println("count : " + count);
		
	}
}
