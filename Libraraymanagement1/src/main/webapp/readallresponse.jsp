<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr>
<th>id</th>
<th>bookname</th>
<th>price</th>
</tr>
<c:forEach var="h" items="${red}">
<tr>
<td>${h.id }</td>
<td>${h.bookname }</td>
<td>${h.price }</td>
</tr>
</c:forEach>

</body>
</html>