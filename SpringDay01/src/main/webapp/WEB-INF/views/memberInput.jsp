<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <form action="memberListForm" method="GET">
      <h2>회원 가입</h2>
      <table>
        <tr>
          <th>아이디</th>
          <th><input id="id" type="text" name="id" /></th>
        </tr>
        <tr>
          <td>비밀번호</td>
          <td><input id="pw" type="password" name="pw" /></td>
        </tr>
        <tr>
          <td><input type="submit" value="가입 및 전송"/></td> 
        </tr>
      </table>
    </form>
    <script>
    </script>
  </body>
</html>

