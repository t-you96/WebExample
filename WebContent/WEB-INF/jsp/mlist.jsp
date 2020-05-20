<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員一覧</title>
<style>

table {
	border-collapse: collapse;
}

td, th {
	border: 1px solid gray;
	padding: 5px 25px;
}
</style>
</head>
<body>

<h1>会員一覧</h1>

<form action="mlist" method="post">
氏名:<input type="text" name="name"><br>
住所:<input type="text" name="adr"><br>
<input type="submit" value="追加">
</form>

<table>
<tr><th>氏名</th><th>住所</th></tr>
<c:forEach var="member" items="${list}">
	<tr>
		<td><a href="mupdate?mid=${member.mid}">${member.name}</a></td>
		<td>${member.adr}</td>
	</tr>
</c:forEach>

</table>

</body>
</html>