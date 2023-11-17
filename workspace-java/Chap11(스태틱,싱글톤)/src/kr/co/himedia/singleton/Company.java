package kr.co.himedia.singleton;

public class Company {

	private Company() {}
	
	private static Company instance = new Company();  // 변수
	
	public static Company getInstance() {   //메서드 
		if(instance == null)
			instance = new Company();
		return instance;
	}
	
	// 클래스 이름 .으로 사용하다
}
