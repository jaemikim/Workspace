package kr.co.himedia.arraylist;

import java.util.ArrayList;

import kr.co.himedia.array02.Book;

public class Student {

	//선언만 했다.
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	//생성자 생성한다
	public Student(int studentId, String studentName ) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}
	
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void showInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println("학생 " + this.studentName + "의 " + subject.getName() + "과목 성적은 " +
			 subject.getScorePoint() + "입니다.");
		}
		System.out.println(this.studentName + "학생의 총점은 " +total + "입니다.");
	}

	
//	for(Book book : copylib) {
//		book.showInfo();
//	}
	
}
