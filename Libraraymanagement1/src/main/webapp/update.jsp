<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<form action="f2">
<h2>UPDATE</h2>
id:<input type="number" name="id"><br>
bname:<input type="text" name="bname"><br>
price:<input type="number" name="price"><br>
<input type="submit">

</form>
</body>
</html>