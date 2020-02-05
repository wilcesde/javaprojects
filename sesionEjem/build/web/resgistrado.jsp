<%-- 
    Document   : resgistrado
    Created on : 13/03/2019, 08:06:18 PM
    Author     : 503
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <%
            String UsuarioIn="", RolIn="", NombreIn="", JefeIn="", ClaveIn="";
            
            //Validar y almacenar los parametros enviados desde el formulario
            if (request.getParameter("txtusuario") != null){
                UsuarioIn=request.getParameter("txtusuario");
            }
            if (request.getParameter("txtrol") != null){
                RolIn=request.getParameter("txtrol");
            }
            if (request.getParameter("txtnombre") != null){
                NombreIn=request.getParameter("txtnombre");
            }
            if (request.getParameter("txtjefe") != null){
                JefeIn=request.getParameter("txtjefe");
            }
            if (request.getParameter("txtclave") != null){
                ClaveIn=request.getParameter("txtclave");
            }
        %>
        <jsp:useBean id="sesionActual" class="beans.sesion" scope="session"/>
        <!-- setProperty llevar hacia el atributo del beans (la class) el value de una variable local -->
        <jsp:setProperty name="sesionActual" property="usuario" value="<%=UsuarioIn%>"/>
        <jsp:setProperty name="sesionActual" property="rol" value="<%=RolIn%>"/>
        <jsp:setProperty name="sesionActual" property="nombre" value="<%=NombreIn%>"/>
        <jsp:setProperty name="sesionActual" property="jefe" value="<%=JefeIn%>"/>
        <jsp:setProperty name="sesionActual" property="clave" value="<%=ClaveIn%>"/>
        <table>
            <!-- getProperty pintar los values de los atributos del beans (de la class) -->
            <tr><td>Usuario:</td><td><jsp:getProperty name="sesionActual" property="usuario"/></td></tr>
            <tr><td>Rol</td><td><jsp:getProperty name="sesionActual" property="rol"/></td></tr>
            <tr><td>Nombre</td><td><jsp:getProperty name="sesionActual" property="nombre"/></td></tr>
            <tr><td>Jefe</td><td><jsp:getProperty name="sesionActual" property="jefe"/></td></tr>
            <tr><td>Clave</td><td><jsp:getProperty name="sesionActual" property="clave"/></td></tr>
        </table>
    </body>
</html>
