package kr.co.himedia.inheritance03;

public class VIPCustomer extends Customer {

	private int agentId;
	double salesRatio;
	
	public VIPCustomer() {
		super(1000, "SILVER");
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}

	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int customerId, String customerName) 생성자 호출");
		
	}
	
	public int getAgentId() {
		return agentId;
	}	
	
	@Override
	public int calcPrice(int price) { //선언부가 기존의 메서드와 같음 (Customer의 선언부와 동일)
		// TODO Auto-generated method stub
		//return super.calcPrice(price);
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
		
}
