package Memoramass;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class GameFrame6Cartas extends javax.swing.JFrame {
    
    private Logica6C log = new Logica6C();
    private boolean CaraVolt = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn =new JButton[2];
    private boolean primerCarta = false;
    private int puntaje = 0;
    
    

    public GameFrame6Cartas() {
        initComponents();
        
        CartasT();
    }
    
    private void CartasT(){
        int[] numbers = log.getCardNumbers();
        
        Boton1.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" +numbers[0]+".jpg")));
        Boton2.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" +numbers[1]+".jpg")));
        Boton3.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" +numbers[2]+".jpg")));
        Boton4.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" +numbers[3]+".jpg")));
        Boton5.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" +numbers[4]+".jpg")));
        Boton6.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" +numbers[5]+".jpg")));
    }
    
    private void btnEnabled(JButton btn){
        if(!CaraVolt){
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            CaraVolt = true;
            primerCarta= false;
        }
        
        else{
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerCarta = true;
            puntaje += 20;
            Ganar();
        }
    }
    
    private void Comparar(){
        if(CaraVolt && primerCarta){
            if (im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
            
                if(puntaje > 10) puntaje -= 10;
            }
            
            CaraVolt = false;
        }
    }
    
    private void Reiniciar(){
        Boton1.setEnabled(true);
        Boton2.setEnabled(true);
        Boton3.setEnabled(true);
        Boton4.setEnabled(true);
        Boton5.setEnabled(true);
        Boton6.setEnabled(true);
        Boton7.setEnabled(true);
        
        primerCarta = false;
        CaraVolt = false;
        puntaje = 0;
    }
    
    private void Ganar(){
        if(!Boton1.isEnabled() && !Boton2.isEnabled()  && !Boton3.isEnabled() && !Boton4.isEnabled() && !Boton5.isEnabled() && !Boton6.isEnabled()){
            JOptionPane.showMessageDialog(this, "Ganaste con una puntuación de "+puntaje);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Boton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(169, 204, 185));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setFont(new java.awt.Font("Quicksand Dash", 1, 36)); // NOI18N
        setForeground(java.awt.Color.white);
        setName(""); // NOI18N

        Boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton1.setName(""); // NOI18N
        Boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton1MouseExited(evt);
            }
        });
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton2.setName(""); // NOI18N
        Boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton2MouseExited(evt);
            }
        });
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton3.setName(""); // NOI18N
        Boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton3MouseExited(evt);
            }
        });
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        Boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton4.setName(""); // NOI18N
        Boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton4MouseExited(evt);
            }
        });
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        Boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton5.setName(""); // NOI18N
        Boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton5MouseExited(evt);
            }
        });
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });

        Boton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton6.setName(""); // NOI18N
        Boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton6MouseExited(evt);
            }
        });
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Quicksand Book", 0, 36)); // NOI18N
        jLabel1.setText("Memorama");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(null);

        Boton7.setBackground(new java.awt.Color(169, 204, 185));
        Boton7.setFont(new java.awt.Font("Quicksand Bold", 0, 15)); // NOI18N
        Boton7.setForeground(new java.awt.Color(0, 0, 0));
        Boton7.setText("Reiniciar");
        Boton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Boton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        btnEnabled(Boton1);
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton1MouseExited
        Comparar();
    }//GEN-LAST:event_Boton1MouseExited

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        btnEnabled(Boton2);
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MouseExited
        Comparar();
    }//GEN-LAST:event_Boton2MouseExited

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        btnEnabled(Boton3);
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton3MouseExited
        Comparar();
    }//GEN-LAST:event_Boton3MouseExited

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        btnEnabled(Boton4);
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton4MouseExited
        Comparar();
    }//GEN-LAST:event_Boton4MouseExited

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        btnEnabled(Boton5);
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton5MouseExited
        Comparar();
    }//GEN-LAST:event_Boton5MouseExited

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        btnEnabled(Boton6);
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton6MouseExited
        Comparar();
    }//GEN-LAST:event_Boton6MouseExited

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        Reiniciar();
    }//GEN-LAST:event_Boton7ActionPerformed

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
            java.util.logging.Logger.getLogger(GameFrame6Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame6Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame6Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame6Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame6Cartas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
