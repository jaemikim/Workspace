<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.net.URLDecoder" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>

<!DOCTYPE html>

<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="author" content="Untree.co">
  <link rel="shortcut icon" href="favicon.png">

  <meta name="description" content="" />
  <meta name="keywords" content="bootstrap, bootstrap4" />

		<!-- Bootstrap CSS -->
		<link type="text/css" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
		<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
		<link type="text/css" href="<%=request.getContextPath()%>/resources/css/tiny-slider.css" rel="stylesheet">
		<link type="text/css" href="<%=request.getContextPath()%>/resources/css/style.css" rel="stylesheet">
		
		<style type="text/css">
		*{box-sizing: border-box;}
		a{text-decoration: none;}
		form{
			padding-top:500px;
			width: 400px;
			height: 500px;
			display: flex;
			flex-direction: column;	/* 세로 */
			align-items: center;
			position: absolute;
			top: 50%;
			left: 50%;
			transform: translate(-50%,-50%);
			
		}
		
		input[type='text'],input[type='password'] {
			width: 300px;
			height: 40px;
			border: 1px solid rgb(89, 117, 196);
			border-radius: 5px;
			padding: 0 10px;
			margin-bottom: 10px;
		}
		button{
			background-color: rgb(89, 117, 196);
			color: white;
			width: 300px;
			height: 50px;
			font-size: 17px;
			border: none;
			border-radius: 5px;
			margin: 20px 0 30px 0;
		}
		#title {
			font-size: 30px;
			margin: 40px 0 30px 0;		
		}
		#msg {
			height: 30px;
			text-align: center;
			font-size: 16px;
			color: red;
			margin-bottom: 20px;
		}
		
		
	</style>
		<title>login </title>
		
	</head>

	<body>

		<!-- Start Header/Navigation -->
		<nav class="custom-navbar navbar navbar navbar-expand-md navbar-dark bg-dark" arial-label="Furni navigation bar">

			<div class="container">
				<a class="navbar-brand" href="index.jsp">Furni<span>.</span></a>

				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsFurni" aria-controls="navbarsFurni" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarsFurni">
					<ul class="custom-navbar-nav navbar-nav ms-auto mb-2 mb-md-0">
						<li class="nav-item">
							<a class="nav-link" href="index.js">Home</a>
						</li>
						<li><a class="nav-link" href="shop.js">Shop</a></li>
						<li><a class="nav-link" href="about.js">About us</a></li>
						<li><a class="nav-link" href="services.js">Services</a></li>
						<li><a class="nav-link" href="blog.js">Blog</a></li>
						<li><a class="nav-link" href="contact.js">Contact us</a></li>
					</ul>

					<ul class="custom-navbar-cta navbar-nav mb-2 mb-md-0 ms-5">
						<li><a class="nav-link" href="<c:url value='${loginoutlink}' />"><img src="<%=request.getContextPath()%>/resources/images/user.svg"></a></li>
						<li><a class="nav-link" href="cart.js"><img src="<%=request.getContextPath()%>/resources/images/cart.svg"></a></li>
					</ul>
				</div>
			</div>
				
		</nav>
		<!-- End Header/Navigation -->
		
		
		
		
		
	<form action="<c:url value='/login/login' />" method="post" onsubmit="return formCheck(this)">
		<h3 id="title">Login</h3>	
		<div id="msg">
			<c:if test="${not empty param.msg}">
				<i class="fa fa-exclamation-circle">${URLDecoder.decode(param.msg)}</i>
			</c:if>
		</div>	
		
		<input type="text" name="id" placeholder="이메일 입력" value="${cookie.id.value}" autofocus />
		<input type="password" name="pwd" placeholder="비밀번호" /> 
		<input type="hidden" name="toURL" value="${param.toURL}"/>
		<button>로그인</button>
		
		<div>
			<label><input type="checkbox" name="rememberId" value="on"${empty cookie.id.value ? "" : "checked"}/>아이디 기억</label>
			<a href="">비밀번호 찾기</a>
			<a href="<c:url value='/register/add' />">회원가입</a>
		</div>
		
	</form>
	
	<script type="text/javascript">
		function formCheck(frm) {
			let msg = ''
			
			if(frm.id.value.length == 0) {
				setMessage(' id를 입력해주세요.', frm.id)
				return false;
			}
			if(frm.pwd.value.length == 0) {
				setMessage(' password를 입력해주세요.', frm.pwd)
				return false;
			}
			
			return true;
		}
		
		function setMessage(msg, element) {
			document.getElementById("msg").innerHTML = `<i class="fa fa-exclamation-circle">${'${msg}'}</i>`
			if(element)
				element.select()			// 값을 잘못 입력되었을 때 그 요소를 선택되게 하는 것
		} 
	</script>
	
	<!-- End Footer Section -->	


		<script src="resources/js/bootstrap.bundle.min.js"></script>
		<script src="resources/js/tiny-slider.js"></script>
		<script src="resources/js/custom.js"></script>
	</body>
</html>















