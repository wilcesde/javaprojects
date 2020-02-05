<%-- 
    Document   : index
    Created on : 13/03/2019, 07:50:32 PM
    Author     : 503
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sesión</title>
    </head>
    <body>
        <form action="resgistrado.jsp" method="post">
            <table>
                <tr><td>Usuario</td><td><input type="text" name="txtusuario"></td></tr>
                <tr><td>Rol</td><td><input type="text" name="txtrol"></td></tr>
                <tr><td>Nombre</td><td><input type="text" name="txtnombre"></td></tr>
                <tr><td>Jefe</td><td><input type="text" name="txtjefe"></td></tr>
                <tr><td>Clave</td><td><input type="password" name="txtclave"></td></tr>
            </table>
            <input type="submit" value="Ingresar">
        </form>
    </body>
</html>
