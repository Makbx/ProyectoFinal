/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.Ciudad;
import entidades.Pasaje;
import java.util.List;

/**
 *
 * @author santi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        CiudadData ciudata=new CiudadData();
           
          PasajeData pas=new PasajeData();
          Pasaje pasaje= new Pasaje();
          pasaje=pas.buscarPasaje(2);
          int id=pasaje.getIdPasaje();
          pas.eliminarPasaje(id);
//        List<Pasaje> lista=pas.listarPasajes();
//        for(Pasaje p:lista){
//            System.out.println(""+p.toString());
//        }
//        Ciudad ciudad=ciudata.buscarCiudadPorId(1);
//        System.out.println(""+ciudad.toString());
    }
    
}
