<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

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
	#tableDiv {
		width:800px;
		border : 1px solid red;
	
	}
	#commentlayer {
		border : 1px solid blue;
		width:600px;
		margin: auto;
	}
	
</style>
</head>
<body>
<div id="tableDiv">
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
		<c:forEach var="fname" items="${oneData.files }">
		<tr>
			<td>
				<a href="${pageContext.request.contextPath }/download?filename=${fname}">${fname}[다운로드]</a>
				<img src="${pageContext.request.contextPath }/download?filename=${fname}">
			</td>
		</tr>
		</c:forEach>		
		<tr>
		<td colspan=2><a href="bbsList">[리스트로 돌아가기]</a>
		</tr>

	</table>

	<div id="commentlayer">
		<div>
  			<c:forEach items="${commentList}" var="vo" varStatus="status">
		 	<p> ${vo.name} :: ${vo.memo } (${vo.wdate.substring(0,10) })
		 	<span class="label label-default">Del</span>
		 	<span class="label label-primary">Mod</span>
			</c:forEach>	
		</div>
		
		<form class="form-inline" action="commentInput" method="post">
  		<div class="form-group">
    		<label for="exampleInputName2">Name</label>
    		<input type="text" placeholder="Name" name="name" size=3>
  		</div>
 		<div class="form-group">
    		<label for="exampleInputEmail2">memo</label>
    		<input type="text" placeholder="memo" name="memo" size=50>
  		</div>
  		<input type="hidden" name="bbs_no" value="${oneData.no }">
  		<button type="submit" class="btn btn-default">저장</button>
		</form>
	</div>

</div>
</body>
</html>