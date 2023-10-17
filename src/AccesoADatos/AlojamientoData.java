/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;
import Entidades.Alojamiento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class AlojamientoData {
    private Connection con=null;
    private CiudadData ciuData;
    
    public AlojamientoData(){
        con=Conexion.getConexion();
        this.ciuData = new CiudadData();
    }
        public void guardadAlojamiento(Alojamiento alo){
        String sql="INSERT INTO alojamiento (nombre, idCiudad, fechaInicio, fechaFin, tipo, costoDiario, estado)"
                + "VALUE(? , ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,alo.getNombre());
            ps.setInt(2,alo.getCiudad().getIdCiudad());
            ps.setDate(3,Date.valueOf(alo.getFechaInicio()));
            ps.setDate(4,Date.valueOf(alo.getFechaFin()));
            ps.setString(5,alo.getTipo());
            ps.setDouble(6,alo.getCosto());
            ps.setBoolean(7, alo.isActivo());
            ps.executeUpdate();

            ResultSet rs=ps.getGeneratedKeys(); 
            if(rs.next()){
                alo.setIdAlojamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alojamiento Guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error al acceder a la tabla Alojamiento");
        }
    }
        public void modificarAlojamiento(Alojamiento alo){
        String sql="UPDATE alojamiento SET nombre = ?, idCiudad = ?, fechaInicio = ?, fechaFin = ?, tipo = ?, costoDiario = ?, estado = ? WHERE idAlojamiento= ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,alo.getNombre());
            ps.setInt(2,alo.getCiudad().getIdCiudad());
            ps.setDate(3,Date.valueOf(alo.getFechaInicio()));
            ps.setDate(4,Date.valueOf(alo.getFechaFin()));
            ps.setString(5,alo.getTipo());
            ps.setDouble(6,alo.getCosto());
            ps.setBoolean(7, alo.isActivo());
            ps.setInt(8, alo.getIdAlojamiento());
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Alojamiento modificado");
            }
            ps.close();       
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error al acceder a la tabla Alojamiento");
        }
    }
    public Alojamiento buscarAlojamientoPorId(int id) {
        String sql = "SELECT * FROM alojamiento WHERE idAlojamiento = ?";
        Alojamiento alojamiento = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(id);
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setCiudad(ciuData.buscarCiudadPorId(rs.getInt("idCiudad")));
                alojamiento.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                alojamiento.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                alojamiento.setTipo(rs.getString("tipo"));
                alojamiento.setCosto(rs.getDouble("costoDiario"));
                alojamiento.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe ciudad con tal id");
            }
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento");
        }
        return alojamiento;
    }
    public void eliminarAlojamiento(int id){ //Borrado logico consiste en poner su estado a 0 no borrarlo
        String sql="UPDATE alojamiento SET estado = 0 WHERE idAlojamiento =?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Alojamiento Eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento");
        }
    }
    public List<Alojamiento> listarAlojamientos(){
        String sql = "SELECT * FROM alojamiento";
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        Alojamiento alojamiento = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setCiudad(ciuData.buscarCiudadPorId(rs.getInt("idCiudad")));
                alojamiento.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                alojamiento.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                alojamiento.setTipo(rs.getString("tipo"));
                alojamiento.setCosto(rs.getDouble("costoDiario"));
                alojamiento.setEstado(rs.getBoolean("estado"));
                alojamientos.add(alojamiento);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento");
        }
        return alojamientos;
    }  
}
