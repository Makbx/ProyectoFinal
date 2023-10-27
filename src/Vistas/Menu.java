/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import accesoADatos.AlojamientoData;
import accesoADatos.CiudadData;
import accesoADatos.PaqueteData;
import accesoADatos.PasajeData;

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
        JMpaquetes = new javax.swing.JMenu();
        jMciudad = new javax.swing.JMenuItem();
        JMpaquete = new javax.swing.JMenuItem();
        JMpasajes = new javax.swing.JMenuItem();
        JMciudad = new javax.swing.JMenu();
        JMgestionciudad = new javax.swing.JMenuItem();
        JMgestionAlojamiento = new javax.swing.JMenuItem();
        JMgestionPasajes = new javax.swing.JMenuItem();
        JMgestionPaquetes = new javax.swing.JMenuItem();
        JMsalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout JDPescritorioLayout = new javax.swing.GroupLayout(JDPescritorio);
        JDPescritorio.setLayout(JDPescritorioLayout);
        JDPescritorioLayout.setHorizontalGroup(
            JDPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1082, Short.MAX_VALUE)
        );
        JDPescritorioLayout.setVerticalGroup(
            JDPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        JMpaquetes.setText("Cliente");

        jMciudad.setText("Ciudades");
        jMciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMciudadActionPerformed(evt);
            }
        });
        JMpaquetes.add(jMciudad);

        JMpaquete.setText("Paquetes");
        JMpaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMpaqueteActionPerformed(evt);
            }
        });
        JMpaquetes.add(JMpaquete);

        JMpasajes.setText("Pasajes");
        JMpasajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMpasajesActionPerformed(evt);
            }
        });
        JMpaquetes.add(JMpasajes);

        jMenuBar1.add(JMpaquetes);

        JMciudad.setText("Administracion");

        JMgestionciudad.setText("Gestion de Ciudades");
        JMgestionciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMgestionciudadActionPerformed(evt);
            }
        });
        JMciudad.add(JMgestionciudad);

        JMgestionAlojamiento.setText("Gestion de Alojamientos");
        JMgestionAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMgestionAlojamientoActionPerformed(evt);
            }
        });
        JMciudad.add(JMgestionAlojamiento);

        JMgestionPasajes.setText("Gestion de Pasajes");
        JMgestionPasajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMgestionPasajesActionPerformed(evt);
            }
        });
        JMciudad.add(JMgestionPasajes);

        JMgestionPaquetes.setText("Gestion de Paquetes");
        JMgestionPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMgestionPaquetesActionPerformed(evt);
            }
        });
        JMciudad.add(JMgestionPaquetes);

        jMenuBar1.add(JMciudad);

        JMsalir.setText("Salir");
        JMsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMsalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(JMsalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JDPescritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(JDPescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMsalirMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JMsalirMouseClicked

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

    private void JMgestionAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMgestionAlojamientoActionPerformed
        // TODO add your handling code here:
        GestionDeAlojamientos gestionalojamiento = new GestionDeAlojamientos();
        JDPescritorio.removeAll();
        JDPescritorio.repaint();
        gestionalojamiento.setVisible(true);
        JDPescritorio.add(gestionalojamiento);
        JDPescritorio.moveToFront(gestionalojamiento);   
    }//GEN-LAST:event_JMgestionAlojamientoActionPerformed

    private void JMgestionPasajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMgestionPasajesActionPerformed
        // TODO add your handling code here:
        GestionDePasajes gdp = new GestionDePasajes();
        JDPescritorio.removeAll();
        JDPescritorio.repaint();
        gdp.setVisible(true);
        JDPescritorio.add(gdp);
        JDPescritorio.moveToFront(gdp);   
    }//GEN-LAST:event_JMgestionPasajesActionPerformed

    private void JMgestionPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMgestionPaquetesActionPerformed
        // TODO add your handling code here:
        GestionDePaquetes gdp = new GestionDePaquetes();
        JDPescritorio.removeAll();
        JDPescritorio.repaint();
        gdp.setVisible(true);
        JDPescritorio.add(gdp);
        JDPescritorio.moveToFront(gdp);   
    }//GEN-LAST:event_JMgestionPaquetesActionPerformed

    private void JMpaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMpaqueteActionPerformed
        // TODO add your handling code here:
        ConsultaDePaquetes cdp = new ConsultaDePaquetes();
        JDPescritorio.removeAll();
        JDPescritorio.repaint();
        cdp.setVisible(true);
        JDPescritorio.add(cdp);
        JDPescritorio.moveToFront(cdp);  
    }//GEN-LAST:event_JMpaqueteActionPerformed

    private void JMpasajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMpasajesActionPerformed
        // TODO add your handling code here:
        ConsultaDePasajes cdp = new ConsultaDePasajes();
        JDPescritorio.removeAll();
        JDPescritorio.repaint();
        cdp.setVisible(true);
        JDPescritorio.add(cdp);
        JDPescritorio.moveToFront(cdp); 
    }//GEN-LAST:event_JMpasajesActionPerformed

    /**
     * 
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
    private javax.swing.JMenuItem JMgestionAlojamiento;
    private javax.swing.JMenuItem JMgestionPaquetes;
    private javax.swing.JMenuItem JMgestionPasajes;
    private javax.swing.JMenuItem JMgestionciudad;
    private javax.swing.JMenuItem JMpaquete;
    private javax.swing.JMenu JMpaquetes;
    private javax.swing.JMenuItem JMpasajes;
    private javax.swing.JMenu JMsalir;
    private javax.swing.JMenuItem jMciudad;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
