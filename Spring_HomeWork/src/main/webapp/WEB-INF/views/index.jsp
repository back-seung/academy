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
<title>유튜브 추천</title>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>볼만한 유튜브 추천</h1>
		<hr />
		<p class="fs-3">유튜브의 링크 기능을 이용하여 나중에 볼 리스트를 정리합니다.</p>
		<p>
			<a class="btn btn-primary" href="siteList">전체보기</a> <a
				class="btn btn-primary" href="userInputForm">회원가입</a>
		</p>
		<p class="fs-4">How To Use ❓</p>
		<hr />
		<ul class="list-group fs-5">
			<li>1️⃣. 공유 버튼 클릭<br /> <img
				src="<c:url value="/img/share.png" />" /></li>
			<li>2️⃣. 퍼가기 버튼 클릭</li>
			<li>3️⃣. 복사 버튼 클릭<br /> <img
				src="<c:url value="/img/given.png" />" /></li>
			<li>4️⃣. url에 입력 !</li>
		</ul>
	</div>
</body>
</html>
