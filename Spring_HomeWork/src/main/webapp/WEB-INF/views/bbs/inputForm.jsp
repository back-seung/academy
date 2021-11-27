<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="inputSave" method=post>
		<p>제목</p>
		<input type=text name="title">
		<p>주소</p>
		<input type=text name="url">
		<p>글쓴이</p>
		<input type=text name="author">
		<p>
			<input type=submit value="저장하기">
		</p>
	</form>
</body>
</html>