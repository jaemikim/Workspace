<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="loginout" value="${sessionScope.id==null ? 'Login' : 'Logout'}"/>
<c:set var="loginoutlink" value="${sessionScope.id==null ? '/login/login' : '/login/logout'}"/>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="<c:url value='/resources/css/menu.css' />" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
	<title>mypost</title>
</head>
<body>
	<div id="menu">
		<ul class="menu2">
			<li id="logo"><a href="<c:url value='/' />">Home</a></li>
			<li><a href="<c:url value='/mypagemain/mypagemain' />">MyPage</a></li>
			<li><a href="<c:url value='/wishlist' />">WishList</a></li>
			<li><a href="<c:url value='/mypost/mypost' />">MyPost</a></li>
			<li><a href="<c:url value='${loginoutlink}' />">${loginout}</a></li>
			<li><a href="<c:url value='/register/add' />">SignUp</a></li>
		</ul>
	</div>
	<div id="mypost">
			<ul>
				
				<li width="500px;" style="border-top: 1px solid; border-bottom: 1px solid; border-color: #8B4513;" >제목</li>
				<li width="100px;" style="border-top: 1px solid; border-bottom: 1px solid; border-color: #8B4513;">조회수</li>
			
			</ul>
			
			<ul style="font-size: 15px; ">
				<li width="500px;" style="border-bottom: 1px solid; border-color: #8B4513;" onclick="location.href='../list/write.jsp'">고양이</li>
				<li width="100px;" style="border-bottom: 1px solid; border-color: #8B4513;" onclick="location.href='../list/write.jsp'">123</li>
			</ul>
	
	
	
	
	</div>
</body>
</html>