<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>리스트(목록보기)</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
	 <h2 align="center">목록 보기</h2>
	 <form action="" method="get">
		<table class="table">
			<tr>
				<td align="center">
					<select name = "searchField">
						<option value = "title">제목</option>
						<option value = "content">내용</option>
					</select>
					<input type = "text" name = "searchWord" />
					<input type = "submit" value = "검색하기" />
				</td>
			</tr>
		</table>
	 </form>
	 
	 <table class="table">
		<tr>
			<th width="10%">번호</th>
			<th width="*">제목</th>
			<th width="15%">작성자</th>
			<th width="10%">조회수</th>
			<th width="15%">작성일</th>
			<th width="8%">첨부파일</th>
		</tr>
		<c:choose>
			<c:when test="${empty boardLists }">      
			<tr>
				<td colspan="6" align="center">
					등록된 게시물이 없습니다.
				</td>
			</tr>
			</c:when>
			
			<c:otherwise>		                         
				<c:forEach items="${boardLists }" var="row" varStatus="loop">
				<tr align="center">
					<td> <!-- 번호 -->
					 ${map.totalCount - (((map.pageNum - 1) * map.pageSize) + loop.index) }
					</td>   
					<td align="left"> <!-- 제목(링크) -->
					<a href="../mvcwebboard/view.do?id=${row.id }">${row.title }</a>
					</td> 
					<td> <!-- 작성자 -->
					${row.name }
					</td>
					<td> <!-- 조회수 -->
						${row.visitcount }
					</td>
					<td><!-- 작성일 -->
						${row.postdate }
					</td>
					<td> 첨부파일 
						<c:if test="${not empty row.ofile }">
							<a href="../mvcwebboard/download.do?ofile=${row.ofile }&sfile=${row.sfile}&id=${row.id}">[Down]</a>	
						</c:if>		
					</td>
				</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>

	 <table class="table">
	 	<tr align="center">
	 		<td>${map.pagingData }</td>
	 		<td>	 		
	 		<button type="button" onclick="location.href='write.do'">글쓰기</button>
	 		</td>
	  	</tr>
	 </table>
</div>
</body>
</html>