package kr.co.himedia.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {

	public static void main(String[] args) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		String str = "Hello, Himedia";
		char[] strArray = str.toCharArray();
		
		for(char c : strArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else
				charCountMap.put(c, 1);
		}
		System.out.println("Character 갯수들");
		for(char c : charCountMap.keySet()) {  // key만
			System.out.println(c + " : " + charCountMap.get(c));
		}
	}
}
