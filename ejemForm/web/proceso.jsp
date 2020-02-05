<%-- 
    Document   : proceso
    Created on : 6/03/2019, 07:23:20 PM
    Author     : 503
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1>DATOS</h1>
        <%
           String nom = request.getParameter("txtnombre");
           String apell = request.getParameter("txtapellido");
           String leng = request.getParameter("lenguaje");
           String pref = request.getParameter("preferencia");         
           
            //if(nom.equals("Ana")){
               out.print("Tu nombre es " + nom +
                    " " +
                    apell + ", tu lenguaje favorito es "
                + leng + " y te gusta el " + pref);
            //}
        %>
        
        </p>
    </body>
</html>
