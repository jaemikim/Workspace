<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title> 수정하기</title>
  <script type="text/javascript">
  	function validationForm(form) {
		if(form.name.value == "") {
			alert("작성자를 입력하세요");
			form.name.focus();
			return false;
		}
		if(form.title.value == "") {
			alert("제목을 입력하세요");
			form.title.focus();
			return false;
		}
		if(form.content.value == "") {
			alert("내용을 입력하세요");
			form.content.focus();
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
	<h2 align="center"> 수정하기</h2>
	<form action="../mvcwebboard/edit.do" name="editFrm" method="post" enctype="multipart/form-data" onsubmit="return validationForm(this);">
		<input type="hidden" name="id" value="${dto.id }" />
		<input type="hidden" name="prevofile" value="${dto.ofile }" />
		<input type="hidden" name="prevsfile" value="${dto.sfile }" />
		<table class="table">
			<tr>
				<td>작성자</td>
				<td>
					<input type="text" name="name" style="width: 150px" value="${dto.name }">
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="title" style="width: 150px" value="${dto.title }">
				</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>
					<textarea name="content" style="width: 90%; height: 100px;">${dto.content }</textarea>
				</td>
			</tr>
			<tr>
				<td>첨부파일</td>
				<td>
					<input type="file" name="ofile">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">수정완료</button>
					<button type="reset">초기화</button>
					<button type="button" onclick="location.href='../mvcwebboard/list.do';">목록</button>
				</td>
			</tr>
		</table>	
	</form>
	</div>
</body>
</html>