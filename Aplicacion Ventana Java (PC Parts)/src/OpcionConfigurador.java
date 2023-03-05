
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author ruflas
 */
public class OpcionConfigurador extends javax.swing.JDialog {

    /**
     * Creates new form OpcionConfigurador
     */
    private OpcionConfigurador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public OpcionConfigurador(Principal VPrincipal) {
        this(null, true);
        this.VPrincipal = VPrincipal;
        this.setIconImage(new ImageIcon("src/images/logo.png").getImage());
        POK = false;
    }

    public boolean showDialog() {
        POK = false;
        this.setVisible(true);
        return POK;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGOpcion = new javax.swing.ButtonGroup();
        CBAmd = new javax.swing.JCheckBox();
        CBIntel = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        BOK = new javax.swing.JButton();
        BCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CBChipset = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opcion Configurador");

        CBAmd.setBackground(new java.awt.Color(0, 153, 0));
        BGOpcion.add(CBAmd);
        CBAmd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CBAmd.setText("AMD");
        CBAmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBAmdActionPerformed(evt);
            }
        });

        CBIntel.setBackground(new java.awt.Color(0, 102, 255));
        BGOpcion.add(CBIntel);
        CBIntel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CBIntel.setText("Intel");
        CBIntel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBIntelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("CPU");

        BOK.setText("OK");
        BOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOKActionPerformed(evt);
            }
        });

        BCancel.setText("Cancelar");
        BCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/intel.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/amd.png"))); // NOI18N

        CBChipset.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(BOK))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(CBIntel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BCancel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBAmd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CBChipset, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CBIntel)
                        .addComponent(CBAmd)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(CBChipset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOK)
                    .addComponent(BCancel))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BCancelActionPerformed

    private void BOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOKActionPerformed
        // TODO add your handling code here:
        if (CBIntel.isSelected() || CBAmd.isSelected()) {
            this.setVisible(false);
            Configurador conf = new Configurador(this);
            conf.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No has seleccionado ninguna opcion.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BOKActionPerformed

    private void CBIntelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBIntelActionPerformed
        // TODO add your handling code here:
        cpuMarked();
    }//GEN-LAST:event_CBIntelActionPerformed

    private void CBAmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBAmdActionPerformed
        // TODO add your handling code here:
        cpuMarked();
    }//GEN-LAST:event_CBAmdActionPerformed

    public String getChipsetSelected(){
        return CBChipset.getSelectedItem().toString();
    }
    
    public boolean cpuMarked() {
        if (CBIntel.isSelected() || CBAmd.isSelected()) {
            CBChipset.setEnabled(true);
            if (CBIntel.isSelected()) {
                CBChipset.removeAllItems();
                añadirChipset("LGA");
            } else {
                CBChipset.removeAllItems();
                añadirChipset("AM");
            }
            return true;
        }
        CBChipset.setEnabled(false);
        return false;
    }

    public void añadirChipset(String modelo) {
        Set<Map.Entry<Producto, String>> auxSet = this.VPrincipal.chipsets.entrySet();
        Iterator<Map.Entry<Producto, String>> it = auxSet.iterator();
        while (it.hasNext()) {
            Map.Entry<Producto, String> cEntry = it.next();
            if (cEntry.getValue().contains(modelo)) {
                if(!containedInCheckBox(cEntry.getValue())){
                    CBChipset.addItem(cEntry.getValue());
                }
            }
        }
    }

    public boolean containedInCheckBox(String elemento){
        for(int i = 0; i<CBChipset.getItemCount(); i++){
            if(CBChipset.getItemAt(i).contains(elemento)){
                return true;
            }
        }
        return false;
    }
    
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
            java.util.logging.Logger.getLogger(OpcionConfigurador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionConfigurador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionConfigurador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionConfigurador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OpcionConfigurador dialog = new OpcionConfigurador(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    private boolean POK;
    Principal VPrincipal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancel;
    private javax.swing.ButtonGroup BGOpcion;
    private javax.swing.JButton BOK;
    private javax.swing.JCheckBox CBAmd;
    private javax.swing.JComboBox<String> CBChipset;
    private javax.swing.JCheckBox CBIntel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}