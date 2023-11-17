package kr.co.himedia.goingtoacademy;

public class Bus {

	int busNumber;
	int busPerson;
	int busIncom;
	
	
	public Bus() {
		
	}
	
	public Bus(int busNumber) {		
		this.busNumber = busNumber;
//		this.busPerson = busPerson;
//		this.busIncom = busIncom;
	}
	
	public void busGo(int busIncom) {
		this.busIncom += busIncom;
		this.busPerson++;
		
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번의 버스는 승객은" + busPerson + " 명이고 수입은 " + busIncom + "입니다." );
	}

//	@Override
//	public String toString() {
//		return this.busNumber +
//		//"Bus [busNumber=" + busNumber + ", busPerson=" + busPerson + ", busIncom=" + busIncom + "]";
//	}
	
}
