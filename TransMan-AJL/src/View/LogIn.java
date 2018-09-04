/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.alee.laf.progressbar.WebProgressBar;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import keeptoo.Drag;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author JoseM
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
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

        panelRoot = new javax.swing.JPanel();
        kPanelLogin = new keeptoo.KGradientPanel();
        tfUserName = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btLogin = new keeptoo.KButton();
        btExit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbUserIconLogin = new javax.swing.JLabel();
        kPanelLoading = new keeptoo.KGradientPanel();
        lbUserNameLoad = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbUserIconLoad = new javax.swing.JLabel();
        webProgressBar1 = new com.alee.laf.progressbar.WebProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRoot.setLayout(new java.awt.CardLayout());

        kPanelLogin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        kPanelLogin.setkEndColor(new java.awt.Color(0, 245, 252));
        kPanelLogin.setkGradientFocus(300);
        kPanelLogin.setkStartColor(new java.awt.Color(0, 204, 0));
        kPanelLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kPanelLoginMouseDragged(evt);
            }
        });
        kPanelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kPanelLoginMousePressed(evt);
            }
        });
        kPanelLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kPanelLoginKeyPressed(evt);
            }
        });

        tfUserName.setBackground(new Color(0,0,0,0));
        tfUserName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfUserName.setOpaque(false);
        tfUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserNameActionPerformed(evt);
            }
        });

        tfPassword.setBackground(new Color(0,0,0,0));
        tfPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfPassword.setOpaque(false);
        tfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPasswordFocusGained(evt);
            }
        });

        jLabel1.setText("Nome Do utilizador");

        jLabel2.setText("Palavra Passe");

        btLogin.setText("Iniciar Sessão");
        btLogin.setkBorderRadius(35);
        btLogin.setkForeGround(new java.awt.Color(0, 0, 0));
        btLogin.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btLogin.setkHoverStartColor(new java.awt.Color(51, 255, 102));
        btLogin.setkPressedColor(new java.awt.Color(0, 255, 102));
        btLogin.setkSelectedColor(new java.awt.Color(102, 255, 255));
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        btExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btExit.setForeground(new java.awt.Color(255, 255, 255));
        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/icons8_Close_Window_20px.png"))); // NOI18N
        btExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExitMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("TransmanAJL");

        jLabel5.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/Logo250x100.png"))); // NOI18N

        lbUserIconLogin.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        lbUserIconLogin.setForeground(new java.awt.Color(102, 102, 102));
        lbUserIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/icons8_Male_User_60px.png"))); // NOI18N

        javax.swing.GroupLayout kPanelLoginLayout = new javax.swing.GroupLayout(kPanelLogin);
        kPanelLogin.setLayout(kPanelLoginLayout);
        kPanelLoginLayout.setHorizontalGroup(
            kPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kPanelLoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(kPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kPanelLoginLayout.createSequentialGroup()
                                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kPanelLoginLayout.createSequentialGroup()
                                .addGroup(kPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPassword)
                                    .addComponent(tfUserName)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(166, 166, 166))))
                    .addGroup(kPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExit))))
            .addGroup(kPanelLoginLayout.createSequentialGroup()
                .addGroup(kPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kPanelLoginLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel5))
                    .addGroup(kPanelLoginLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(lbUserIconLogin)))
                .addGap(0, 158, Short.MAX_VALUE))
        );
        kPanelLoginLayout.setVerticalGroup(
            kPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kPanelLoginLayout.createSequentialGroup()
                .addGroup(kPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExit)
                    .addGroup(kPanelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUserIconLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelRoot.add(kPanelLogin, "card2");

        kPanelLoading.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        kPanelLoading.setkEndColor(new java.awt.Color(0, 245, 252));
        kPanelLoading.setkGradientFocus(300);
        kPanelLoading.setkStartColor(new java.awt.Color(0, 204, 0));
        kPanelLoading.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                kPanelLoadingAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        kPanelLoading.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kPanelLoadingMouseDragged(evt);
            }
        });
        kPanelLoading.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kPanelLoadingMousePressed(evt);
            }
        });
        kPanelLoading.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kPanelLoadingKeyPressed(evt);
            }
        });

        lbUserNameLoad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUserNameLoad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUserNameLoad.setText("Nome Do utilizador");

        jLabel8.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("TransmanAJL");

        jLabel9.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/Logo250x100.png"))); // NOI18N

        lbUserIconLoad.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        lbUserIconLoad.setForeground(new java.awt.Color(102, 102, 102));
        lbUserIconLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/icons8_Male_User_60px.png"))); // NOI18N

        webProgressBar1.setValue(3);
        webProgressBar1.setBgBottom(new java.awt.Color(51, 255, 204));
        webProgressBar1.setProgressTopColor(new java.awt.Color(51, 255, 102));
        webProgressBar1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                webProgressBar1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout kPanelLoadingLayout = new javax.swing.GroupLayout(kPanelLoading);
        kPanelLoading.setLayout(kPanelLoadingLayout);
        kPanelLoadingLayout.setHorizontalGroup(
            kPanelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kPanelLoadingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kPanelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kPanelLoadingLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kPanelLoadingLayout.createSequentialGroup()
                        .addGap(0, 101, Short.MAX_VALUE)
                        .addGroup(kPanelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kPanelLoadingLayout.createSequentialGroup()
                                .addComponent(lbUserNameLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kPanelLoadingLayout.createSequentialGroup()
                                .addComponent(webProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))))))
            .addGroup(kPanelLoadingLayout.createSequentialGroup()
                .addGroup(kPanelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kPanelLoadingLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel9))
                    .addGroup(kPanelLoadingLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(lbUserIconLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kPanelLoadingLayout.setVerticalGroup(
            kPanelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kPanelLoadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUserIconLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(lbUserNameLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(webProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        panelRoot.add(kPanelLoading, "card2");

        getContentPane().add(panelRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserNameActionPerformed

    private void kPanelLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kPanelLoginKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_kPanelLoginKeyPressed

    private void kPanelLoginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kPanelLoginMouseDragged
        // TODO add your handling code here:
        new Drag(kPanelLogin).moveWindow(evt);
    }//GEN-LAST:event_kPanelLoginMouseDragged

    private void kPanelLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kPanelLoginMousePressed
        // TODO add your handling code here:
        new Drag(kPanelLogin).onPress(evt);
    }//GEN-LAST:event_kPanelLoginMousePressed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        // TODO add your handling code here:
            
            
            panelRoot.removeAll();
            panelRoot.add(kPanelLoading);
            if(tfUserName.getText().equalsIgnoreCase("josemanuel")){
            lbUserIconLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/josemanuel.png")));}else
            if(tfUserName.getText().equalsIgnoreCase("arleybebe"))
            lbUserIconLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/arleybebe.png")));else
            if(tfUserName.getText().equalsIgnoreCase("luismabjaia"))
            lbUserIconLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/luismabjaia.png")));else
            lbUserIconLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/icons8_Male_User_60px.png")));
            lbUserNameLoad.setText(tfUserName.getText());
            panelRoot.repaint();
            panelRoot.revalidate();
            //webProgressBar1.setValue(50);
            
           /*this.dispose();
            Loading loa=new Loading();
            loa.setVisible(true);*/
         
            
    }//GEN-LAST:event_btLoginActionPerformed

    private void btExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btExitMouseClicked

    private void kPanelLoadingMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kPanelLoadingMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_kPanelLoadingMouseDragged

    private void kPanelLoadingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kPanelLoadingMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_kPanelLoadingMousePressed

    private void kPanelLoadingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kPanelLoadingKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_kPanelLoadingKeyPressed

    private void kPanelLoadingAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_kPanelLoadingAncestorAdded
        //timer.start();
        
       Timer timer = new Timer(20, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    barLoading();
                    index++;
                    if (index > 100) {
                        ((Timer)e.getSource()).stop();
                        System.out.println("Timer Ended");
                        finishScreen();
                        Home home=new Home();
                        home.setVisible(true);
                        
                    }
                }
            });
            timer.setInitialDelay(0);
            timer.start();
            System.out.println("Timer ended");
        
    }//GEN-LAST:event_kPanelLoadingAncestorAdded

    private void webProgressBar1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_webProgressBar1AncestorAdded
        // TODO add your handling code here:
         /*for (int i = 0; i <= 100; i++) {
            try {
                //Pause for
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Print a message
            System.out.println("Loading Nr :"+i);
            webProgressBar1.setValue(i);
            panelRoot.repaint();
            panelRoot.revalidate();
            kPanelLoading.repaint();
            kPanelLoading.revalidate();
            webProgressBar1.setVisible(false);
            webProgressBar1.repaint();
            webProgressBar1.revalidate();
             System.out.println("Next");
             
        }*/
    }//GEN-LAST:event_webProgressBar1AncestorAdded

    private void tfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusGained
        // TODO add your handling code here:
        if(tfUserName.getText().equalsIgnoreCase("josemanuel"))
            lbUserIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/josemanuel.png")));else
        if(tfUserName.getText().equalsIgnoreCase("arleybebe"))
            lbUserIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/arleybebe.png")));else
        if(tfUserName.getText().equalsIgnoreCase("luismabjaia"))
            lbUserIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/luismabjaia.png")));else
            lbUserIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/icons8_Male_User_60px.png")));
    }//GEN-LAST:event_tfPasswordFocusGained

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
    
    public void barLoading()  {
            
            webProgressBar1.setValue(index);
            kPanelLoading.repaint();
            kPanelLoading.validate();
            kPanelLoading.revalidate();
            
            webProgressBar1.repaint();
            webProgressBar1.validate();
            webProgressBar1.revalidate();
             System.out.println("Next "+index);
             
          
    }
    
    public void finishScreen(){
        this.dispose();
    }
    
    private Timer timer;
    private int index=0;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btExit;
    private keeptoo.KButton btLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kPanelLoading;
    private keeptoo.KGradientPanel kPanelLogin;
    private javax.swing.JLabel lbUserIconLoad;
    private javax.swing.JLabel lbUserIconLogin;
    private javax.swing.JLabel lbUserNameLoad;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUserName;
    private com.alee.laf.progressbar.WebProgressBar webProgressBar1;
    // End of variables declaration//GEN-END:variables
}
