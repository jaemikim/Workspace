<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath }"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 칭</title>
<script type="text/javascript">
	function fnValidate() {
		//alert("||")
		let frmLogin = document.frmLogin
		let userId = frmLogin.userId.value
		let userName = frmLogin.userName.value
		
		if((userId.length == 0 || userId == "") || (userName.length == 0 || userName == "")){
			alert("아이디와 이름을 필수 입니다.")			
		} else {
			frmLogin.method = "post"
			frmLogin.action = "${contextPath}/req/login.do"
			frmLogin.submit()
		}
	}
</script>
</head>
<body>
	<form name="frmLogin" action="${contextPath}/req/login.do" method="post">
		<table width="400">		
			<tr>
				<td>아이디 <input type="text" name="userId" size="10"/> </td>
				<td>이름 <input type="text" name="userName" size="10"/> </td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="로그인" onclick="fnValidate()"/>
					<input type="reset" value="다시입력"/>
			    </td>
				
				
			</tr>
		</table>
	
	</form> 
</body>
</html>