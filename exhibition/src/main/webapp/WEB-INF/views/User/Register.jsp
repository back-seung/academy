<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <!-- 합쳐지고 최소화된 최신 CSS -->
      <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css"
    />

    <!-- 부가적인 테마 -->
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css"
    />

    <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
  <title>Document</title>
</head>
<body>
  <div class="thumbnail text-center">
    <div class="jumbotron">
    <h2>Register</h2>
  </div>
    <form action="" method="post">
      <p>ID : </p><input type="text" name="id" id="">
      <p>NAME : </p><input type="text" name="name" id="">
      <p>PW : </p><input type="text" name="pw" id="">
      <p>PW Check: </p><input type="text" id="">
      <p class="notEqaual" style="color:red"></p>
      <input class="btn btn-default" type="submit" value="회원가입">
    </form>
  </div>
</body>
</html>