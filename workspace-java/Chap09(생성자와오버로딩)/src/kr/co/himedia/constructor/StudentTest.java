package kr.co.himedia.constructor;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student student0 = new Student();		
		System.out.println(student0.showInfo());
		
		//사용자정의  // new 다음에 오는게 생성자이다
		Student student = new Student(202309, "이순신", 3);
		System.out.println(student.showInfo());
	}

}
