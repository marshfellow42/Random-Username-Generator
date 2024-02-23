/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author mello
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        centreWindow(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        uppercase_btn = new javax.swing.JRadioButton();
        numbers_btn = new javax.swing.JRadioButton();
        symbols_btn = new javax.swing.JRadioButton();
        lowercase_btn = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insert how many characters you want to insert");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(15, 20, 590, 37);

        jTextField1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(240, 90, 118, 70);

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 220, 157, 39);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(3, 320, 600, 84);

        buttonGroup1.add(uppercase_btn);
        uppercase_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uppercase_btn.setText("Uppercase");
        jPanel1.add(uppercase_btn);
        uppercase_btn.setBounds(390, 110, 120, 20);

        buttonGroup1.add(numbers_btn);
        numbers_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numbers_btn.setText("Numbers");
        jPanel1.add(numbers_btn);
        numbers_btn.setBounds(390, 140, 100, 30);

        buttonGroup1.add(symbols_btn);
        symbols_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        symbols_btn.setText("Symbols");
        symbols_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symbols_btnActionPerformed(evt);
            }
        });
        jPanel1.add(symbols_btn);
        symbols_btn.setBounds(390, 180, 94, 30);

        buttonGroup1.add(lowercase_btn);
        lowercase_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lowercase_btn.setText("Lowercase");
        jPanel1.add(lowercase_btn);
        lowercase_btn.setBounds(390, 70, 120, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 615, 454));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] lowercase = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] uppercase = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] symbols = {"!", "@", "#", "$", "%", "&", "*", "(", ")", "-", "_", "+", "=", "{", "}", "[", "]", "|", ":", ";", "<", ">", ",", ".", "?"};

        int length = Integer.valueOf(jTextField1.getText());

        String[] final_name = {};

        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = rnd.nextInt(26);

            if (uppercase_btn.isSelected()) {
                final_name = ArrayUtils.add(final_name, lowercase[randomIndex]);
                final_name = ArrayUtils.add(final_name, uppercase[randomIndex]);
            } else if (numbers_btn.isSelected()) {
                int randomIndexNumber = rnd.nextInt(10);
                final_name = ArrayUtils.add(final_name, lowercase[randomIndex]);
                final_name = ArrayUtils.add(final_name, numbers[randomIndexNumber]);
            } else if (symbols_btn.isSelected()) {
                int randomIndexSymbols = rnd.nextInt(25);
                final_name = ArrayUtils.add(final_name, lowercase[randomIndex]);
                final_name = ArrayUtils.add(final_name, symbols[randomIndexSymbols]);
            } else if (lowercase_btn.isSelected()) {
                final_name = ArrayUtils.add(final_name, lowercase[randomIndex]);
            } else {
                final_name = ArrayUtils.add(final_name, lowercase[randomIndex]);
            }
        }

        Collections.shuffle(Arrays.asList(final_name));
        String joined_text = String.join("", final_name);
        jLabel2.setText(joined_text.substring(0, length));


    }//GEN-LAST:event_jButton1ActionPerformed

    private void symbols_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symbols_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symbols_btnActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    private void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton lowercase_btn;
    private javax.swing.JRadioButton numbers_btn;
    private javax.swing.JRadioButton symbols_btn;
    private javax.swing.JRadioButton uppercase_btn;
    // End of variables declaration//GEN-END:variables
}
