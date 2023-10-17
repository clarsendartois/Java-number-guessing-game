/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Toolkit;

import Classes.GuessNumbers;
import Classes.Gui;

/**
 *
 * @author darto
 */
public class GuessingGame extends javax.swing.JFrame {

    /**
     * Creates new form GuessingGame
     */
    public GuessingGame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_reset = new javax.swing.JLabel();
        l_bestscore = new javax.swing.JLabel();
        l_score = new javax.swing.JLabel();
        l_guess = new javax.swing.JLabel();
        l_life = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        f_guess = new javax.swing.JTextField();
        l_showRandom = new javax.swing.JLabel();
        l_show = new javax.swing.JLabel();
        l_unshow = new javax.swing.JLabel();
        l_remarks = new javax.swing.JLabel();
        btn_newRandom = new javax.swing.JButton();
        btn_guess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUESSING GAME");
        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(350, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/reset.png"))); // NOI18N
        l_reset.setToolTipText("Reset");
        l_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_resetMouseClicked(evt);
            }
        });
        getContentPane().add(l_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 13, 30, 30));

        l_bestscore.setFont(new java.awt.Font("DS-Digital", 3, 36)); // NOI18N
        l_bestscore.setForeground(new java.awt.Color(255, 255, 255));
        l_bestscore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_bestscore.setText("Best Score: 0");
        getContentPane().add(l_bestscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, 220, -1));

        l_score.setFont(new java.awt.Font("DS-Digital", 3, 24)); // NOI18N
        l_score.setForeground(new java.awt.Color(255, 255, 255));
        l_score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_score.setText("Score: 0");
        getContentPane().add(l_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        l_guess.setFont(new java.awt.Font("DS-Digital", 3, 24)); // NOI18N
        l_guess.setForeground(new java.awt.Color(255, 255, 255));
        l_guess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_guess.setText("Guesses: 0");
        getContentPane().add(l_guess, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 120, -1));

        l_life.setFont(new java.awt.Font("DS-Digital", 3, 24)); // NOI18N
        l_life.setForeground(new java.awt.Color(255, 255, 255));
        l_life.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_life.setText("    Life: 0");
        getContentPane().add(l_life, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 110, -1));

        jLabel6.setFont(new java.awt.Font("DS-Digital", 3, 45)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Guess the Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 350, 40));

        jLabel7.setFont(new java.awt.Font("DS-Digital", 3, 45)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("between 1 and 100");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 350, 40));

        jLabel9.setFont(new java.awt.Font("DS-Digital", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enter a number (1-100)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 350, 40));

        f_guess.setBackground(new java.awt.Color(255, 255, 255));
        f_guess.setFont(new java.awt.Font("DS-Digital", 3, 100)); // NOI18N
        f_guess.setForeground(new java.awt.Color(0, 102, 255));
        f_guess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f_guess.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 102, 255)));
        f_guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_guessActionPerformed(evt);
            }
        });
        f_guess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                f_guessKeyTyped(evt);
            }
        });
        getContentPane().add(f_guess, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 156, 130));

        l_showRandom.setFont(new java.awt.Font("DS-Digital", 3, 48)); // NOI18N
        l_showRandom.setForeground(new java.awt.Color(0, 102, 255));
        l_showRandom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_showRandom.setText("?");
        l_showRandom.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 102, 255)));
        getContentPane().add(l_showRandom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 75, -1));

        l_show.setBackground(new java.awt.Color(255, 255, 255));
        l_show.setFont(new java.awt.Font("DS-Digital", 3, 48)); // NOI18N
        l_show.setForeground(new java.awt.Color(255, 153, 0));
        l_show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/vision_view_eye_icon_153887.png"))); // NOI18N
        l_show.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        l_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_showMouseClicked(evt);
            }
        });
        getContentPane().add(l_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 75, -1));

        l_unshow.setBackground(new java.awt.Color(255, 255, 255));
        l_unshow.setFont(new java.awt.Font("DS-Digital", 3, 48)); // NOI18N
        l_unshow.setForeground(new java.awt.Color(255, 153, 0));
        l_unshow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_unshow.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/Asset/disable_eye_hidden_hide_internet_security_view_icon_127055.png"))); // NOI18N
        l_unshow.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        l_unshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_unshowMouseClicked(evt);
            }
        });
        getContentPane().add(l_unshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 75, -1));

        l_remarks.setBackground(new java.awt.Color(255, 255, 255));
        l_remarks.setFont(new java.awt.Font("DS-Digital", 3, 18)); // NOI18N
        l_remarks.setForeground(new java.awt.Color(204, 0, 0));
        l_remarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_remarks.setText("-------- Try Your luck --------");
        l_remarks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null,
                java.awt.Color.white, null, java.awt.Color.white));
        l_remarks.setOpaque(true);
        getContentPane().add(l_remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 350, 30));

        btn_newRandom.setBackground(new java.awt.Color(255, 255, 255));
        btn_newRandom.setFont(new java.awt.Font("DS-Digital", 3, 36)); // NOI18N
        btn_newRandom.setForeground(new java.awt.Color(255, 153, 0));
        btn_newRandom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/shuffle.png"))); // NOI18N
        btn_newRandom.setText("  New");
        btn_newRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newRandomActionPerformed(evt);
            }
        });
        getContentPane().add(btn_newRandom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 170, 40));

        btn_guess.setBackground(new java.awt.Color(255, 255, 255));
        btn_guess.setFont(new java.awt.Font("DS-Digital", 3, 36)); // NOI18N
        btn_guess.setForeground(new java.awt.Color(255, 153, 0));
        btn_guess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/check.png"))); // NOI18N
        btn_guess.setText("Guess");
        btn_guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guessActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guess, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l_resetMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_l_resetMouseClicked
        // TODO add your handling code here:
        Object[] options = { "YES", "NON" };
        int x = JOptionPane.showOptionDialog(this, "Are you sure you want to reset (yes/no)?", "MESSAGE",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);

    }// GEN-LAST:event_l_resetMouseClicked

    private void f_guessKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_f_guessKeyTyped
        // TODO add your handling code here:
        Gui._integerOnly(evt);
    }// GEN-LAST:event_f_guessKeyTyped

    private void l_unshowMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_l_unshowMouseClicked
        // TODO add your handling code here:
        l_show.setEnabled(true);
        l_unshow.setEnabled(false);
        l_showRandom.setText("?");
    }// GEN-LAST:event_l_unshowMouseClicked

    private void l_showMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_l_showMouseClicked
        // TODO add your handling code here:
        l_show.setEnabled(false);
        l_unshow.setEnabled(true);
        l_showRandom.setText(String.valueOf(random));
    }// GEN-LAST:event_l_showMouseClicked

    private void btn_guessActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_guessActionPerformed
        // TODO add your handling code here:
        guess();
    }// GEN-LAST:event_btn_guessActionPerformed

    private void f_guessActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_f_guessActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_f_guessActionPerformed

    private void btn_newRandomActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_newRandomActionPerformed
        // TODO add your handling code here:
        randomNew();
    }// GEN-LAST:event_btn_newRandomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guess;
    private javax.swing.JButton btn_newRandom;
    private javax.swing.JTextField f_guess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l_bestscore;
    private javax.swing.JLabel l_guess;
    private javax.swing.JLabel l_life;
    private javax.swing.JLabel l_remarks;
    private javax.swing.JLabel l_reset;
    private javax.swing.JLabel l_score;
    private javax.swing.JLabel l_show;
    private javax.swing.JLabel l_showRandom;
    private javax.swing.JLabel l_unshow;
    // End of variables declaration//GEN-END:variables

    // Initialize Component
    Gui gui;

    // Variable
    private int random = 0, bestScore = 0, yourScore = 0, addCorrectScore = 3;
    private byte guessCount = 0, lifeCount = 10, greatThanError = 0, lessThanError = 0, countError = 3;

    private void init() {
        gui = new Gui();

        // Center
        Gui._centerFrame(this);

        // Icon
        gui.setIconFrame(this);

        // Load random number
        random = GuessNumbers._randomNumber();

        // Hide
        l_unshow.setEnabled(false);

        // Get best scores
        bestScore = Gui.getCurrentBestScore();
        l_bestscore.setText("Best Score: " + bestScore);
    }

    // Create new random
    private void randomNew() {
        random = GuessNumbers._randomNumber();

        // Clear field
        f_guess.setText("");
        f_guess.requestFocus();

        //
        l_unshow.setEnabled(false);
        l_show.setEnabled(true);
        l_showRandom.setEnabled(true);

    }

    private void guess() {
        // Validate user input
        if (f_guess.getText().equals("")) {
            Gui._message("Please enter your number", 0);
            f_guess.requestFocus();
        } else if (Integer.parseInt(f_guess.getText()) >= 101 || Integer.parseInt(f_guess.getText()) < 1) {
            Gui._message("Please enter number from 1-100!", 0);
            f_guess.setText("");
            f_guess.requestFocus();
        } else {
            int yourNumber = Integer.parseInt(f_guess.getText());
            if (yourNumber == random) {
                Gui._message("YOU WON! \nAdditional 3 life was added!", 1);
                yourScore++; // Increment correct number
                l_score.setText("Score: " + yourScore);

                // Add life
                lifeCount += addCorrectScore;
                l_life.setText("Life: " + lifeCount);

                // Check and update bestscore
                updateBestscore();

            } else {
                lifeCount--; // Count the error
                l_life.setText("Life: " + lifeCount);

                // Creating warning icon when life is less than 5
                if (lifeCount <= 4) {
                    l_life.setIcon(new ImageIcon(
                            Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Asset/warning.png"))));
                } else {
                    l_life.setIcon(null);
                }
                // Creating hint
                hint(random, yourNumber);

                // Check if lifecount reached to 0
                if (lifeCount == 0) {
                    Gui._message("You've used your life! \nPlease try again next time!", 0);
                    System.exit(0);
                }
            }
            // Count the guess
            guessCount++; // Increment guess
            l_guess.setText("Guesses: " + guessCount);
        }
    }

    // Creating hint
    private void hint(int _randomNumber, int yourNumber) {
        String mes;
        if (_randomNumber > yourNumber) {
            // Count
            lessThanError++;
            mes = messageHint(lessThanError, (byte) 1, yourNumber);
            l_remarks.setText(mes);
        } else {
            greatThanError++;
            mes = messageHint(greatThanError, (byte) 0, yourNumber);
            l_remarks.setText(mes);
        }

    }

    // Contains the message hint in array
    private String messageHint(byte errorCount, byte errorCatcher, int numGuess) {
        String message;
        switch (errorCatcher) {
            // For less than hint
            case 1:
                String messageCat[] = { String.valueOf(numGuess) + ", is less than the number. Observe!",
                        String.valueOf(numGuess) + ", is less than the number. Oh! Come on!",
                        String.valueOf(numGuess) + ", is less than the number. Don't give up!",
                        String.valueOf(numGuess) + ", is less than the number. Try again!"
                };
                // User only allows 2 errors to have the default message otherwise, the next
                // message will be dynamic
                if (errorCount < 2) {
                    message = String.valueOf(numGuess) + ", is less than the number.";
                } else {
                    // Make it dynamic messge out from category array
                    int randomMes = (int) Math.round(Math.random() * 3);
                    message = messageCat[randomMes];
                }
                break;

            // For greater than hint
            default:
                String messageCat1[] = { String.valueOf(numGuess) + ", is greater than the number. Observe!",
                        String.valueOf(numGuess) + ", is greater than the number. Oh! Come on!",
                        String.valueOf(numGuess) + ", is greater than the number. Don't give up!",
                        String.valueOf(numGuess) + ", is greater than the number. Try again!"
                };

                // User only allows 2 errors to have the default message otherwise, the next
                // message will be dynamic
                if (errorCount < 2) {
                    message = String.valueOf(numGuess) + ", is greater than the number!";
                } else {
                    // Make it dynamic messge out from category array
                    int randomMes = (int) Math.round(Math.random() * 3);
                    message = messageCat1[randomMes];
                }
                break;
        }

        return message;
    }

    // Update the best score
    private void updateBestscore() {
        if (yourScore > bestScore) {
            Gui._message("Congratulation! New Best Score!", 1);
            Gui.setNewBestScore("bestScore[" + yourScore + "]");
            bestScore = yourScore;
            l_bestscore.setText("Best Score: " + bestScore);
        }
    }

    // Creating new game
    private void newGame() {
        f_guess.setText("");
        f_guess.requestFocus();

        l_remarks.setText("-------- Try Your luck --------");
        l_unshow.setEnabled(false);
        l_show.setEnabled(true);
        l_showRandom.setText("?");
        l_guess.setText("Guesses: 0");
        guessCount = 0;

        l_life.setText("Life: 10");
        lifeCount = 10;

        greatThanError = 0;
        lessThanError = 0;

        random = GuessNumbers._randomNumber();
    }

    private void reset() {
        f_guess.setText("");
        f_guess.requestFocus();

        l_remarks.setText("-------- Try Your luck --------");
        l_unshow.setEnabled(false);
        l_show.setEnabled(true);
        l_showRandom.setText("?");
        l_guess.setText("Guesses: 0");
        guessCount = 0;

        l_life.setText("Life: 10");
        lifeCount = 10;

        greatThanError = 0;
        lessThanError = 0;

        random = GuessNumbers._randomNumber();

        l_score.setText("Score: 0");
        yourScore = 0;

    }
}
