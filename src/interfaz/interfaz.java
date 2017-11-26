/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;
import wabisabinomina.Empresa;
import wabisabinomina.WabiSabiNomina;


/**
 *
 * @author Maicol Velasquez
 */
public class interfaz extends javax.swing.JFrame {
    Scanner de = new Scanner (System.in);
    String usuario ;
    String contraseña;
    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/interfaz/imagenes/logows1.png")).getImage());       
    }
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBUSalir1 = new javax.swing.JButton();
        jLabelIconoUsuario = new javax.swing.JLabel();
        jLabelUsu = new javax.swing.JLabel();
        jLabelContras = new javax.swing.JLabel();
        jPasswordFieldContra = new javax.swing.JPasswordField();
        jTextFieldUsu = new javax.swing.JTextField();
        jButtonIniciarS = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IniciarSesion - WabiSabiContabilidad");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBUSalir1.setBackground(new java.awt.Color(0, 102, 204));
        jBUSalir1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jBUSalir1.setForeground(new java.awt.Color(255, 255, 255));
        jBUSalir1.setText("Salir");
        jBUSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUSalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBUSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 80, 30));

        jLabelIconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/Usuario.png"))); // NOI18N
        getContentPane().add(jLabelIconoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 230, 290));

        jLabelUsu.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUsu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelUsu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsu.setText("Usuario:");
        getContentPane().add(jLabelUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jLabelContras.setBackground(new java.awt.Color(255, 255, 255));
        jLabelContras.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelContras.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContras.setText("Contraseña:");
        getContentPane().add(jLabelContras, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 140, 20));

        jPasswordFieldContra.setBackground(new java.awt.Color(0, 51, 204));
        jPasswordFieldContra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPasswordFieldContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContraActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 200, 30));

        jTextFieldUsu.setBackground(new java.awt.Color(0, 51, 204));
        jTextFieldUsu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldUsu.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 200, 30));

        jButtonIniciarS.setBackground(new java.awt.Color(0, 51, 204));
        jButtonIniciarS.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButtonIniciarS.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniciarS.setText("Iniciar Sesión");
        jButtonIniciarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIniciarSMouseClicked(evt);
            }
        });
        jButtonIniciarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIniciarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/fondo.jpg"))); // NOI18N
        jLabelFondo.setMaximumSize(new java.awt.Dimension(1000, 1600));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("jdf"), jLabelFondo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -60, 1090, 860));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBUSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUSalir1ActionPerformed
                 System.exit(0);
    }//GEN-LAST:event_jBUSalir1ActionPerformed

   
    
    private void jPasswordFieldContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldContraActionPerformed

    private void jButtonIniciarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIniciarSActionPerformed

    private void jButtonIniciarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniciarSMouseClicked
         File archiEmpr = new File("Empresa/Datos Empresa.txt");
          Empresa empresa = new Empresa();
          
         new WabiSabiNomina().iniciar(empresa, archiEmpr, de);
        String str = jLabelUsu.getText();
        if( true ) {
        //   panel newPanel = new panel(usuario, contra);
          //  panel.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonIniciarSMouseClicked

    private void jTextFieldUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // Image icon = getIconImage;
         //      String str = jLabelUsu.getText();
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBUSalir1;
    private javax.swing.JButton jButtonIniciarS;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelContras;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIconoUsuario;
    private javax.swing.JLabel jLabelUsu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldContra;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldUsu;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
