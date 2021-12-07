<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="UTF-8" />
<title>Exhibition</title>
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
body {
	background-color: rgb(236, 236, 236);
}

.header {
	margin-bottom: 0px;
}

.font-lg {
	font-size: large;
}
</style>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Exhibition Recommend</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">VIEW LIST</a></li>
					<li><a href="#">ADD LIST</a></li>
					<li><a href="#">현재 사용자 : ${name}님</a></li>
					<li><a href="#">LOG OUT</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	<div class="col-md-12 item">
		<div class="thumbnail font-lg">
			<div class="jumbotron text-center header">
				<h1>Exhibition Recommend</h1>
			</div>
			<div class="col-md-12 item">
				<div class="page-header font-lg">
					<div class="caption">
						<ul class="list-group">
							<span class="badge">NOTICE</span>
							<li class="list-group-item">Exhibition은 사람들이 많이 찾는 인싸가 될 수
								있는 전시회를 엄중하게 선별하여 소개 시켜드리겠습니다.</li>
							<li class="list-group-item">Exhibition은
								사람들이 잘 모르고 있던 숨겨진 보물같은 전시회를 찾아 소개 시켜드리겠습니다.</li>
							<li class="list-group-item">Exhibition은
								사람들에게 유용한 전시회만을 찾아 소개 시켜드리겠습니다.</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="col-sm-2 col-md-2 item">
		<span class="badge">FAMOUS EXHIBITION #1</span>
		<div class="thumbnail">
			<img class="img" src="<c:url value="/img/sayuroom.png"/>" />
			<h2>
				SEOUL
				<hr />
				<small><a href="#">국립중앙박물관, 사유의 방</a></small>
			</h2>
			<div class="caption">사유의 방은 삼국시대 6세기 후반과 7세기 전반에 제작된 우리나라의 국보
				반가사유상半跏思惟像 두 점을 나란히 전시한 공간이다. 어둡고 고요한 복도를 지나면 왼쪽 무릎 위에 오른쪽 다리를 얹고
				오른쪽 손가락을 살짝 뺨에 댄 채 깊은 생각에 잠긴 반가사유상을 만나볼 수 있다. 뛰어난 주조기술을 바탕으로 간결하면서도
				생동감 넘치고, 화려하면서도 절제된 근엄한 반가사유상의 모습은 인간의 생로병사에 대한 깊은 고뇌와 깨달음을 상징한다.</div>
			<hr />
			<div class="caption">2021-11 ~ 2022-01</div>
		</div>
	</div>

	<div class="col-sm-2 col-md-2 item">
		<span class="badge">FAMOUS EXHIBITION #2</span>
		<div class="thumbnail">
			<img class="img" src="<c:url value="/img/lightBunker.png"/>" />
			<h2>
				JEJU
				<hr />
				<small><a href="#">프랑스 몰입형 미디어아트, 빛의 벙커</a></small>
			</h2>
			<div class="caption">옛 국가기간 통신시설 벙커를 재생하여 거장들의 작품을 빛과 음악을 통해서
				감상하는 빛의 벙커. 혁신적인 전시 기법인 몰입형 미디어아트를 도입한 빛의 벙커는 감각의 앞단에서 시각을 넘어 예술에
				몰입하는 경험을 제공함으로써 다양한 예술작품을 쉽게 이해하고 색다른 방법으로 감상할 수 있다. 이를 통해서 장소성을
				되살리는 도시재생의 효과와 더 많은 사람들이 문화 예술을 체험하는 문화민주화의 역할을 수행할 수 있다.</div>
			<hr />
			<div class="caption">2020-09-12 ~ 2022-02-02</div>
		</div>
	</div>

	<div class="col-sm-2 col-md-2 item">
		<span class="badge">FAMOUS EXHIBITION #3</span>
		<div class="thumbnail">
			<img class="img" src="<c:url value="/img/supernature.png"/>" />
			<h2>
				BUSAN
				<hr />
				<small><a href="#">뮤지엄 다, 슈퍼 네이처</a></small>
			</h2>
			<div class="caption">
				<수퍼 네이처>는 올 해 환경의 날 주제인 ‘생물 다양성(Biodiversity)’에 초점을 맞추어,
				환경단체(부산환경공단, WWF, 대자연)들과 함께 환경 운동에 대한 문제 제기를 하고, 관람객들로 하여금 환경 문제에 대한
				자각을 꾀하기 위해 마련되었다.참여작가 : 꼴라쥬플러스(SHO JANG&MIN KIM), 고지인, 김남표, 김민수,
				김영원, 김정민, 김지희, 두민, 류지윤, 신이철, 안효찬, 이상훈, 이세현, 이송준, 이원주, 이태수, 이호준, 임채욱,
				정해윤, 황유식, Alessandro Mendini, Karim Rashid
			</div>
			<hr />
			<div class="caption">2020-09-12 ~ 2022-02-02</div>
		</div>
	</div>
</body>
</html>
