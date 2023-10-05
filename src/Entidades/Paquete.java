/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author crist
 */
public class Paquete {
    
    private int idPaquete;
    private Pasaje pasaje;
    private Alojamiento alojamiento;
    private Ciudad origen;
    private Ciudad destino;
    private boolean activo;

    public Paquete() {
    }

    public Paquete(Pasaje pasaje, Alojamiento alojamiento, Ciudad origen, Ciudad destino, boolean activo) {
        this.pasaje = pasaje;
        this.alojamiento = alojamiento;
        this.origen = origen;
        this.destino = destino;
        this.activo = activo;
    }

    public Paquete(int idPaquete, Pasaje pasaje, Alojamiento alojamiento, Ciudad origen, Ciudad destino, boolean activo) {
        this.idPaquete = idPaquete;
        this.pasaje = pasaje;
        this.alojamiento = alojamiento;
        this.origen = origen;
        this.destino = destino;
        this.activo = activo;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
