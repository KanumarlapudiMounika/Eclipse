<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%	String Fname=request.getParameter("fname");//from userinputfile
	String Lname=request.getParameter("lname");
	String Email=request.getParameter("Email");
%>


<%=

        "My First name is: "+Fname + "<br>" +
		"My Last name is: "+Lname + "<br>" +
		"If you have any doubts you can contact me on <br> "+Email
%>



</body>
</html>