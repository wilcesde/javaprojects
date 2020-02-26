<%-- 
    Document   : index
    Created on : 30/03/2019, 07:50:40 PM
    Author     : wcastro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SoWil</title>
    </head>
    <body>
        <header>
            <h1>Hello World! Welcome!!</h1>
            <!--Cuando habra el index de inmediato redireccione al listar vehiculos--> 
            <jsp:forward page="listarVehi.jsp"></jsp:forward>
            <!--<nav>
                <ul>
                    <li><a href="adminTipoVehi?action=nuevotv">NuevoTv</a></li>
                    <li><a href="adminTipoVehi?action=mostrartv">MostrarTv</a></li>
                </ul>
            </nav>-->
        </header>
    </body>
</html>
