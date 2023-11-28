package kr.co.himedia.utils;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.JspWriter;

public class JSFunction {

	// 메시지 알림장을 띄운 후 명시한 URL로 이동함
	public static void alertLocation(String msg, String url, JspWriter out) {

		try {														// 자바스크립트 코드
			String script = ""
			        + "<script>"
			        + "       alert('"+ msg +"');"
			        + "       location.href = '" +url+ "';"
					+ "</script>";
			out.println(script);									// 자바스크립트 코드가 out 내장객체로 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 메시지 알림창을 띄운 후 이전 페이지로 돌아감
	public static void alertBack(String msg, JspWriter out) {

		try {														// 자바스크립트 코드
			String script = ""
			        + "<script>"
			        + "       alert('"+ msg +"');"
			        + "       history.back();"
					+ "</script>";
			out.println(script);									// 자바스크립트 코드가 out 내장객체로 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 메시지 알림장을 띄운 후 명시한 URL로 이동함
		public static void alertLocation(HttpServletResponse response, String msg, String url) {

			try {														// 자바스크립트 코드
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter write = response.getWriter();
				String script = ""
				        + "<script>"
				        + "       alert('"+ msg +"');"
				        + "       location.href = '" +url+ "';"
						+ "</script>";
				write.println(script);									// 자바스크립트 코드가 out 내장객체로 출력
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 메시지 알림창을 띄운 후 이전 페이지로 돌아감
		public static void alertBack(HttpServletResponse response, String msg) {

			try {														// 자바스크립트 코드
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter write = response.getWriter();
				String script = ""
				        + "<script>"
				        + "       alert('"+ msg +"');"
				        + "       history.back();"
						+ "</script>";
				write.println(script);									// 자바스크립트 코드가 out 내장객체로 출력
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	
}
