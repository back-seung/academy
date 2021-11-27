<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
</head>
<body align="center">
	<h1>자세히 보기</h1>
	<table border="1" align="center">
		<tr>
			<td>글번호</td>
			<td>${oneData.no}</td>
		</tr>
		<tr>
			<td>작가</td>
			<td>${oneData.author}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${oneData.info}</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${oneData.cnt}</td>
		</tr>
		<tr>
			<td colspan="2"><a href="viewList">[리스트로 돌아가기]</a></td>
		</tr>
	</table>
	<a href="${pageContext.request.contextPath}/">처음으로</a>
</body>
</html>
