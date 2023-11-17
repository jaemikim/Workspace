package kr.co.himedia.inheritance04;

public class GoldCustomer extends Customer {	
	

	double salesRatio;

	//생성자
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
		
		System.out.println("GoldCustomer(int customerId, String customerName) 생성자 호출");
		
	}
	
	@Override
	public int calcPrice(int price) { //선언부가 기존의 메서드와 같음 (Customer의 선언부와 동일)
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
}

