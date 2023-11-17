package kr.co.himedia.arraylist02;

import java.util.ArrayList;

public class Student {

	private String name;
	//private String readBook;	
	private ArrayList<Book> bookList;

	public Student(String name /* , String readBook */) {
		this.name = name;
		//this.readBook = readBook;
		
		bookList = new ArrayList<>();
	}
	
	public void addBook(String title, String author) {
		Book book = new Book();
		book.setTitle(title);
		book.setAuthor(author);
		
		bookList.add(book);
	}
	
	public void showInfo() {
		
		System.out.println(name + "학생이 읽은 책은 : ");
		for(Book book : bookList) {
			//System.out.println(name + "학생이 읽은 책은 : " + book.getTitle() + "입니다.");
			System.out.print(book.getTitle() + ", ");
		}
		System.out.println("입니다.");
	}
	
}



//for(Subject subject : subjectList) {
//	total += subject.getScorePoint();
//	System.out.println("학생 " + this.studentName + "의 " + subject.getName() + "과목 성적은 " +
//	 subject.getScorePoint() + "입니다.");
//}