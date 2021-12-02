<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	var a = 10; 
</script>
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

</head>
<body>
<h2> my Table ~ </h2>
<!--	입력한 이름은 ${getName } <hr>   
	입력한 메모는 ${getMemo }   단일 변수를 전달 받은 것 -->
	<!--  bbslist  자료형이 list를 전달 받을 것.. -->
	

	<table >
		<tr>
			<th>글번호</th>
			<th>이름</th>
			<th>메모</th>		
			<th>수정/삭제</th>		
		</tr>
		<!--  여기부터는 리스트에 글을 하나씩 반복하여 출력해야한다. -->
		<!--  jstl문법으로 많이사용합니다. -->		
		<c:forEach items="${bbslist}" var="vo" varStatus="status">
		<tr>
			<td>${status.count - 1}</td>
			<td>${vo.name }			
			</td>
			<td><a href=bbsView?bbsindex=${vo.no}>${vo.memo }</td>
			<td><a href=bbsMod?bbsindex=${vo.no}>수정</a>/
			<a href=bbsDelete?bbsindex=${vo.no}>삭제</a></td>			
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