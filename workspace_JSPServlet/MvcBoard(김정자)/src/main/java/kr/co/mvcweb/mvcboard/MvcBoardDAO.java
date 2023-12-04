package kr.co.mvcweb.mvcboard;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import kr.co.mvcweb.common.DBConnPool;

public class MvcBoardDAO extends DBConnPool{

	public MvcBoardDAO() {
		super();
	}

	public int selectCount(Map<String, Object> map) {
		int totalCount = 0;
		
		String query = "SELECT COUNT(*) FROM HM.MVCHIBOARD";
		if(map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " " 
					+ " LIKE '%" + map.get("searchWord") + "%'";
		}
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			rs.next();
			totalCount = rs.getInt(1);
		} catch (SQLException e) {
			System.out.println("게시물 카운트 중 예외 발생");
			e.printStackTrace();
		}
		
		return totalCount;
	}

	public List<MvcBoardDTO> selectListPage(Map<String, Object> map) {
		List<MvcBoardDTO> board = new ArrayList<>();
		
		String query = " SELECT * FROM ("
				+ " SELECT A.*, rownum rNum FROM ( "
				+ " SELECT * FROM  MVCHIBOARD ";		
		
		if(map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " " 
					+ " LIKE '%" + map.get("searchWord") + "%'";
		}
		query += " ORDER BY id DESC "
				+ " ) A "
				+ " ) "
				+ " WHERE rNum BETWEEN  ? AND ? ";	
		
		try {
			psmt = con.prepareStatement(query);				
			psmt.setString(1, map.get("start").toString()); 
			psmt.setString(2, map.get("end").toString());
			rs = psmt.executeQuery(); 
			
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

	public int insertWrite(MvcBoardDTO dto) {

		int result = 0;
		
		String query = "INSERT INTO HM.MVCHIBOARD (ID, NAME, TITLE, CONTENT, OFILE, SFILE, PASS) "
						+ " VALUES(seq_board_num.nextval, ?, ?, ?, ?, ?, ?)";
		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getContent());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getSfile());
			psmt.setString(6, dto.getPass());
			
			result = psmt.executeUpdate();	
			
		} catch (SQLException e) {
			System.out.println("게시물 입력 중 예외 발생");
			e.printStackTrace();
		}
		
		
		return result;
	}

	public MvcBoardDTO selectView(String id) {
		
		MvcBoardDTO dto = new MvcBoardDTO();
		String query = "SELECT * FROM MVCHIBOARD WHERE id = ?" ;  
		
		try {
			psmt = con.prepareStatement(query);					
			psmt.setString(1, id);                              
			rs = psmt.executeQuery();                          
			
			if (rs.next()) {
				// 결과를 DTO 객체에 저장
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
			}
			
		} catch (SQLException e) {
			System.out.println("게시물 상세보기 중 예외 발생");
			e.printStackTrace();
		}		
		
		return dto;	
	}

	public void updateVisitCount(String id) {
		
		String query = "UPDATE MVCHIBOARD  SET VISITCOUNT = VISITCOUNT + 1 WHERE id = ?";
		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, id);
			psmt.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("게시물 조회수 증가 중 예외 발생");
			e.printStackTrace();
		}
		
	}

	public void downloadCount(String id) {
		
		String sql = "UPDATE MVCHIBOARD SET DOWUNCOUNT = DOWUNCOUNT  + 1 WHERE ID  = ?";
		
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("다운로드 횟수 증가 중 오류 발생");
			e.printStackTrace();
		}		
		
	}

	public boolean confirmPassword(String pass, String id) {
		boolean result = true;
		
		String sql = "SELECT COUNT(*) FROM MVCHIBOARD WHERE pass = ? AND id = ?";
		
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, pass);
			psmt.setString(2, id);
			rs = psmt.executeQuery();
			
			rs.next();
			if(rs.getInt(1) == 0)
				result = false;
			
		} catch (SQLException e) {
			System.out.println("비밀번호 일치 체크 중 오류 발생");
			result = false;
			e.printStackTrace();
		}
		
		return result;
	}

	public int updateBoard(MvcBoardDTO dto) {
		int result = 0;
		
		//쿼리문 템플릿 준비
		String query = "UPDATE MVCHIBOARD SET TITLE=?, NAME=?,  CONTENT=?, OFILE=?, SFILE=? "
					+ "WHERE ID = ? AND pass = ?";
		
		// 쿼리문 준비
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getContent());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getSfile());
			psmt.setString(6, dto.getId());
			psmt.setString(7, dto.getPass());
			
			//쿼리문 실행
			result  = psmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("게시물 수정중 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}

	public int deleteBoard(String id) {
		int result = 0;
		
		String sql = "DELETE FROM MVCHIBOARD WHERE id = ?";
		
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("게시물 삭제 중 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}
	
	

}
