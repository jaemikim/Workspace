package kr.co.himedia.constructor;

public class Student {
	
	//멤버변수
	int studentId;
	String studentName;
	int grade;
	
	public Student() {
		System.out.println("기본생성자 호출");
	}
	
	//생성자를 초기하 화는것이다.
	                 //입력변수
	public Student(int studentId, String studentName, int grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showInfo() {
		return studentName + " 학생의 학번은 " + studentId + "이고, " + grade + "학년 입니다.";
	}
}


//this 자기 자신을 가르키는 참조변수 
//참조변수에는 주소번지가 들어간다. 
//개체를 생성하면 사용