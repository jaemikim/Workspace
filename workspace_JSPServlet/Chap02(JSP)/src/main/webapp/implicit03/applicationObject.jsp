<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>내장 객체 - application</title>
</head>
<body>
	<h2>web.xml에 설정한 내용 읽기</h2>
	초기화 매개변수-- : <%= application.getInitParameter("INIT_PARAM") %>
	
	<h2>서버에서의 물리적 경로 읽기</h2>
	application 내장 객체 : <%= application.getRealPath("/implicit03") %>
	
	<%!
		public String useImplicitObject(){
		return this.getServletContext().getRealPath("/implicit03");
		}
		
		public String useImplicitObject(ServletContext app){
		return app.getRealPath("/implicit03");
		}		
	%>
	
	<ul>
		<li>this 사용 : <%= useImplicitObject() %></li>
		<li>내장 객체율 인수로 전달 : <%= useImplicitObject(application) %></li>
	</ul>
</body>
</html>