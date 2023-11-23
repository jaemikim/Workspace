package ko.co.himedia.fileupload;

import java.sql.SQLException;

/*
 * INSERT INTO HM.HIFILE (ID, TITLE, CATEGORY, OFILE, SFILE)
VALUES(seq_board_num.nextval, '?', '?', '?', '?'); 
 */

public class HiFileDAO extends DBConnPool{
	
	//입력
	public int insertFile(HiFileDTO dto) {
		int result = 0;
		
		String query = "INSERT INTO HM.HIFILE (ID, TITLE, CATEGORY, OFILE, SFILE) "
						+ " VALUES(seq_board_num.nextval, ?, ?, ?, ?) "; 
		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getCategory());
			psmt.setString(3, dto.getOfile());
			psmt.setString(4, dto.getSfile());
			
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Inster 중 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}
}
