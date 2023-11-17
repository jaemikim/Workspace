package kr.co.himedia.set03;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<>();
		tree.add("이순신");
		tree.add("류성룔");
		tree.add("신사임당");
		tree.add("최무선");
		tree.add("신사임당");
		
		System.out.println("객체 수 : " + tree.size());
	
		//Iterator 반복자에 의한 반복
		for(Iterator<String> itr = tree.iterator(); itr.hasNext(); )
			System.out.print(itr.next().toString() + '\t');  //toString 내용 출력  tree알고리즘이 적용되어서 정렬을 해서 출력한다.
		System.out.println();
	}
}
