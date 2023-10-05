/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.AlojamientoData;
import AccesoADatos.CiudadData;
import AccesoADatos.PaqueteData;
import AccesoADatos.PasajeData;

/**
 *
 * @author crist
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public static AlojamientoData alojamientoData;
    public static CiudadData ciudadData;
    public static PaqueteData paqueteData;
    public static PasajeData pasajeData;    
    
    public Menu() {
        initComponents();
        this.alojamientoData = new AlojamientoData();
        this.ciudadData = new CiudadData();
        this.paqueteData = new PaqueteData();
        this.pasajeData = new PasajeData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDPescritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMciudad = new javax.swing.JMenuItem();
        JMciudad = new javax.swing.JMenu();
        JMgestionciudad = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout JDPescritorioLayout = new javax.swing.GroupLayout(JDPescritorio);
        JDPescritorio.setLayout(JDPescritorioLayout);
        JDPescritorioLayout.setHorizontalGroup(
            JDPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        JDPescritorioLayout.setVerticalGroup(
            JDPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jMenu1.setText("Cliente");

        jMciudad.setText("Ciudades");
        jMciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMciudadActionPerformed(evt);
            }
        });
        jMenu1.add(jMciudad);

        jMenuBar1.add(jMenu1);

        JMciudad.setText("Administracion");

        JMgestionciudad.setText("Gestion de ciudades");
        JMgestionciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMgestionciudadActionPerformed(evt);
            }
        });
        JMciudad.add(JMgestionciudad);

        jMenuBar1.add(JMciudad);

        jMenu2.setText("Salir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JDPescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JDPescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMciudadActionPerformed
        // TODO add your handling code here:
        Ciudades ciudades = new Ciudades();
        JDPescritorio.removeAll();
        JDPescritorio.repaint();
        ciudades.setVisible(true);
        JDPescritorio.add(ciudades);
        JDPescritorio.moveToFront(ciudades);
    }//GEN-LAST:event_jMciudadActionPerformed

    private void JMgestionciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMgestionciudadActionPerformed
        // TODO add your handling code here:
        GestionDeCiudades gestionciudades = new GestionDeCiudades();
        JDPescritorio.removeAll();
        JDPescritorio.repaint();
        gestionciudades.setVisible(true);
        JDPescritorio.add(gestionciudades);
        JDPescritorio.moveToFront(gestionciudades);        
    }//GEN-LAST:event_JMgestionciudadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDPescritorio;
    private javax.swing.JMenu JMciudad;
    private javax.swing.JMenuItem JMgestionciudad;
    private javax.swing.JMenuItem jMciudad;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
