
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
        JBbuscar = new javax.swing.JButton();
        JBguardar = new javax.swing.JButton();
        JBeliminar = new javax.swing.JButton();
        JBsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTpasajes = new javax.swing.JTable();
        JLnota = new javax.swing.JLabel();

        setResizable(true);
        setMinimumSize(new java.awt.Dimension(320, 80));
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

        JBbuscar.setText("Buscar");
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
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
        JTpasajes.setPreferredSize(new java.awt.Dimension(380, 110));
        JTpasajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JTpasajesMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(JTpasajes);

        JLnota.setText("Nota: Para modificar o eliminar un pasaje debes buscarlo por id o seleccionarlo de la tabla      ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
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
                            .addComponent(JBbuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBguardar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JBsalir)
                                .addComponent(JBeliminar)))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLnota)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JLtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLid)
                    .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbuscar))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLtipo)
                    .addComponent(JCBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLciudad)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JCBciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBeliminar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLcosto)
                            .addComponent(JTFcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLestado)
                            .addComponent(JRBestado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(JBsalir)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLnota)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
        // TODO add your handling code here:
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
        }
    }//GEN-LAST:event_JBbuscarActionPerformed

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
        int id=(int)JTpasajes.getValueAt(JTpasajes.getSelectedRow(), 0);
        if (JOptionPane.showConfirmDialog(null, pasaje.toString() + "\nNota: el pasaje seguira en la tabla con Activo=false "
                , "¿Desea dar de baja el paquete?", 
                        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == 0) {
            Menu.paqueteData.eliminarPaquete(id);
            limpiarTabla();
            cargarPasajes();
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
        JBeliminar.setEnabled(true);
        JBguardar.setText("Modificar");
    }//GEN-LAST:event_JTpasajesMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
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
        List<Pasaje> pasajes=Menu.pasajeData.listarPasajes();
        try {
            //List<Pasaje> pasajes=Menu.pasajeData.listarPasajes();
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
    private void cargarComboCiudad() {
        JCBciudad.addItem(null);

        for (Ciudad ciudad : Menu.ciudadData.listarCiudades()) {
            
            JCBciudad.addItem(ciudad);
        }
    }
    private void cargarComboTipo(){
     JCBtipo.addItem(null);
            
     JCBtipo.addItem("avion");
     JCBtipo.addItem("colectivo");
     JCBtipo.addItem("auto");
    }
}
