package kr.co.himedia.lambda05;

public class FunctionSTest {

	public static void main(String[] args) {
		
		//FunctionSTest<t, u, v> add = (x, y, z) -> x + y + z;
		FunctionS<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z;  //람다식으로 Integer 참조변수 
		int result = add.apply(8, 5, 4);    //FunctionS에서 정의된 apply를 적용 값 대입
		System.out.println(result);
		
	}
}
