package kr.co.himedia.review.review04;

import java.util.Random;

public class RandomAPITest {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] arr = new int[6];
		
		int i = 0;   // 저장 위치
		
		while(i<6) {
			int num = rand.nextInt(45) + 1;   //1 ~ 45
			boolean duplicated = false;		  //중복 안됨

			for(int j = 0; j < i; j++) {      //처음은 0,0이라 조건이 만족하지 않는다
				if(arr[j] == num) {
					duplicated = true;        //중복 됨
					break;
				} 				
			}
				
			if(!duplicated) {
				arr[i++] = num;				
			}
		}
		
		for(int num : arr)			
			System.out.print(num + " ");
		
	}
	
	
}
