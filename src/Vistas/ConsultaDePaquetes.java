/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import entidades.Alojamiento;
import entidades.Ciudad;
import entidades.Paquete;
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
public class ConsultaDePaquetes extends javax.swing.JInternalFrame {
    
    private DefaultComboBoxModel  modeloCombo=new DefaultComboBoxModel(){
        
     public boolean isCellEditable(int c, int f){
            return false;
        }
    };

    private DefaultTableModel modeloTabla=new DefaultTableModel(){
        
     public boolean isCellEditable(int c, int f){
            return false;
        }
    };
    
    public ConsultaDePaquetes() {
        initComponents();
        armarCabecera();
        
        cargarComboTipoBusqueda();
//        JCBobjetos.setEnabled(false);
//        JCBobjetos.setVisible(false);
//        JLobjetos.setVisible(false);
//        JLid.setVisible(false);
//        JTFid.setEnabled(false);
//        JTFid.setVisible(false);
//        JRBactivos.setEnabled(false);
//        JRBtodos.setEnabled(false);
        JCBtipoBusqueda.setSelectedIndex(0);
        JLcosto.setEnabled(false);
        JTFcosto.setEnabled(false);
        JScantPersonas.setEnabled(false);
        JBcalcular.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLtitulo = new javax.swing.JLabel();
        JLbuscar = new javax.swing.JLabel();
        JCBtipoBusqueda = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTpaquetes = new javax.swing.JTable();
        JCBobjetos = new javax.swing.JComboBox();
        JLobjetos = new javax.swing.JLabel();
        JRBtodos = new javax.swing.JRadioButton();
        JRBactivos = new javax.swing.JRadioButton();
        JTFid = new javax.swing.JTextField();
        JLid = new javax.swing.JLabel();
        JBsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JLcosto = new javax.swing.JLabel();
        JTFcosto = new javax.swing.JTextField();
        JScantPersonas = new javax.swing.JSpinner();
        JBcalcular = new javax.swing.JButton();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        JLtitulo.setText("Busqueda de Paquetes");

        JLbuscar.setText("Buscar segun:");

        JCBtipoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBtipoBusquedaActionPerformed(evt);
            }
        });

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

        JCBobjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBobjetosActionPerformed(evt);
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

        JTFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFidActionPerformed(evt);
            }
        });

        JLid.setText("ID:");

        JBsalir.setText("Salir");
        JBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Nota: para conocer el costo del paquete seleccione de la tabla");

        JLcosto.setText("Costo:");

        JTFcosto.setEditable(false);

        JScantPersonas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 8, 1));

        JBcalcular.setText("Calcular");
        JBcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(JLtitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLbuscar)
                            .addComponent(JLid)
                            .addComponent(JLobjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JRBtodos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JRBactivos))
                            .addComponent(JCBtipoBusqueda, javax.swing.GroupLayout.Alignment.TRAILING, 0, 328, Short.MAX_VALUE)
                            .addComponent(JCBobjetos, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addComponent(JBsalir)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(JLcosto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBcalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLtitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(JBsalir))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLbuscar)
                            .addComponent(JCBtipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLobjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JCBobjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JRBtodos)
                            .addComponent(JRBactivos))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLcosto)
                                .addComponent(JTFcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JScantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JBcalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCBtipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBtipoBusquedaActionPerformed
        // TODO add your handling code here:
        limpiarComboObjetos();
        JRBactivos.setEnabled(true);
        JTFid.setText("");
        switch (JCBtipoBusqueda.getSelectedIndex()) {
            case 0:
                JLobjetos.setVisible(false);
                JCBobjetos.setVisible(false);
                JCBobjetos.setEnabled(false);

                JLid.setVisible(false);
                JTFid.setEnabled(false);
                JTFid.setVisible(false);
//                JRBtodos.setEnabled(true);
//                JRBactivos.setEnabled(true);
//                JRBtodos.setSelected(true);
//                JRBactivos.setSelected(false);
                limpiarTabla();
                cargarPaquetes();
                break;
            case 1:
                JLobjetos.setVisible(false);
                JCBobjetos.setVisible(false);
                JCBobjetos.setEnabled(false);
                JLid.setVisible(true);
                JTFid.setEnabled(true);
                JTFid.setVisible(true);
                JRBactivos.setEnabled(false);
                break;
            case 2:
                JLid.setVisible(false);
                JTFid.setEnabled(false);
                JTFid.setVisible(false);
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
                cargarPaquetes();
                break;
            case 3:
                JLid.setVisible(false);
                JTFid.setEnabled(false);
                JTFid.setVisible(false);
                JLobjetos.setText("Ciudades:");
                JLobjetos.setVisible(true);
                List<Ciudad> ciudadesD = Menu.ciudadData.listarCiudades();
                for (Ciudad aux : ciudadesD) {
                    modeloCombo.addElement(aux);
                }
                JCBobjetos.setModel(modeloCombo);
                
                JCBobjetos.setSelectedIndex(0);
                JCBobjetos.setVisible(true);
                JCBobjetos.setEnabled(true);
                limpiarTabla();
                cargarPaquetes();
                break;
//            case 4:
//                
//                JLid.setVisible(false);
//                JTFid.setEnabled(false);
//                JTFid.setVisible(false);
//                JLobjetos.setText("Alojamientos:");
//                JLobjetos.setVisible(true);
//                List<Alojamiento> alojamientos = Menu.alojamientoData.listarAlojamientos();
//                for (Alojamiento aux : alojamientos) {
//                    modeloCombo.addElement(aux);
//                }
//                JCBobjetos.setModel(modeloCombo);
//                JCBobjetos.setSelectedIndex(0);
//                JCBobjetos.setVisible(true);
//                JCBobjetos.setEnabled(true);
//                limpiarTabla();
//                cargarPaquetes();
//                break;
//            case 5:
//                JLid.setVisible(false);
//                JTFid.setEnabled(false);
//                JTFid.setVisible(false);
//                JLobjetos.setText("Pasajes:");
//                JLobjetos.setVisible(true);
//                List<Pasaje> pasajes = Menu.pasajeData.listarPasajes();
//                for (Pasaje aux : pasajes) {
//                    modeloCombo.addElement(aux);
//                }
//                JCBobjetos.setModel(modeloCombo);
//                JCBobjetos.setSelectedIndex(0);
//                JCBobjetos.setVisible(true);
//                JCBobjetos.setEnabled(true);
//                limpiarTabla();
//                cargarPaquetes();
//                break;
        }
        JRBtodos.setSelected(true);
        JRBactivos.setSelected(false);
        
    }//GEN-LAST:event_JCBtipoBusquedaActionPerformed

    private void JCBobjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBobjetosActionPerformed
        // TODO add your handling code here:
        
        JRBtodos.setEnabled(true);
        JRBactivos.setEnabled(true);
        JRBtodos.setSelected(true);
        JRBactivos.setSelected(false);
        limpiarTabla();
        cargarPaquetes();
    }//GEN-LAST:event_JCBobjetosActionPerformed

    private void JRBtodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBtodosActionPerformed
        // TODO add your handling code here:
        if(JRBtodos.isSelected()){
            JRBactivos.setSelected(false);
        }else{
            JRBactivos.setSelected(true);
        }
        limpiarTabla();
        cargarPaquetes();
    }//GEN-LAST:event_JRBtodosActionPerformed

    private void JRBactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBactivosActionPerformed
        // TODO add your handling code here:
        if(JRBactivos.isSelected()){
            JRBtodos.setSelected(false);
        }else{
            JRBtodos.setSelected(true);
        }
        limpiarTabla();
        cargarPaquetes();
    }//GEN-LAST:event_JRBactivosActionPerformed

    private void JTFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidActionPerformed
