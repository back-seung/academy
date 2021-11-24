<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>책 전체보기</h1>
	<table border=1>
		<tr>
			<td>No.</td>
			<td>작가</td>
			<td>제목</td>
			<td>장르</td>
			<td>내용</td>
			<td>출판사</td>
			<td>수정 및 삭제</td>
		</tr>
		<c:forEach items="${bookList}" var="vo">
			<c:set var="i" value="${i+1}" />
			<tr name="session">
				<td>${i-1}</td>
				<td>${vo.author}</td>
				<td><a href="listDetail?index=${i-1}">${vo.title}</a></td>
				<td>${vo.genre}</td>
				<td>${vo.info}</td>
				<td>${vo.company}</td>
				<td><a href="listUpdate?index=${i-1}">수정</a> / <a
					href="listDelete?index=${i-1}">삭제</a></td>
			</tr>
		</c:forEach>
		<!--  여기까지 -->
	</table>
	<a href="${pageContext.request.contextPath}/">처음으로</a>
	<script>
		
	</script>
</body>
</html>