<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="author" content="Untree.co">
  <link rel="shortcut icon" href="favicon.png">

  <meta name="description" content="" />
  <meta name="keywords" content="bootstrap, bootstrap4" />

		<!-- Bootstrap CSS -->
		<link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">
		<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
		<link href="<c:url value='/resources/css/tiny-slider.css'/>" rel="stylesheet">
		<link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet">
		<link href="<c:url value='/resources/css/style1.css'/>" rel="stylesheet">

		
		<title>유기견 동물을 입양하세요</title>
	</head>

	<body>
    
	<!-- Start Header/Navigation -->
		<nav class="custom-navbar navbar navbar navbar-expand-md navbar-dark bg-dark" arial-label="Furni navigation bar">

			<div class="container">
				<a class="navbar-brand" href="<c:url value='/index'/>">Furni<span>.</span></a>

				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsFurni" aria-controls="navbarsFurni" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarsFurni">
					<ul id="gnb" class="custom-navbar-nav navbar-nav ms-auto mb-2 mb-md-0">
						<li class="active">
							<a class=" nav-link" href="<c:url value='/index'/>">Home</a>
						</li>
						<li class="nav-item dropdown"><a class="nav-link" data-bs-toggle="dropdown" href="<c:url value='/about/about'/>">About us</a>
							<ul class="dropdown-menu rounded">
								<li><a href="<c:url value='/about/about'/>" class="dropdown-item">기업인사말</a></li>
								<li><a href="#" class="dropdown-item">조직도</a></li>
								<li><a href="#" class="dropdown-item">센터현황</a></li>
								<li><a href="#" class="dropdown-item">결산공고</a></li>
							</ul>
						</li>
						<li><a class="nav-item nav-link" href="<c:url value='/loss/loss'/>">동물분실</a></li>
						<li class="nav-item dropdown"><a class="nav-link" data-bs-toggle="dropdown" href="<c:url value='/adopt/adopt_list'/>">입양</a>
							<ul class="dropdown-menu rounded">
								<li><a href="<c:url value='/adopt/adopt_list'/>" class="dropdown-item">입양하기</a></li>
								<li><a href="<c:url value='/adopt/review_list'/>" class="dropdown-item">입양후기</a></li>
							</ul>
						</li>
						<li><a class="nav-link" href="<c:url value='/shelter/shelter'/>">보호소</a></li>
					</ul>

					<ul class="custom-navbar-cta navbar-nav mb-2 mb-md-0 ms-5">
						<li><a class="nav-link" href="<c:url value='/login/login'/>"><img src="<c:url value='/resources/images/login.svg'/>" alt="로그인"></a></li>
						<li><a class="nav-link" href="<c:url value='/login/join'/>"><img src="<c:url value='/resources/images/join.svg'/>" alt="회원가입"></a></li>
					</ul>
				</div>
			</div>
				
		</nav>
		<!-- End Header/Navigation -->