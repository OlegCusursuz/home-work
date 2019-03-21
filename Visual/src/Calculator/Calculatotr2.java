package Calculator;

public class Calculatotr2 extends javax.swing.JFrame {

    public Calculatotr2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResult = new javax.swing.JTextField();
        btnShapte = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnOpt = new javax.swing.JButton();
        btnModul = new javax.swing.JButton();
        btnNoua = new javax.swing.JButton();
        btnMultiplay = new javax.swing.JButton();
        btnShare = new javax.swing.JButton();
        btnCinci = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnDoua = new javax.swing.JButton();
        btnUne = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btnPatru = new javax.swing.JButton();
        btnTrei = new javax.swing.JButton();
        btnPunkt = new javax.swing.JButton();
        btnShase = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        txtResult.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtResult.setToolTipText("");
        txtResult.setEnabled(false);
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        btnShapte.setText("7");
        btnShapte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShapteActionPerformed(evt);
            }
        });

        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnOpt.setText("8");
        btnOpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptActionPerformed(evt);
            }
        });

        btnModul.setText("%");
        btnModul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModulActionPerformed(evt);
            }
        });

        btnNoua.setText("9");
        btnNoua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNouaActionPerformed(evt);
            }
        });

        btnMultiplay.setText("*");
        btnMultiplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplayActionPerformed(evt);
            }
        });

        btnShare.setText("/");
        btnShare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShareActionPerformed(evt);
            }
        });

        btnCinci.setText("5");
        btnCinci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCinciActionPerformed(evt);
            }
        });

        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnDoua.setText("2");
        btnDoua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDouaActionPerformed(evt);
            }
        });

        btnUne.setText("1");
        btnUne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUneActionPerformed(evt);
            }
        });

        btnPlusMinus.setText("+/-");
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });

        btnPatru.setText("4");
        btnPatru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatruActionPerformed(evt);
            }
        });

        btnTrei.setText("3");
        btnTrei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreiActionPerformed(evt);
            }
        });

        btnPunkt.setText(".");
        btnPunkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPunktActionPerformed(evt);
            }
        });

        btnShase.setText("6");
        btnShase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShaseActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnResult.setText("=");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jDelete.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jDelete.setText("←");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnShapte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPatru, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnModul, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCinci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDoua, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addComponent(btnZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNoua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTrei, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPunkt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btnShase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnShare, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMultiplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMinus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPlus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnShare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShapte, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnOpt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNoua, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMultiplay, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPatru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCinci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDoua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUne, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTrei, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPlus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPunkt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    double num, total;
    int calculation;
    int punct = 0;
    double sum = 0;
    boolean result = true;
    boolean lucr = false;


    private void btnShareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShareActionPerformed
        if (lucr) {
            if (result) {
                num = Double.parseDouble(txtResult.getText());
                calculation = '/';
                txtResult.setText("");
                jLabel1.setText(num + "/");
                punct = 0;
                result = false;
            } else {
                arithmeticOperation();
                calculation = '/';
                jLabel1.setText(num + "/");
                punct = 0;
            }
            lucr = false;
        }

    }//GEN-LAST:event_btnShareActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        txtResult.setText("");
        jLabel1.setText("");
        result = true;
        calculation = '0';
        total = 0.0;


    }//GEN-LAST:event_btnCEActionPerformed

    private void btnModulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModulActionPerformed
        if (lucr) {
            if (result) {
                num = Double.parseDouble(txtResult.getText());
                calculation = '%';
                txtResult.setText("");
                jLabel1.setText(num + "%");
                punct = 0;
                result = false;
            } else {
                arithmeticOperation();
                calculation = '%';
                jLabel1.setText(num + "%");
                punct = 0;
            }
            lucr = false;
        }
    }//GEN-LAST:event_btnModulActionPerformed

    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinusActionPerformed
        if (txtResult.getText().length() > 0) {
            txtResult.setText(Double.parseDouble(txtResult.getText()) * -1 + "");
        }
    }//GEN-LAST:event_btnPlusMinusActionPerformed

    private void btnMultiplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplayActionPerformed
        if (lucr) {
            if (result) {
                num = Double.parseDouble(txtResult.getText());
                calculation = '*';
                txtResult.setText("");
                jLabel1.setText(num + "*");
                punct = 0;
                result = false;
            } else {
                arithmeticOperation();
                calculation = '*';
                jLabel1.setText(num + "*");
                punct = 0;
            }
            lucr = false;
        }
    }//GEN-LAST:event_btnMultiplayActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        if (lucr) {
            if (result) {
                num = Double.parseDouble(txtResult.getText());
                calculation = '-';
                txtResult.setText("");
                jLabel1.setText(num + "-");
                punct = 0;
                result = false;
            } else {
                arithmeticOperation();
                calculation = '-';
                jLabel1.setText(num + "-");
                punct = 0;
            }
            lucr = false;
        }
    }//GEN-LAST:event_btnMinusActionPerformed

    public void arithmeticOperation() {

        switch (calculation) {
            case '+':
                total = num + Double.parseDouble(txtResult.getText());
                num = total;
                txtResult.setText("");
                jLabel1.setText(total + "");
                break;
            case '-':
                total = num - Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                jLabel1.setText(total + "");
                num = total;
                break;
            case '*':
                total = num * Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                jLabel1.setText(total + "");
                num = total;
                break;
            case '/':
                total = num / Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                jLabel1.setText(total + "");
                num = total;
                break;
            case '%':
                total = num % Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                jLabel1.setText(total + "");
                num = total;
                break;

        }

    }
    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        if (lucr) {
            if (result) {
                num = Double.parseDouble(txtResult.getText());
                calculation = '+';
                txtResult.setText("");
                jLabel1.setText(num + "+");
                punct = 0;
                result = false;
            } else {
                arithmeticOperation();
                calculation = '+';
                jLabel1.setText(num + "+");
                punct = 0;
            }
            lucr = false;
        }
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        if (txtResult.getText().length() > 0) {
            arithmeticOperation();
            txtResult.setText(total + "");
            jLabel1.setText("");
            punct = 0;
            result = true;
            lucr = true;
        }
    }//GEN-LAST:event_btnResultActionPerformed

    private void btnPunktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPunktActionPerformed
        lucr = true;
        if (punct == 0) {
            txtResult.setText(txtResult.getText() + ".");
            punct++;
        } else {
            txtResult.setText(txtResult.getText());
        }
    }//GEN-LAST:event_btnPunktActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        lucr = true;
        if (txtResult.getText().equals("0")) {
            txtResult.setText(0 + "");
        } else {
            txtResult.setText(txtResult.getText() + "0");
        }
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnUneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUneActionPerformed
        txtResult.setText(txtResult.getText() + "1");
        lucr = true;
    }//GEN-LAST:event_btnUneActionPerformed

    private void btnDouaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDouaActionPerformed
        lucr = true;
        txtResult.setText(txtResult.getText() + "2");
    }//GEN-LAST:event_btnDouaActionPerformed

    private void btnTreiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreiActionPerformed
        lucr = true;
        txtResult.setText(txtResult.getText() + "3");
    }//GEN-LAST:event_btnTreiActionPerformed

    private void btnPatruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatruActionPerformed
        lucr = true;
        txtResult.setText(txtResult.getText() + "4");
    }//GEN-LAST:event_btnPatruActionPerformed

    private void btnCinciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCinciActionPerformed
        lucr = true;
        txtResult.setText(txtResult.getText() + "5");
    }//GEN-LAST:event_btnCinciActionPerformed

    private void btnShaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShaseActionPerformed
        lucr = true;
        txtResult.setText(txtResult.getText() + "6");
    }//GEN-LAST:event_btnShaseActionPerformed

    private void btnShapteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShapteActionPerformed
        lucr = true;
        txtResult.setText(txtResult.getText() + "7");
    }//GEN-LAST:event_btnShapteActionPerformed

    private void btnOptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptActionPerformed
        lucr = true;
        txtResult.setText(txtResult.getText() + "8");
    }//GEN-LAST:event_btnOptActionPerformed

    private void btnNouaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNouaActionPerformed
        lucr = true;
        txtResult.setText(txtResult.getText() + "9");
    }//GEN-LAST:event_btnNouaActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed

    }//GEN-LAST:event_txtResultActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        if(txtResult.getText().length() > 0){
        String deleteString = txtResult.getText().substring(0, txtResult.getText().length()-1);
        txtResult.setText(deleteString);
        }
        
    }//GEN-LAST:event_jDeleteActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Calculatotr2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculatotr2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculatotr2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculatotr2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculatotr2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCinci;
    private javax.swing.JButton btnDoua;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnModul;
    private javax.swing.JButton btnMultiplay;
    private javax.swing.JButton btnNoua;
    private javax.swing.JButton btnOpt;
    private javax.swing.JButton btnPatru;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnPunkt;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnShapte;
    private javax.swing.JButton btnShare;
    private javax.swing.JButton btnShase;
    private javax.swing.JButton btnTrei;
    private javax.swing.JButton btnUne;
    private javax.swing.JButton btnZero;
    private javax.swing.JButton jDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
