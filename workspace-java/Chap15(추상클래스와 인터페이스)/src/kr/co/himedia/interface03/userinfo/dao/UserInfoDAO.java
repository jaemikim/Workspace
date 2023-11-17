package kr.co.himedia.interface03.userinfo.dao;

import kr.co.himedia.interface03.userinfo.UserInfoDTO;

public interface UserInfoDAO {

	void insertUserInfo(UserInfoDTO userinfoDTO);
	void updateUserInfo(UserInfoDTO userinfoDTO);
	void deleteUserInfo(UserInfoDTO userinfoDTO);
	void selectUserInfo(UserInfoDTO userinfoDTO);
	
}
