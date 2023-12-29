<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ include file="../common/menu.jsp" %>
	
	
	<div class="container">
	
		<div id="login">
			
		<form class="logform" action="<c:url value='/login/login' />" method="post" onsubmit="return formCheck(this)">
			<h3 id="title">Login</h3>	
			<div id="msg">
				<c:if test="${not empty param.msg}">
					<i class="fa fa-exclamation-circle">${URLDecoder.decode(param.msg)}</i>
				</c:if>
			</div>	
			
			<input class="loginput" type="text" name="id" placeholder="이메일 입력" value="${cookie.id.value}" autofocus />
			<input class="loginput" type="password" name="pwd" placeholder="비밀번호" /> 
			<input class="loginput" type="hidden" name="toURL" value="${param.toURL}"/>
			<button class="logbutton">로그인</button>
			
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
		
	
	      </div>
	</div>
	
	
	<%@ include file="../common/footer.jsp" %>