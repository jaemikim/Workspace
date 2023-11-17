package kr.co.himedia.method;

public class ArrayInMethod {

	public static void main(String[] args) {
		int[] arr = makeIntArray(5);
		int sum = sumOfArray(arr); //sumOfArray(arr); 참조 번지 - Call By Reference
		System.err.println(sum);
	}
	
	private static int sumOfArray(int[] arr) {  //Call By Reference
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}
	
	private static int[] makeIntArray(int len) { //Call By Value
		
		int[] arr = new int[len];  //arr
		
		for(int i = 0; i < len; i++)
			arr[i] = i;
		
		return arr; //int arr값으로 arr을 
	}
}
