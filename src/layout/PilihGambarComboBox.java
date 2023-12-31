/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layout;

import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarComboBox
     */
    public PilihGambarComboBox() {
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

        panelCBB = new javax.swing.JPanel();
        cbbTA = new javax.swing.JComboBox<>();
        panelIMG = new javax.swing.JPanel();
        lblFree = new javax.swing.JLabel();
        lblTA1 = new javax.swing.JLabel();
        lblTA2 = new javax.swing.JLabel();
        lblTA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penampil Gambar Combo Box");

        panelCBB.setBackground(new java.awt.Color(255, 255, 204));

        cbbTA.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        cbbTA.setForeground(new java.awt.Color(51, 51, 51));
        cbbTA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clear", "Tuna Asap", "Tuna Asap 1", "Tuna Asap 2", "Exit" }));
        cbbTA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTAItemStateChanged(evt);
            }
        });
        panelCBB.add(cbbTA);

        getContentPane().add(panelCBB, java.awt.BorderLayout.PAGE_START);

        panelIMG.setLayout(new java.awt.CardLayout());

        lblFree.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFree.setName("null"); // NOI18N
        panelIMG.add(lblFree, "0");
        lblFree.getAccessibleContext().setAccessibleName("0");
        lblFree.getAccessibleContext().setAccessibleDescription("null");

        lblTA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tuna_asap_1.jpg"))); // NOI18N
        lblTA1.setName("null"); // NOI18N
        panelIMG.add(lblTA1, "1");
        lblTA1.getAccessibleContext().setAccessibleName("1");
        lblTA1.getAccessibleContext().setAccessibleDescription("null");

        lblTA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tuna_asap_2.jpg"))); // NOI18N
        lblTA2.setName("null"); // NOI18N
        panelIMG.add(lblTA2, "2");
        lblTA2.getAccessibleContext().setAccessibleName("2");
        lblTA2.getAccessibleContext().setAccessibleDescription("null");

        lblTA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tuna_asap.jpg"))); // NOI18N
        lblTA.setName("null"); // NOI18N
        panelIMG.add(lblTA, "3");
        lblTA.getAccessibleContext().setAccessibleName("3");
        lblTA.getAccessibleContext().setAccessibleDescription("null");

        getContentPane().add(panelIMG, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbTAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTAItemStateChanged
        String v = cbbTA.getSelectedItem().toString();
       
if (!v.equals("Exit")){    
        CardLayout cl =(CardLayout) (panelIMG.getLayout());
        cl.show (panelIMG, String.valueOf(cbbTA.getSelectedIndex()));
    }else{
        
    int keluar = JOptionPane.showConfirmDialog(this, "Apakah Yakin Ingin Keluar", "keluar", JOptionPane.YES_NO_OPTION);
    if(keluar == 0){
     System.exit(0);
        }
    }
    }//GEN-LAST:event_cbbTAItemStateChanged

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
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbTA;
    private javax.swing.JLabel lblFree;
    private javax.swing.JLabel lblTA;
    private javax.swing.JLabel lblTA1;
    private javax.swing.JLabel lblTA2;
    private javax.swing.JPanel panelCBB;
    private javax.swing.JPanel panelIMG;
    // End of variables declaration//GEN-END:variables
}
