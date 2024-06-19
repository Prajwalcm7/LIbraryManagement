<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<form action="f1">
<h2>CREATE</h2>
id:<input type="number" name="id"><br>
bookname:<input type="text" name="bookname"><br>
price:<input type="number" name="price"><br>
<input type="submit">
</form>
</body>
</html>