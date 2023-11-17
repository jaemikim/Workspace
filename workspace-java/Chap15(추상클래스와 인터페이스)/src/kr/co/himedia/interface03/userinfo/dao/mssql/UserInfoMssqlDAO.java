package kr.co.himedia.interface03.userinfo.dao.mssql;

import kr.co.himedia.interface03.userinfo.UserInfoDTO;
import kr.co.himedia.interface03.userinfo.dao.UserInfoDAO;

public class UserInfoMssqlDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userinfoDTO) {
		System.out.println("insert into Mssql DB userid = " + userinfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userinfoDTO) {
		System.out.println("update Mssql DB userid = " + userinfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userinfoDTO) {
		System.out.println("delete Mssql DB userid = " + userinfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userinfoDTO) {
		System.out.println("select Mssql DB userid = " + userinfoDTO.getUserId());
		
	}

}
