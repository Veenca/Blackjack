/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Famiglia Luisi
 */
public class Finestra extends javax.swing.JFrame {
static BET BET;
    int range = (52 - 1) + 1;
    int i = 0;
    int im;
    String tot = "0";
    String totmaz = "0";
    int mazz2;
    int much;

    /**
     * Creates new form Finestra
     */
    public Finestra() {
        initComponents();
       // pesca.setEnabled(!true);
       // stai.setEnabled(!true);
        novisible();
      //  Bet.setEnabled(false);
     
        boolean win = false;
        carta1.setBounds(100, 222, 30, 25);
        carta1.setBorder(new RoundedBorder(35)); //10 is the radius
        carta1.setBackground(Color.red);
        carta4.setBounds(100, 222, 30, 25);
        carta4.setBorder(new RoundedBorder(35)); //10 is the radius

        
//this.setEnabled(false);
assegna();
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
        jFrame1 = new javax.swing.JFrame();
        carta6 = new javax.swing.JButton();
        jPanel1 = new RoundedPanel(100);
        carta1 = new javax.swing.JButton();
        carta4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        carta3 = new javax.swing.JButton();
        carta2 = new javax.swing.JButton();
        pesca = new javax.swing.JButton();
        stai = new javax.swing.JButton();
        carta5 = new javax.swing.JButton();
        carta7 = new javax.swing.JButton();
        carta8 = new javax.swing.JButton();
        carta9 = new javax.swing.JButton();
        winlab = new javax.swing.JLabel();
        carta10 = new javax.swing.JButton();
        carta11 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        carta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/1200px-Carte_Napoletane_retro.jpg"))); // NOI18N
        carta6.setText("jButton2");
        carta6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setUndecorated(true);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/1200px-Carte_Napoletane_retro.jpg"))); // NOI18N
        carta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        carta1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        carta1.setInheritsPopupMenu(true);
        carta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta1ActionPerformed(evt);
            }
        });

        carta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/1200px-Carte_Napoletane_retro.jpg"))); // NOI18N
        carta4.setText("jButton2");
        carta4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setBackground(new java.awt.Color(102, 0, 153));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        carta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/1200px-Carte_Napoletane_retro.jpg"))); // NOI18N
        carta3.setText("jButton2");
        carta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/1200px-Carte_Napoletane_retro.jpg"))); // NOI18N
        carta2.setText("jButton2");
        carta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pesca.setText("Pesca");
        pesca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pescaMouseClicked(evt);
            }
        });

        stai.setText("Stai");
        stai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staiMouseClicked(evt);
            }
        });

        carta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/1200px-Carte_Napoletane_retro.jpg"))); // NOI18N
        carta5.setText("jButton2");
        carta5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        carta7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/1200px-Carte_Napoletane_retro.jpg"))); // NOI18N
        carta7.setText("jButton2");
        carta7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        carta8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/1200px-Carte_Napoletane_retro.jpg"))); // NOI18N
        carta8.setText("jButton2");
        carta8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        carta9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/1200px-Carte_Napoletane_retro.jpg"))); // NOI18N
        carta9.setText("jButton2");
        carta9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        carta10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/1200px-Carte_Napoletane_retro.jpg"))); // NOI18N
        carta10.setText("jButton2");
        carta10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        carta11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/1200px-Carte_Napoletane_retro.jpg"))); // NOI18N
        carta11.setText("jButton2");
        carta11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(carta9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(carta7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(carta8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 357, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(carta11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(carta10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(winlab, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stai)
                        .addGap(18, 18, 18)
                        .addComponent(pesca)))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(winlab)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesca)
                    .addComponent(stai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carta7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void carta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_carta1ActionPerformed

    private void pescaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pescaMouseClicked
        // TODO add your handling code here:
        int n = (int) (Math.random() * range) + 1;
        i++;
        switch (i) {
            case 1:
                carta5.setVisible(true);
                carta5.setIcon(new ImageIcon((selelezione(n))));
                break;
            case 2:
                carta9.setVisible(true);
                carta9.setIcon(new ImageIcon((selelezione(n))));
                break;
            case 3:
                carta7.setVisible(true);
                carta7.setIcon(new ImageIcon((selelezione(n))));

                break;
            case 4:
                carta8.setVisible(true);
                carta8.setIcon(new ImageIcon((selelezione(n))));
                break;
        }
        tot = calcolapunteggio(n, tot);
        jLabel2.setText(tot);
        if (tot.equals("0")) {
            winlab.setText("hai sprasciato");
             System.out.println("hai sprasciato");
             this.setVisible(false);
                BET =  new BET();
       BET.setSize(400,200);
       BET.setVisible(true);
        BET.setLocation(100,150);
            riprova();
        }
    }//GEN-LAST:event_pescaMouseClicked

    private void staiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staiMouseClicked
        // TODO add your handling code here:
        totmaz = calcolapunteggio(mazz2, totmaz);
        jLabel3.setText(totmaz);
        carta4.setIcon(new ImageIcon((selelezione(mazz2))));
   
//tiramaz();
        confronto();
 carta4.setIcon(new ImageIcon("C:\\Users\\Famiglia Luisi\\Documents\\NetBeansProjects\\Blackjack\\cards\\1200px-Carte_Napoletane_retro.jpg"));
        carta1.setIcon(new ImageIcon("C:\\Users\\Famiglia Luisi\\Documents\\NetBeansProjects\\Blackjack\\cards\\1200px-Carte_Napoletane_retro.jpg"));
        carta2.setIcon(new ImageIcon("C:\\Users\\Famiglia Luisi\\Documents\\NetBeansProjects\\Blackjack\\cards\\1200px-Carte_Napoletane_retro.jpg"));
        carta3.setIcon(new ImageIcon("C:\\Users\\Famiglia Luisi\\Documents\\NetBeansProjects\\Blackjack\\cards\\1200px-Carte_Napoletane_retro.jpg"));
       
        riprova();
    }//GEN-LAST:event_staiMouseClicked

    /**
     * @param a
     * @return
     */
    public String selelezione(int a) {//dato un numero da 0 a 52 la converte in una carta del mazzo restituendo una stringa che verra
        //poi convertita in icona

        String imagePath = null;

        int x = 0;
        int test;

        test = a;

        if ((a % 13) == 0) {

            switch (a / 13) {
                case 1:
                    x = 0;
                    break;
                case 2:
                    x = 1;
                    break;
                case 3:
                    x = 2;
                    break;
                case 4:
                    x = 3;
                    break;
            }
        } else {
            x = a / 13;
        }
        switch (x) {
            case 0:

               
                imagePath = "C:\\Users\\Famiglia Luisi\\Documents\\NetBeansProjects\\Blackjack\\cards\\picche\\" + (a % 13) + ".png";
                break;
            case 1:

               

                imagePath = "C:\\Users\\Famiglia Luisi\\Documents\\NetBeansProjects\\Blackjack\\cards\\quadri\\" + (a % 13) + ".png";

                break;
            case 2:


                imagePath = "C:\\Users\\Famiglia Luisi\\Documents\\NetBeansProjects\\Blackjack\\cards\\cuori\\" + (a % 13) + ".png";

                break;
            case 3:

               

                imagePath = "C:\\Users\\Famiglia Luisi\\Documents\\NetBeansProjects\\Blackjack\\cards\\fiori\\" + (a % 13) + ".png";

                break;
            default:
                break;
        }

        return (imagePath);

    }

    String calcolapunteggio(int c1, String tot) {
        String res = null;
        int i = 0, Assi = 0, p = 0, p2 = 0;
        int m = c1 % 13;
   
        try {
         
            p = Integer.parseInt(tot);

            if (m == 10 || m == 11 || m == 12 || m == 0) {
                p = p + 10;
            } else if (m == 1) {
          
                Assi += 1;
                p += 11;

            } else {
                p += m;
            }

            if (Assi != 0) {
                p2 = p;
                for (i = 0; i < Assi; i++) {
                    p2 = p - 10;
                }
            }
         
            if (p > 21) {
                p = p2;
                p2 = 0;
            }
            if (p == 0) {
           
               
             //   Riprova.setVisible(true);
            

                return "0";
            }
            res = "" + p;
            if (p2 != 0) {
                res = res + "/" + p2;
            }
            if (p == 21) {

            }

        } catch (Exception e) {
            
            for (i = 0; i < tot.length(); i++) {
                if (tot.charAt(i) == '/') {
                    break;
                }
            }
            p = Integer.parseInt(tot.substring(0, i));

            p2 = Integer.parseInt(tot.substring(i + 1, tot.length()));
           
            if (m == 10 || m == 11 || m == 12 || m == 0) {
                p = p + 10;
                p2 += 10;
            } else if (m == 1) {

                Assi += 1;
                p += 11;
                p2 += 11;

            } else {
                p += m;
                p2 += m;
            }

            if (p > 21) {
                p = p2;
                p2 = 0;
            }
            if (p <= 21) {
                res = "" + p;
                if (p2 != 0) {
                    res = res + "/" + p2;
                }

            } else {
               
              //  Riprova.setVisible(true);
               

                return "0";

            }
        }

        return res;

    }

    void assegna() {
        carta4.setIcon(new ImageIcon("C:\\Users\\Famiglia Luisi\\Documents\\NetBeansProjects\\Blackjack\\cards\\1200px-Carte_Napoletane_retro.jpg"));
        Blackjack.user.setCard1((int) (Math.random() * range) + 1);
      //Blackjack.user.setCard1(1);
        tot = calcolapunteggio(Blackjack.user.getCard1(), tot);
        
        Blackjack.user.setCard2((int) (Math.random() * range) + 1);
    //  Blackjack.user.setCard2(10);
        tot = calcolapunteggio(Blackjack.user.getCard2(), tot);
        jLabel2.setText(tot);
        carta1.setIcon(new ImageIcon((selelezione(Blackjack.user.getCard1()))));
        carta2.setIcon(new ImageIcon((selelezione(Blackjack.user.getCard2()))));
        int mazz1 = (int) (Math.random() * range) + 1;
        totmaz = calcolapunteggio(mazz1, totmaz);
        mazz2 = (int) (Math.random() * range) + 1;

        carta3.setIcon(new ImageIcon((selelezione(mazz1))));

        jLabel3.setText(totmaz);
        
       
    }

    void novisible() {
        carta5.setVisible(false);
        carta7.setVisible(false);
        carta8.setVisible(false);
        carta9.setVisible(false);
        carta10.setVisible(false);
        carta11.setVisible(false);

    }

    void riprova() {
        tot = "0";
        totmaz = "0";
        i = 0;
        assegna();
        novisible();
   
        pesca.setEnabled(!false);
        stai.setEnabled(!false);
    }

    void confronto() {
        int player, mazz;
        try {
            player = Integer.parseInt(tot);

        } catch (Exception e) {
            int j;
            for (j = 0; j < tot.length(); j++) {
                if (tot.charAt(j) == '/') {
                    break;
                }
            }
            player = Integer.parseInt(tot.substring(0, j));
        }
        try {
            mazz = Integer.parseInt(totmaz);

        } catch (Exception e) {
            int j;
            for (j = 0; j < totmaz.length(); j++) {
                if (totmaz.charAt(j) == '/') {
                    break;
                }
            }
            mazz = Integer.parseInt(totmaz.substring(0, j));
        }
        if (player <= mazz) {
            winlab.setText("vince il mazziere con " + mazz);
            System.out.println("vince il mazziere con " + mazz);
        } else {
            winlab.setText("Hai vinto con con " + player + "vs" + mazz);
            System.out.println("Hai vinto con con " + player + "vs" + mazz);
           
         
            
            Blackjack.user.setCoin(Blackjack.user.getCoin()+(BET.bl*2));

        }
         this.setVisible(false);
                BET =  new BET();
       BET.setSize(400,200);
       BET.setVisible(true);
       BET.setLocation(100,150);
       //  pesca.setEnabled(!true);
       // stai.setEnabled(!true);
        novisible();
       // Riprova.setVisible(false);
       
        
    }
    void tiramaz(){
        int pm;
    try {
            pm = Integer.parseInt(totmaz);

        } catch (Exception e) {
            int j;
            for (j = 0; j < tot.length(); j++) {
                if (tot.charAt(j) == '/') {
                    break;
                }
            }
            pm = Integer.parseInt(totmaz.substring(0, j));
    }
    int pp;
    try {
            pp = Integer.parseInt(tot);

        } catch (Exception e) {
            int j;
            for (j = 0; j < tot.length(); j++) {
                if (tot.charAt(j) == '/') {
                    break;
                }
            }
            pp = Integer.parseInt(tot.substring(0, j));
    }
     
    while(pp>pm&&pm<16){
    int n = (int) (Math.random() * range) + 1;
        im++;
        switch (im) {
            case 1:
                carta10.setVisible(true);
                carta5.setIcon(new ImageIcon((selelezione(n))));
                break;
            case 2:
                carta11.setVisible(true);
                carta11.setIcon(new ImageIcon((selelezione(n))));
                break;
            default:
                break;
        }
    }
    
    }

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
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finestra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carta1;
    private javax.swing.JButton carta10;
    private javax.swing.JButton carta11;
    private javax.swing.JButton carta2;
    private javax.swing.JButton carta3;
    private javax.swing.JButton carta4;
    private javax.swing.JButton carta5;
    private javax.swing.JButton carta6;
    private javax.swing.JButton carta7;
    private javax.swing.JButton carta8;
    private javax.swing.JButton carta9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton pesca;
    private javax.swing.JButton stai;
    private javax.swing.JLabel winlab;
    // End of variables declaration//GEN-END:variables

    class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;

        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;

        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//            
        }
    }

    private static class RoundedBorder implements Border {

        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }

    }

}
