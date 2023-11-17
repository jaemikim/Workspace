package kr.co.himedia.goingtoacademy02;

public class Student {

	private String name;
	private int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void busTake(Bus bus) {
		System.out.println("버스를 탑니다.");	
		bus.busGo(1250);
		money -= 1250;
	}
	
	public void subwayTake(Subway subway) {
		System.out.println("지하철을 탑니다.");
		subway.subwayGo(1300);
		money -= 1300;
	}
	
	public void taxiTake(Taxi taxi) {
		System.out.println("택시를 탑니다.");
		taxi.taxGo(10000);
		money -= 10000;
	}
	 	
	public void showInfo() {
		System.out.println(name + " 남은 금액은 " + money + "원입니다.");
	}
}
