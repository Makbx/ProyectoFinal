
package Vistas;

import entidades.Ciudad;
import entidades.Pasaje;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author santi
 */
public class GestionDePasajes extends javax.swing.JInternalFrame {
    
    private Pasaje pasaje;
    private DefaultTableModel modelo=new DefaultTableModel(){
        
     public boolean isCellEditable(int c, int f){
            return false;
        }
    };
    public GestionDePasajes() {
        initComponents();
        armarCabecera();
        cargarPasajes();
        cargarComboCiudad();
        cargarComboTipo();
        //limpiarTabla();
        JBeliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLtitulo = new javax.swing.JLabel();
        JLid = new javax.swing.JLabel();
        JLtipo = new javax.swing.JLabel();
        JLciudad = new javax.swing.JLabel();
        JLcosto = new javax.swing.JLabel();
        JLestado = new javax.swing.JLabel();
        JTFid = new javax.swing.JTextField();
        JCBtipo = new javax.swing.JComboBox<>();
        JCBciudad = new javax.swing.JComboBox<>();
        JTFcosto = new javax.swing.JTextField();
        JRBestado = new javax.swing.JRadioButton();
        JBguardar = new javax.swing.JButton();
        JBeliminar = new javax.swing.JButton();
        JBsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTpasajes = new javax.swing.JTable();
        JLnota = new javax.swing.JLabel();

        setResizable(true);
        setMinimumSize(new java.awt.Dimension(320, 80));
        setPreferredSize(new java.awt.Dimension(700, 600));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        JLtitulo.setText("Control de Pasajes");

        JLid.setText("Id de Pasaje:");

        JLtipo.setText("Tipo de transporte:");

        JLciudad.setText("Ciudad de origen:");

        JLcosto.setText("Costo: ");

        JLestado.setText("Estado: ");

        JTFid.setEditable(false);

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
        JTpasajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JTpasajesMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(JTpasajes);

        JLnota.setText("Nota: Para modificar o eliminar un pasaje debes seleccionarlo de la tabla      ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLid)
                            .addComponent(JLciudad)
                            .addComponent(JLcosto)
                            .addComponent(JLestado)
                            .addComponent(JLtipo))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCBciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(JLtitulo))
                            .addComponent(JRBestado))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBguardar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JBsalir)
                                .addComponent(JBeliminar)))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLnota)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JLtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLid, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLtipo)
                    .addComponent(JCBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBeliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLciudad)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JCBciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBsalir)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcosto)
                    .addComponent(JTFcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLestado)
                    .addComponent(JRBestado))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLnota)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        // TODO add your handling code here:
        try {
            if (JBguardar.getText().equals("Guardar")) {
                if (JCBciudad.getSelectedIndex() > 0 && JCBtipo.getSelectedIndex() > 0
                        && !JTFcosto.getText().equals("")) {
                    Ciudad ciudadO = (Ciudad) JCBciudad.getSelectedItem();
                    String tipo = (String) JCBtipo.getSelectedItem();
                    

                    pasaje = new Pasaje(ciudadO, tipo, Double.parseDouble(JTFcosto.getText()), JRBestado.isSelected());
                    if (JOptionPane.showConfirmDialog(null, pasaje.toString() + "\nNota: por defecto el pasaje se guardara "
                            + "activo, para desactivarlo modifique en la tabla", "¿Desea guardar el pasaje?",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                        pasaje.setIdPasaje(Menu.pasajeData.guardarPasaje(pasaje));
                        limpiarTabla();
                        cargarPasajes();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Para cargar un pasaje debe seleccionar los elementos para el mismo");
                }
            }else{
                int i=JTpasajes.getSelectedRow();
                int id = (int) JTpasajes.getValueAt(i, 0);
                Ciudad ciudadO = (Ciudad) JCBciudad.getSelectedItem();
                String tipo = (String) JCBtipo.getSelectedItem();
                Boolean estado=JRBestado.isSelected();
                Double costo=Double.parseDouble(JTFcosto.getText());
                pasaje=new Pasaje(id,ciudadO,tipo,costo,estado);
                if (JOptionPane.showConfirmDialog(null, "Nuevo pasaje:\n"+pasaje.toString(),
                        "¿Desea modificar el pasaje?",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {

                    Menu.pasajeData.modificarPasaje(pasaje);
                    limpiarTabla();
                    cargarPasajes();
                } 
            }
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"para el costo debe ingresar numeros");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Ocurrio algo inesperado, intente nuevamente");
        }
    }//GEN-LAST:event_JBguardarActionPerformed

    private void JBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarActionPerformed
        // TODO add your handling code here:
        int id = (int) JTpasajes.getValueAt(JTpasajes.getSelectedRow(), 0);
        if (pasaje.isActivo()) {
            if (JOptionPane.showConfirmDialog(null, pasaje.toString() + "\nNota: el pasaje seguira en la tabla con Activo=false ",
                     "¿Desea dar de baja el pasaje?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                Menu.paqueteData.eliminarPaquete(id);
                limpiarTabla();
                cargarPasajes();
            }
        } else {
            JOptionPane.showMessageDialog(null, "El pasaje ya esta inhabilitado");
        }
    }//GEN-LAST:event_JBeliminarActionPerformed

    private void JBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JBsalirActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        JTpasajes.clearSelection();
        JBeliminar.setEnabled(false);
        JBguardar.setText("Guardar");
    }//GEN-LAST:event_formMouseClicked

    private void JTpasajesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTpasajesMouseReleased
        // TODO add your handling code here:
        int id=(int)JTpasajes.getValueAt(JTpasajes.getSelectedRow(), 0);
        pasaje=new Pasaje();
        pasaje=Menu.pasajeData.buscarPasaje(id);
        JTFid.setText(Integer.toString(id));
        JCBciudad.removeAllItems();
        int posCiudad=cargarComboCiudad();
        JCBciudad.setSelectedIndex(posCiudad);
        JCBtipo.setSelectedItem(pasaje.getTipoTransporte());
        JTFcosto.setText(Double.toString(pasaje.getCosto()));
        JRBestado.setSelected(pasaje.isActivo());
        JBeliminar.setEnabled(true);
        JBguardar.setText("Modificar");
    }//GEN-LAST:event_JTpasajesMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBeliminar;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBsalir;
    private javax.swing.JComboBox<Ciudad> JCBciudad;
    private javax.swing.JComboBox<String> JCBtipo;
    private javax.swing.JLabel JLciudad;
    private javax.swing.JLabel JLcosto;
    private javax.swing.JLabel JLestado;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLnota;
    private javax.swing.JLabel JLtipo;
    private javax.swing.JLabel JLtitulo;
    private javax.swing.JRadioButton JRBestado;
    private javax.swing.JTextField JTFcosto;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTable JTpasajes;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
         modelo.addColumn("Id");
         modelo.addColumn("Ciudad");
         modelo.addColumn("Transporte");
         modelo.addColumn("Costo");
         modelo.addColumn("Activo");
         JTpasajes.setModel(modelo);
    } 
    private void limpiarTabla() {
        int f = JTpasajes.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    private void cargarPasajes() {
        
        try {
            List<Pasaje> pasajes=Menu.pasajeData.listarPasajes(1);
            for (Pasaje aux : pasajes) {
                modelo.addRow(new Object[]{
                    aux.getIdPasaje(),
                    aux.getCiudadOrigen(),
                    aux.getTipoTransporte(),
                    aux.getCosto(),
                    aux.isActivo()
                });   
            }
            
        } catch (NullPointerException ex) {
            modelo.addRow(new Object[]{
                "",
                "",
                "no hay pasajes"
            });
        }
    }
    private int cargarComboCiudad() {
        JCBciudad.addItem(null);
        List<Ciudad> ciudades=Menu.ciudadData.listarCiudades();
        int pos=-1;
        
        if (JTpasajes.getSelectedRow() != -1) {
            Ciudad ciudad=(Ciudad)JTpasajes.getValueAt(JTpasajes.getSelectedRow(), 1);
            for (Ciudad aux : ciudades) {

                JCBciudad.addItem(aux);
                if (aux.getIdCiudad()==ciudad.getIdCiudad()) {
                    pos = ciudades.indexOf(aux);
                }
            }
        }else{
            for (Ciudad aux : ciudades) {

                JCBciudad.addItem(aux);
            }
        }
        return pos + 1;
    }
    private void cargarComboTipo(){
     JCBtipo.addItem(null);
     
     JCBtipo.addItem("avion");
     JCBtipo.addItem("colectivo");
     JCBtipo.addItem("taxi");
    }
    
    
    /*buscar
    List<Pasaje> pasajes=Menu.pasajeData.listarPasajes();
        int bandera=0;
        for(Pasaje pas: pasajes){
            if(Integer.parseInt(JTFid.getText())==pas.getIdPasaje()){
                bandera=1;
                JTpasajes.setRowSelectionInterval(pasajes.indexOf(pas), pasajes.indexOf(pas));
                break;
            }
        }
        if(bandera==0){
            JOptionPane.showMessageDialog(null, "El id no corresponde a ningun pasaje existente");
        }else{
            JBeliminar.setEnabled(true);
            JBguardar.setText("Modificar");
        }*/
}
