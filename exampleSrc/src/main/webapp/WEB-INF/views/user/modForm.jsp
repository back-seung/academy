<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="userMod" method=post>
		<p>아이디 : ${moddata.id } </p>
		<p>암호</p><input type=text name="pwd" value="${moddata.pwd}" >
		<p>이름</p><input type=text name="name" value="${moddata.name }">
		<input type="hidden" name="id" value="${moddata.id }">
		<input type=reset value="모두지우기">  <!--  form 영역의  input를 초기화. -->
		<input type=submit value="저장하기">  <!--  submit은 from action이동 -->
		<!--   사용자가 입력한 내용을 서버를 통해 데이터 베이스에 저장하려는 것. -->
	</form>
</body>
</html>




