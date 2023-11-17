package kr.co.himedia.reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student(202309, "이순신");
		student.setKoreaSubject("국어", 100);
		student.setMathSubject("수학", 80);
		student.showScore();
		
		Student student1 = new Student(202310, "이순신");
		student1.setKoreaSubject("국어", 95);
		student1.setMathSubject("수학", 90);
		student1.showScore();
	}
}


//Subject()
//-score
//-subjectId
//-SubjectName

//Stduent(int, string)
//-korea
//-studentName
//-Math-studentId
//-setKoreaSubject(string, int)
//-setMathSubject(string, int)
//-showScore()