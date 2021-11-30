<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/css/bootstrap.css" />" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<form action="CMTInsert" method="POST">
		<div class="jumbotron text-center">
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
				<table class="table table-hover">
					<thead>
						<tr>
							<th colspan="4">댓글작성하기</th>
						</tr>
					</thead>
					<tbody>

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