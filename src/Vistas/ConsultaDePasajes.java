/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import entidades.Ciudad;
import entidades.Pasaje;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author santi
 */
public class ConsultaDePasajes extends javax.swing.JInternalFrame {

    private DefaultComboBoxModel  modeloCombo=new DefaultComboBoxModel(){
        
     public boolean isCellEditable(int c, int f){
            return false;
        }
    };
    private DefaultTableModel modeloTabla = new DefaultTableModel() {

        public boolean isCellEditable(int c, int f) {
            return false;
        }
    };

    public ConsultaDePasajes() {
        initComponents();
        armarCabecera();
        cargarComboTipo();
        JCBtipoBusqueda.setSelectedIndex(0);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLtitulo = new javax.swing.JLabel();
        JCBtipoBusqueda = new javax.swing.JComboBox<>();
        JLbuscar = new javax.swing.JLabel();
        JCBobjetos = new javax.swing.JComboBox<>();
        JLobjetos = new javax.swing.JLabel();
        JLidCosto = new javax.swing.JLabel();
        JTFidCosto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTpasajes = new javax.swing.JTable();
        JBsalir = new javax.swing.JButton();
        JRBtodos = new javax.swing.JRadioButton();
        JRBactivos = new javax.swing.JRadioButton();

        JLtitulo.setText("Busqueda de Pasajes");

        JCBtipoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBtipoBusquedaActionPerformed(evt);
            }
        });

        JLbuscar.setText("Buscar segun:");

        JCBobjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBobjetosActionPerformed(evt);
            }
        });

        JLidCosto.setText("Costo limite:");

        JTFidCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFidCostoActionPerformed(evt);
            }
        });

        JTpasajes.setModel(new javax.swing.table.DefaultTableModel(
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
        JTpasajes.setPreferredSize(new java.awt.Dimension(500, 250));
        jScrollPane1.setViewportView(JTpasajes);

        JBsalir.setText("Salir");
        JBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalirActionPerformed(evt);
            }
        });

        JRBtodos.setText("Todos");
        JRBtodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBtodosActionPerformed(evt);
            }
        });

        JRBactivos.setText("Activos");
        JRBactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBactivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(JLtitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLidCosto)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JLbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLobjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JCBobjetos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JCBtipoBusqueda, 0, 176, Short.MAX_VALUE)
                            .addComponent(JTFidCosto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBsalir)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JRBtodos)
                        .addGap(152, 152, 152)
                        .addComponent(JRBactivos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLobjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLtitulo)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBtipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLbuscar)
                            .addComponent(JBsalir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCBobjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLidCosto)
                    .addComponent(JTFidCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBtodos)
                    .addComponent(JRBactivos))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCBobjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBobjetosActionPerformed
        // TODO add your handling code here:
        JRBtodos.setEnabled(true);
        JRBactivos.setEnabled(true);
        JRBtodos.setSelected(true);
        JRBactivos.setSelected(false);
        limpiarTabla();
        cargarPasajes();
    }//GEN-LAST:event_JCBobjetosActionPerformed

    private void JTFidCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidCostoActionPerformed
        // TODO add your handling code here:
        try {
            if (JCBtipoBusqueda.getSelectedIndex() == 1) {

                int id = Integer.parseInt(JTFidCosto.getText());
                limpiarTabla();
                cargarPasajes();
            }else{
                Double costo = Double.parseDouble(JTFidCosto.getText());
                limpiarTabla();
                cargarPasajes();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
        
    }//GEN-LAST:event_JTFidCostoActionPerformed

    private void JBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JBsalirActionPerformed

    private void JRBtodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBtodosActionPerformed
        // TODO add your handling code here:
        if(JRBtodos.isSelected()){
            JRBactivos.setSelected(false);
        }else{
            JRBactivos.setSelected(true);
        }
        
        limpiarTabla();
        cargarPasajes();
    }//GEN-LAST:event_JRBtodosActionPerformed

    private void JRBactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBactivosActionPerformed
        // TODO add your handling code here:
        if(JRBactivos.isSelected()){
            JRBtodos.setSelected(false);
        }else{
            JRBtodos.setSelected(true);
        }
        limpiarTabla();
        cargarPasajes();
    }//GEN-LAST:event_JRBactivosActionPerformed

    private void JCBtipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBtipoBusquedaActionPerformed
        // TODO add your handling code here:
        limpiarComboObjetos();
        JRBactivos.setEnabled(true);
        JTFidCosto.setText("");
        switch(JCBtipoBusqueda.getSelectedIndex()){
            case 0:
                JLobjetos.setVisible(false);
                JCBobjetos.setVisible(false);
                JCBobjetos.setEnabled(false);

                JLidCosto.setVisible(false);
                JTFidCosto.setEnabled(false);
                JTFidCosto.setVisible(false);
                limpiarTabla();
                cargarPasajes();
                break;
            case 1:
                JLobjetos.setVisible(false);
                JCBobjetos.setVisible(false);
                JCBobjetos.setEnabled(false);
                JLidCosto.setText("ID:");
                JLidCosto.setVisible(true);
                JTFidCosto.setEnabled(true);
                JTFidCosto.setVisible(true);
                JRBactivos.setEnabled(false);
                break;
            case 2:
                JLidCosto.setVisible(false);
                JTFidCosto.setEnabled(false);
                JTFidCosto.setVisible(false);
                JLobjetos.setText("Ciudades:");
                JLobjetos.setVisible(true);
                List<Ciudad> ciudadesO = Menu.ciudadData.listarCiudades();
                for (Ciudad aux : ciudadesO) {
                    modeloCombo.addElement(aux);
                }
                JCBobjetos.setModel(modeloCombo);
                JCBobjetos.setSelectedIndex(0);
                JCBobjetos.setVisible(true);
                JCBobjetos.setEnabled(true);
                limpiarTabla();
                cargarPasajes();
                break;
            case 3:
                JLidCosto.setVisible(false);
                JTFidCosto.setEnabled(false);
                JTFidCosto.setVisible(false);
                JLobjetos.setText("Transportes:");
                JLobjetos.setVisible(true);
                modeloCombo.addElement("avion");
                modeloCombo.addElement("colectivo");
                modeloCombo.addElement("taxi");
                JCBobjetos.setModel(modeloCombo);
                
                JCBobjetos.setSelectedIndex(0);
                JCBobjetos.setVisible(true);
                JCBobjetos.setEnabled(true);
                limpiarTabla();
                cargarPasajes();
                break;
            case 4:
                JLobjetos.setVisible(false);
                JCBobjetos.setVisible(false);
                JCBobjetos.setEnabled(false);
                JLidCosto.setText("Costo:");
                JLidCosto.setVisible(true);
                JTFidCosto.setEnabled(true);
                JTFidCosto.setVisible(true);
                break;
        }
        JRBtodos.setSelected(true);
        JRBactivos.setSelected(false);
    }//GEN-LAST:event_JCBtipoBusquedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBsalir;
    private javax.swing.JComboBox<String> JCBobjetos;
    private javax.swing.JComboBox<String> JCBtipoBusqueda;
    private javax.swing.JLabel JLbuscar;
    private javax.swing.JLabel JLidCosto;
    private javax.swing.JLabel JLobjetos;
    private javax.swing.JLabel JLtitulo;
    private javax.swing.JRadioButton JRBactivos;
    private javax.swing.JRadioButton JRBtodos;
    private javax.swing.JTextField JTFidCosto;
    private javax.swing.JTable JTpasajes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void cargarComboTipo(){
        JCBtipoBusqueda.addItem("Todos");
        JCBtipoBusqueda.addItem("ID");
        JCBtipoBusqueda.addItem("Ciudad de Origen");
        JCBtipoBusqueda.addItem("Tipo de Transporte");
        JCBtipoBusqueda.addItem("Costo maximo");
    }
    
    private void limpiarComboObjetos(){
        int f = JCBobjetos.getItemCount() - 1;
        for (; f >= 0; f--) {
            modeloCombo.removeElementAt(f);
        }
    }
    
    private void armarCabecera() {
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Ciudad");
        modeloTabla.addColumn("Transporte");
        modeloTabla.addColumn("Costo");
        modeloTabla.addColumn("Activo");
        JTpasajes.setModel(modeloTabla);
    }

    private void limpiarTabla() {
        int f = JTpasajes.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }

    private void cargarPasajes() {
        List<Pasaje> pasajes = new ArrayList();
        int opcion;
        try {
            switch (JCBtipoBusqueda.getSelectedIndex()) {
                case 0:
                    if (JRBtodos.isSelected()) {
                        opcion = 1;
                    } else {
                        opcion = 0;
                    }
                    pasajes = Menu.pasajeData.listarPasajes(opcion);
                    break;
                case 1:
                    try {
                        int id = Integer.parseInt(JTFidCosto.getText());
                        pasajes.add(Menu.pasajeData.buscarPasaje(id));
                    } catch (NumberFormatException ex) {
                        //JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros");
                    }
                    break;
                case 2:
                    Ciudad origen = (Ciudad) JCBobjetos.getSelectedItem();
                    if (JRBtodos.isSelected()) {
                        opcion = 1;
                    } else {
                        opcion = 0;
                    }
                    pasajes = Menu.pasajeData.listarPasajesPorCiudad(origen, opcion);
                    break;
                case 3:
                    String tipo = (String) JCBobjetos.getSelectedItem();
                    if (JRBtodos.isSelected()) {
                        opcion = 1;
                    } else {
                        opcion = 0;
                    }
                    pasajes = Menu.pasajeData.listarPasajesPorTransporte(tipo, opcion);
                    break;
                case 4:
                    try {
                        double costo = Double.parseDouble(JTFidCosto.getText());
                        if (JRBtodos.isSelected()) {
                            opcion = 1;
                        } else {
                            opcion = 0;
                        }
                        pasajes = Menu.pasajeData.listarPasajesPorCostoMaximo(costo, opcion);
                    } catch (NumberFormatException ex) {
                        // JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros");
                    }
                    break;
            }
        } catch (Exception ex) {

        }
        try {
            
            for (Pasaje aux : pasajes) {
                modeloTabla.addRow(new Object[]{
                    aux.getIdPasaje(),
                    aux.getCiudadOrigen(),
                    aux.getTipoTransporte(),
                    aux.getCosto(),
                    aux.isActivo()
                });
            }

        } catch (Exception ex) {
            
        }
    }
}
