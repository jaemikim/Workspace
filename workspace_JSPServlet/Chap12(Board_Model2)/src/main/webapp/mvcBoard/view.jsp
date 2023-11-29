<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>모델 2 기반 게시판 - 상세보기</title>
</head>
<body>
	<h2>모델 2 기반 게시판 - 상세보기</h2>
	<table border="1" width="90%">
		<colgroup>
			<col width="15%" /><col width="35%" /><col width="15%" /><col width="*" />
		</colgroup>		
		<!-- 게시글 내용 -->
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
			<td colspan="3">
				<c:if test="${not empty dto.ofile}">
					${dto.ofile}
					<a href="../mvcboard/download.do?ofile=${dto.ofile}&sfile=${dto.sfile}&id=${dto.id}">[다운로드]</a>
				</c:if>
			</td>
		</tr>
	</table>
</body>
</html>