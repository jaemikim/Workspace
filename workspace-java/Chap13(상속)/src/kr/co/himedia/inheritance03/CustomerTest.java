package kr.co.himedia.inheritance03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerL = new Customer(20230926,"이순신");
//		customerL.setCustomerName("이순신");
//		customerL.setCustomerId(20230926);
		customerL.bonusPoint = 1000;
		System.out.println(customerL.showInfo());
		
		System.out.println();
		
		VIPCustomer customerS = new VIPCustomer();
		//customerS.
		customerS.setCustomerName("신사임달");
		customerS.setCustomerId(20231026);
		customerS.bonusPoint = 10000;
		System.out.println(customerS.showInfo());
		System.out.println();
		
		Customer customerL2 = new VIPCustomer(20231126, "이방원"); // 왼쪽이 상위 클래스, 오른쪽이 하위클래스 보이는것은 왼쪽기준으로 한다.  
//		customerL2.  Customer 클래스의 멤버변수와 메서드만 사용가능
		customerL2.bonusPoint = 10000;
		System.out.println(customerL2.showInfo());
		
	}
	
}

// 
//객체 생성을 다르게 Lvalue, Rvalue(생성자)