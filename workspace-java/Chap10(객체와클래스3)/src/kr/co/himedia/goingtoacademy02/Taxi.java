package kr.co.himedia.goingtoacademy02;

public class Taxi {

	private String taxiName;
	private int taxiIncom;
	
	public Taxi (String taxiName) {
		
		this.taxiName = taxiName;
	}
	
	public void taxGo (int taxiIncom) {
		this.taxiIncom += taxiIncom;	
	}
	
	public void showInfo() {
		System.out.println(taxiName + "수입는 " + taxiIncom + "입니다");
	}
}


