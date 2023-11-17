package kr.co.himedia.inheritance04;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerL = new Customer(202309, "이순신");
		Customer customerS = new Customer(202310, "신사임당");
		Customer customerL2 = new GoldCustomer(202311, "이성계");
		Customer customerC = new GoldCustomer(202312, "최영");
		Customer customerR = new VIPCustomer(202401, "류성룔");
		
		
		customerList.add(customerL);
		customerList.add(customerS);
		customerList.add(customerL2);
		customerList.add(customerC);
		customerList.add(customerR);
		
		
		System.out.println("-----------------고객 정보 출력 -----------------");
		
		for(Customer customer : customerList)
			System.out.println(customer.showInfo());
		
		
		System.out.println("-----------------할인율 계산 -----------------");
		int price = 10000;
		//int priceS = customerS.calcPrice(10000);
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "지불금은 " + cost + "원 입니다.");
		
		}  
		
		System.out.println("-----------------보너스 포인트 계산 -----------------");
		
		for(Customer customer : customerList) {
			//customer.calcPrice(price); 위에 선언해서 이렇게 다시 정의해서 적용 할수 있다.
			int cost = customer.calcPrice(8000);			
			System.out.println(customer.showInfo() + "지불금은 " + cost + "원 입니다.");			
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트 " + customer.bonusPoint + "원 입니다.");
			System.out.println();
		}

//		GoldCustomer customerG = new GoldCustomer(20231030, "홍길동");
//		customerG.bonusPoint = 10000;
//		System.out.println(customerG.showInfo());
//		System.out.println();
//		
	}
	
}

// 
//객체 생성을 다르게 Lvalue, Rvalue(생성자)