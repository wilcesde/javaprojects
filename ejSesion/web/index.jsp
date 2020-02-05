<%-- 
    Document   : index
    Created on : 22/08/2019, 06:52:21 AM
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
        <h1>LOGIN</h1>
        <form action="login" method="post">
            Usuario:<input type="text" name="txtusuario">
            Password:<input type="password" name="txtclave">
            <br><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
