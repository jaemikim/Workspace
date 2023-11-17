package kr.co.himedia.goingtoacademy;

public class Subway {

	int subwayNumber;
	int subwayPerson;
	int subwayIncom;
	
	public Subway() {
		
	}
	
	public Subway(int subwayNumber) {		
		this.subwayNumber = subwayNumber;
//		this.subwayPerson = subwayPerson;
//		this.subwayIncom = subwayIncom;
	}

	
	public void subwayGo(int subwayIncom) {
		this.subwayIncom += subwayIncom;
		this.subwayPerson++;
		
	}
	
	
	public void showInfo() {
		System.out.println(subwayNumber + "호선 지하철의 승객은" + subwayPerson + " 명이고 수입은 " + subwayIncom + "입니다." );
	}
//	@Override
//	public String toString() {
//		return this.subwayNumber ;
//		//"Subway [subwayNumber=" + subwayNumber + ", subwayPerson=" + subwayPerson + ", subwayIncom=" + subwayIncom + "]";
//	}
//	
	
}
