package kr.co.himedia.review.review08;

public class MyBookArrayTest {

	public static void main(String[] args) {
		
		BookArray list = new BookArray();  //Book, 길이
		
		list.add(new Book("이대로 살자", 25000, "인디북1", "홍길동1"));
		list.add(new Book("이대로 살자", 25000, "인디북2", "홍길동2"));
		list.add(new Book("이대로 살자", 25000, "인디북3", "홍길동3"));
		list.add(new Book("이대로 살자", 25000, "인디북4", "홍길동4"));
		list.add(new Book("이대로 살자", 25000, "인디북5", "홍길동5"));
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(0));
//		System.out.println(list.get(0));
		for(int i = 0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		
		System.out.println(list.get(11));

	}
}


