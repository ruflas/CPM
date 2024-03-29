
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ruflas
 */
public class GoogleAuth extends javax.swing.JFrame {

    /**
     * Creates new form GoogleAuth
     */
    private GoogleAuth() {
        initComponents();
        BNext.setVisible(false);
        this.setIconImage(new ImageIcon("src/images/gmail.png").getImage());
    }
    
    public GoogleAuth(Login VLogin){
        this();
        this.VLogin = VLogin;
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
        TFMail = new javax.swing.JTextField();
        BSiguiente = new javax.swing.JButton();
        LProfilePicture = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BNext = new javax.swing.JButton();

        setTitle("Google Login");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel1.setText("Iniciar sesión");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Utiliza tu cuenta de Google");

        TFMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFMailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFMailKeyTyped(evt);
            }
        });

        BSiguiente.setBackground(new java.awt.Color(0, 153, 153));
        BSiguiente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        BSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        BSiguiente.setText("Siguiente");
        BSiguiente.setEnabled(false);
        BSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSiguienteActionPerformed(evt);
            }
        });

        LProfilePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gmail.png"))); // NOI18N

        BNext.setBackground(new java.awt.Color(153, 255, 153));
        BNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/glogin.png"))); // NOI18N
        BNext.setEnabled(false);
        BNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(BSiguiente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(LProfilePicture))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(TFMail, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BNext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(LProfilePicture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BNext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BSiguiente)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSiguienteActionPerformed
        // TODO add your handling code here:
         if(!emptyTextField()){
            generateProfilePicture("src/images/");
            user = TFMail.getText();
            TFMail.setText("");
            TFMail.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, false));
            BSiguiente.setVisible(false);
            BNext.setVisible(true);
         }
    }//GEN-LAST:event_BSiguienteActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
        VLogin.enableGAuth();
    }//GEN-LAST:event_formComponentHidden

    private void BNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNextActionPerformed
        // TODO add your handling code here:
        if(!emptyTextField()){
            password = TFMail.getText();
            this.setVisible(false);
            VLogin.gAuthSuccess(user,password);
        }
    }//GEN-LAST:event_BNextActionPerformed

    private void TFMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFMailKeyTyped
        // TODO add your handling code here:
        if(BSiguiente.isVisible()){
            char c=evt.getKeyChar();
            String caux = ""+c;
            caux = caux.toUpperCase();
            c = caux.charAt(0);
             evt.setKeyChar(c);
        }
        else{
            if(!TFMail.getText().isEmpty()){
                BNext.setEnabled(true);
            }
        }
    }//GEN-LAST:event_TFMailKeyTyped

    private void TFMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFMailKeyReleased
        // TODO add your handling code here:
        if(BSiguiente.isVisible()){
            String CC = TFMail.getText();
         if(!CC.contains("@GMAIL.COM")){
             TFMail.setBorder(BorderFactory.createLineBorder(Color.red, 2, true));
         }
         else{
            TFMail.setBorder(BorderFactory.createLineBorder(Color.green, 2, true));
            BSiguiente.setEnabled(true);
         }
        }
    }//GEN-LAST:event_TFMailKeyReleased

    public boolean emptyTextField(){
        boolean empty = TFMail.getText().isEmpty();
        if(empty)
            JOptionPane.showMessageDialog(null, "Campo Vacio", "Error", JOptionPane.ERROR_MESSAGE);
        return empty;
    }
    
    public void generateProfilePicture(String filePath) {
    try {
        // Obtener la primera letra del texto del JTextField
        String text = TFMail.getText();
        String firstLetter = text.substring(0, 1).toUpperCase();

        // Leer la imagen de usuario existente
        File file = new File(filePath + "/usuario.png");
        BufferedImage image = ImageIO.read(file);

        // Obtener las dimensiones de la imagen
        int width = image.getWidth();
        int height = image.getHeight();

        // Crear un objeto Graphics2D para dibujar sobre la imagen
        Graphics2D g2d = image.createGraphics();

        // Definir la fuente y el tamaño de la letra
        Font font = new Font("Roboto", Font.BOLD, 30);

        // Obtener las dimensiones del rectángulo que contendrá la letra
        FontMetrics metrics = g2d.getFontMetrics(font);
        int x = (width - metrics.stringWidth(firstLetter)) / 2;
        int y = ((height - metrics.getHeight()) / 2) + metrics.getAscent();

        // Dibujar la letra en el centro de la imagen
        g2d.setFont(font);
        g2d.setColor(Color.BLACK);
        g2d.drawString(firstLetter, x, y);

        // Guardar la imagen generada
        File outputFile = new File(filePath + "/guser_profile.png");
        ImageIO.write(image, "png", outputFile);

        // Actualizar el icono del JLabel
        ImageIcon icon = new ImageIcon(outputFile.getAbsolutePath());
        LProfilePicture.setIcon(icon);
    } catch (IOException ex) {
        System.out.println("Error al generar la imagen de perfil: " + ex.getMessage());
    }
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
            java.util.logging.Logger.getLogger(GoogleAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoogleAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoogleAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoogleAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoogleAuth().setVisible(true);
            }
        });
    }
Login VLogin;
private String user,password;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNext;
    private javax.swing.JButton BSiguiente;
    private javax.swing.JLabel LProfilePicture;
    private javax.swing.JTextField TFMail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
