<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<form action="UserInput" method="post">
		<p>
			ID : <input id="userId" type="text" name="id" />
		</p>
		<p>
			PWD : <input id="userPw" type="text" name="pwd" />
		</p>
		<p>
			NAME : <input type="text" name="name" />
		</p>
		<input type="submit" value="회원가입하기" onclick="submitCheck()">
	</form>
	<script>
		let id = document.getElementById("userId");
		let pw = document.getElementById("userPw");
		const pattern = /(?=.*\d)(?=.*[!@#$%^&*+=-])(?=.*[a-zA-ZS]).{8,}/;
		function submitCheck() {
			if (pattern !== id && pattern !== pw) {
				alert("ID 또는 PW는 숫자, 특수문자 1개 포함 및 8글자 이상을 충족해야함.");
			} else {
				return;
			}
		}
	</script>
</body>
</html>