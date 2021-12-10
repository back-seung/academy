<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아름다운 캠핑 일기~</title>
</head>
<body>
<hr>
현재 사용자 이름 : ${sessionScope.userName } / ${sessionScope.userid }
<a href="logout">[로그아웃]</a>
<hr>
메뉴 : <a href="inputForm">글쓰기</a>  
<a href="bbsList">전체보기</a><!--  href로 컨트롤러 지정.. -->
<a href="addUserForm">회원가입</a>
<a href="userList">회원보기</a>
<hr>
</body>
</html>