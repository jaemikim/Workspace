<%@page import="kr.co.himedia.common.PersonDTO"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>application ����</title>
</head>
<body>
	<h2>application ���� ����</h2>
	<%
		Map<String, PersonDTO> maps = new HashMap<>();
		maps.put("actor1", new PersonDTO("���������� ��ī������", 49));
		maps.put("actor2", new PersonDTO("���� Ŭ������", 38));
		application.setAttribute("maps", maps);
	%>
	application ������ �Ӽ��� ����Ǿ����ϴ�.
</body>
</html>