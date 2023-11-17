package kr.co.himedia.interface07;

import java.util.ArrayList;

//책꽂이 -- 책을 보관(자료구조, ArrayList)
public class BookShelf {

	protected ArrayList<String> bookshelf;  //힙에 생성된다. 
	
	public BookShelf() {
		bookshelf = new ArrayList<>();
	}

	public ArrayList<String> getBookshelf() {
		return bookshelf;
	}

	public int getCount() {
		return bookshelf.size();
	}
	
}

//스택은 아래에서 위로 
//큐는 피포
//