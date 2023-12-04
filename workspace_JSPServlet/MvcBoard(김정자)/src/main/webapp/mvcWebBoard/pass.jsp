<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>비밀번호 체크</title>
  <script type="text/javascript">
  	function validateForm(form) {
		if (form.pass.value == "") {
			alert("비밀번호를 입력하세요.");
			form.pass.focus();
			return false;
		}
	}
  </script> 
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script> 
</head>
<body>
	<div class="container">
	<h2 align="center">비밀번호 체크</h2>
	<form action="../mvcwebboard/pass.do" method="post" name="passFrm" onsubmit="return validateForm(this);">
		<input type="hidden" name="id" value="${param.id }" />
		<input type="hidden" name="mode" value="${param.mode }" />
		<table class="table">
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pass"  style="width: 100px"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">검증하기</button>
					<button type="reset">초기화</button>
					<button type="button" onclick="location.href='../mvcwebboard/list.do'">목록</button>
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>