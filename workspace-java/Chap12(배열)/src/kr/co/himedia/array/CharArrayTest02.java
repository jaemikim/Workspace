package kr.co.himedia.array;

/*
 * Quiz) char[] 배열에 APPLE이라는 문자로 초기화 하시오.
 * 		 대문자로 된 APPLE을 소문자 apple로 출력하시오
 * 		 대문자와 소문자의 차이는 30
 */
public class CharArrayTest02 {

	public static void main(String[] args) {
		char[] charArr = new char[] {'A', 'P', 'P','L','E'};
		char ch = 'A';
		
		//char[] charArr1 = new char[5] ;
		
		for(int i = 0; i < charArr.length; i++) {
			charArr[i] = ch++;
		}
		
		for(int i = 0; i < charArr.length; i++) {
			System.out.println(charArr[i] + ", " + (int)charArr[i]);
		}
		
		System.out.println("------------------------");
		
		char[] ch2 = {'A', 'P', 'P','L','E'};
		System.out.print((char)(ch2[0]+32));
		System.out.print((char)(ch2[1]+32));
		System.out.print((char)(ch2[2]+32));
		System.out.print((char)(ch2[3]+32));
		System.out.print((char)(ch2[4]+32));
		
		System.out.println();
		System.out.println();
		for(int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i] + ", " + (char)(ch2[i]+32));
		}
	}
}
