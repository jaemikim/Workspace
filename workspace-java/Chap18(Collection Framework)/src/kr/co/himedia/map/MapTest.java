package kr.co.himedia.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> stuScores = new HashMap<>();
		stuScores.put("Kim", 95);
		stuScores.put("Lee", 85);
		stuScores.put("Park", 90);
		stuScores.put("Choi", 80);
		
		System.out.println("kim' score: " + stuScores.get("Kim"));
		System.out.println("Lee' score: " + stuScores.get("Lee"));
		System.out.println("Park' score: " + stuScores.get("Park"));
		System.out.println("Choi' score: " + stuScores.get("Choi"));
		
		stuScores.put("Park", 92); //수정
		System.out.println("Park' score: " + stuScores.get("Park"));
		
		stuScores.remove("Choi");  //삭제
		System.out.println("Choi' score: " + stuScores.get("Choi"));

		System.out.println();
		
		for(Map.Entry<String, Integer> entry : stuScores.entrySet()) {
			System.out.println(entry.getKey() + "'s score : " + entry.getValue());
//			System.out.println(entry.getKey() + entry.getValue());
		}
		
	}
}
