<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	<% String Search=request.getParameter("search");//this file gets data from the UserInput page
	response.sendRedirect("https://www.bing.com/search?q="+Search);
	 %>

</body>
</html>