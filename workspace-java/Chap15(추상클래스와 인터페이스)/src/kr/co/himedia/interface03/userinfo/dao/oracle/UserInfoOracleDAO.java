package kr.co.himedia.interface03.userinfo.dao.oracle;

import kr.co.himedia.interface03.userinfo.UserInfoDTO;
import kr.co.himedia.interface03.userinfo.dao.UserInfoDAO;

public class UserInfoOracleDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userinfoDTO) {
		System.out.println("insert into ORACLE DB userid = " + userinfoDTO.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfoDTO userinfoDTO) {
		System.out.println("update ORACLE DB userid = " + userinfoDTO.getUserId());		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userinfoDTO) {
		System.out.println("delete ORACLE DB userid = " + userinfoDTO.getUserId());		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userinfoDTO) {
		System.out.println("select ORACLE DB userid = " + userinfoDTO.getUserId());		
	}
	
}
