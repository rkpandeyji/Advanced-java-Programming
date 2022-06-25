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
      Cookie[] cks = request.getCookies();
      if (cks != null) {
         for (int i = 0; i < cks.length; i++) {
            String name = cks[i].getName();
            String value = cks[i].getValue();
            if (name.equals("auth")) {
               break; // exit the loop and continue the page
            }
            if (i == (cks.length - 1)) // if all cookie are not valid redirect to error page
            {
               response.sendRedirect("sessionExpired.html");
               return; // to stop further execution
            }
            i++;
         }
      } else {
         response.sendRedirect("sessionExpired.html");
         return; // to stop further execution
      }
   %>
   <h3>You had successfully logged in.</h3><br>
   your session is set to expire in 1min<br>
   try reloading after 1 min <br>
   <form action="Logout" method="post">
      <input type="submit" value="Logout">
   </form>

</body>
</html>