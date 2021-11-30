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
				<th>ID 클릭시 수정</th>
				<th>NAME</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userList}" var="user" varStatus="status">
				<tr>
					<td>${status.count}</td>
					<td><a href=userModForm?id=${user.id}>${user.id}</a></td>
					<td>${user.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="text-center">
		<a class="btn btn-primary" href="${pageContext.request.contextPath}/">처음으로</a>
	</div>
</body>
</html>