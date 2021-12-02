<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
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