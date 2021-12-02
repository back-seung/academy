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
    <title>유튜브추천 : 수정</title>
  </head>
  <body>
    <form action="update" method="post">
      <div class="jumbotron text-center">
        <h2>URL이 뜨지 않나요? 수정부탁드립니다 !</h2>
        <p>현재 URL</p>
        <p>${siteData.url}</p>
        <hr />
        <p>수정할 내용</p>
        <input type="text" name="title" placeholder="제목 수정란" />
        <p>
          <input type="text" name="url" placeholder="url 수정란" />
        </p>
        <input  type="hidden" name="no" value="${siteData.no}" />
        <input class="btn btn-primary" type="reset" value="모두지우기" />
        <input class="btn btn-primary"type="submit" value="저장하기" />
      </form>
    </div>
  </body>
</html>
