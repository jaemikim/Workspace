<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css">
	<style type="text/css">
		* { box-sizing: border-box; }
		.title {
			font-size: 50px;
			margin: 40px 0 30px 0
		}
		
		form {
			width: 400px;
			height: 600px;
			display: flex; 
			flex-direction: column;
			align-items: center;
			position: absolute;
			top: 50%;
			left: 50%;
			transform : translate(-50%, -50%);
			border: 1px solid rgb(89,117,196);
			border-radius: 10px
		}
		.msg {
			height: 30px;
			text-align: center;
			font-size: 16px;
			color: red;
			margin-bottom: 20px;
			 
		}
		label {
			width: 300px;
			height: 30px;
			margin-top: 4px;	
		}
		
		.input-field {
			width: 300px;
			height: 40px;
			border: 1px solid rgb(89,117,196);
			border-radius: 5px;
			padding: 0 10px;
			margin-bottom: 10px;
		}
		
		.sns-chk { margin-top: 5px; }
		
		button {
			background-color:rgb(89,117,196); 
			color: white;
			width: 300px;
			height: 50px;
			font-size: 17px;
			border: none;
			border-radius: 5px;
			margin: 20px 0 30px 0;
				}
		
	</style>
	<title>회원가입</title>
</head>
<body>
	<!-- jstl에서 c:url /을 사용하면 context path를 안써줘도 됨 -->
	<form action="<c:url value="/register/save"/>" method="post" onsubmit="return formCheck(this)">
		<div class="title">Register</div>
		<div id="msg" class="msg"></div>
	
		<label for="">아이디</label>
		<input class="input-field" type="text" name="id" placeholder="8~12자리의 영대소문자, 숫자 조합" autofocus/>
		
		<label for="">비밀번호</label>
		<input class="input-field" type="password" name="pwd" placeholder="8~12자리의 영대소문자, 숫자 조합" />
		
		<label for="">이름</label>
		<input class="input-field" type="name" name="name" placeholder="김00" />
		
		<label for="">이메일</label>
		<input class="input-field" type="text" name="email" placeholder="kim@gmail.com" />
	
		<label for="">생일</label>
		<input class="input-field" type="text" name="birth" placeholder="2000/01/01" />
		
		<div class="sns-chk">
			<label><input type="checkbox" name="sns" value="facebook"> 페이스북</label>
			<label><input type="checkbox" name="sns" value="kakaotalk"> 카카오</label>
			<label><input type="checkbox" name="sns" value="instagram"> 인스타</label>
		</div>
		
		<button>회원 가입</button>
	
	</form>
	
	
	<script type="text/javascript">
		function formCheck(frm) {
			let msg = ''
			
			if(frm.id.value.length < 8) {
				setMessage(' id의 길이는 8자리 이상이어야 합니다.', frm.id)
				return false;
			}
			if(frm.pwd.value.length < 8) {
				setMessage(' pwd의 길이는 8자리 이상이어야 합니다.', frm.pwd)
				return false;
			}
			
			return true;
		}
		
		<%--   
		
		   ES6 템플릿 리터럴 사용함
			- 새로운 문자열 표기법 
			- ` ` ← 기호로 표기함 
			- ${ } ← 로 변수 출력 가능
			
		   서버가 JSP를 먼저 해석하므로 '${msg}' 이 부분을 EL로 해석함 
		   서버가 해석한 결과를 브라우저로 보내줌 
			   
		--%>
	
		function setMessage(msg, element) {
			document.getElementById("msg").innerHTML = `<i class="fa fa-exclamation-circle">${'${msg}'}</i>`
			if(element)
				element.select()			// 값을 잘못 입력되었을 때 그 요소를 선택되게 하는 것
		}
		
	</script>

</body>
</html>























