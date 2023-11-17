package kr.co.himedia.variable02;

// 123
public class BinaryTest02 {
	
	public static void main(String[] args) {
		
		int data = 123;
		
		String bin = Integer.toBinaryString(data);
		System.out.println("bin = " + bin);
		
		String oct = Integer.toOctalString(data);
		System.out.println("oct = " + oct);
		
		String hex = Integer.toHexString(data);
		System.out.println("hex = " + hex);
		
		System.out.println("--------------------------------------------------");
		
		int decimal = 123;         // 10진수
		System.out.println("decimal = " + decimal);
		
		int binary = 0b01111011;  // 2진수
		System.out.println("binary = " + binary);
		
		int octal = 0173;         // 8진수
		System.out.println("octal = " + octal);
		
		int hexa = 0x7B;          // 16진수
		System.out.println("hexa = " + hexa);	
		 
	}

}