<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#searchBtn').click(function() {
		//	alert("검색하기")
			$.ajax({
				url : "../naverSearchAPI.do",       //요청 url
				type : "get",						//HTTP 메서드
				data : {							//매개변수로 전달할 데이터
					keyword : $('#keyword').val(),  //검색어
					startNum : $('#startNum option:selected').val()				// 검색 시작 위치
				},
				dataType : "json",                  // 응답 데이터 형식
				success : sucFuncJson,              // 요청 성공시 호출할 메서드 설정 (콜백)
				error : errFunc                     // 요청 실패시 호출할 메서드 설정 (콜백)
			});			
		});		
	});
	
	// 검색 성공시 결과를 화면에 출력
	function sucFuncJson(d) {
		let str = "";
		$.each(d.items, function(index, item) {
			str += "<ul>";
			str += "  <li>" + (index + 1) + "</li>";
			str += "  <li>" + item.title + "</li>";
			str += "  <li>" + item.description + "</li>";
			str += "  <li>" + item.bloggername + "</li>";
			str += "  <li>" + item.bloggerlink + "</li>";
			str += "  <li>" + item.postdate + "</li>";
			str += "  <li><a href='" + item.link + "'target='_blank'>링크</a></li>";
			str += "</ul>";			
		});
		$('#searchResult').html(str);
	}
	
	// 실패시 경고창 출력
	function errFunc() {
		alert("실패 : " + e.status);
	}
</script>
<style type="text/css">
	ul { border: 2px #cccccc solid;}
</style>
</head>
<body>
	<div>
		<div>
			<form action="#" id="searchFrm">
				한 페이지에 10개씩 출력함 <br />
				<select id="startNum">
					<option value="1">1페이지</option>
					<option value="11">2페이지</option>
					<option value="21">3페이지</option>
					<option value="31">4페이지</option>
					<option value="41">5페이지</option>
				</select>
				<input type="text" id="keyword" placeholder="검색어를 입력하세요">
				<button type="button" id="searchBtn">검색요청하기</button>
			</form>
		</div>
		<div class="row" id="searchResult">
			여기에 검색 결과가 출력됩니다. 
		</div>
	</div>
</body>
</html>