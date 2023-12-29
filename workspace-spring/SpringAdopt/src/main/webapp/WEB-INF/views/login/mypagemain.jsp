<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.net.URLDecoder" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="loginout" value="${sessionScope.id==null ? 'Login' : 'Logout'}"/>
<c:set var="loginoutlink" value="${sessionScope.id==null ? '/login/login' : '/login/logout'}"/>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<script
   src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
   integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
   crossorigin="anonymous"></script>
   <link
   href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
   rel="stylesheet"
   integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
   crossorigin="anonymous">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="<c:url value='/resources/css/menu.css' />" />
	<link rel="stylesheet" href="<c:url value='/resources/css/mypagemain.css' />" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
	<title>mypagemain</title>
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
	
	
	<h1 class="mypagetitle"  >마이페이지메인</h1>
		
		<div id="mypagemain" class="a">
		
			
			<a>내정보</a>
			
			
			<ul>
				<li>ID</li>
				<li><input type="text" name="id" value="${loginUser.id }" readonly="readonly" placeholder="아이디"></li>
			</ul>
			
			<ul>
				<li>PASSWORD</li>
				<li><input type="password" name="pass" readonly="readonly" ></li>
			</ul>

		<ul>
			<li>이름</li>
			<li><input type="text" name="name" value="${loginUser.name }"
				readonly="readonly" placeholder="김00"></li>
		</ul>

		<ul>
			<li>핸드폰번호</li>
			<li><input type="text" name="phone" value="${loginUser.phone }"
				readonly="readonly"></li>
		</ul>

		<ul>
			<li>이메일</li>
			<li><input type="text" name="email" value="${loginUser.phone }"
				readonly="readonly"></li>
		</ul>


		<ul class="edit" >
				<li>
				<button class="editbutton"  type="button" onclick="location.href='../MyPage/myprivacypass.jsp'" >수정하기</button>
				</li>
			</ul>
			
		</div>	
		
</body>
</html>














