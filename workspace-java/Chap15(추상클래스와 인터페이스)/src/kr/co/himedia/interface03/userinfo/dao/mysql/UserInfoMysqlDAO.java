package kr.co.himedia.interface03.userinfo.dao.mysql;

import kr.co.himedia.interface03.userinfo.UserInfoDTO;
import kr.co.himedia.interface03.userinfo.dao.UserInfoDAO;

public class UserInfoMysqlDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userinfoDTO) {
		System.out.println("insert into Mysql DB userid = " + userinfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userinfoDTO) {
		System.out.println("update Mysql DB userid = " + userinfoDTO.getUserId());	
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userinfoDTO) {
		System.out.println("delete Mysql DB userid = " + userinfoDTO.getUserId());	
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userinfoDTO) {
		System.out.println("select Mysql DB userid = " + userinfoDTO.getUserId());	
		
	}

}
