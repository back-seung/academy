<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수정하기</h1>
	<h2>현재 값</h2>
	<table border="1">
		<tr>
			<td>작가 : ${oneData.author}</td>
		</tr>
		<tr>
			<td>내용 : ${oneData.info}</td>
		</tr>
	</table>
	<h2>수정할 값</h2>
	<form action="doUpdate?index=<%=request.getParameter("index")%>"
		method="POST">
		<table border="1">
			<tr>
				<td><input type="text" name="author" placeholder="작성자 수정 칸" /></td>
			</tr>
			<tr>
				<td><input type="text" name="info" placeholder="내용 수정 칸" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="[수정하기]" /><a
					href="inputList">[취소하기]</a></td>
			</tr>
		</table>
	</form>
</body>
</html>