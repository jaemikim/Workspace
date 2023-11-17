package kr.co.himedia.userdefinetype03;

public class MovieTest {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		
		movie.title = "오펜하이머";
		movie.date =  "2023.08.15 ";
		movie.hero = "킬리언 머피";
		movie.genre = "스릴러";
		movie.time = 180;
		movie.level = 15;
		
		System.out.println(movie.title + "\t" + movie.date + "\t" + movie.hero + "\t" + movie.genre + "\t" + movie.time + "\t" + movie.level);
				
	}
}
