package kr.co.himedia.lambda05;

import java.util.function.BiFunction;
/*
 * Interface BiFunction<T, U, R>
 * - 매개변수가 두 개일때 
 */
public class BiFunctionTest {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> add =  (x, y) -> x + y;      //왼쪽은 상위급
		int result = add.apply(3, 5);
		System.out.println(result);
	}
}
