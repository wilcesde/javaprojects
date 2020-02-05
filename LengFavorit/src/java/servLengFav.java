/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.LengFavorBean;
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
public class servLengFav extends HttpServlet {

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
            out.println("<title>Servlet servLengFav</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servLengFav at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
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
        
        //Pedir los parametros
        String nombre = request.getParameter("txtnombre");
        String lenguaje = request.getParameter("txtlenguaje");
        String cancion = request.getParameter("txtcancion");
        
        //Crear un objeto de tipo beans para pasarle los parametros nombre y clave
        LengFavorBean lFavorito = new LengFavorBean();
        lFavorito.setNombre(nombre);
        lFavorito.setLenguaje(lenguaje);
        lFavorito.setCancion(cancion);
        
        //Llamar al metodo de autenticado de la clave, el cual devuelve un booleano
        String comentarioL = lFavorito.getcomentariosLenguaje();
        
        //Validar la autenticacion. Si si, ir a la vista bienvenido, si no a errorguey
        //Crear un Despachador de respuestas (generador de respuestas)
        /*RequestDispatcher despachador = null;
        if (autenticado){
            despachador = request.getRequestDispatcher("bienvenido.jsp");
        } else{
            despachador = request.getRequestDispatcher("errorguey.jsp");
        }*/
        RequestDispatcher despachador = null;
        despachador = request.getRequestDispatcher("lengfavorit.jsp");
        
        //Devolver el objeto. Enviar la llamada con forward
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
