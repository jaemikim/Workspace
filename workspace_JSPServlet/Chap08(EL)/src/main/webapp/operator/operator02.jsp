<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("num1", 0);
	pageContext.setAttribute("num2", "10");
	
	pageContext.setAttribute("nullStr", null);
	pageContext.setAttribute("emptyStr", "");
	pageContext.setAttribute("lengthzero", new Integer[0]);
	pageContext.setAttribute("sizeZero", new ArrayList<Object>());
%>    
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>empty 연산자, 삼항 연산자, null 연산</title>
</head>
<body>
	<h3>empty 연산자</h3>
	empty nullstr : ${empty nullStr}  <br/> <!-- 값이 없는(null) 상태임 -->
	empty emptyStr : ${empty emptyStr } <br />
	empty IengthZero : ${empty IengthZero} <br />
	empty sizeZero : ${empty sizeZero } <br />
	
	<h3>삼항 연산자</h3>
	num1 gt num2 ? "참" : "거짓" => ${ num1 gt num2 ? "num1이 크다" : "num2가 크다" }
	
	<h3>null 연산자</h3>
	null + 10 : ${null + 10 }<br/>     <!-- null은 모두 0으로 처리됨 -->
	nullStr + 10 : ${nullStr + 10 }<br/>
	param.noVar > 10 : ${param.noVar > 10 }
</body>
</html>