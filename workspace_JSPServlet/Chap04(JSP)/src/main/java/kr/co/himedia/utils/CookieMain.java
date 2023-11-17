package kr.co.himedia.utils;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieMain {

	// 쿠키 생성 - 이름, 값, 유지 기간
	public static void makeCooke(HttpServletResponse response, String cName, String cValue, int cTime) {		
		Cookie cookie = new Cookie(cName, cValue);	/*쿠키 생성 */
		cookie.setPath("/");		            	/* 경로 설정 */
		cookie.setMaxAge(cTime);					/*  유지기간 설정*/
		response.addCookie(cookie);					/* 응답 객체에 추가 */
	}
	
	// 쿠키 읽기 - 특정한 쿠키를 찾아서 그 값 반환
	public static String readCookie(HttpServletRequest request, String cName) {
		String cookieValue = "";                   // 반환 값
		
		Cookie[] cookies = request.getCookies();   // 쿠키를 읽어서 popupMode 값 설정
		if(cookies != null) {
			for(Cookie c : cookies) {
				String cookieName = c.getName();
					if(cookieName.equals(cName)) {
						cookieValue = c.getValue();
				}
			}
		}
		return cookieValue;
	}
	
	// 쿠키 삭제 - 특정 이름의 쿠키
	public static void deleteCookie(HttpServletResponse response, String cName) {
		makeCooke(response, cName, "", 0);    // 0초를 선택하면 삭제이다.
	}
	
}
