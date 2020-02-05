<%-- 
    Document   : bienvenida
    Created on : 22/08/2019, 08:01:39 AM
    Author     : wcastro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome!</h1>
        <%
          out.print(request.getAttribute("usuario"));  
        %>
    </body>
</html>
