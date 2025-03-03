<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String Username=request.getParameter("uname");
	out.println("user name is :"+ Username); 
	
	String Details=config.getInitParameter("Name");
	//int ContactNumber=Integer.parseInt(config.getInitParameter("Number"));
	out.println("Details");
//	out.println("ContactNumber");
	%>
</body>
</html>