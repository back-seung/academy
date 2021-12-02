
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>URL을 입력해주세요</h1>
		<form action="inputSave" method="post">
			<p>제목</p>
			<input class="form-control form-control-lg" type="text" name="title" />
			<p>주소</p>
			<input class="form-control form-control-lg" type="text" name="url" />
			<p>글쓴이</p>
			<input class="form-control form-control-lg" type="text" name="author" />
			<br>
			<p>
				<input class="btn btn-primary" type="submit" value="저장하기" />
			</p>
		</form>
	</div>
</body>
</html>
