/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author crist
 */
public class Alojamiento {
    
    private int idAlojamiento;
    private String nombre;
    private Ciudad ciudad;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String tipo;
    private double costo;
    private boolean activo;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, Ciudad ciudad, LocalDate fechaInicio, LocalDate fechaFin, String tipo, double costo, boolean activo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipo = tipo;
        this.costo = costo;
        this.activo = activo;
    }

    public Alojamiento(int idAlojamiento,String nombre, Ciudad ciudad, LocalDate fechaInicio, LocalDate fechaFin, String tipo, double costo, boolean activo) {
        this.idAlojamiento = idAlojamiento;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipo = tipo;
        this.costo = costo;
        this.activo = activo;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setEstado(boolean activo) {
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return idAlojamiento + "," + ciudad + "," + fechaInicio + "," + fechaFin + "," + tipo + "," + costo + "," + activo;
    }
}