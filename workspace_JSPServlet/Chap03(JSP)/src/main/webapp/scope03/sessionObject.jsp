<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	ArrayList<String> lists = new ArrayList<>();
	lists.add("�̼���");
	lists.add("�Ż��Ӵ�");
	
	session.setAttribute("lists", lists);
%>    
<!DOCTYPE html>
<html>
<head>
  <meta charset="EUC-KR">
  <title>session ����</title>
</head>
<body>
	<h2>������ �̵� �� session ������ �Ӽ� �б�</h2>
	<a href = "sessionObject02.jsp">sessionObject02.jsp �ٷΰ���</a>
</body>
</html>