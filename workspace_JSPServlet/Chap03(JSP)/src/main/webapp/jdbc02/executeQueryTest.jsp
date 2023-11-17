<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="kr.co.himedia.common.JDBConnectionTest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>executeQuery - jdbc</title>
</head>
<body>
	<h2>ȸ�� ��� ��ȸ (executeQuery() ���)</h2>
	<%
		//DB�� ����
		JDBConnectionTest jdbc = new JDBConnectionTest();
	
		// ������ ����  
		String sql = "SELECT ID, PASS, NAME, REGIDATE FROM MEMBER";
		Statement stmt = jdbc.con.createStatement();
		
		//���� ����
		ResultSet rs = stmt.executeQuery(sql);
		
		//��� Ȯ��(�� ������ ���)
		while(rs.next()) {  // ���� ��(���ڵ�)�� ��ȯ��
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			Date regidate = rs.getDate(4);
			
			out.println(String.format("%s %s %s %s", id, pw, name, regidate) + "<br />");
		}
		
		//���� �ݱ�
		jdbc.close();
	%>
</body>
</html>

