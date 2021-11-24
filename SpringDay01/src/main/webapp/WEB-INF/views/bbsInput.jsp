<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
</head>
<body>
<form action="bbsInput" method=POST> 
<!-- action = 컨트롤러 이름, method = parameter 전달방식
	form 태그 범위안에 name="" 가 변수명이 되어 파라미터로 전달됨
 -->
	<table border="1">
		<thead>
			<td colspan="2"><h2 id="head">게시판글쓰기</h2></td>
		</thead>
		<tbody>
			<tr>
				<td>제목</td>
				<td><input id="title" type="text" name="title" /></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input id="author" type="text" name="author" value="백승한"/></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input id="content" type="text" name="content" /></td>
			</tr>
			<tr>
				<th colspan="2"><input type="button" value="다시쓰기" /> 
				<input id="alert" type="button" value="글쓰기" onclick="clickEvt()" />
				<input type="submit" value="저장" />
				</th>
				
			</tr>
		</tbody>
	</table>
</form>
	<script>
		const head = document.getElementById("head");
		const btn = document.getElementById("alert");
		const title = document.getElementById("title");
		const author = document.getElementById("author");
		const content = document.getElementById("content");

		function clickEvt() {
			btn.addEventListener("click", alert("제목 : " + title.value
					+ "\n내용 : " + content.value));
			head.innerHTML = title.value + author.value;
		}
	</script>
</body>
</html>
