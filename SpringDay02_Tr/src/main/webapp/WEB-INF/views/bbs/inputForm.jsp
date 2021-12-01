<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>











<body>
	<form action="inputSave" method=post>
		<p>작성자</p><input type=text name="name">
		<p>내용</p><input type=text name="memo">
		<input type=reset value="모두지우기">  <!--  form 영역의  input를 초기화. -->
		<input type=submit value="저장하기">  <!--  submit은 from action이동 -->
		<!--   사용자가 입력한 내용을 서버를 통해 데이터 베이스에 저장하려는 것. -->
	</form>
</body>
</html>




