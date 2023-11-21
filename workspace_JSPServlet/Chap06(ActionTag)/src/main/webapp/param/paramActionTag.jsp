<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String pValue = "이순신";
%>    
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>액션 태그 - param </title>
</head>
<body>
 	<jsp:useBean id="person" class="kr.co.himedia.actiontag.PersonDTO" scope="request" />
 	<jsp:setProperty property="name" name="person" value="신사임당"/>
 	<jsp:setProperty property="age" name="person" value="48"/>
 	<jsp:forward page="paramForward.jsp?param0=이방원">
 		<jsp:param value="서울시 강동구" name="param1"/>
 		<jsp:param value="<%=pValue %>" name="param2"/>
 	</jsp:forward>
</body>
</html>