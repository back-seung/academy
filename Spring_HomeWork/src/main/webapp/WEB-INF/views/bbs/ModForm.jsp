<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="update" method=post>
		<h2>URL이 뜨지 않나요? 수정부탁드립니다 !</h2>
		<p>현재 URL</p>
		<p>${siteData.url}</p>
		<hr>
		<p>수정할 내용</p>
		<input type=text name="title" placeholder="제목 수정란">
		<p>
			<input type=text name="url" placeholder="url 수정란">
		</p>
		<input type=hidden name="no" value=${siteData.no}> <input
			type=reset value="모두지우기"> <input type=submit value="저장하기">
	</form>
</body>
</html>