/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.Ciudad;
import entidades.Paquete;
import entidades.Pasaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class PasajeData {
    private Connection con=null;
    private Pasaje pasaje;
    private CiudadData ciudata;

    public PasajeData() {
        con=Conexion.getConexion();
        this.ciudata=new CiudadData();
    }
    
    public int guardarPasaje(Pasaje pasaje){
        String sql="INSERT INTO pasaje (idCiudad, costo, tipo, estado)VALUES(?,?,?,?)";
        try{
            
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, pasaje.getCiudadOrigen().getIdCiudad());
            ps.setDouble(2, pasaje.getCosto());
            ps.setString(3, pasaje.getTipoTransporte());
            ps.setBoolean(4,pasaje.isActivo());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                pasaje.setIdPasaje(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El pasaje ingresado se creo con exito");
            }else{
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado");
            }
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        return pasaje.getIdPasaje();
    }
    
    public void modificarPasaje(Pasaje pasaje){
         String sql="UPDATE pasaje SET idCiudad=?, costo=?, tipo=?, estado=? "
                + "WHERE idPasaje=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pasaje.getCiudadOrigen().getIdCiudad());
            ps.setDouble(2, pasaje.getCosto());
            ps.setString(3, pasaje.getTipoTransporte());
            ps.setBoolean(4, pasaje.isActivo());
            ps.setInt(5,pasaje.getIdPasaje());
            int exito=ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "El pasaje se modifico correctamente");
            }else{
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Ocurrio un error al acceder a la base de datos");
        }
    }
    
    public void eliminarPasaje(int id){
        String sql="UPDATE pasaje SET estado=0 WHERE idPasaje=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Se dio de baja el pasaje");
            }else{
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Ocurrio un error al acceder a la base de datos");
        }
    }
    
    public Pasaje buscarPasaje(int id){
        String sql ="SELECT* FROM pasaje WHERE idPasaje=?";
        pasaje=null;
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                pasaje=new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setCiudadOrigen(ciudata.buscarCiudadPorId(rs.getInt("idCiudad")));
                pasaje.setCosto(rs.getDouble("costo"));
                pasaje.setTipoTransporte(rs.getString("tipo"));
                pasaje.setActivo(rs.getBoolean("estado"));
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro el pasaje");
            }
            ps.close();
        } catch (SQLException ex) {
            //
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        
        return pasaje;
    }
    
    public List<Pasaje> listarPasajes(int opcion){
        String sql;
        if(opcion==1){
            sql ="SELECT* FROM pasaje";
        }else{
            sql ="SELECT* FROM pasaje WHERE estado=1";
        }
        
        List<Pasaje> pasajes = new ArrayList<>();
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                pasaje=new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setCosto(rs.getDouble("costo"));
                pasaje.setTipoTransporte(rs.getString("tipo"));
                pasaje.setActivo(rs.getBoolean("estado"));
                pasaje.setCiudadOrigen(ciudata.buscarCiudadPorId(rs.getInt("idCiudad")));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        return pasajes;
    }
    
    public List<Pasaje> listarPasajesPorCiudad(Ciudad ciudad,int opcion){
        
        String sql ;
        if(opcion==1){
            sql="SELECT* FROM pasaje WHERE idCiudad =?";
        }else{
            sql="SELECT* FROM pasaje WHERE idCiudad =? AND estado=1";
        }
        List<Pasaje> pasajes = new ArrayList<>();
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, ciudad.getIdCiudad());
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                pasaje=new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setCosto(rs.getDouble("costo"));
                pasaje.setTipoTransporte(rs.getString("tipo"));
                pasaje.setActivo(rs.getBoolean("estado"));
                pasaje.setCiudadOrigen(ciudata.buscarCiudadPorId(rs.getInt("idCiudad")));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            //Error al acceder a la base de datos
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        return pasajes;
    }
    
    public List<Pasaje> listarPasajesPorTransporte(String tipo,int opcion){
        
        String sql ;
        if(opcion==1){
            sql="SELECT* FROM pasaje WHERE tipo =?";
        }else{
            sql="SELECT* FROM pasaje WHERE tipo =? AND estado=1";
        }
        List<Pasaje> pasajes = new ArrayList<>();
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,tipo);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                pasaje=new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setCosto(rs.getDouble("costo"));
                pasaje.setTipoTransporte(rs.getString("tipo"));
                pasaje.setActivo(rs.getBoolean("estado"));
                pasaje.setCiudadOrigen(ciudata.buscarCiudadPorId(rs.getInt("idCiudad")));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            //Error al acceder a la base de datos
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        return pasajes;
    }
    public List<Pasaje> listarPasajesPorCostoMaximo(double costo,int opcion){
        
        String sql ;
        if(opcion==1){
            sql="SELECT* FROM pasaje WHERE costo <=?";
        }else{
            sql="SELECT* FROM pasaje WHERE costo <= ? AND estado=1";
        }
        List<Pasaje> pasajes = new ArrayList<>();
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setDouble(1,costo);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                pasaje=new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setCosto(rs.getDouble("costo"));
                pasaje.setTipoTransporte(rs.getString("tipo"));
                pasaje.setActivo(rs.getBoolean("estado"));
                pasaje.setCiudadOrigen(ciudata.buscarCiudadPorId(rs.getInt("idCiudad")));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            //Error al acceder a la base de datos
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        return pasajes;
    }

}
