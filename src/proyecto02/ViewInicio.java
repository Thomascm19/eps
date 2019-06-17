/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto02;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Newshore
 */
public class ViewInicio extends javax.swing.JFrame {

    ArrayList<Empresa> listaEmpresa;
   
    public ViewInicio() {
        initComponents();
        
        listaEmpresa = new ArrayList<Empresa>();
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
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        BtnGuardarEmpresa = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jDateReserva = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtSede = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(73, 181, 172));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto02/img/image (1).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 370, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 490));

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nit");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        txtNit.setBackground(new java.awt.Color(33, 45, 62));
        txtNit.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtNit.setForeground(new java.awt.Color(255, 255, 255));
        txtNit.setBorder(null);
        txtNit.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        txtNombre.setBackground(new java.awt.Color(33, 45, 62));
        txtNombre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Direccion");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        txtDireccion.setBackground(new java.awt.Color(33, 45, 62));
        txtDireccion.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setBorder(null);
        txtDireccion.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 150, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(33, 45, 62));
        txtTelefono.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(null);
        txtTelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 150, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registra Tu IPS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 7));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, 10));

        jSeparator3.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 150, 10));

        jSeparator4.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 150, 10));

        BtnGuardarEmpresa.setBackground(new java.awt.Color(73, 181, 172));
        BtnGuardarEmpresa.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        BtnGuardarEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardarEmpresa.setText("GUARDAR");
        BtnGuardarEmpresa.setBorder(null);
        BtnGuardarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarEmpresaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGuardarEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 99, 34));

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

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de fundacion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jDateReserva.setBackground(new java.awt.Color(33, 45, 62));
        jDateReserva.setForeground(new java.awt.Color(33, 45, 62));
        jPanel2.add(jDateReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 120, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sede");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        txtSede.setBackground(new java.awt.Color(33, 45, 62));
        txtSede.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtSede.setForeground(new java.awt.Color(255, 255, 255));
        txtSede.setBorder(null);
        txtSede.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 150, -1));

        jSeparator5.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 150, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 400, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void BtnGuardarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarEmpresaActionPerformed

        String nit = txtNit.getText();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        Date fechaFundacion = jDateReserva.getDate();
        String sede = txtSede.getText();
        //Se crea el objeto
        Empresa objEmpresa = new Empresa(nit, nombre, direccion, telefono, fechaFundacion, sede);

        listaEmpresa.add(objEmpresa);
        JOptionPane.showMessageDialog(this, "Se agrego la IPS de forma correcta. ");

        ViewPrincipal open = new ViewPrincipal();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnGuardarEmpresaActionPerformed

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        ViewPrincipal open = new ViewPrincipal();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ViewInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarEmpresa;
    private javax.swing.JButton BtnVolver;
    private com.toedter.calendar.JDateChooser jDateReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSede;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}