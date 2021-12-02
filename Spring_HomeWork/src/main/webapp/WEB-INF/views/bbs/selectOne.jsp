<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<form action="CMTInsert" method="POST">
		<div class="jumbotron text-center">
			<input type="hidden" name="sno" value="${siteData.no}" /> <input
				type="hidden" name="author" value="${siteData.author}" />
			<table class="table table-dark">
				<tr>
					<td class="fs-5">제목</td>
				</tr>
				<tr>
					<td>${siteData.title}</td>
				</tr>
				<tr>
					<td colspan="2">${siteData.url}</td>
				</tr>
				<tr>
					<td class="fs-5">작성자</td>
				</tr>
				<tr>
					<td>${siteData.author}</td>
				</tr>
			</table>
			<div>
				<table class="table table-dark">
					<thead>
						<tr>
							<td>No.</td>
							<td>댓글 내용</td>
							<td>글쓴이</td>
						</tr>
					</thead>
					<tbody>
						<c:if test="${replyList != null}">
							<c:forEach items="${replyList}" var="reply" varStatus="status">
								<tr>
									<td>${status.count}</td>
									<td>${reply.cmt}</td>
									<td>${reply.author}</td>
								</tr>
							</c:forEach>
						</c:if>
					</tbody>
				</table>
			</div>

			<p>
				<a class="btn btn-primary" href="siteList">리스트로 돌아가기</a>
			</p>
		</div>
		<p>
			<input type="text" class="form-control" name="cmt"
				placeholder="댓글을 입력해주세요...">
		</p>
		<input class="btn btn-primary" type="submit" value="댓글등록" />
	</form>
	
</body>
</html>