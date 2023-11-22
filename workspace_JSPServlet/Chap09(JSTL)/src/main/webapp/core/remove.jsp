<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>   
<!-- 변수 선언 -->
<c:set var="scope" value="Page Value"/>
<c:set var="scope" value="Request Value" scope="request"/>
<c:set var="scope" value="Session Value" scope="session"/>
<c:set var="scope" value="Application Value" scope="application"/>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>JSTL - remove</title>
</head>
<body>
	<h4>출력하기</h4>
	<ul>
		<li>scope : ${scope }</li>
		<li>requestScope : ${requestScope.scope }</li>
		<li>sessionCope.scoope : ${sessionScope.scope }</li>
		<li>applicationScope.scope : ${applicationScope.scope }</li>
	</ul>
	<h4>session 영역에서 삭제하기</h4>
	<c:remove var="scope" scope="session"/>
	<ul>
		<li>sessionCope.scoope : ${sessionScope.scope }</li>
	</ul>
	
	<h4>scope 지정없이 삭제하기</h4>
	<c:remove var="scoope"/>
	<ul>
		<li>scope : ${scope }</li>
		<li>requestScope : ${requestScope.scope }</li>
		<li>sessionCope.scoope : ${sessionScope.scope }</li>
		<li>applicationScope.scope : ${applicationScope.scope }</li>
	</ul>
</body>
</html>