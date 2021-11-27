<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>나중에 볼 리스트</h2>
	<table border="1">
		<tr>
			<th>NO.</th>
			<th>제목</th>
			<th>작성자</th>
			<th>수정 및 삭제</th>
			<th>현재 조회수</th>
		</tr>
		<c:forEach items="${siteList}" var="site" varStatus="status">
			<tr>
				<th>${ status.count}</th>
				<th><a href=selectOne?index=${site.no}>${site.title}</a></th>
				<th>${site.author}</th>
				<th><a href=updateView?index=${site.no}>수정</a>/<a
					href=delete?index=${site.no}>삭제</a></th>
				<th>${site.cnt}</th>
			</tr>
		</c:forEach>
		<!--  여기까지 -->
	</table>
	<table id="downtbl">
		<tr>
			<td><a href="${pageContext.request.contextPath}/">[처음으로]</a></td>
		</tr>
	</table>


</body>
</html>