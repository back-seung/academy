<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수정하기</h1>
	<h2>수정할 값</h2>
	<form action="modInput" method="POST">
		<table border="1">
			<tr>
				<td><input type="text" name="author" value="${oneData.author}" /></td>
			</tr>
			<tr>
				<td><input type="text" name="info" value="${oneData.info}" />
				</td>

			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="[수정하기]" /><a
					href="viewList">[취소하기]</a></td>
			</tr>
		</table>
		<input type="hidden" name="no" value="${oneData.no}" />
	</form>
</body>
</html>