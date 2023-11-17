package kr.co.himedia.array04;

public class MainParameterTest {

	public static void main(String[] args) {
		
		//main() 메서드의 매개변수 확인 문자열만 들어가는 배열이다. 
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
