<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</head>
<body>
<table>
	<tr><td>name</td>
		<td>${oneData.name }</td>
	</tr>
	<tr><td>memo</td>
		<td>${oneData.memo }</td>
	</tr>
	<tr><td>조회수</td>
		<td>${oneData.cnt }</td>
	</tr>
	<tr>
		<td colspan=2><a href="bbsList">[리스트로 돌아가기]</a>
	</tr>
</table>
</body>
</html>