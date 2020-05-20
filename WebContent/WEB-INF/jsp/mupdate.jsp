<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員データ更新</title>
</head>
<body>

<h1>会員データ更新</h1>

<form action="mupdate" method="post">
<input type="hidden" name="mid" value="${member.mid}">
氏名:<input type="text" name="name" value="${member.name}"><br>
住所:<input type="text" name="adr" value="${member.adr}"><br>
<input type="submit" value="変更">
</form>

<form action="mdel" method="post">
<input type="hidden" name="mid" value="${member.mid}">
<input type="submit" value="削除">
</form>

</body>
</html>