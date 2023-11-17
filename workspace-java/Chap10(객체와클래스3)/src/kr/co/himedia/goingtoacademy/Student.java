package kr.co.himedia.goingtoacademy;

/*
 * 객체지향 프로그래밍에서 협력
 * 	- 객체 간에 필요한 메시지를 전송하고 이를 처리하는 기능 구현
 *  - 매개 변수로 객체가 전달되는 경우
 *  - 협력 예) 
 *  	- 학생이 버스를 탄다
 *  	- 학생이 지하철을 탄다.
 *  - 시나리오 
 *      - 채은이와 승덕이는 각각 버스와 지하철을 타고 학원에 간다. 
 *      - 채은이는 10,000원을 가지고 있었고, 3321번 버스를 타면서 1,250원을 지불합니다.  
 *      - 승덕이는 50,000원은 가지고 있었고, 5호선 지하철을 타면서 1,300원을 지불합니다.
 *      - 두 학생이 버스와 지하철을 타는 상황을 구현하시오.  
 *      - 이순신이 지각을 해서 택시를 타야 했다.
 *        20000원을 가지고 있었는데 10000원을 택시비로 사용했습니다. 
 *        택시는 '하이운수' 회사 택시를 탔습니다. 
 *        
 *      
 *  - 출력 예시
 *  	- 김채은님의 남은 잔액은 8,750원이다
 *  	- 서승덕님은 남은 잔객은 48,700원 입니다. 
 *      
 *      - 3321번의 버스의 승객은 1명이고, 수입을 1,250원입니다 
 *      - 5호선 지하철의 승객은 1명이고, 수입은 1,300원입니다.  
 *      
 *      - 이순신님의 남은 돈을 10000원입니다. 
 *        하이택시 수입은 10000원 입니다. 
 *   
 *  					버스   
 *  학생		버스			---
 *  ----			    버스 번호
 *  이름				    승객 수 
 *  학년				    수입
 *  돈
 *  					지하철
 *                      ----
 *                      노선 번호
 *                      승객 수
 *                      수입
 */
public class Student {

	String name;
	int grade;
	int money;
	
	public Student() {
		
	}
	
	public Student(String name, /* int grade, */ int money) {		
		this.name = name;
		//this.grade = grade;
		this.money = money;
	}

	public void busTake(Bus bus) {
		System.out.println("버스를 탑니다. ");	
		bus.busGo(1250);
		money -= 1250;		
		//System.out.println("용돈 : " + (this.money));		
	}
	
	public void subwayTake(Subway subway ) {
		System.out.println("지하철을 탑니다. ");
		subway.subwayGo(1300); //호출시 금액을 명시해야 한다. 
		money -= 1300;
	}
	
	public void showInfo() {
		System.out.println(name + " 남은 금액은 " + money + "원입니다." );
	}
	
//	@Override
//	public String toString() {
//		return this.name + ", " + this.grade + ", " + this.money;
//				//"Student [name=" + name + ", grade=" + grade + ", money=" + money + "]";
//	}

	
}
