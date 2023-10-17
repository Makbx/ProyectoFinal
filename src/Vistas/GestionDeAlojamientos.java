/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.CiudadData;
import Entidades.Alojamiento;
import Entidades.Ciudad;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crist
 */
public class GestionDeAlojamientos extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionDeAlojamientos
     */
    private DefaultTableModel modelo=new DefaultTableModel(){
        
    public boolean isCellEditable(int c, int f){
            return false;
        }
    };

    private Ciudad ciudadSelec;
    public static CiudadData ciudadData;
    public GestionDeAlojamientos() {
        initComponents();
        cargarCombo();
        armarCabecera();
        cargartabla();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JDCinicio = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        JDCfin = new com.toedter.calendar.JDateChooser();
        JTFalojamiento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTFtipo = new javax.swing.JTextField();
        JTFcosto = new javax.swing.JTextField();
        RBestado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTalojamiento = new javax.swing.JTable();
        JBsalir = new javax.swing.JButton();
        JBguardar = new javax.swing.JButton();
        JBeliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CBciudades = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        JTFnombre = new javax.swing.JTextField();

        jLabel1.setText("Agregando Alojamientos");

        jLabel2.setText("Id de Alojamiento:");

        jLabel4.setText("Fecha de inicio:");

        jLabel5.setText("Fecha de Fin:");

        jLabel3.setText("Tipo:");

        jLabel6.setText("Costo Diario:");

        jLabel7.setText("Estado:");

        JTalojamiento.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTalojamiento);

        JBsalir.setText("Salir");
        JBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalirActionPerformed(evt);
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

        jLabel8.setText("Ciudades:");

        jLabel9.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBeliminar)
                .addGap(18, 18, 18)
                .addComponent(JBguardar)
                .addGap(18, 18, 18)
                .addComponent(JBsalir)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JDCfin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(JDCinicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBciudades, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTFalojamiento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBestado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFcosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFnombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFtipo))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CBciudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(JDCinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JDCfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JTFtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(JTFcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBestado)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBsalir)
                    .addComponent(JBguardar)
                    .addComponent(JBeliminar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        // TODO add your handling code here:
        if(JTFnombre.getText().isEmpty() || JDCinicio.toString().isEmpty() || JDCfin.toString().isEmpty() || JTFtipo.getText().isEmpty() || JTFcosto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }else{
            try {
                String nombre = JTFnombre.getText();
                ciudadSelec = (Ciudad) CBciudades.getSelectedItem();
                LocalDate fechaIni = JDCinicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fechaFin = JDCfin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                String tipo = JTFtipo.getText();
                double costo = Integer.parseInt(JTFcosto.getText());
                boolean estado = RBestado.isSelected();
                
                Alojamiento alo = new Alojamiento(nombre,ciudadSelec, fechaIni, fechaFin, tipo, costo, estado);

                Menu.alojamientoData.guardadAlojamiento(alo);

                JTFalojamiento.setText("");
                JTFnombre.setText("");
                JDCinicio.setDate(null);
                JDCfin.setDate(null);
                JTFtipo.setText("");
                JTFcosto.setText("");
                RBestado.setSelected(false);
                limpiarTabla();
                cargartabla();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese los campos correctamente");  
            }
        }
    }//GEN-LAST:event_JBguardarActionPerformed

    private void JBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarActionPerformed
        // TODO add your handling code here:
        if(JTFalojamiento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo id de Alojamiento no puede estar vacio");
        }else{
            try {
                int idAlo = Integer.parseInt(JTFalojamiento.getText());
                int eleccion = JOptionPane.showConfirmDialog(null, "¿Estas seguro/a de eliminar el alojamiento?","", JOptionPane.YES_NO_OPTION);
                if(eleccion == JOptionPane.YES_OPTION){
                    Menu.alojamientoData.eliminarAlojamiento(idAlo);
                }else{
                    JOptionPane.showMessageDialog(null, "No se elimino el alojamiento");
                }
                JTFalojamiento.setText("");
                JTFnombre.setText("");
                JDCinicio.setDate(null);
                JDCfin.setDate(null);
                JTFtipo.setText("");
                JTFcosto.setText("");
                RBestado.setSelected(false);
                limpiarTabla();
                cargartabla();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Ingrese el id de Alojamiento correctamente");
            }
        }   
    }//GEN-LAST:event_JBeliminarActionPerformed

    private void JBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JBsalirActionPerformed
    private void armarCabecera(){
        modelo.addColumn("ID Alojamiento");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Fecha de Inicio");
        modelo.addColumn("Fecha de Fin");
        modelo.addColumn("Tipo");
        modelo.addColumn("Costo diario");
        modelo.addColumn("Estado");
        
        JTalojamiento.setModel(modelo);
    }
    private void limpiarTabla(){
        int f = JTalojamiento.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    private void cargarCombo() {
        for (Ciudad ciu : Menu.ciudadData.listarCiudades()) {
            CBciudades.addItem(ciu);
        }
    }
    private void cargartabla(){
        for (Alojamiento alojamiento : Menu.alojamientoData.listarAlojamientos()) {
                modelo.addRow(new Object[]{
                    alojamiento.getIdAlojamiento(),
                    alojamiento.getNombre(),
                    alojamiento.getCiudad().getNombre(),
                    alojamiento.getFechaInicio(),
                    alojamiento.getFechaFin(),
                    alojamiento.getTipo(),
                    alojamiento.getCosto(),
                    alojamiento.isActivo()
                });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Ciudad> CBciudades;
    private javax.swing.JButton JBeliminar;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBsalir;
    private com.toedter.calendar.JDateChooser JDCfin;
    private com.toedter.calendar.JDateChooser JDCinicio;
    private javax.swing.JTextField JTFalojamiento;
    private javax.swing.JTextField JTFcosto;
    private javax.swing.JTextField JTFnombre;
    private javax.swing.JTextField JTFtipo;
    private javax.swing.JTable JTalojamiento;
    private javax.swing.JRadioButton RBestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
