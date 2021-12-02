<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h2>게시판 목록</h2>
	<div class="text-center">
		<table class="table table-bordered table-hover">
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
						<td><a href=selectOne?index=${site.no}>${site.title}</a></td>
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
		<nav>
			<ul class="pagination">
				<li><c:if test="${pageVO.prev}">
						<a
							href="siteList?page=${pageVO.startPage-1}&searchType=${pageVO.searchType}&searchKeyword=${pageVO.searchKeyword}"
							aria-label="Previous" class="prevpage  pbtn">이전</a>
					</c:if></li>
				<li class=""><c:forEach begin="${pageVO.startPage}"
						end="${pageVO.endPage}" var="idx">
						<a href="siteList?page=${idx}">${idx}</a>
					</c:forEach></li>
				<li><c:if test="${pageVO.next}">
						<a
							href="siteList?page=${pageVO.endPage+1}&searchType=${pageVO.searchType}&searchKeyword=${pageVO.searchKeyword}"
							class="nextpage  pbtn">다음</a>
					</c:if></li>
					
			</ul>
		</nav>
	</div>
</body>
</html>