<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--   입력한 이름은 ${getName } <hr>   
   입력한 메모는 ${getMemo }   단일 변수를 전달 받은 것 -->
	<!--  bbslist  자료형이 list를 전달 받을 것.. -->
	<table border=1>
		<tr>
			<td>이름</td>
			<td>메모</td>
		</tr>
		<!--  여기부터는 리스트에 글을 하나씩 반복하여 출력해야한다. -->
		<!--  jstl문법으로 많이사용합니다. -->
		<c:forEach items="${bbsList}" var="vo">
			<tr>
				<td>${vo.author }</td>
				<td>${vo.content}</td>
			</tr>
		</c:forEach>
		<!--  여기까지 -->
	</table>

	<a href="${pageContext.request.contextPath}/">처음으로</a>
</body>
</html>