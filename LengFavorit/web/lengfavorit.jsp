<%-- 
    Document   : lengfavorit.jsp
    Created on : 22-abr-2015, 20:08:34
    Author     : pale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- Etiqueta JSP con cuerpo donde su contenido es otra etiqueta JSP -->
<jsp:useBean id="lenguajeFavorito" scope="page" class="beans.LengFavorBean">
   <%-- <jsp:setProperty name="lenguajeFavorito" property="*"/>
    <jsp:setProperty name="lenguajeFavorito" property="*"/> --%>
</jsp:useBean>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado!</h1>
        
        <%
            String NombreIn="";
            String LenguajeIn="";
            String CancionIn="";
            if (request.getParameter("txtnombre") != null){
                NombreIn=request.getParameter("txtnombre");
            }
            if (request.getParameter("txtlenguaje") != null){
                LenguajeIn=request.getParameter("txtlenguaje");
            }
            if (request.getParameter("txtcancion") != null){
                CancionIn=request.getParameter("txtcancion");
            }            
        %>       
        
        <jsp:setProperty name="lenguajeFavorito" property="nombre" value="<%=NombreIn%>"/>        
        <jsp:setProperty name="lenguajeFavorito" property="lenguaje" value="<%=LenguajeIn%>"/>
        <jsp:setProperty name="lenguajeFavorito" property="cancion" value="<%=CancionIn%>"/>
        
        <p>Hola <jsp:getProperty name="lenguajeFavorito" property="nombre"/> </p>
        <p>Su lenguaje favorito es: <jsp:getProperty name="lenguajeFavorito" property="lenguaje"/> </p>
                
        <p>Su cancion favorita es: <jsp:getProperty name="lenguajeFavorito" property="cancion"/> </p>
        
    </body>
</html>
