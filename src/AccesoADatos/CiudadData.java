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
