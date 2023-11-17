package kr.co.himedia.loop02;

public class TriangleTest {

	public static void main(String[] args) {
	
		for(int i=1; i<=8; i++) {   //행 
			for(int j=1; j<=8; j++) {  //열
			  System.out.print("*");				
				}
			  System.out.println();
			}	  	
		
		System.out.println("-------------------------------");
		
		for(int i=1; i<=8; i++) {
			for(int j=8; j>=0; j--) {
				
				if(j<i) {
				  System.out.print(" ");
				 } else {
				  System.out.print("*");
				 }
			}
			  System.out.println();
		 }
		
	
		System.out.println("-------------------------------");
		
		for(int i=1; i<=8; i++) {
			for(int j=8; j>=i; j--) {
			  System.out.print("*");				
				}
			  System.out.println();
			}	  
		
		
		System.out.println("-------------------------------");
		
		for(int i=1; i<=8; i++) {
			for(int j=1; j<=i; j++) {
			  System.out.print("*");				
				}
			  System.out.println();
			}	  
		System.out.println("-------------------------------");
		
		int x = 0;
		
		for(int i = 0; i < 8 ; i++) {
			for(int j = 0; j < (8-x); j++) {
				System.out.print("* ");
			}
			x++;
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
		for(int i = 0; i < 8 ; i++) {
			for(int j = i; j < 8; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	
		System.out.println("-------------------------------");
		
		for(int i = 0; i < 8 ; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
