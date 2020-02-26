/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.vehi;

/**
 *
 * @author wcastro
 */
public class vehiDAO {
    //Metodo Insert
    public static boolean insertarvehi(vehi v){
        try {            
            Connection cone = conexionLib.conectarnosBD();             
            //String SQL = "INSERT INTO tbl_vehi (idvehi,marca,modelo,matricula,anio,id_tv) VALUES(?,?,?,?,?,?)";
            //String SQLUno = "INSERT INTO tbl_vehi VALUES(?,?,?,?,(select now()),?)";   //(select now()) es para llevar la fecha del sistema como value a un campo tipo datetime
            //Cuando se insertan todo los values en una tabla tambien se puede de la siguiente forma
            String SQL = "INSERT INTO vehiculo VALUES(?,?,?,?,?)";
            PreparedStatement ps = cone.prepareStatement(SQL);
                        
            ps.setString(1, v.getPlacavehi());
            ps.setString(2, v.getMarcavehi());
            ps.setString(3, v.getRefvehi());
            ps.setString(4, v.getModelovehi());
            ps.setInt(5, v.getId_tv());            
                        
            if (ps.executeUpdate() > 0){
                return true;
            } else{
                return false;
            }             
            
        } catch (SQLException ex) {
            //System.out.println(ex);
            return false;
        }
        //return false;
    }
    
    //Metodo Consultar
    public static ArrayList<vehi> listarV(){        
        try {
            String sqlListarV = "select * from vehiculo;";            
            Connection conex = conexionLib.conectarnosBD();
            PreparedStatement st = conex.prepareStatement(sqlListarV);
            ResultSet resultado = st.executeQuery();
            //ArrayList<vehi> listav = null;
            ArrayList<vehi> listav = new ArrayList<>();
            vehi Vehi;
            
            while (resultado.next()){
                Vehi = new vehi();
                Vehi.setPlacavehi(resultado.getString("placaVehi"));
                Vehi.setMarcavehi(resultado.getString("marcaVehi"));
                Vehi.setRefvehi(resultado.getString("refVehi"));
                Vehi.setModelovehi(resultado.getString("modeloVehi"));
                Vehi.setId_tv(resultado.getInt("idTipoVehi"));
                listav.add(Vehi);
            }
            return listav;
        } catch (SQLException ex) {
            //System.out.println(ex);
            return null;
        }
    }
    
    //Metodo Update
    public static boolean actualizarvehi(vehi v){
        try {            
            Connection cone = conexionLib.conectarnosBD();
            String SQL = "update vehiculo set " +
                "    marcaVehi=?," +
                "    refVehi=?," +
                "    modeloVehi=?," +
                "    idTipoVehi=?" +
                "    where placaVehi=?";
            PreparedStatement ps = cone.prepareStatement(SQL);
                        
            ps.setString(5, v.getPlacavehi());
            ps.setString(1, v.getMarcavehi());
            ps.setString(2, v.getRefvehi());
            ps.setString(3, v.getModelovehi());
            ps.setInt(4, v.getId_tv());
                                    
            if (ps.executeUpdate() > 0){
                return true;
            } else{
                return false;
            }             
            
        } catch (SQLException ex) {
            //System.out.println(ex);
            return false;
        }
        //return false;
    }
    
    //Metodo Eliminar
    public static boolean eliminarvehi(vehi v){
        try {            
            Connection cone = conexionLib.conectarnosBD();
            String SQL = "delete from vehiculo where placaVehi=?";
            PreparedStatement ps = cone.prepareStatement(SQL);                        
            ps.setString(1, v.getPlacavehi());
                        
            if (ps.executeUpdate() > 0){
                return true;
            } else{
                return false;
            }             
            
        } catch (SQLException ex) {
            //System.out.println(ex);
            return false;
        }
        //return false;
    }
    
    //Metodo EliminarUno
    public static boolean eliminarvehiuno(String placavehi){
        String SQL = "delete from vehiculo where placaVehi="+placavehi;
        try {            
            Connection cone = conexionLib.conectarnosBD();
            //String SQL = "delete from tbl_vehi where idvehi=?";            
            PreparedStatement ps = cone.prepareStatement(SQL);                        
            //ps.setInt(1, v.getIdvehi());
                        
            if (ps.executeUpdate() > 0){
                return true;
            } else{
                return false;
            }             
            
        } catch (SQLException ex) {            
            return false;
        }        
    }
}
