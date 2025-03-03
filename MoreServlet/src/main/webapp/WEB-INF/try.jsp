<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String name=(String)request.getAttribute("Name_key");
%>
<%
	String pass=(String)request.getAttribute("Pass_key");
%>
<h3>Welcome: <%= name %></h3>
<h3>Your password: <%= pass %></h3>
</body>
</html>