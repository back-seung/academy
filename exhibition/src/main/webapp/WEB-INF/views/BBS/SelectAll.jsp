<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
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
    <style>
    </style>
    <title>Document</title>
  </head>
  <body>
    <nav class="navbar navbar-default">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="/html/viewList.html"
            >Exhibition Recommend</a
          >
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="/html/selectAll.html">VIEW LIST</a></li>
            <!-- MOD USER-->
            <li><a href="#">MY PAGE</a></li>
            <li><a href="/html/login.html">LOG OUT</a></li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="input-group col-md-offset-10 col-md-2">
      <input type="text" class="form-control" name="reply" aria-describedby="sizing-addon1">
      <span class="input-group-addon btn btn-default" id="sizing-addon1"><a href="">SEARCH!</a></span>
    </div>
    <hr>
    <table class="table table-striped">
      <tr class="table">
        <th>#NO</th>
        <th>TITLE</th>
        <th>DURING</th>
        <th>AUTHOR</th>
        <th>CITY</th>
        <th>MOD/DEL</th>
      </tr>
      <tr>
        <!-- C:forEach-->
        <td>test</td>
        <td><a href="/html/selectOne.html">test</a></td>
        <td>test</td>
        <td>test</td>
        <td>test</td>
        <td>test</td>
      </tr>
    </table>
    <!-- Context Path로 돌아가기-->
    <div class="text-center">
      <nav>
        <ul class="pagination">
          <li>
            <a href="#" aria-label="Previous">
              <span aria-hidden="true">&laquo;</span>
            </a>
          </li>
          <li><a href="#">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li><a href="#">5</a></li>
          <li>
            <a href="#" aria-label="Next">
              <span aria-hidden="true">&raquo;</span>
            </a>
          </li>
        </ul>
      </nav>
      <a class="btn btn-default" href="/html/viewList.html">처음으로</a>
    </div>
  </body>
</html>
