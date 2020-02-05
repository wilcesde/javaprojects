<%-- 
    Document   : index
    Created on : 22-abr-2015, 19:52:36
    Author     : pale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Favoritos!</h1>
        <!--<form action="lengfavorit.jsp" method="post"> -->
        <form action="LengFavorBean" method="post">
            <p>
                Tu Nombre: <input type="text" name="txtnombre">
                <br><br>¿Tu lenguaje favorito?
                <select name="txtlenguaje">
                    <option value="Java"> Java
                    <option value="PHP"> PHP
                    <option value="C#"> C#
                </select>
                
                <br><br>¿Tu cancion favorita?  <input type="text" name="txtcancion">
            </p>
            <p> <input type="submit" value="Enviar información">
        </form>
    </body>
</html>
