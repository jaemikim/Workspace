package kr.co.himedia.goingtoacademy02;

public class Bus {
	
	private int busNumber;
	private int busPerson;
	private int busIncome;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void busGo(int busIncome) {
		this.busIncome += busIncome;
		this.busPerson++;		
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번의 버스는 승객은 " + busPerson + " 수입은 " + busIncome + "입니다");
	}
}