//        // TODO add your handling code here:
        try{
            int id=Integer.parseInt(JTFid.getText());
            limpiarTabla();
            cargarPaquetes();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros");
        }
    }//GEN-LAST:event_JTFidActionPerformed

    private void JBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JBsalirActionPerformed

    private void JTpaquetesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTpaquetesMouseClicked
        // TODO add your handling code here:
        try{
            JBcalcular.setEnabled(true);
            JLcosto.setEnabled(true);
            JTFcosto.setEnabled(true);
            JScantPersonas.setEnabled(true);
            int fila=(int)JTpaquetes.getSelectedRow();
            Pasaje pasaje=(Pasaje)JTpaquetes.getValueAt(fila, 4);
            double costoPasaje=pasaje.getCosto();
            Alojamiento alo=(Alojamiento)JTpaquetes.getValueAt(fila, 3);
            double costoAlojamiento=alo.getCosto();
            double costoPaquete= costoPasaje+costoAlojamiento;
            JScantPersonas.setValue(1);
            JTFcosto.setText(Double.toString(costoPaquete));
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_JTpaquetesMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        JBcalcular.setEnabled(true);
        JLcosto.setEnabled(false);
        JTFcosto.setEnabled(false);
        JScantPersonas.setEnabled(false);
        JTpaquetes.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void JBcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcalcularActionPerformed
        // TODO add your handling code here:
        try{
            int fila=(int)JTpaquetes.getSelectedRow();
            Pasaje pasaje=(Pasaje)JTpaquetes.getValueAt(fila, 4);
            double costoPasaje=pasaje.getCosto();
            Alojamiento alo=(Alojamiento)JTpaquetes.getValueAt(fila, 3);
            double costoAlojamiento=alo.getCosto();
            double costoPaquete= costoPasaje+costoAlojamiento;
            int cantPersonas=(int)JScantPersonas.getValue();
            JTFcosto.setText(Double.toString(costoPaquete*cantPersonas));
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_JBcalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBcalcular;
    private javax.swing.JButton JBsalir;
    private javax.swing.JComboBox JCBobjetos;
    private javax.swing.JComboBox<String> JCBtipoBusqueda;
    private javax.swing.JLabel JLbuscar;
    private javax.swing.JLabel JLcosto;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLobjetos;
    private javax.swing.JLabel JLtitulo;
    private javax.swing.JRadioButton JRBactivos;
    private javax.swing.JRadioButton JRBtodos;
    private javax.swing.JSpinner JScantPersonas;
    private javax.swing.JTextField JTFcosto;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTable JTpaquetes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Origen");
        modeloTabla.addColumn("Destino");
        modeloTabla.addColumn("Alojamiento");
        modeloTabla.addColumn("Pasaje");
        modeloTabla.addColumn("Activo");
        JTpaquetes.setModel(modeloTabla);
    }
    private void limpiarTabla() {
        int f = JTpaquetes.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }
    private void cargarPaquetes() {
        JLcosto.setEnabled(false);
        JTFcosto.setEnabled(false);
        JScantPersonas.setEnabled(false);
        JTpaquetes.clearSelection();
        
        List<Paquete> paquetes=new ArrayList();
        int opcion;
        try {
            switch (JCBtipoBusqueda.getSelectedIndex()) {
                case 0:
                    if (JRBtodos.isSelected()) {
                        opcion = 1;
                    } else {
                        opcion = 0;
                    }
                    paquetes = Menu.paqueteData.listarPaquetes(opcion);
                    break;
                case 1:
                    try {
                        int id = Integer.parseInt(JTFid.getText());
                        paquetes.add(Menu.paqueteData.buscarPaquete(id));
                    } catch (NumberFormatException ex) {
//                        JOptionPane.showMessageDialog(null, "Ingrese numeros enteros");
                    }

                    break;
                case 2:
                    Ciudad origen = (Ciudad) JCBobjetos.getSelectedItem();
                    if (JRBtodos.isSelected()) {
                        opcion = 1;
                    } else {
                        opcion = 0;
                    }
                    paquetes = Menu.paqueteData.listarPaquetesPorOrigen(origen.getIdCiudad(), opcion);
                    break;
                case 3:
                    Ciudad destino = (Ciudad) JCBobjetos.getSelectedItem();
                    if (JRBtodos.isSelected()) {
                        opcion = 1;
                    } else {
                        opcion = 0;
                    }
                    paquetes = Menu.paqueteData.listarPaquetesPorDestino(destino.getIdCiudad(), opcion);
                    break;
//            case 4:
//                Alojamiento alo=(Alojamiento)JCBobjetos.getSelectedItem();
//                if(JRBtodos.isSelected()){
//                    opcion=1;
//                }else{
//                    opcion=0;
//                }
//                paquetes=Menu.paqueteData.listarPaquetesPorAlo(alo.getIdAlojamiento(), opcion);
//                break;
//            case 5:
//                Pasaje pasaje=(Pasaje)JCBobjetos.getSelectedItem();
//                if(JRBtodos.isSelected()){
//                    opcion=1;
//                }else{
//                    opcion=0;
//                }
//                paquetes=Menu.paqueteData.listarPaquetesPorPasaje(pasaje.getIdPasaje(), opcion);
//                break;
            }
        }catch(NullPointerException ex){
            
        }
        
        
        try {
            for (Paquete aux : paquetes) {
                aux.toString();
                modeloTabla.addRow(new Object[]{
                    
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
    private void cargarComboTipoBusqueda(){
     JCBtipoBusqueda.addItem("Todos");
     JCBtipoBusqueda.addItem("ID");
     JCBtipoBusqueda.addItem("Ciudad de Origen");
     JCBtipoBusqueda.addItem("Ciudad de Destino");
     //JCBtipoBusqueda.addItem("Alojamiento");
     //JCBtipoBusqueda.addItem("Pasaje");
    }
    private void limpiarComboObjetos(){
        int f = JCBobjetos.getItemCount() - 1;
        for (; f >= 0; f--) {
            modeloCombo.removeElementAt(f);
        }
    }
}
