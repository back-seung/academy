<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
</head>
<body>
	<table>
		<tr>
			<td>제목</td>
			<td>${siteData.title}</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${siteData.author}</td>
		</tr>
		<tr>
			<td>동영상</td>
			<td>${siteData.url}</td>
		</tr>
		<tr>
			<td colspan=2><a href="siteList">[리스트로 돌아가기]</a>
		</tr>
	</table>
</body>
</html>