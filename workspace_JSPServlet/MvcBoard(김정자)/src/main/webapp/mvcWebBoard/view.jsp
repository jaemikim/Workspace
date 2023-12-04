<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>  
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>상세보기</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container">
	<h2 align="center">상세보기</h2>
	<table class="table">
		<colgroup>
			<col width="15%" /><col width="35%" /><col width="15%" /><col width="*" />
		</colgroup>		
		<tr>
			<td>번호</td><td>${dto.id }</td>
			<td>작성자</td><td>${dto.name }</td>
		</tr>
		<tr>
			<td>자성일</td><td>${dto.postdate }</td>
			<td>조회수</td><td>${dto.visitcount }</td>
		</tr>
		<tr>
			<td>제목</td><td colspan="3">${dto.title }</td>
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="3">
				${dto.content }
				<c:if test="${not empty dto.ofile and isImage eq true }">
					<br/><img alt="첨부파일"	src="../Uploads/${dto.sfile }" style="max-width:100%"; >			
				</c:if>			
			</td>
		</tr>
		<tr>
			<td>첨부파일</td>
			<td>
				<c:if test="${not empty dto.ofile}">
					${dto.ofile}
					<a href="../mvcbweboard/download.do?ofile=${dto.ofile}&sfile=${dto.sfile}&id=${dto.id}">[다운로드]</a>
				</c:if>
			</td>
			<td>다운로드수</td>
			<td>${dto.downcount }</td>
		</tr>
		<tr>
			<td colspan="4" align="center">
				<button type="button" onclick="location.href='../mvcwebboard/pass.do?mode=edit&id=${param.id}'">수정하기</button>
				<button type="button" onclick="location.href='../mvcwebboard/pass.do?mode=delete&id=${param.id}'">삭제하기</button>
				<button type="button" onclick="location.href='../mvcwebboard/list.do'">목록</button>
			</td>			
		</tr>
	</table>
	</div>
</body>
</html>