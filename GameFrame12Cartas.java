package Memoramass;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GameFrame12Cartas extends javax.swing.JFrame {

    private Logica12C log = new Logica12C();
    private boolean CaraVolt = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerCarta = false;
    private int puntaje = 0;

    public GameFrame12Cartas() {
        initComponents();

        CartasT();
    }

    private void CartasT() {
        int[] numbers = log.getCardNumbers();

        Boton1.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[0] + ".jpg")));
        Boton2.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[1] + ".jpg")));
        Boton3.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[2] + ".jpg")));
        Boton4.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[3] + ".jpg")));
        Boton5.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[4] + ".jpg")));
        Boton6.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[5] + ".jpg")));
        Boton7.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[6] + ".jpg")));
        Boton8.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[7] + ".jpg")));
        Boton9.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[8] + ".jpg")));
        Boton10.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[9] + ".jpg")));
        Boton11.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[10] + ".jpg")));
        Boton12.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[11] + ".jpg")));
    }

    private void btnEnabled(JButton btn) {
        if (!CaraVolt) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            CaraVolt = true;
            primerCarta = false;
        } else {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerCarta = true;
            puntaje += 20;
            Ganar();
        }
    }

    private void Comparar() {
        if (CaraVolt && primerCarta) {
            if (im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);

                if (puntaje > 10) {
                    puntaje -= 10;
                }
            }

            CaraVolt = false;
        }
    }

    private void Reiniciar() {
        Boton1.setEnabled(true);
        Boton2.setEnabled(true);
        Boton3.setEnabled(true);
        Boton4.setEnabled(true);
        Boton5.setEnabled(true);
        Boton6.setEnabled(true);
        Boton7.setEnabled(true);
        Boton8.setEnabled(true);
        Boton9.setEnabled(true);
        Boton10.setEnabled(true);
        Boton11.setEnabled(true);
        Boton12.setEnabled(true);
        BotonReinicio.setEnabled(true);

        primerCarta = false;
        CaraVolt = false;
        puntaje = 0;
    }

    private void Ganar() {
        if (!Boton1.isEnabled() && !Boton2.isEnabled() && !Boton3.isEnabled() && !Boton4.isEnabled() && !Boton5.isEnabled() && !Boton6.isEnabled() && !Boton7.isEnabled() && !Boton8.isEnabled() && !Boton9.isEnabled() && !Boton10.isEnabled() && !Boton11.isEnabled() && !Boton12.isEnabled()) {
            JOptionPane.showMessageDialog(this, "Ganaste con una puntuación de " + puntaje);
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
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        Boton10 = new javax.swing.JButton();
        Boton11 = new javax.swing.JButton();
        Boton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotonReinicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 153));

        Boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton1.setToolTipText("");
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
        Boton2.setToolTipText("");
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
        Boton3.setToolTipText("");
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
        Boton4.setToolTipText("");
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
        Boton5.setToolTipText("");
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
        Boton6.setToolTipText("");
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

        Boton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton7.setToolTipText("");
        Boton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton7MouseExited(evt);
            }
        });
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        Boton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton8.setToolTipText("");
        Boton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton8MouseExited(evt);
            }
        });
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });

        Boton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton9.setToolTipText("");
        Boton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton9MouseExited(evt);
            }
        });
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });

        Boton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton10.setToolTipText("");
        Boton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton10MouseExited(evt);
            }
        });
        Boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton10ActionPerformed(evt);
            }
        });

        Boton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton11.setToolTipText("");
        Boton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton11MouseExited(evt);
            }
        });
        Boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton11ActionPerformed(evt);
            }
        });

        Boton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton12.setToolTipText("");
        Boton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton12MouseExited(evt);
            }
        });
        Boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton12ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Quicksand Bold", 0, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 134, 52));
        jLabel1.setText("Memorama");

        BotonReinicio.setBackground(new java.awt.Color(255, 249, 222));
        BotonReinicio.setFont(new java.awt.Font("Quicksand Bold", 0, 18)); // NOI18N
        BotonReinicio.setForeground(new java.awt.Color(150, 108, 128));
        BotonReinicio.setText("Reiniciar");
        BotonReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReinicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(BotonReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton1))
                    .addComponent(Boton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Boton6)
                        .addComponent(Boton7)
                        .addComponent(Boton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton11)
                    .addComponent(Boton10)
                    .addComponent(Boton12))
                .addGap(18, 18, 18)
                .addComponent(BotonReinicio)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        btnEnabled(Boton1);
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        btnEnabled(Boton2);
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        btnEnabled(Boton3);
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        btnEnabled(Boton4);
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        btnEnabled(Boton5);
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        btnEnabled(Boton6);
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        btnEnabled(Boton7);
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        btnEnabled(Boton8);
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        btnEnabled(Boton9);
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton10ActionPerformed
        btnEnabled(Boton10);
    }//GEN-LAST:event_Boton10ActionPerformed

    private void Boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton11ActionPerformed
        btnEnabled(Boton11);
    }//GEN-LAST:event_Boton11ActionPerformed

    private void Boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton12ActionPerformed
        btnEnabled(Boton12);
    }//GEN-LAST:event_Boton12ActionPerformed

    private void Boton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton1MouseExited
        Comparar();
    }//GEN-LAST:event_Boton1MouseExited

    private void Boton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MouseExited
        Comparar();
    }//GEN-LAST:event_Boton2MouseExited

    private void Boton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton3MouseExited
        Comparar();
    }//GEN-LAST:event_Boton3MouseExited

    private void Boton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton4MouseExited
        Comparar();
    }//GEN-LAST:event_Boton4MouseExited

    private void Boton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton5MouseExited
        Comparar();
    }//GEN-LAST:event_Boton5MouseExited

    private void Boton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton6MouseExited
        Comparar();
    }//GEN-LAST:event_Boton6MouseExited

    private void Boton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton7MouseExited
        Comparar();
    }//GEN-LAST:event_Boton7MouseExited

    private void Boton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton8MouseExited
        Comparar();
    }//GEN-LAST:event_Boton8MouseExited

    private void Boton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton9MouseExited
        Comparar();
    }//GEN-LAST:event_Boton9MouseExited

    private void Boton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton10MouseExited
        Comparar();
    }//GEN-LAST:event_Boton10MouseExited

    private void Boton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton11MouseExited
        Comparar();
    }//GEN-LAST:event_Boton11MouseExited

    private void Boton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton12MouseExited
        Comparar();
    }//GEN-LAST:event_Boton12MouseExited

    private void BotonReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReinicioActionPerformed
        Reiniciar();
    }//GEN-LAST:event_BotonReinicioActionPerformed

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
            java.util.logging.Logger.getLogger(GameFrame12Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame12Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame12Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame12Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame12Cartas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton10;
    private javax.swing.JButton Boton11;
    private javax.swing.JButton Boton12;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonReinicio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
