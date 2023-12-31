package kr.co.himedia.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jakarta.servlet.ServletContext;
import kr.co.himedia.common.JDBConnection;

public class BoardDAO extends JDBConnection {

	public BoardDAO(ServletContext application) {
		super(application);
	}
	
	// board 테이블에 저장된 (검색 조건에 맞는) 게시물 갯수 반환
	public int selectCount(Map<String, Object> map) {
		int totalCount = 0;   //게시물 수를 담을 변수
		
		// 게시물 수를 얻어오는 쿼리문
		String query = "SELECT COUNT(*) FROM BOARD";
		if(map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " " 
					+ " LIKE '%" + map.get("searchWord") + "%'";
		}
		
		try {
			stmt = con.createStatement();    //쿼리문 생성
			rs = stmt.executeQuery(query);   //쿼리문 실행 (ResultSet 이여서 rs로 받는다.)
			
			rs.next(); 						 // 커서가 첫 번째 행으로 이동
			totalCount = rs.getInt(1); 	     //첫 번째 컬럼 값 가져옴
		} catch (SQLException e) {
			System.out.println("게시물 수를 구하는 중 예외 발생");
			e.printStackTrace();
		}
		
		return totalCount;
	}
	
	// board 테이블의 레코드를 가져와서 (검색 조건에 맞는) 게시물 목록 반환
	public List<BoardDTO> selectList(Map<String, Object> map) {
		List<BoardDTO> bbs = new ArrayList<>();		// 게시물 목록을 담을 변수 
		
		String query = "SELECT * FROM BOARD";
		if(map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " " 
					+ " LIKE '%" + map.get("searchWord") + "%'";
		}

		query += " ORDER BY num DESC";
		
		try {
			stmt = con.createStatement();       // 쿼리문 실행하기 위해 statement 객체 생성		
			rs = stmt.executeQuery(query);		// Select 쿼리문 실행. 실행 결과는 ResultSet 객체로 반환
			
			/*
			 * - ResultSet 객체로부터 게시물 목록을 반복하여 가져옴
			 * - ResultSet 객체는 행 단위로 저장됨. 현재 행을 가리키는 커서(cursor)를 통해 읽어오는 구조임
			 * - next()로 커서를 최초 행으로 이동 시킴. 
			 */
			while(rs.next()) {					// 커서를 이동시켜서 결과값이 있는지 확인 (결과물을 반복하며)
				//게시물 하나(한행)의 내용을 DTO에 저장
				BoardDTO dto = new BoardDTO();
				
				dto.setNum(rs.getString("num"));   	            // 일련번호
				dto.setTitle(rs.getString("title"));            // 제목
				dto.setContent(rs.getString("content"));        // 내용
				dto.setId(rs.getString("id"));                  // 작성자아이디
				dto.setPostdate(rs.getDate("postdate"));        //작성일
				dto.setVisitCount(rs.getString("visitCount"));  //조회수
				
				bbs.add(dto);                                   //결과목록에 저장
			}
		} catch (SQLException e) {
			System.out.println("게시물 조회 중 예외 발생");
			e.printStackTrace();
		}
		
		return bbs;
	}		
	
	// 게시글 데이터를 받아 DB에 추가 
	public int insertBoard(BoardDTO dto) {
		int  result = 0;
		
		//insert 쿼리문
		String query = "INSERT INTO BOARD ( "
						+ " NUM, TITLE, CONTENT, ID, VISITCOUNT) "
						+ " VALUES(seq_board_num.nextval, ?, ?, ?, 0)";
		
		try {
			psmt = con.prepareStatement(query); 		// 동적 쿼리
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getId());
			
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("게시물 입력 중 예외 발생");
			e.printStackTrace();
		}
				
		return result;
	}
	
	// 지정된 게시물 내용을 반환
	public BoardDTO selectView(String num) {
		BoardDTO dto = new BoardDTO();
		
		//쿼리문 준비 
		String query = "SELECT b.*, m.name " 
					   + " FROM MEMBER m INNER JOIN BOARD b "
					   + " ON m.ID = b.ID "
					   + " WHERE b.num = ? ";
		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, num);						// 인파라미터를 일련번호로 설정
			rs = psmt.executeQuery();					// 쿼리 실행
			
			//결과 처리
			if(rs.next()) {
				dto.setNum(rs.getString(1));
				dto.setTitle(rs.getString(2));
				dto.setContent(rs.getString("content"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setId(rs.getString("id"));
				dto.setVisitCount(rs.getString(6));
				dto.setName(rs.getString("name"));
			}
			
		} catch (SQLException e) {
			System.out.println("게시물 상세 보기 중 예외 발생");
			e.printStackTrace();
		}
		
		return dto;
	}
	
	// 게시물의 조회수 1증가
	public void updateVisitCount(String num) {
		
		//쿼리문 준비
		String query = "UPDATE BOARD SET VISITCOUNT = VISITCOUNT + 1 "
						+ " WHERE num = ?";
		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, num);		// 인파라미터를 일련번호로 설정
			psmt.executeQuery();      //쿼리 실행
		} catch (SQLException e) {
			System.out.println("게시물 조회수 증가 중 예외 바랫ㅇ");
			e.printStackTrace();
		}
	}
}
