/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Ciudad;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class CiudadData {
    private Connection con=null;
    
    public CiudadData(){
        con=Conexion.getConexion();
    }
    public void guardadCiudad(Ciudad ciudad){
        String sql="INSERT INTO ciudad (nombre, pais, provincia, estado)"
                + "VALUE(? , ?, ?, ?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,ciudad.getNombre());
            ps.setString(2,ciudad.getPais());
            ps.setString(3, ciudad.getProvincia());
            ps.setBoolean(4, ciudad.isActivo());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys(); 
            if(rs.next()){
                ciudad.setIdCiudad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ciudad Guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error al acceder a la tabla Ciudad");
        }
    }
    public void modificarCiudad(Ciudad ciudad){
        String sql="UPDATE ciudad SET nombre = ?, pais = ?, provincia = ?, estado = ? WHERE idCiudad = ?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setString(3, ciudad.getProvincia());
            ps.setBoolean(4, ciudad.isActivo());
            ps.setInt(5, ciudad.getIdCiudad());
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Ciudad modificada");
            }
            ps.close();        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudad");
        }
    }
    public void eliminarCiudad(int id){ //Borrado logico consiste en poner su estado a 0 no borrarlo
        String sql="UPDATE ciudad SET estado = 0 WHERE idCiudad =?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Ciudad Eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudad");
        }
    }    
    public Ciudad buscarCiudadPorId(int id) {
        String sql = "SELECT nombre, pais, provincia FROM ciudad WHERE idCiudad = ? AND estado = 1";
        Ciudad ciudad = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe ciudad con tal id");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudad");
        }
        return ciudad;
    }
    public Ciudad buscarCiudadPorNombre(String ciu) {
        String sql = "SELECT * FROM ciudad WHERE nombre = ? AND estado = 1";
        Ciudad ciudad = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ciu);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudad");
        }
        return ciudad;
    }
    public List<Ciudad> listarCiudades() {
        String sql = "SELECT idCiudad,nombre, pais, provincia, estado FROM ciudad WHERE estado = 1";
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        Ciudad ciudad = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setEstado(rs.getBoolean("estado"));
                ciudades.add(ciudad);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudad");
        }
        return ciudades;
    }
}
