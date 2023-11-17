package kr.co.himedia.lambda05;

@FunctionalInterface
public interface FunctionS<T, U, V, R> {  //제네릭으로 정이 한다. 리턴타입은 R로 일반화 시켰다.

	R apply(T t , U u, V v);	//참조 변수 정의 한다 뭐가 들어올지는 모른다. 
}
