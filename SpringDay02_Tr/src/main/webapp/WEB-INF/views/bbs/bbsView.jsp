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
	
	}
	#commandDiv {
		width:800px;
		
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
	<tr>
		<td colspan=2><a href="bbsList">[리스트로 돌아가기]</a>
	</tr>
</table>
</div>

<div id="commandDiv">
<form class="form-horizontal" action="commentInput" method="post">
  <div class="form-group">
	<c:forEach items="${commentList}" var="vo" varStatus="status">
	 	<span class="glyphicon glyphicon-sunglasses" aria-hidden="true"></span>
		 <p> ${vo.name} :: ${vo.memo } :: ${vo.wdate }</p>
	</c:forEach>	
  </div>
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">작성자</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" id="inputEmail3" placeholder="작성자를 입력하세요" name="name">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">내용</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" id="inputPassword3" placeholder="내용을 입력하세요." name="memo">
    </div>
  </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-8">
      <input type="hidden" name="bbs_no" value="${oneData.no }">
      <button type="submit" class="btn btn-default">저장</button>
    </div>
  </div>
</form>

</div>
</body>
</html>