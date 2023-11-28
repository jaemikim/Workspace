package kr.co.himedia.mvcboard;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import kr.co.himedia.common.DBConnPool;

public class MvcBoardDAO extends DBConnPool {     // 커넥션 풀 상속

	public MvcBoardDAO() {
		super();
	}
	
	// (검색 조건에 맞는) 게시물의 개수 반환
	public int selectCount(Map<String, Object> map) {
		int totalCount = 0;
		
		// 쿼리문 준비
		String query = "SELECT COUNT(*) FROM mvcboard";
		if(map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " " 
					+ " LIKE '%" + map.get("searchWord") + "%'";
		}
		
		// 쿼리문 생성
		try {
			stmt = con.createStatement();		// 쿼리문 생성
			rs = stmt.executeQuery(query);		// 쿼리문 싫행
			
			rs.next();
			totalCount = rs.getInt(1);			// 검색된 게시물 개수 저장
		} catch (SQLException e) {
			System.out.println("게시물 카운트 중 예외 발생");
			e.printStackTrace();
		}
		
		
		return totalCount;						// 게시물 개수를 서블릿으로 반환
	}
	
	// (검색 조건에 맞는) 게시물 목록 반환 (페이징 기능 지원)
	public List<MvcBoardDTO> selectListPage(Map<String, Object> map) {
		List<MvcBoardDTO> board = new ArrayList<>();
		
		//쿼리문 준비
		String query = " SELECT * FROM ("
				+ " SELECT A.*, rownum rNum FROM ( "
				+ " SELECT * FROM  mvcboard ";		
		// 검색 조건이 있다면 where절로 추가
		if(map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " " 
					+ " LIKE '%" + map.get("searchWord") + "%'";
		}
		query += " ORDER BY id DESC "
				+ " ) A "
				+ " ) "
				+ " WHERE rNum BETWEEN  ? AND ? ";			// 게시물 구간
		
		try {
			psmt = con.prepareStatement(query);				// 동적 쿼리문 생성
			psmt.setString(1, map.get("start").toString()); // 인파라미터 설정
			psmt.setString(2, map.get("end").toString());
			rs = psmt.executeQuery();                       // 쿼리문 실행
			
			// 반환된 게시물 목록을 List컬렉션에 추가
			while(rs.next()) {
				MvcBoardDTO dto = new MvcBoardDTO();
				
				dto.setId(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setPostdate(rs.getDate(5));
				dto.setOfile(rs.getString(6));
				dto.setSfile(rs.getString(7));
				dto.setDowncount(rs.getInt(8));
				dto.setPass(rs.getString(9));
				dto.setVisitcount(rs.getInt(10));
				
				board.add(dto);
				
			}
			
		} catch (SQLException e) {
			System.out.println("게시물 조회 중 예외 발생");
			e.printStackTrace();
		}
		
		
		return board;		
	}
}
