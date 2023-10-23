/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.Paquete;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PaqueteData {
    
    Connection con=null;
    Paquete paquete;
    PasajeData pasData;
    AlojamientoData aloData;
    CiudadData ciuData;
    
    public PaqueteData(){
        ciuData=new CiudadData();
        pasData=new PasajeData();
        aloData=new AlojamientoData();
        con=Conexion.getConexion();
    }
    
    public int guardarPaquete(Paquete paquete){
        String sql="INSERT INTO Paquete ( idCiudad_origen, idCiudad_destino, idAlojamiento, idPasaje, estado)"
                + "VALUES (?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getPasaje().getIdPasaje());
            ps.setBoolean(5,paquete.isActivo());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                paquete.setIdPaquete(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El paquete de viaje se creo con exito");
            }else{
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Ocurrio un error al acceder a la base de datos");
        }
        return paquete.getIdPaquete();
    }
    
    public void modificarPaquete(Paquete paquete){
        String sql="UPDATE paquete SET idCiudad_origen=?, idCiudad_destino=?, idAlojamiento=?, idPasaje=? "
                + ", estado=? WHERE idPaquete=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getPasaje().getIdPasaje());
            ps.setBoolean(5, paquete.isActivo());
            ps.setInt(6,paquete.getIdPaquete());
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "El paquete de viaje se modifico correctamente");
            }else{
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Ocurrio un error al acceder a la base de datos");
        }
    }
    
    public void eliminarPaquete (int id){
        String sql="UPDATE paquete SET estado=0 WHERE idPaquete=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ps.executeUpdate();
           
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "El paquete se dio de baja");
            }else{
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Ocurrio un error al acceder a la base de datos");
        }
    }
    
    public Paquete buscarPaquete(int id){
        String sql ="SELECT* FROM paquete WHERE idPaquete=?";
          paquete=null;
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                paquete=new Paquete();
                paquete.setIdPaquete(rs.getInt("idPaquete"));
                paquete.setOrigen(ciuData.buscarCiudadPorId(rs.getInt("idCiudad_origen")));
                paquete.setDestino(ciuData.buscarCiudadPorId(rs.getInt("idCiudad_destino")));
                paquete.setAlojamiento(aloData.buscarAlojamientoPorId(rs.getInt("idAlojamiento")));
                paquete.setPasaje(pasData.buscarPasaje(rs.getInt("idPasaje")));
                paquete.setActivo(rs.getBoolean("estado"));
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro el paquete");
            }
            ps.close();
        } catch (SQLException ex) {
            //Error al acceder a la base de datos
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        return paquete;
    }
    
    public List<Paquete> listarPaquetesPorOrigen(int idCiudad){
        
        String sql ="SELECT* FROM paquete WHERE idCiudad_origen=?";
        List<Paquete> paquetes = new ArrayList<>();
        Paquete paquete=null;
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                paquete=new Paquete();
                paquete.setIdPaquete(rs.getInt("idPaquete"));
                paquete.setOrigen(ciuData.buscarCiudadPorId(rs.getInt("idCiudad_origen")));
                paquete.setDestino(ciuData.buscarCiudadPorId(rs.getInt("idCiudad_destino")));
                paquete.setAlojamiento(aloData.buscarAlojamientoPorId(rs.getInt("idAlojamiento")));
                paquete.setPasaje(pasData.buscarPasaje(rs.getInt("idPasaje")));
                paquete.setActivo(rs.getBoolean("estado"));
                paquetes.add(paquete);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        return paquetes;
    }
    
    public List<Paquete> listarPaquetes(){
        String sql ="SELECT* FROM paquete";
        List<Paquete> paquetes = new ArrayList<>();
        Paquete paquete=null;
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                paquete=new Paquete();
                paquete.setIdPaquete(rs.getInt("idPaquete"));
                paquete.setOrigen(ciuData.buscarCiudadPorId(rs.getInt("idCiudad_origen")));
                paquete.setDestino(ciuData.buscarCiudadPorId(rs.getInt("idCiudad_destino")));
                paquete.setAlojamiento(aloData.buscarAlojamientoPorId(rs.getInt("idAlojamiento")));
                paquete.setPasaje(pasData.buscarPasaje(rs.getInt("idPasaje")));
                paquete.setActivo(rs.getBoolean("estado"));
                paquetes.add(paquete);
            }
            ps.close();
        } catch (SQLException ex) {
            //
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        return paquetes;
    }
    
    
}
