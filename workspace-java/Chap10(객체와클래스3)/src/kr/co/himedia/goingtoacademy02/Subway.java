package kr.co.himedia.goingtoacademy02;

public class Subway {
	
	private int subwayNumber;
	private int subwayPerson;
	private int subwayIncome;
	
	public Subway(int subwayNumber) {
	
		this.subwayNumber = subwayNumber;
	}
	
	public void subwayGo(int subwayIncome) {
		this.subwayIncome += subwayIncome;
		this.subwayPerson++;
	}
	
	public void showInfo() {
		System.out.println(subwayNumber + "번의 지하철 승객은 " + subwayPerson + " 수입은 " + subwayIncome + "입니다");
	}
	
}
