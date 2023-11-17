package kr.co.himedia.review.review05;

import com.google.gson.Gson;

public class GsonToAPI {

	public static void main(String[] args) {
		
		Person person = new Person("이순신", 35);
		Gson gson = new Gson();
		String json = gson.toJson(person); //다형성 Object 상속을 받아서 사용
		
		System.out.println(json);
		
	}
}
