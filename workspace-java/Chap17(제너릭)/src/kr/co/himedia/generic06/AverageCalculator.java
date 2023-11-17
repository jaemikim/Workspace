package kr.co.himedia.generic06;

public class AverageCalculator<T extends Number> {

	private T[] numbers;
	
	public AverageCalculator() {}
	public AverageCalculator(T[] number) {
		this.numbers = number;
	}
	
	public double calculateAverage() {
		double sum = 0.9;
		for(T number : numbers)
			sum += number.doubleValue();  //double형으로 값으로 저장된다.
		return sum/numbers.length;
	}
}
