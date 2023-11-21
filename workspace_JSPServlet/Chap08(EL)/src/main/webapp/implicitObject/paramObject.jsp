<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>표현 언어(EL) - 폼값 처리</title>
</head>
<body>
	<h2>폼값 전송</h2>
	<form action="paramFormSubmit.jsp">
		이름 :	<input type = "text" name = "name" /> <br />
		성별 :	<input type = "radio" name = "gender" value ="man" /> 남자
				<input type = "radio" name = "gender" value ="woman" /> 여자 <br />
		학력 :	<select name = "grade">
					<option value="ele">초딩</option>
					<option value="mi">중딩</option>
					<option value="high">고딩</option>
					<option value="uni">대딩</option>
				</select>	<br />
		관심사항 : 
				<input type = "checkbox" name = "interest" value = "pol" />정치
				<input type = "checkbox" name = "interest" value = "eco" />경제
				<input type = "checkbox" name = "interest" value = "ent" />연예
				<input type = "checkbox" name = "interest" value = "spo" />운동 <br />
		<input type = "submit" value = "전송하기" />
	</form>
</body>
</html>