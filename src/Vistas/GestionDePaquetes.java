/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import entidades.Alojamiento;
import entidades.Ciudad;
import entidades.Pasaje;
import javax.swing.table.DefaultTableModel;
import entidades.Paquete;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class GestionDePaquetes extends javax.swing.JInternalFrame {
    private Paquete paquete;

    private DefaultTableModel modelo=new DefaultTableModel(){
        
     public boolean isCellEditable(int c, int f){
            return false;
        }
    };
    
    public GestionDePaquetes() {
        initComponents();
        armarCabecera();
        JBeliminar.setEnabled(false);
        
        cargarPaquetes();
        cargarComboAlojamiento();
        cargarComboCiudadO();
        cargarComboCiudadD();
        cargarComboPasaje();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLtitulo = new javax.swing.JLabel();
        JLid = new javax.swing.JLabel();
        JLciudadO = new javax.swing.JLabel();
        JLciudadD = new javax.swing.JLabel();
        JLalojamiento = new javax.swing.JLabel();
        JLpasaje = new javax.swing.JLabel();
        JTFid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTpaquetes = new javax.swing.JTable();
        JCBciudadD = new javax.swing.JComboBox<>();
        JCBalojamiento = new javax.swing.JComboBox<>();
        JCBpasaje = new javax.swing.JComboBox<>();
        JCBciudadO = new javax.swing.JComboBox<>();
        JBguardar = new javax.swing.JButton();
        JBeliminar = new javax.swing.JButton();
        JBsalir = new javax.swing.JButton();
        JLnota = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        JLestado = new javax.swing.JLabel();
        JRBestado = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(700, 600));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        JLtitulo.setText("Control de Paquetes");

        JLid.setText("ID de paquete:");

        JLciudadO.setText("Ciudad de origen:");

        JLciudadD.setText("Ciudad de destino:");

        JLalojamiento.setText("Alojamiento:");

        JLpasaje.setText("Pasaje:");

        JTpaquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JTpaquetes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        JTpaquetes.setColumnSelectionAllowed(true);
        JTpaquetes.setPreferredSize(new java.awt.Dimension(550, 100));
        JTpaquetes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JTpaquetesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTpaquetes);
        JTpaquetes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        JBguardar.setText("Guardar");
        JBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarActionPerformed(evt);
            }
        });

        JBeliminar.setText("Eliminar");
        JBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeliminarActionPerformed(evt);
            }
        });

        JBsalir.setText("Salir");
        JBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalirActionPerformed(evt);
            }
        });

        JLnota.setText("Nota: Para modificar o eliminar un paquete debes buscarlo por id o seleccionarlo de la tabla");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        JLestado.setText("Estado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLtitulo)
                .addGap(258, 258, 258))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLnota, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JLciudadD)
                                        .addComponent(JLciudadO, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JLid, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JLalojamiento, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(JLpasaje)
                                    .addComponent(JLestado))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTFid)
                                            .addComponent(JCBciudadD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JCBalojamiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JCBciudadO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JCBpasaje, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(126, 126, 126))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JRBestado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JBguardar)
                                    .addComponent(Buscar)
                                    .addComponent(JBeliminar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(JBsalir))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 51, Short.MAX_VALUE)))
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLtitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Buscar)
                        .addGap(11, 11, 11)
                        .addComponent(JBguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBeliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBsalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLestado)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBciudadO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLciudadO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBciudadD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLciudadD))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLalojamiento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBpasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLpasaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JRBestado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLnota)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        // TODO add your handling code here:
        try {
            if (JBguardar.getText().equals("Guardar")) {
                if (JCBciudadD.getSelectedIndex() > 1 && JCBciudadO.getSelectedIndex() > 1
                        && JCBalojamiento.getSelectedIndex() > 1 && JCBpasaje.getSelectedIndex() > 1) {
                    Ciudad ciudadO = (Ciudad) JCBciudadO.getSelectedItem();
                    Ciudad ciudadD = (Ciudad) JCBciudadD.getSelectedItem();
                    Pasaje pasaje = (Pasaje) JCBpasaje.getSelectedItem();
                    Alojamiento alojamiento = (Alojamiento) JCBalojamiento.getSelectedItem();
                    paquete = new Paquete(pasaje, alojamiento, ciudadD, ciudadO, isIcon);
                    if (JOptionPane.showConfirmDialog(null, paquete.toString() + "\nNota: por defecto el paquete se guardara "
                            + "activo, para desactivarlo modifique en la tabla", "¿Desea guardar el paquete?",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                        Menu.paqueteData.guardarPaquete(paquete);
                        modelo.addRow(new Object[]{
                            paquete.getIdPaquete(),
                            paquete.getOrigen().getNombre(),
                            paquete.getDestino().getNombre(),
                            paquete.getAlojamiento().getTipo(),
                            paquete.getPasaje().getTipoTransporte(),
                            paquete.isActivo()
                        });
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Para cargar un paquete debe seleccionar los elementos para el mismo");
                }
            } else {
                int i=JTpaquetes.getSelectedRow();
                int id = (int) JTpaquetes.getValueAt(i, 0);
                    Ciudad ciudadO = (Ciudad) JCBciudadO.getSelectedItem();
                    Ciudad ciudadD = (Ciudad) JCBciudadD.getSelectedItem();
                    Pasaje pasaje = (Pasaje) JCBpasaje.getSelectedItem();
                    Alojamiento alojamiento = (Alojamiento) JCBalojamiento.getSelectedItem();
                    Boolean estado=JRBestado.isSelected();
                    paquete = new Paquete(id,pasaje, alojamiento, ciudadD, ciudadO, estado);
                if (JOptionPane.showConfirmDialog(null, "Nuevo paquete:\n"+paquete.toString(),
                         "¿Desea modificar el paquete?",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                    
                    Menu.paqueteData.modificarPaquete(paquete);
                    modelo.setValueAt(ciudadO,i,1);
                    modelo.setValueAt(ciudadD,i,2);
                    modelo.setValueAt(alojamiento,i,3);
                    modelo.setValueAt(pasaje,i,4);
                    modelo.setValueAt(estado,i,5);
                    
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Ocurrio algo inesperado, intente nuevamente");
        }

    }//GEN-LAST:event_JBguardarActionPerformed

    private void JBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JBsalirActionPerformed

    private void JBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarActionPerformed
        // TODO add your handling code here:
        
        int id=(int)JTpaquetes.getValueAt(JTpaquetes.getSelectedRow(), 0);
        if (JOptionPane.showConfirmDialog(null, paquete.toString() + "\nNota: el paquete seguira en la tabla con Activo=false "
                , "¿Desea dar de baja el paquete?", 
                        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == 0) {
            Menu.paqueteData.eliminarPaquete(id);
            limpiarTabla();
            cargarPaquetes();
        }
    }//GEN-LAST:event_JBeliminarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        JTpaquetes.clearSelection();
        JBeliminar.setEnabled(false);
        JBguardar.setText("Guardar");
    }//GEN-LAST:event_formMouseClicked

    private void JTpaquetesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTpaquetesMouseReleased
        // TODO add your handling code here:
        JBeliminar.setEnabled(true);
        JBguardar.setText("Modificar");
        
    }//GEN-LAST:event_JTpaquetesMouseReleased

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your hanling code here:
        try {
            List<Paquete> paquetes = Menu.paqueteData.listarPaquetes();
            int bandera = 0;
            for (Paquete paq : paquetes) {
                if (Integer.parseInt(JTFid.getText()) == paq.getIdPaquete()) {
                    bandera = 1;
                    JTpaquetes.setRowSelectionInterval(paquetes.indexOf(paq), paquetes.indexOf(paq));
                    break;
                }
            }
            if (bandera == 0) {
                JOptionPane.showMessageDialog(null, "El id no corresponde a ningun paquete existente");
            } else {
                JBeliminar.setEnabled(true);
                JBguardar.setText("Modificar");
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No se encontraron paquetes en la base de datos", "error", JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "solo debe ingresar numeros enteros", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton JBeliminar;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBsalir;
    private javax.swing.JComboBox<Alojamiento> JCBalojamiento;
    private javax.swing.JComboBox<Ciudad> JCBciudadD;
    private javax.swing.JComboBox<Ciudad> JCBciudadO;
    private javax.swing.JComboBox<Pasaje> JCBpasaje;
    private javax.swing.JLabel JLalojamiento;
    private javax.swing.JLabel JLciudadD;
    private javax.swing.JLabel JLciudadO;
    private javax.swing.JLabel JLestado;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLnota;
    private javax.swing.JLabel JLpasaje;
    private javax.swing.JLabel JLtitulo;
    private javax.swing.JRadioButton JRBestado;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTable JTpaquetes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        modelo.addColumn("Id");
        modelo.addColumn("Origen");
        modelo.addColumn("Destino");
        modelo.addColumn("Alojamiento");
        modelo.addColumn("Pasaje");
        modelo.addColumn("Activo");
        
        JTpaquetes.setModel(modelo);
    }
    private void limpiarTabla() {
        int f = JTpaquetes.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    private void cargarPaquetes() {
        try {
            for (Paquete aux : Menu.paqueteData.listarPaquetes()) {
                modelo.addRow(new Object[]{
                    aux.getIdPaquete(),
                    aux.getOrigen().getNombre(),
                    aux.getDestino().getNombre(),
                    aux.getAlojamiento().getTipo(),
                    aux.getPasaje().getTipoTransporte(),
                    aux.isActivo()
                });
            }
        } catch (NullPointerException ex) {
            modelo.addRow(new Object[]{
                "",
                "",
                "no hay paquetes"
            });
        }
    }
    private void cargarComboCiudadO() {
        JCBciudadO.addItem(null);
        Ciudad ciudadD=(Ciudad)JCBciudadD.getSelectedItem();

        for (Ciudad ciudad : Menu.ciudadData.listarCiudades()) {
            //if(ciudadD.getIdCiudad()!=ciudad.getIdCiudad()){
                JCBciudadO.addItem(ciudad);
            //}
        }
    }
    private void cargarComboCiudadD() {

        JCBciudadD.addItem(null);
        Ciudad ciudadO=(Ciudad)JCBciudadO.getSelectedItem();
        for (Ciudad ciudad : Menu.ciudadData.listarCiudades()) {
            //if(ciudadO.getIdCiudad()!=ciudad.getIdCiudad()){
                JCBciudadD.addItem(ciudad);
            //}
        }
    }
    private void cargarComboPasaje() {
        JCBpasaje.addItem(null);
        for (Pasaje pasaje : Menu.pasajeData.listarPasajes()) {

            JCBpasaje.addItem(pasaje);

        }
    }
    private void cargarComboAlojamiento() {
        JCBalojamiento.addItem(null);
//    for(Alojamiento alo: Menu.alojamientoData.listarAlojamientos()){
//        JCBalojamiento.addItem(alo);
//    }
    }
}
