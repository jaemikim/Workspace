package kr.co.mvcweb.utils;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.JspWriter;

public class JSFunction {


	public static void alertLocation(String msg, String url, JspWriter out) {

		try {														
			String script = ""
			        + "<script>"
			        + "       alert('"+ msg +"');"
			        + "       location.href = '" +url+ "';"
					+ "</script>";
			out.println(script);									
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 메시지 알림창을 띄운 후 이전 페이지로 돌아감
	public static void alertBack(String msg, JspWriter out) {

		try {														
			String script = ""
			        + "<script>"
			        + "       alert('"+ msg +"');"
			        + "       history.back();"
					+ "</script>";
			out.println(script);									
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
		public static void alertLocation(HttpServletResponse response, String msg, String url) {

			try {													
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter write = response.getWriter();
				String script = ""
				        + "<script>"
				        + "       alert('"+ msg +"');"
				        + "       location.href = '" +url+ "';"
						+ "</script>";
				write.println(script);								
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

		public static void alertBack(HttpServletResponse response, String msg) {

			try {														
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter write = response.getWriter();
				String script = ""
				        + "<script>"
				        + "       alert('"+ msg +"');"
				        + "       history.back();"
						+ "</script>";
				write.println(script);									
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
}
