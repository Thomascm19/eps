/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto02;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Newshore
 */
public class ViewAtender extends javax.swing.JFrame {

   ViewCliente listaC = new ViewCliente();
   ViewEmpleado listaE = new ViewEmpleado();
   
    public ViewAtender() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnGuardarEmpleado = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(73, 181, 172));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto02/img/image (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 360));

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnGuardarEmpleado.setBackground(new java.awt.Color(73, 181, 172));
        BtnGuardarEmpleado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        BtnGuardarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardarEmpleado.setText("ATTEND");
        BtnGuardarEmpleado.setBorder(null);
        BtnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGuardarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 99, 34));

        BtnVolver.setBackground(new java.awt.Color(73, 181, 172));
        BtnVolver.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(255, 255, 255));
        BtnVolver.setText("x");
        BtnVolver.setBorder(null);
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 34));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 400, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        ViewPrincipal open = new ViewPrincipal();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void BtnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarEmpleadoActionPerformed

        try {
            String buscarUsuario = JOptionPane.showInputDialog("Ingrese la cedula del cliente que desea atender: ");
            String buscarDoctor = JOptionPane.showInputDialog("Ingrese la cedula del doctor: ");
            for (int i = 0; i <= listaE.listaEmpleado.size(); i++) {
                Empleado empleadoTemp = (Empleado) listaE.listaEmpleado.get(i);
                for (int j = 0; j <= listaC.listaCliente.size(); j++) {
                    Cliente clienteTemp = (Cliente) listaC.listaCliente.get(i);
                    if (buscarUsuario.equals(clienteTemp.getCedula()) && buscarDoctor.equals(empleadoTemp.getCedula())) {

                        listaC.listaCliente.Desencolar();

                        JOptionPane.showMessageDialog(this, "El turno bajo cedula: " + clienteTemp.getCedula() + " esta siendo atenido.");

                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, Cedula no encontrada" + e);
        }

    }//GEN-LAST:event_BtnGuardarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAtender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAtender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAtender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAtender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAtender().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarEmpleado;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
