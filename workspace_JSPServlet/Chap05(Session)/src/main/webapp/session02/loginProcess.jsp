<%@page import="kr.co.himedia.login.MemberDTO"%>
<%@page import="kr.co.himedia.login.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//�α��� �����κ��� ���� ���̵�� �н����� 
	String userId = request.getParameter("user_id");
	String userPwd = request.getParameter("user_pw");
	
	//web.xml���� ������ DB ���� ����
	String oracleDriver = application.getInitParameter("OracleDriver");
	String oracleURL = application.getInitParameter("OracleURL");
	String oracleId = application.getInitParameter("OracleId");
	String oraclePwd = application.getInitParameter("OraclePwd");
	
	// DAO�� ���� ȸ�� ���� Ȯ��
	MemberDAO dao = new MemberDAO(oracleDriver, oracleURL, oracleId, oraclePwd);
	MemberDTO memberDTO = dao.getMemberDTO(userId, userPwd);
	dao.close();
	
	//�α��� ������ ���� ó��
	if (memberDTO.getId() != null){
		//�α��� ����
		session.setAttribute("userId", memberDTO.getId());
		session.setAttribute("userName", memberDTO.getName());
		response.sendRedirect("loginForm.jsp");
	} else {
		//�α��� ���� 
		request.setAttribute("loginErrMsg", "�α��� �����Դϴ�.");
		request.getRequestDispatcher("loginForm.jsp").forward(request, response);
	}
%>