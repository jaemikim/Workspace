<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>액션 태그 - param </title>
</head>
<body>
<!-- 이전 페이지 request 영역에 저장한 자바빈즈를 가져옴 -->
	<jsp:useBean id="person" class="kr.co.himedia.actiontag.PersonDTO" scope="request" />
	<h2>포워드 된 페이지에서 매개변수 확인하기</h2>
	<ul>
		<li><jsp:getProperty property="name" name="person"/></li> <!-- 멤버변수의 값을 가져와 출력함 -->
		<li>나이 : <jsp:getProperty property="age" name="person"/> </li>
		<li>성명 : <%= request.getParameter("param0") %></li>
		<li>장소 : <%= request.getParameter("param1") %></li>
		<li>성함 : <%= request.getParameter("param2") %></li>
	</ul>
	<jsp:include page="paramInclude.jsp">
		<jsp:param value="천호점" name="himedia"/>
		<jsp:param value="임계점은 언제?" name="AI"/>
	</jsp:include>
</body>
</html>