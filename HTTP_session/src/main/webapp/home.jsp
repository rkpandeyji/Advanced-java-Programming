<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> HttpSession value</h1>
<br>
<%
String name=(String)session.getAttribute("name");

%>

HttpSession value is <%=name %>
</body>
</html>