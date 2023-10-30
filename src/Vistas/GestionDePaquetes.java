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
import java.awt.Component;
import java.awt.event.ItemEvent;
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
        cargarComboCiudadO();
        cargarComboCiudadD();
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
        JCBciudadD = new javax.swing.JComboBox<>();
        JCBalojamiento = new javax.swing.JComboBox<>();
        JCBpasaje = new javax.swing.JComboBox<>();
        JCBciudadO = new javax.swing.JComboBox<>();
        JBguardar = new javax.swing.JButton();
        JBeliminar = new javax.swing.JButton();
        JBsalir = new javax.swing.JButton();
        JLnota = new javax.swing.JLabel();
        JLestado = new javax.swing.JLabel();
        JRBestado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTpaquetes = new javax.swing.JTable();

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

        JTFid.setEditable(false);

        JCBciudadD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBciudadDActionPerformed(evt);
            }
        });

        JCBciudadO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBciudadOActionPerformed(evt);
            }
        });

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

        JLestado.setText("Estado:");

        JTpaquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTpaquetes.setPreferredSize(new java.awt.Dimension(500, 250));
        JTpaquetes.getTableHeader().setResizingAllowed(false);
        JTpaquetes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTpaquetesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTpaquetes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLtitulo)
                .addGap(258, 258, 258))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLciudadD)
                                    .addComponent(JLciudadO, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLid, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLalojamiento, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(JLpasaje))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLestado)
                                .addGap(54, 54, 54)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFid)
                                    .addComponent(JCBciudadD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JCBalojamiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JCBciudadO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JCBpasaje, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JBguardar)
                                    .addComponent(JBeliminar)
                                    .addComponent(JBsalir))
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JRBestado)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(JLnota, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(94, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLtitulo)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBciudadO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLciudadO)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(JBguardar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBciudadD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLciudadD))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBeliminar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLalojamiento)
                    .addComponent(JBsalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBpasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLpasaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBestado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLestado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLnota)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        // TODO add your handling code here:
        try {
            if (JCBciudadD.getSelectedIndex() > 0 && JCBciudadO.getSelectedIndex() > 0
                    && JCBalojamiento.getSelectedIndex() > 0 && JCBpasaje.getSelectedIndex() > 0) {
                if (JCBciudadD.getSelectedIndex() != JCBciudadO.getSelectedIndex()) {
                    if (JBguardar.getText().equals("Guardar")) {

                        Ciudad ciudadO = (Ciudad) JCBciudadO.getSelectedItem();
                        Ciudad ciudadD = (Ciudad) JCBciudadD.getSelectedItem();
                        Pasaje pasaje = (Pasaje) JCBpasaje.getSelectedItem();
                        Alojamiento alojamiento = (Alojamiento) JCBalojamiento.getSelectedItem();
                        Boolean estado = JRBestado.isSelected();
                        paquete = new Paquete(pasaje, alojamiento, ciudadO, ciudadD, estado);
                        if (JOptionPane.showConfirmDialog(null, paquete.toString() + "\nNota: por defecto el paquete se guardara "
                                + "activo, para desactivarlo modifique en la tabla", "¿Desea guardar el paquete?",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                            Menu.paqueteData.guardarPaquete(paquete);
                            limpiarTabla();
                            cargarPaquetes();
                        }

                    } else {
                        paquete = null;
                        int i = JTpaquetes.getSelectedRow();
                        int id = (int) JTpaquetes.getValueAt(i, 0);
                        Ciudad ciudadO = (Ciudad) JCBciudadO.getSelectedItem();
                        Ciudad ciudadD = (Ciudad) JCBciudadD.getSelectedItem();
                        Pasaje pasaje = (Pasaje) JCBpasaje.getSelectedItem();
                        Alojamiento alojamiento = (Alojamiento) JCBalojamiento.getSelectedItem();
                        Boolean estado = JRBestado.isSelected();
                        paquete = new Paquete(id, pasaje, alojamiento, ciudadO, ciudadD, estado);
                        if (JOptionPane.showConfirmDialog(null, "Nuevo paquete:\n" + paquete.toString(),
                                "¿Desea modificar el paquete?",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {

                            Menu.paqueteData.modificarPaquete(paquete);
                            limpiarTabla();
                            cargarPaquetes();

                        }
                        JTpaquetes.clearSelection();
                        JBeliminar.setEnabled(false);
                        JBguardar.setText("Guardar");
                    }
                    JCBciudadD.setSelectedIndex(0);
                    JCBciudadO.setSelectedIndex(0);
                    JCBalojamiento.removeAllItems();
                    JCBpasaje.removeAllItems();
                    JTFid.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Las ciudades de origen y destino no pueden ser iguales");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Para guardar o modificar un paquete debe seleccionar los elementos para el mismo");
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Ocurrio algo inesperado, intente nuevamente");
        }

    }//GEN-LAST:event_JBguardarActionPerformed

    private void JBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JBsalirActionPerformed

    private void JBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarActionPerformed
        // TODO add your handling code here:
        
        if (paquete.isActivo()) {
            if (JOptionPane.showConfirmDialog(null, paquete.toString() + "\nNota: el paquete seguira en la tabla con Activo=false ",
                    "¿Desea dar de baja el paquete?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                Menu.paqueteData.eliminarPaquete(paquete.getIdPaquete());
                limpiarTabla();
                cargarPaquetes();
                JCBalojamiento.setSelectedIndex(0);
                JCBciudadD.setSelectedIndex(0);
                JCBciudadO.setSelectedIndex(0);
                JCBpasaje.setSelectedIndex(0);
                JTFid.setText("");
                JTpaquetes.clearSelection();
                JBeliminar.setEnabled(false);
                JBguardar.setText("Guardar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El paquete ya esta inhabilitado");
        }
    }//GEN-LAST:event_JBeliminarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        JTFid.setText("");
        JTpaquetes.clearSelection();
        JBeliminar.setEnabled(false);
        JBguardar.setText("Guardar");
    }//GEN-LAST:event_formMouseClicked

    private void JCBciudadOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBciudadOActionPerformed
        // TODO add your handling code here:
        if(JCBciudadO.getSelectedIndex()>0){
            cargarComboPasaje();
        }
    }//GEN-LAST:event_JCBciudadOActionPerformed

    private void JCBciudadDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBciudadDActionPerformed
        // TODO add your handling code here:
        if(JCBciudadD.getSelectedIndex()>0){
            cargarComboAlojamiento();
        }
    }//GEN-LAST:event_JCBciudadDActionPerformed

    private void JTpaquetesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTpaquetesMouseClicked
        // TODO add your handling code here:
        try{
            int id=(int)JTpaquetes.getValueAt(JTpaquetes.getSelectedRow(), 0);
        paquete=Menu.paqueteData.buscarPaquete(id);
        JTFid.setText(Integer.toString(id));
        
        JCBciudadO.removeAllItems();
        int posCiudadO=cargarComboCiudadO();
        JCBciudadO.setSelectedIndex(posCiudadO);
        
        JCBciudadD.removeAllItems();
        int posCiudadD=cargarComboCiudadD();
        JCBciudadD.setSelectedIndex(posCiudadD);
        
        int posAlojamiento=cargarComboAlojamiento();
        JCBalojamiento.setSelectedIndex(posAlojamiento);
        
        int posPasaje=cargarComboPasaje();
        JCBpasaje.setSelectedIndex(posPasaje);
        
        Boolean estado=paquete.isActivo();
        JRBestado.setSelected(estado);
        
        JBeliminar.setEnabled(true);
        JBguardar.setText("Modificar");
        }catch(Exception ex){
            
        }
        
        
        
    }//GEN-LAST:event_JTpaquetesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
            for (Paquete aux : Menu.paqueteData.listarPaquetes(1)) {
                aux.toString();
                modelo.addRow(new Object[]{
                    
                    aux.getIdPaquete(),
                    aux.getOrigen(),
                    aux.getDestino(),
                    aux.getAlojamiento(),
                    aux.getPasaje(),
                    aux.isActivo()
                });
                
            }
        } catch (Exception ex) {
            
        }
    }
    private int cargarComboCiudadO() {
        JCBciudadO.addItem(null);

        List<Ciudad> ciudades = Menu.ciudadData.listarCiudades();
        int pos = 0;
        if (JTpaquetes.getSelectedRow() != -1) {
            
            Ciudad ciudad = (Ciudad) JTpaquetes.getValueAt(JTpaquetes.getSelectedRow(), 1);
            for (Ciudad aux : ciudades) {
                JCBciudadO.addItem(aux);

                if (ciudad.getIdCiudad() == aux.getIdCiudad()) {
                    pos = ciudades.indexOf(aux);
                }
            }
        } else {
            
            for (Ciudad aux : ciudades) {

                JCBciudadO.addItem(aux);
            }
        }

        return pos + 1;
    }
    private int cargarComboCiudadD() {
        JCBciudadD.addItem(null);
        List<Ciudad> ciudades = Menu.ciudadData.listarCiudades();
        int pos = 0;
        if (JTpaquetes.getSelectedRow() != -1) {
            
            Ciudad ciudad = (Ciudad) JTpaquetes.getValueAt(JTpaquetes.getSelectedRow(), 2);
            for (Ciudad aux : ciudades) {
                JCBciudadD.addItem(aux);
                if (ciudad.getIdCiudad() == aux.getIdCiudad()) {
                    pos = ciudades.indexOf(aux);
                }
            }
        } else {
            
            for (Ciudad aux : ciudades) {

                JCBciudadD.addItem(aux);
            }
        }
         

        return pos + 1;
    }
    private int cargarComboPasaje() {
        try {
            
            JCBpasaje.removeAllItems();
            JCBpasaje.addItem(null);
            Ciudad ciudadO = (Ciudad) JCBciudadO.getSelectedItem();
            List<Pasaje> pasajes = Menu.pasajeData.listarPasajesPorCiudad(ciudadO,1);
            int pos = 0;
            if (JTpaquetes.getSelectedRow() != -1) {
                Pasaje pasaje = (Pasaje) JTpaquetes.getValueAt(JTpaquetes.getSelectedRow(), 4);
                for (Pasaje aux : pasajes) {
                    JCBpasaje.addItem(aux);
                    if (pasaje.getIdPasaje() == aux.getIdPasaje()) {
                        pos = pasajes.indexOf(aux);
                    }
                }
            } else {
                for (Pasaje aux : pasajes) {
                    JCBpasaje.addItem(aux);
                }
            }
            
            
            return pos+1;
        } catch (Exception ex) {
        }
        return 0;
    }
    private int cargarComboAlojamiento() {
        try {
            JCBalojamiento.removeAllItems();
            JCBalojamiento.addItem(null);
            Ciudad ciudadD = (Ciudad) JCBciudadD.getSelectedItem();
            List<Alojamiento> alojamientos = Menu.alojamientoData.listarAlojamientosPorCiudad(ciudadD);
            int pos = 0;
            if (JTpaquetes.getSelectedRow() != -1) {
                Alojamiento alo = (Alojamiento) JTpaquetes.getValueAt(JTpaquetes.getSelectedRow(), 3);
                for (Alojamiento aux : alojamientos) {
                    JCBalojamiento.addItem(aux);
                    if (alo.getIdAlojamiento() == aux.getIdAlojamiento()) {
                        pos = alojamientos.indexOf(aux);
                    }
                }
            } else {
                for (Alojamiento aux : alojamientos) {
                    JCBalojamiento.addItem(aux);
                }
            }
            
            return pos+1;
        } catch (Exception ex) {
        }
        return 0;
    }
}
