/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import entidades.Ciudad;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crist
 */
public class GestionDeCiudades extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionDeCiudades
     */
    private DefaultTableModel modelo=new DefaultTableModel(){
        
    public boolean isCellEditable(int c, int f){
            return false;
        }
    };
    public GestionDeCiudades() {
        initComponents();
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
        JTFpais = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFprovincia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFciudad = new javax.swing.JTextField();
        RBestado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        JBsalir = new javax.swing.JButton();
        JBguardar = new javax.swing.JButton();
        JBeliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTciudades = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        JTFid = new javax.swing.JTextField();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("Agregando Ciudades");

        jLabel2.setText("Pais:");

        jLabel3.setText("Provincia:");

        jLabel4.setText("Ciudad:");

        jLabel5.setText("Estado:");

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

        JTciudades.setModel(new javax.swing.table.DefaultTableModel(
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
        JTciudades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTciudadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTciudades);

        jLabel6.setText("ID de ciudad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RBestado)
                            .addComponent(JTFpais, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFprovincia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFciudad)
                            .addComponent(JTFid, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                        .addGap(11, 11, 11))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBeliminar)
                        .addGap(26, 26, 26)
                        .addComponent(JBguardar)
                        .addGap(26, 26, 26)
                        .addComponent(JBsalir)
                        .addGap(31, 31, 31)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBestado)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBsalir)
                    .addComponent(JBeliminar)
                    .addComponent(JBguardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        // TODO add your handling code here:
        try {
            if (JBguardar.getText().equals("Guardar")) {
                if (JTFpais.getText().equals("") && JTFprovincia.getText().equals("") && !JTFciudad.getText().equals("")) {
                    String nombre = JTFciudad.getText();
                    String pais = JTFpais.getText();
                    String provincia = JTFprovincia.getText();
                    boolean estado = RBestado.isSelected();
                
                    Ciudad ciu = new Ciudad(nombre,provincia,pais,estado);
                    Menu.ciudadData.guardadCiudad(ciu);
                    limpiarTabla();
                    cargartabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos menos id");
                }
            }else{  
                    int i = JTciudades.getSelectedRow();
                    int id = (int) JTciudades.getValueAt(i, 0);
                    String nombre = JTFciudad.getText();
                    String pais = JTFpais.getText();
                    String provincia = JTFprovincia.getText();
                    boolean estado = RBestado.isSelected();
                    Ciudad ciu = new Ciudad(nombre,provincia,pais,estado);
                    ciu.setIdCiudad(id);
                    Menu.ciudadData.modificarCiudad(ciu);
                    limpiarTabla();
                    cargartabla();                
            }
            JTFid.setText("");
            JTFciudad.setText("");
            JTFpais.setText("");
            JTFprovincia.setText("");
            RBestado.setSelected(false);
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"para el costo debe ingresar numeros");
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
        if(JTFid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Codigo no puede estar vacio");
        }else{
            try {
                int idCiu = Integer.parseInt(JTFid.getText());
                int eleccion = JOptionPane.showConfirmDialog(null, "¿Estas seguro/a de eliminar la ciudad?","", JOptionPane.YES_NO_OPTION);
                if(eleccion == JOptionPane.YES_OPTION){
                    Menu.ciudadData.eliminarCiudad(idCiu);
                }else{
                    JOptionPane.showMessageDialog(null, "No se elimino la ciudad");
                }
                JTFid.setText("");
                JTFciudad.setText("");
                JTFpais.setText("");
                JTFprovincia.setText("");
                RBestado.setSelected(false);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Ingrese el id correctamente");
            }
        }  
    }//GEN-LAST:event_JBeliminarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        JTciudades.clearSelection();
        JBeliminar.setEnabled(false);
        JBguardar.setText("Guardar");
    }//GEN-LAST:event_formMouseClicked

    private void JTciudadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTciudadesMouseClicked
        // TODO add your handling code here:
        try{
            int id=(int)JTciudades.getValueAt(JTciudades.getSelectedRow(), 0);
            Ciudad ciudad=Menu.ciudadData.buscarCiudadPorId(id);
            JTFid.setText(Integer.toString(id));
            
            String nombre= ciudad.getNombre();
            String pais = ciudad.getPais();
            String provincia = ciudad.getProvincia();
            Boolean estado = ciudad.isActivo();
            
            JTFid.setText(Integer.toString(id));
            JTFpais.setText(pais);
            JTFprovincia.setText(provincia);
            JTFciudad.setText(nombre);
            RBestado.setSelected(estado);
        
            JBeliminar.setEnabled(true);
            JBguardar.setText("Modificar");
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_JTciudadesMouseClicked
    private void armarCabecera(){
        modelo.addColumn("Id");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Provincia");     
        modelo.addColumn("Pais");
        modelo.addColumn("Estado");
        
        JTciudades.setModel(modelo);  
    }
    private void limpiarTabla(){
        int f = JTciudades.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    private void cargartabla(){
        for (Ciudad ciudad : Menu.ciudadData.listarCiudades()) {
                modelo.addRow(new Object[]{
                    ciudad.getIdCiudad(),
                    ciudad.getNombre(),
                    ciudad.getProvincia(),
                    ciudad.getPais(),                    
                    ciudad.isActivo()
                });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBeliminar;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBsalir;
    private javax.swing.JTextField JTFciudad;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFpais;
    private javax.swing.JTextField JTFprovincia;
    private javax.swing.JTable JTciudades;
    private javax.swing.JRadioButton RBestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
