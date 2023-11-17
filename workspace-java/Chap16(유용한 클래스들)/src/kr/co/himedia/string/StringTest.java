package kr.co.himedia.string;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("himedia");  // 스택힙에 만들어지고
		String str2 = new String("himedia");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	
		String str3 = "himedia";  // 상수풀에 있는데 리터럴로 어사인됨
		String str4 = "himedia2";
		
		System.out.println(str3 == str4);
		System.out.println(str1.equals(str3)); //
	}
}
