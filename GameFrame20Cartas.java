package Memoramass;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class GameFrame20Cartas extends javax.swing.JFrame {

    private Logica20C log = new Logica20C();
    private boolean CaraVolt = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerCarta = false;
    private int puntaje = 0;
    
    public GameFrame20Cartas() {
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
        Boton13.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[12] + ".jpg")));
        Boton14.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[13] + ".jpg")));
        Boton15.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[14] + ".jpg")));
        Boton16.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[15] + ".jpg")));
        Boton17.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[16] + ".jpg")));
        Boton18.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[17] + ".jpg")));
        Boton19.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[18] + ".jpg")));
        Boton20.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagen/Imagen" + numbers[19] + ".jpg")));
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
        Boton13.setEnabled(true);
        Boton14.setEnabled(true);
        Boton15.setEnabled(true);
        Boton16.setEnabled(true);
        Boton17.setEnabled(true);
        Boton18.setEnabled(true);
        Boton19.setEnabled(true);
        Boton20.setEnabled(true);

        BotonReinicio.setEnabled(true);

        primerCarta = false;
        CaraVolt = false;
        puntaje = 0;
    }

    private void Ganar() {
        if (!Boton1.isEnabled() && !Boton2.isEnabled() && !Boton3.isEnabled() && !Boton4.isEnabled() && !Boton5.isEnabled() && !Boton6.isEnabled() && !Boton7.isEnabled() && !Boton8.isEnabled() && !Boton9.isEnabled() && !Boton10.isEnabled() && !Boton11.isEnabled() && !Boton12.isEnabled() && !Boton13.isEnabled() && !Boton14.isEnabled() && !Boton15.isEnabled() && !Boton16.isEnabled() && !Boton17.isEnabled() && !Boton18.isEnabled() && !Boton19.isEnabled() && !Boton20.isEnabled()) {
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
        Boton13 = new javax.swing.JButton();
        Boton14 = new javax.swing.JButton();
        Boton15 = new javax.swing.JButton();
        Boton16 = new javax.swing.JButton();
        Boton17 = new javax.swing.JButton();
        Boton18 = new javax.swing.JButton();
        Boton19 = new javax.swing.JButton();
        Boton20 = new javax.swing.JButton();
        BotonReinicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
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

        Boton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton13MouseExited(evt);
            }
        });
        Boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton13ActionPerformed(evt);
            }
        });

        Boton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton14MouseExited(evt);
            }
        });
        Boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton14ActionPerformed(evt);
            }
        });

        Boton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton15MouseExited(evt);
            }
        });
        Boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton15ActionPerformed(evt);
            }
        });

        Boton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton16MouseExited(evt);
            }
        });
        Boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton16ActionPerformed(evt);
            }
        });

        Boton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton17MouseExited(evt);
            }
        });
        Boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton17ActionPerformed(evt);
            }
        });

        Boton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton18MouseExited(evt);
            }
        });
        Boton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton18ActionPerformed(evt);
            }
        });

        Boton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton19MouseExited(evt);
            }
        });
        Boton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton19ActionPerformed(evt);
            }
        });

        Boton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oso.jpg"))); // NOI18N
        Boton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton20MouseExited(evt);
            }
        });
        Boton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton20ActionPerformed(evt);
            }
        });

        BotonReinicio.setBackground(new java.awt.Color(242, 233, 176));
        BotonReinicio.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BotonReinicio.setForeground(new java.awt.Color(27, 28, 38));
        BotonReinicio.setText("Reiniciar");
        BotonReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReinicioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Quicksand Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(150, 189, 168));
        jLabel1.setText("Memorama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boton17, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 154, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Boton10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton18, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton19, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addGap(33, 33, 33)
                            .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton17, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton18, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton20, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BotonReinicio)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        btnEnabled(Boton1);
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton10ActionPerformed
        btnEnabled(Boton10);
    }//GEN-LAST:event_Boton10ActionPerformed

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

    private void Boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton11ActionPerformed
        btnEnabled(Boton11);
    }//GEN-LAST:event_Boton11ActionPerformed

    private void Boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton12ActionPerformed
        btnEnabled(Boton12);
    }//GEN-LAST:event_Boton12ActionPerformed

    private void Boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton13ActionPerformed
        btnEnabled(Boton13);
    }//GEN-LAST:event_Boton13ActionPerformed

    private void Boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton14ActionPerformed
        btnEnabled(Boton14);
    }//GEN-LAST:event_Boton14ActionPerformed

    private void Boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton15ActionPerformed
        btnEnabled(Boton15);
    }//GEN-LAST:event_Boton15ActionPerformed

    private void Boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton16ActionPerformed
        btnEnabled(Boton16);
    }//GEN-LAST:event_Boton16ActionPerformed

    private void Boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton17ActionPerformed
        btnEnabled(Boton17);
    }//GEN-LAST:event_Boton17ActionPerformed

    private void Boton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton18ActionPerformed
        btnEnabled(Boton18);
    }//GEN-LAST:event_Boton18ActionPerformed

    private void Boton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton19ActionPerformed
        btnEnabled(Boton19);
    }//GEN-LAST:event_Boton19ActionPerformed

    private void Boton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton20ActionPerformed
        btnEnabled(Boton20);
    }//GEN-LAST:event_Boton20ActionPerformed

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

    private void Boton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton13MouseExited
        Comparar();
    }//GEN-LAST:event_Boton13MouseExited

    private void Boton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton14MouseExited
        Comparar();
    }//GEN-LAST:event_Boton14MouseExited

    private void Boton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton15MouseExited
        Comparar();
    }//GEN-LAST:event_Boton15MouseExited

    private void Boton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton16MouseExited
        Comparar();
    }//GEN-LAST:event_Boton16MouseExited

    private void Boton17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton17MouseExited
        Comparar();
    }//GEN-LAST:event_Boton17MouseExited

    private void Boton18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton18MouseExited
        Comparar();
    }//GEN-LAST:event_Boton18MouseExited

    private void Boton19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton19MouseExited
        Comparar();
    }//GEN-LAST:event_Boton19MouseExited

    private void Boton20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton20MouseExited
        Comparar();
    }//GEN-LAST:event_Boton20MouseExited

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
            java.util.logging.Logger.getLogger(GameFrame20Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame20Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame20Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame20Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame20Cartas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton10;
    private javax.swing.JButton Boton11;
    private javax.swing.JButton Boton12;
    private javax.swing.JButton Boton13;
    private javax.swing.JButton Boton14;
    private javax.swing.JButton Boton15;
    private javax.swing.JButton Boton16;
    private javax.swing.JButton Boton17;
    private javax.swing.JButton Boton18;
    private javax.swing.JButton Boton19;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton20;
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
