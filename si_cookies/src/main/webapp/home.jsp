<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success page</title>
</head>
<body>

<b><h1> Cookie from browser</h1></b>
<br>
<%
   Cookie[] cks=request.getCookies();
   for(Cookie ck:cks)
   {
      String cn=ck.getName();
      String cv=ck.getValue();
      
      %>
      Cookie name : <b><%=cn %> </b><br>
      Cookie Value : <b><%=cv %> </b><br>
      <%
   }
%>

</body>
</html>