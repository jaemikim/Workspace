<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>액션 태크 - UseBean</title>
</head>
<body>
	<h2>useBean 액션 테그</h2>
	<h3>자바빈즈 생성하기</h3>
	<jsp:useBean id="person" class="kr.co.himedia.actiontag.PersonDTO"  scope="request" />
	
	<h3>setProperty 액션 태그로 자바빈즈 속성 지정</h3>
	<jsp:setProperty property="name" name="person"  value="이순신"/>
	<jsp:setProperty property="age" name="person"  value="30"/>
	
	<h3>getProperty 액션 태그로 자바빈즈 속성 지정</h3>
	<ul>
		<li>이름 : <jsp:getProperty property="name" name="person"/></li>
		<li>나이 : <jsp:getProperty property="age" name="person"/></li>
	</ul>	
</html>