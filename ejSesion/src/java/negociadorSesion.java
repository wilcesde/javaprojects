/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wcastro
 */
public class negociadorSesion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet negociadorSesion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet negociadorSesion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");  */
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        //Recibirlos los parametros
        String usuario = request.getParameter("txtusuario");
        String clave = request.getParameter("txtclave");
        
        //Crear un objeto de tipo beans (login) para pasarle los parametros
        login Login = new login();
        Login.setUsuario(usuario);
        Login.setClave(clave);
        
        //Llamar el metodo de autenticado de la clave.
        boolean autenticacion = Login.autenticacion();
        
        //Validar la autenticacion.
        //Despachador de respuesta
        RequestDispatcher despachador = null;
        if(autenticacion){
            despachador = request.getRequestDispatcher("bienvenida.jsp");
        }else{
            despachador = request.getRequestDispatcher("errorInicio.jsp");
        }
        
        request.setAttribute("usuario", usuario);        
        
        //Devolver el objeto mediante el metodo forward
        despachador.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
