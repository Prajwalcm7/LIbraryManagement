<%@page import="com.besant.model.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Model m=(Model)request.getAttribute("get"); %>
id:<%=m.getId() %><br>
name:<%=m.getBookname() %><br>
price:<%=m.getPrice() %>

</body>
</html>