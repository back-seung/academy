<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
</head>
<body align="center">
	<h1>글쓰기</h1>
	<form action="inputSave" method="post">
		<table align="center" border="1">
			<tr>
				<th>글쓴이</th>
				<th><input type="text" name="author" id="" placeholder="저자 입력칸" /></th>
			</tr>
			<tr>
				<th>제목</th>
				<th><input type="text" name="title" id="" placeholder="제목 입력칸" /></th>
			</tr>

			<tr>
				<th>장르</th>
				<th><input type="text" name="genre" id="" placeholder="장르 입력칸" /></th>
			</tr>
			<tr>
				<th>소개</th>
				<th><input type="text" name="info" id="" placeholder="소개 입력칸" /></th>
			</tr>
			<tr>
				<th>출판사</th>
				<th><input type="text" name="company" id=""
					placeholder="장르 입력칸" /></th>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="저장하기" /> <input
					type="reset" value="값초기화" /></th>
			</tr>
		</table>
	</form>
</body>
</html>
