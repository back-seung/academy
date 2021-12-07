<%@ page import="java.net.URLEncoder"%>
<%@ page import="java.security.SecureRandom"%>
<%@ page import="java.math.BigInteger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css" />

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css" />

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style>
.naver {
	background-color: limegreen;
	padding: 15px;
	color: white;
}

.kakao {
	background-color: yellow;
	padding: 15px;
	color: black;
}

.loginform {
	margin-top: 3%;
}
</style>
</head>
<body>
	<%
		String clientId = "_gtieZ9aaWY9T8YzziZO";//애플리케이션 클라이언트 아이디값";
		String redirectURI = URLEncoder.encode("http://localhost:8081/exhibition/", "UTF-8");
		SecureRandom random = new SecureRandom();
		String state = new BigInteger(130, random).toString();
		String apiURL = "https://nid.naver.com/oauth2.0/authorize?response_type=code";
		apiURL += "&client_id=" + clientId;
		apiURL += "&redirect_uri=" + redirectURI;
		apiURL += "&state=" + state;
		session.setAttribute("state", state);
	%>
	<h1 class="text-center">전시회 추천</h1>
	<div class="col-md-offset-4 col-md-4 text-center loginform">
		<h4>로그인하기</h4>
		<hr>
		<a href="<%=apiURL%>"><img height="70"
			src="http://static.nid.naver.com/oauth/small_g_in.PNG" /></a> <a
			class="kakao thumbnail" href="#">카카오로 로그인</a>
	</div>
</body>
</html>