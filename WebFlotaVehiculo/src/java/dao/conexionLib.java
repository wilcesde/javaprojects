/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wcastro
 */
public class conexionLib {
    public static Connection conectarnosBD(){
        try {
            //Por medio del driver conectarse al server y bd que se le indique
            //Class.forName("com.mysql.jdbc.Driver");
            ///Class.forName("com.mysql.cj.jdbc.Driver");
            ///return DriverManager.getConnection("jdbc:mysql://localhost:3306/flotavehiculo", "root", "");
            ///return DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            ///return DriverManager.getConnection("jdbc:mysql://localhost:3306/flotavehiculo?zeroDateTimeBehavior=convertToNull", "root", "");
            //return DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario", "root", "");
            
            //Datos connection
            String dbDriver = "com.mysql.jdbc.Driver";
            String dbURL = "jdbc:mysql://localhost:3306/";
            
            //Datos db
            String dbName = "concesionario";
            String dbUser = "root";
            String dbPassword = "";
            
            Class.forName(dbDriver);
            Connection conex = DriverManager.getConnection(dbURL + dbName, dbUser, dbPassword);
            return conex;
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }    
    }
    
    /*Connection con = null;
    public conexionLib(){
        try {
            //Por medio del driver conectarse al server y bd que se le indique
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario", "root", "");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flotavehiculo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario?zeroDateTimeBehavior=convertToNull", "root", "");
            boolean ok = con.isValid(5000);
            System.out.println(ok ? "Conexión bien" : "Conexión Fallo");
            //if (con != null){
                //System.out.println("Conexion Ok");
            //}
        } catch (SQLException ex) {
            System.out.println("Mensaje " + ex.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println("Mensaje " + e.getMessage());
        }  
    }
    
    public Connection getConnection(){
        return con;
    } */
}