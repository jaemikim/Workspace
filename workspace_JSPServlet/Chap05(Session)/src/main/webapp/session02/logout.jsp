<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 세션에 저장된 정보 삭제
	session.removeAttribute("userId");
	session.removeAttribute("userName");
	
	//모든 세션의 속성 한꺼번에 삭제
	session.invalidate();
	
	// 페이지 이동
	response.sendRedirect("loginForm.jsp");
%>