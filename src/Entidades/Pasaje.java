/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author crist
 */
public class Pasaje {

    private int idPasaje;
    private Ciudad ciudadOrigen;
    private String tipoTransporte;
    private double costo;
    private boolean activo;

    public Pasaje() {
    }

    public Pasaje(Ciudad ciudadOrigen, String tipoTransporte, double costo, boolean activo) {
        this.ciudadOrigen = ciudadOrigen;
        this.tipoTransporte = tipoTransporte;
        this.costo = costo;
        this.activo = activo;
    }

    public Pasaje(int idPasaje, Ciudad ciudadOrigen, String tipoTransporte, double costo, boolean activo) {
        this.idPasaje = idPasaje;
        this.ciudadOrigen = ciudadOrigen;
        this.tipoTransporte = tipoTransporte;
        this.costo = costo;
        this.activo = activo;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
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

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Pasaje: \n" + "ID: " + idPasaje + ", Origen: " + ciudadOrigen + ", Transporte: " + tipoTransporte + ", Costo: " + costo + ", Activo: " + activo + '}';
    }
}
