package kr.co.himedia.goingtoacademy;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("김채은", 10000);
//		student1.name = "김채은";
//		student1.grade = 5;
//		student1.money = 10000;
		
		Student student2 = new Student("서승덕", 50000);
		Student student3 = new Student("홍길동", 25000);
//		student2.name = "서승덕";
//		student2.grade = 6;
//		student2.money = 50000;
		
//		System.out.println(student1);
//		System.out.println(student2);
	
//		int a = (student2.money) -;		
//		System.out.println(a);
		
		
		Bus bus = new Bus(3325);
		student1.busTake(bus);
		student1.showInfo();
		bus.showInfo();
		
		System.out.println("----------------------------");
		student1.busTake(bus);
		student1.showInfo();
		bus.showInfo();
		
		System.out.println("----------------------------");
		student3.busTake(bus);
		student3.showInfo();
		bus.showInfo();		
		
		
		System.out.println("----------------------------");
		Subway subway = new Subway(5);
		student2.subwayTake(subway);
		student2.showInfo();
		subway.showInfo();
		
		
		//System.out.println(subway);
		
		//student1.busTake();
		
		
		
//		int sum = (student1.money) - (subway.subwayIncom);		
//		System.out.println(sum);

		
	}
	
}
