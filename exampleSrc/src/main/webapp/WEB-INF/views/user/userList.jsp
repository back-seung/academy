<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>    /* 선택자  : 선택자에서 설정한 옵션들... display : 화면구성옵션.     */
	a{     
		color:purple;
		text-decoration: none;
	}
	a:hover{
		color:blue;
	}
	tr, td{
		height:25px;
		border : 1px solid #444444;
	}
	th{
		background-color: #bbdefb;
	}
	table{
		font-size: 12px;
		width:600px;
		margin: auto;
		text-align:center;
		border : 1px solid red;
		border-collapse: collapse;
	}
	h2{
		display:inline;
		-webkit-text-stroke: 2px blue;
		
	}
	/* 문서에서 id로 지정된 태그를 선택하여 적용하여라 */
	#downtbl{
		width:600px;
		height:10px;
		margin: auto;
		text-align:center;
		border : 1px solid red;
		border-collapse: collapse;
	}
	/* 문서에서 클래스로 지정된 태그는 */
	.className {
	
	}	
</style>
<script type="text/javascript">
	function checkFlag(delno){
		if(confirm("정말 삭제할래요?"+delno)==true){
			// 컨트롤러에게 이동
			location.href= "userDel?uid="+delno;
		}else{
			return;  // 함수에서 호출부에 값을 넘기는 건데.. 함수를 종료하는 의미로도 사용됩니다.
		}
	}
</script>
</head>
<body>
<h2> my Table ~ </h2>
<!--	입력한 이름은 ${getName } <hr>   
	입력한 메모는 ${getMemo }   단일 변수를 전달 받은 것 -->
	<!--  bbslist  자료형이 list를 전달 받을 것.. -->

	<table >
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>비밀번호</th>		
			<th>이름</th>
			<th>가입날짜</th>		
			<th>수정/삭제</th>
		</tr>
		<!--  여기부터는 리스트에 글을 하나씩 반복하여 출력해야한다. -->
		<!--  jstl문법으로 많이사용합니다. -->		
		<c:forEach items="${userList}" var="vo" varStatus="status">
		<tr>
			<td id="userid">${status.count - 1}</td>
			<td>${vo.id }</td>
			<td>${vo.pwd}</td>
			<td>${vo.name}</td>
			<td>${vo.day}</td>	
			<td>
			
			<a href="userMod?uid=${vo.id }">수정</a>/
	<!--  		<a href="userDel?uid=${vo.id }">삭제</a> -->
			<a href="#" onclick="checkFlag('${vo.id}');">삭제</a>
			
			</td>		
		</tr>
		</c:forEach>		
	  	<!--  여기까지 -->
	</table>
	<table id="downtbl">
		<tr>
			<td><a href="${pageContext.request.contextPath}/" >[처음으로]</a>
			</td>
		</tr>
	</table>
	
</body>

</html>