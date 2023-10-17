/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author crist
 */
public class Ciudad {
   
    private int idCiudad;
    private String nombre;
    private String provincia;
    private String pais;
    private boolean activo;

    public Ciudad() {
    }

    public Ciudad(String nombre, String provincia, String pais, boolean activo) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.pais = pais;
        this.activo = activo;
    }

    public Ciudad(int idCiudad, String nombre, String provincia, String pais, boolean activo) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.provincia = provincia;
        this.pais = pais;
        this.activo = activo;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setEstado(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return nombre + ", Provincia: " + provincia + ", Pais: " + pais;
    }
}
