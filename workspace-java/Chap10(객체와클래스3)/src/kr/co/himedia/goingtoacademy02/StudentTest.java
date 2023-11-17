package kr.co.himedia.goingtoacademy02;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("김채은", 10000);
		Student student2 = new Student("서승덕", 50000);
		Student student3 = new Student("이순신", 20000);
		
		Bus bus100 = new Bus(3315);
		Subway subway5 = new Subway(5);
		Taxi taxi = new Taxi("하이미디어 운수");
		
		System.out.println("----------------------------");
		student1.busTake(bus100);
		student1.showInfo();
		bus100.showInfo();
		
		System.out.println("----------------------------");
		student2.subwayTake(subway5);
		student2.showInfo();
		subway5.showInfo();
		
		System.out.println("----------------------------");
		student3.taxiTake(taxi);
		student3.showInfo();
		taxi.showInfo();
	}
}
