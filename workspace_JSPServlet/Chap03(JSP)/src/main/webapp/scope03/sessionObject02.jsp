<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>session ����</title>
</head>
<body>
	<h2>������ �̵� �� session ������ �Ӽ� �б�</h2>
	<%
		ArrayList<String> lists = (ArrayList<String>)session.getAttribute("lists");
		for (String str : lists)
			out.print(str + "<br />");
	%>
</body>
</html>