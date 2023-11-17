package kr.co.himedia.generic03;

public class ObjectArr<T> {

	private T[] array;  // 선언만 되어 있다. 타입이 정의 되어 있지 않음
	private int size;
	
	public ObjectArr(int size) {
		array = (T[])new Object[size];  //상위 타입인 Object로 설정
	}
	
	public void set(int index, T value) {
		array[index] = value;
		size++;		
	}
	
	public T get(int index) {
		return array[index];
	}
	
	public int size() {
		return size;
	}
}
