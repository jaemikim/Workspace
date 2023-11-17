package kr.co.himedia.member;

// 학생 클래스를 생성하여 객체(인스턴스)에 각각 다른 이름과 주소를 대입함

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentName = "이순신";
		student1.address = "서울 강동구";
		
		student1.showStudentInfo();
		
		
		Student student2 = new Student();
		student2.studentName = "신사임당";
		student2.address = "서울 강남구";
		
		student2.showStudentInfo();
		
		// 두사람의 객체가 만들어지고 힙(Heap)에 올라간다
		
		System.out.println(student1);
		System.out.println(student2);
		
	//main안에 있는 student1, student2 스택에 있으며 로컬 존재한다
	}
}
