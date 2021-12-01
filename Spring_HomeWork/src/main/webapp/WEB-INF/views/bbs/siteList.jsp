<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/css/bootstrap.css" />" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<h2>게시판 목록</h2>
	<table class="table table-bordered table-hover text-center">
		<thead>
			<tr>
				<th>NO.</th>
				<th>제목</th>
				<th>작성자</th>
				<th>수정 및 삭제</th>
				<th>현재 조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${siteList}" var="site" varStatus="status">
				<tr>
					<td>${status.count}</td>
					<td><a href=selectOne?index=${site.no}&selectAll>${site.title}</a></td>
					<td>${site.author}</td>
					<td><a href=updateView?index=${site.no}>수정</a>/<a
						href=delete?index=${site.no}>삭제</a></td>
					<td>${site.cnt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="text-center">
		<a class="btn btn-primary" href="inputForm">작성하기</a> <a
			class="btn btn-primary" href="${pageContext.request.contextPath}/">처음으로</a>
	</div>
</body>
</html>