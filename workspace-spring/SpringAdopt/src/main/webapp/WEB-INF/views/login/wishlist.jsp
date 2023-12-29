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
	<link rel="stylesheet" href="<c:url value='/resources/css/wishlist.css' />" />
	<link rel="stylesheet" href="<c:url value='/resources/css/menu.css' />" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
	<title>wishlist</title>
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


	<div id="wishlist">		
			<h1>
				<img class="img" src="resources/img/c1.jpg" >
			</h1>
			
			<ul>				
				<li class="t1" >
					<input type="text" placeholder="제목 : 고양이" readonly="readonly"  >
				</li>
				<li class="t2" >
					<input type="text" placeholder="작성자" readonly="readonly" >
				</li>
				<li class="t3">
					<input type="text" placeholder="내용" readonly="readonly" >
				</li>
				<li>
					<button style="width: 50px; margin-top: 220px;">삭제</button><br/>
				</li>
				
			</ul>
			
			<h1>
			<img class="img" src="resources/img/puppy.jpg" >
			</h1>
			
			<ul>
				<li class="t1" >
					<input type="text" placeholder="제목 : 강아지" readonly="readonly" >
				</li>
				<li class="t2" >
					<input type="text" placeholder="작성자" readonly="readonly" >
				</li>
				<li class="t3" >
					<input type="text" placeholder="내용" readonly="readonly" >							
				</li>
				<li>
					<button style="width: 50px; margin-top: 220px;">삭제</button>
				</li>				
			</ul>
			
			
		</div>

	
	
</body>
</html>