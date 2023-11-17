package kr.co.himedia.stream07;

public class Mocha extends Decorator {

	public Mocha(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.print("모가 시럽 추가 ");
	}
}
