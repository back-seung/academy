<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<link rel="stylesheet" href="css/bootstrap.css" />
<title>유저 수정</title>
<script>
	function checkFlag() {
		if (confirm("삭제하시겠습니까?") == true) {
			location.href = "userDelete?pwd=";
		} else {
			return; // 함수에서 호출부에 값을 넘기는 것 || 함수를 종료하는 의미.
		}
	}
</script>
</head>
<body>
	<form action="UserUpdate" method="post">
		<div class="jumbotron text-center">
			<h2>이름 수정</h2>
			<p>현재 USER 정보</p>
			<p>ID : ${user.id}</p>
			<p>NAME : ${user.name}</p>
			<hr />
			<p>수정</p>
			<p>
				<input type="text" name="name" placeholder="NAME 수정란" />
			</p>
			<input type="hidden" name="pwd" value="${user.pwd}" /> <input
				class="btn btn-primary" type="submit" value="수정하기" />
	</form>
	<a href="UserDelete?pwd=${user.pwd}" class="btn btn-primary">삭제하기</a>
	<a href="#" class="btn btn-primary" onclick="checkFlag('${user.pwd}')">삭제하기</a>
	</div>
</body>
</html>