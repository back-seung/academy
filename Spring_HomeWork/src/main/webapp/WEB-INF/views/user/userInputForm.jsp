<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
		<input type="submit" value="회원가입하기">
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