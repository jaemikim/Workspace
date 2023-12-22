package com.cheonho.winter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Spring과 DB 연결하기(JDBC API 이용)
public class DBConnectionTest {

	public static void main(String[] args) throws SQLException {
		//데이터베이스 접속 정보 변수 선언
		String DB_URL = "jdbc:oracle:thin:@//DESKTOP-1GQAA06:1521/xe";
		//DB 사용자 정보
		String DB_USER = "hm";
		String DB_PASSWORD = "0305";
		
		//1) 데이터베이스 연결을 얻기 (Connection 객체 생성)
		Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		
		//2) Statement 객체 생성
		Statement stmt = conn.createStatement();
		
		// 시스템 현 날짜 
		String query = "SELECT SYSDATE, SYSTIMESTAMP FROM dual";
		
		//3) Statement 객체의 executeQuery() 실행해서 ResultSet 객체 생성
		ResultSet rs = stmt.executeQuery(query);
		
		// 실행결과 담긴 rs에서 한줄씩 읽어서 출력
		while(rs.next()) {
			String curDate = rs.getString(1);   //읽어온 행의 첫번째 컬럼 값을 String으로 읽어서 curDate에 저장
			System.out.println(curDate);
		}
	}
}
