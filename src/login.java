
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shrey
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        btn2 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lb2 = new javax.swing.JLabel();
        Login_button = new javax.swing.JButton();
        Close_button = new javax.swing.JButton();
        tf2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        btn2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit application.png"))); // NOI18N
        btn2.setText("Close");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb1.setText("Username :");
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, 30));

        tf1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 340, 40));

        lb2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb2.setText("Password :");
        getContentPane().add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, 34));

        Login_button.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Login_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        Login_button.setText("Login");
        Login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 151, 41));

        Close_button.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit application.png"))); // NOI18N
        Close_button.setText("Close");
        Close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, 151, 41));

        tf2.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 340, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login background final.PNG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_buttonActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_Close_buttonActionPerformed

    private void Login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_buttonActionPerformed
        // TODO add your handling code here:
        if(tf1.getText().equals("bbms") && tf2.getText().equals("admin"))
        {
            setVisible(false);
            new home().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
        
    }//GEN-LAST:event_Login_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
//if(a==0)
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close_button;
    private javax.swing.JButton Login_button;
    private javax.swing.JButton btn2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JTextField tf1;
    private javax.swing.JPasswordField tf2;
    // End of variables declaration//GEN-END:variables
}
