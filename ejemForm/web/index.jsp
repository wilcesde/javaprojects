<%-- 
    Document   : index
    Created on : 6/03/2019, 07:16:59 PM
    Author     : 503
        Luego sesionEjem, ejSesion, LengFavorit, 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EJEMPLO FORMULARIO</h1>
        <form action="proceso.jsp" method="post">
            Nombre:
            <br>
            <input type="text" name="txtnombre">            
            <br><br>
            Apellido:
            <br>
            <input type="text" name="txtapellido">
            <br><br>
            Edad:
            <br>
            <input type="text" name="txtedad">
            <br><br>
            Lenguajes Preferidos:
            <br>
            <select name="lenguaje">
                <option value="java">Java
                <option value="ruby">Ruby
                <option value="csharp" selected>C#
                <option value="angular">Angular
            </select>
            <br><br>
            Que te gusta mas: (Front o Back)
            <br>
            <input type="radio" name="preferencia" value="front">Front
            <input type="radio" name="preferencia" value="back">Back
            <br><br>
            <p> <input type="submit" value="Enviar"> </p>
        </form>
    </body>
</html>
