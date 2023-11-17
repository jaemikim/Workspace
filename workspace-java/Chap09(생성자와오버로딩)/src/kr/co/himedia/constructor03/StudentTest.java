package kr.co.himedia.constructor03;

public class StudentTest {

	public static void main(String[] args) {
		//기본 생성자 호출
		Student student = new Student();
		student.getName();
		System.out.println(student.getName());
		System.out.println(student.getAge());	
		
		
		System.out.println("------------------------------");
		//매개변수가 String, int 타입이 있는 생성자 
		Student student1 = new Student("이순신", 30);			
		student1.toString();		
		System.out.println(student1.toString());
		
		
		
		System.out.println("------------------------------");
		//매개변수가 String만 있는 생성자 호출
		Student student2 = new Student("이순신");
		student2.toString();	
		System.out.println(student2.toString());
		
		
		
		System.out.println("------------------------------");
		//매개변수 int만 있는 생성사 호출
		Student student3 = new Student(30);
		student3.toString();
		System.out.println(student3.toString());
	}
}
