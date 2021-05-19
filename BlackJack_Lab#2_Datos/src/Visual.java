
import java.awt.Font;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kemer
 */
public class Visual extends javax.swing.JFrame {

    /**
     * Creates new form Visual
     */
    public boolean Apostado = false;
    public volatile boolean HintBool = false;
    public volatile boolean StandBool = false;
    public String playerText = "Bienvenid@ a Blackjack!";
    //public String dealerText = "Bienvenid@ a Blackjack!";

    public int playerBet;
    public int playerMoney;

    public Visual() {
        initComponents();
        this.setSize(1096, 670);
        Fondo1.setSize(1096, 670);
        Fondo2.setSize(1096, 670);

        URL imageURL = getClass().getResource("/Cards/fondo_red.jpg");
        ImageIcon icon = new ImageIcon(imageURL);
        Fondo2.setIcon(icon);
        Fondo1.setIcon(icon);
        Game.setVisible(false);
        Start.setSize(300, 70);
        Font font = new Font("Agency FB", Font.BOLD, 36);
        Start.setFont(font);
        Start.setText("Start");
        int wB = this.getWidth() / 2 - Start.getWidth() / 2;
        Start.setLocation(wB, this.getHeight() / 3 * 2);
    }

    private void scaleImage(String source, javax.swing.JLabel label) {
        ImageIcon icon = new ImageIcon(source);

        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleIcon = new ImageIcon(imgScale);
        label.setIcon(scaleIcon);
    }

    private void drawCards(String card, javax.swing.JButton button) {
        String source = getCardSource(card);
        System.out.println("source: " + source);

        URL imageURL = getClass().getResource("/Cards/" + source);
        ImageIcon icon = new ImageIcon(imageURL);

        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleIcon = new ImageIcon(imgScale);
        button.setIcon(scaleIcon);
    }

    private void drawCards(javax.swing.JButton button) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Cards/gray_back.png"));

        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleIcon = new ImageIcon(imgScale);
        button.setIcon(scaleIcon);
    }

    private String getCardSource(String card) {
        String cardWords[] = card.split("-");
        String value = " ";
        switch (cardWords[0]) {
            case "DOS":
                value = "2";
                break;
            case "TRES":
                value = "3";
                break;
            case "CUATRO":
                value = "4";
                break;
            case "CINCO":
                value = "5";
                break;
            case "SEIS":
                value = "6";
                break;
            case "SIETE":
                value = "7";
                break;
            case "OCHO":
                value = "8";
                break;
            case "NUEVE":
                value = "9";
                break;
            case "DIES":
                value = "10";
                break;
            case "JACK":
                value = "J";
                break;
            case "QUEEN":
                value = "Q";
                break;
            case "KING":
                value = "K";
                break;
            case "AZ":
                value = "A";
                break;
        }
        char suit = cardWords[1].charAt(0);

        String cardSource = "";
        cardSource += value + suit + ".png";
        return cardSource;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Entrance = new javax.swing.JPanel();
        Start = new javax.swing.JButton();
        Fondo1 = new javax.swing.JLabel();
        Game = new javax.swing.JPanel();
        Hint = new javax.swing.JButton();
        Stand = new javax.swing.JButton();
        Apuesta = new javax.swing.JTextField();
        Apostar = new javax.swing.JButton();
        PlayerCard1 = new javax.swing.JButton();
        PlayerCard2 = new javax.swing.JButton();
        DealerCard1 = new javax.swing.JButton();
        DealerCard2 = new javax.swing.JButton();
        PlayerValue = new javax.swing.JButton();
        jscrollpane = new javax.swing.JScrollPane();
        PlayerHistorial = new javax.swing.JTextArea();
        PlayerMoney = new javax.swing.JButton();
        DealerValue = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Capital = new javax.swing.JLabel();
        Puntajes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Entrance.setLayout(null);

        Start.setText("jButton1");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        Entrance.add(Start);
        Start.setBounds(490, 440, 73, 23);

        Fondo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kemer\\Desktop\\Lab#2_Datos\\fondo_red.jpg")); // NOI18N
        Entrance.add(Fondo1);
        Fondo1.setBounds(0, 0, 1080, 670);

        Game.setLayout(null);

        Hint.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        Hint.setText("Pedir");
        Hint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HintActionPerformed(evt);
            }
        });
        Game.add(Hint);
        Hint.setBounds(680, 440, 170, 50);

        Stand.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        Stand.setText("Quedarse");
        Stand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StandActionPerformed(evt);
            }
        });
        Game.add(Stand);
        Stand.setBounds(850, 440, 170, 50);

        Apuesta.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        Game.add(Apuesta);
        Apuesta.setBounds(700, 520, 120, 40);

        Apostar.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        Apostar.setText("Apostar");
        Apostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApostarActionPerformed(evt);
            }
        });
        Game.add(Apostar);
        Apostar.setBounds(840, 520, 71, 40);
        Game.add(PlayerCard1);
        PlayerCard1.setBounds(20, 90, 120, 230);
        Game.add(PlayerCard2);
        PlayerCard2.setBounds(180, 90, 120, 230);
        Game.add(DealerCard1);
        DealerCard1.setBounds(780, 90, 120, 230);
        Game.add(DealerCard2);
        DealerCard2.setBounds(940, 90, 120, 230);

        PlayerValue.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        PlayerValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerValueActionPerformed(evt);
            }
        });
        Game.add(PlayerValue);
        PlayerValue.setBounds(390, 220, 110, 90);

        PlayerHistorial.setEditable(false);
        PlayerHistorial.setColumns(20);
        PlayerHistorial.setRows(5);
        jscrollpane.setViewportView(PlayerHistorial);

        Game.add(jscrollpane);
        jscrollpane.setBounds(50, 390, 510, 210);

        PlayerMoney.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        PlayerMoney.setForeground(new java.awt.Color(0, 255, 0));
        PlayerMoney.setText("$ 100");
        Game.add(PlayerMoney);
        PlayerMoney.setBounds(530, 140, 70, 50);

        DealerValue.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        Game.add(DealerValue);
        DealerValue.setBounds(630, 220, 110, 90);

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jugador");
        Game.add(jLabel1);
        jLabel1.setBounds(50, 30, 200, 50);

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Repartidor");
        Game.add(jLabel2);
        jLabel2.setBounds(810, 30, 200, 50);

        Capital.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        Capital.setForeground(new java.awt.Color(255, 255, 255));
        Capital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Capital.setText("Capital");
        Game.add(Capital);
        Capital.setBounds(520, 100, 90, 30);

        Puntajes.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        Puntajes.setForeground(new java.awt.Color(255, 255, 255));
        Puntajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Puntajes.setText("Puntajes");
        Game.add(Puntajes);
        Puntajes.setBounds(500, 220, 130, 90);

        jButton1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Game.add(jButton1);
        jButton1.setBounds(940, 520, 70, 40);

        Fondo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\kemer\\Desktop\\Lab#2_Datos\\fondo_red.jpg")); // NOI18N
        Game.add(Fondo2);
        Fondo2.setBounds(0, 0, 1100, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Entrance, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Game, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Entrance, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Game, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Deck playingDeck;
    Deck playerCards;
    Deck dealerCards;
    boolean endRound;

    private void inicialDecks() {
        playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffle();

        //playerCards will be the cards the player has in their hand
        playerCards = new Deck();
        //playerMoney holds players cash - we will be lazy and use doubles instead of bigdecimals
        playerMoney = 100;
        PlayerMoney.setText("$ " + playerMoney);
        //dealerCards will be the cards the dealer has in their hand
        dealerCards = new Deck();

        playerText += "\nTienes $" + playerMoney + " ¿Cuanto apostaras?";
        endRound = false;
    }

    private void putBackCards() {
        playerCards.moveAllToDeck(playingDeck);
        dealerCards.moveAllToDeck(playingDeck);
    }

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        Entrance.setVisible(false);
        Game.setVisible(true);
        
        Apuesta.setText("");
        
        PlayerMoney.setLocation(530, PlayerMoney.getY());
        Capital.setLocation(520, Capital.getY());
        Puntajes.setLocation(500, Puntajes.getY());

        drawCards(PlayerCard1);
        drawCards(PlayerCard2);
        drawCards(DealerCard1);
        drawCards(DealerCard2);
        
        PlayerValue.setText("0");
        DealerValue.setText("0");

        //abrir un JFrame con info basica del juego
        playerText = "Bienvienid@ a BlackJack!";
        PlayerHistorial.setText(playerText);
        JOptionPane.showMessageDialog(this, playerText);
        JOptionPane.showMessageDialog(this, "BlackJack es un juego de casino simple de cartas"
                + "\n" + "Cada carta tienen un valor numerico y el objetivo es alcanar 21"
                + "\n" + "Pierdes si pasas de 21 o alguien mas obtiene un valor mayor al tuyo"
                + "\n" + "Diviertete!!");
        inicialDecks();
    }//GEN-LAST:event_StartActionPerformed

    private void HintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HintActionPerformed
        if (playerBet != 0) {
            playerCards.draw(playingDeck);
            playerText += "\n" + "Nueva carta:" + playerCards.getCard(playerCards.deckSize() - 1).toString();
            playerText += "\n" + "Valor de la mano: " + playerCards.cardsValue();
            PlayerValue.setText("" + playerCards.cardsValue());

            PlayerHistorial.setText(playerText);
            //Bust if they go over 21
            if (playerCards.cardsValue() > 21) {
                playerText += "\n" + "oof! superaste los 21 con: " + playerCards.cardsValue() + "\n" + "Pierdes la apuesta";
                putBackCards();
                PlayerHistorial.setText(playerText);
                playerMoney -= playerBet;
                PlayerMoney.setText("$" + playerMoney);

                if (playerMoney <= 0) {
                    int seleccion = JOptionPane.showOptionDialog(this, "Has Perdido!", "", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                            new Object[]{"Try Again", "Quit"}, "Try Again");
                    if (seleccion != -1) {
                        if (seleccion == 0) {
                            playerMoney = 100;
                            PlayerMoney.setText("$" + playerMoney);
                            drawCards(PlayerCard1);
                            drawCards(PlayerCard2);
                            drawCards(DealerCard1);
                            drawCards(DealerCard2);
                            playerText = "Bienvenid@ a BlackJack!";
                            PlayerHistorial.setText(playerText);
                            PlayerValue.setText("0");
                            DealerValue.setText("0");
                            putBackCards();
                            
                            endRound = false;
                        } else if (seleccion == 1) {
                            System.exit(0);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Tienes $" + playerMoney + "\nApuesta de nuevo!");
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Realiza una apuesta!");
        }

        /*playerCards.draw(playingDeck);
        playerText += "\n" + "Nueva carta:" + playerCards.getCard(playerCards.deckSize() - 1).toString();
        playerText += "\n" + "Valor de la mano: " + playerCards.cardsValue();

        PlayerHistorial.setText(playerText);
        //Bust if they go over 21
        if (playerCards.cardsValue() > 21) {
            playerText += "\n" + "oof! superaste los 21 con: " + playerCards.cardsValue() + "\n" + "Pierdes la apuesta";
            putBackCards();
            PlayerHistorial.setText(playerText);
            playerMoney -= playerBet;
            PlayerMoney.setText("$" + playerMoney);

            if (playerMoney <= 0) {
                int seleccion = JOptionPane.showOptionDialog(this, "Has Perdido!", "", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        new Object[]{"Try Again", "Quit"}, "Try Again");
                if (seleccion != -1) {
                    if (seleccion == 0) {
                        playerMoney = 100;
                        PlayerMoney.setText("$" + playerMoney);
                        drawCards(PlayerCard1);
                        drawCards(PlayerCard2);
                        drawCards(DealerCard1);
                        drawCards(DealerCard2);
                        playerText = "Bienvenid@ a BlackJack!";
                        PlayerHistorial.setText(playerText);
                        putBackCards();
                        endRound = false;
                    } else if (seleccion == 1) {
                        System.exit(0);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tienes $" + playerMoney + "\nApuesta de nuevo!");
            }
        }*/
        //actualizar el valor visible de la mano
    }//GEN-LAST:event_HintActionPerformed

    private void StandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StandActionPerformed
        endRound = false;

        //Reveal Dealer Cards
        playerText += "\n" + "Cartas del Repartidor:" + dealerCards.toString();
        drawCards(dealerCards.getCard(1).toString(), DealerCard2);
        DealerValue.setText("" + dealerCards.cardsValue());
        
        PlayerHistorial.setText(playerText);
        //See if dealer has more points than player
        if ((dealerCards.cardsValue() > playerCards.cardsValue()) && endRound == false) {
            playerText += "\n" + "El Repartidor vence: " + dealerCards.cardsValue() + " a " + playerCards.cardsValue();
            PlayerHistorial.setText(playerText);
            playerMoney -= playerBet;
            PlayerMoney.setText("$" + playerMoney);
            endRound = true;
        }
        //Dealer hits at 16 stands at 17
        while ((dealerCards.cardsValue() < 17) && endRound == false) {
            dealerCards.draw(playingDeck);
            playerText += "\n" + "Repartidor toma una: " + dealerCards.getCard(dealerCards.deckSize() - 1).toString();
            DealerValue.setText("" + dealerCards.cardsValue());
            PlayerHistorial.setText(playerText);
        }
        //Display value of dealer
        playerText += "\n" + "Mano del repartidor valuada: " + dealerCards.cardsValue();
        PlayerHistorial.setText(playerText);
        //Determine if dealer busted
        if ((dealerCards.cardsValue() > 21) && endRound == false) {
            playerText += "\n" + "El repartidor pierde. " + "\n" + "Ganas la Mano.";
            PlayerHistorial.setText(playerText);
            playerMoney += playerBet;
            PlayerMoney.setText("$" + playerMoney);
            endRound = true;
        }
        //Determine if push
        if ((dealerCards.cardsValue() == playerCards.cardsValue()) && endRound == false) {
            playerText += "\n" + "Empate.";
            PlayerHistorial.setText(playerText);
            endRound = true;
        }
        //Determine if player wins
        if ((playerCards.cardsValue() > dealerCards.cardsValue()) && endRound == false) {
            playerText += "\n" + "Ganas la Mano: " + playerCards.cardsValue() + " a " + dealerCards.cardsValue();
            PlayerHistorial.setText(playerText);
            playerMoney += playerBet;
            PlayerMoney.setText("$" + playerMoney);
            endRound = true;
        } else if (endRound == false) //dealer wins
        {
            playerText += "\n" + "Repartidor gana: " + dealerCards.cardsValue() + " a " + playerCards.cardsValue();
            PlayerHistorial.setText(playerText);
            playerMoney -= playerBet;
            PlayerMoney.setText("$" + playerMoney);
        }

        //End of hand - put cards back in deck
        putBackCards();
        //playerText += "\n" + "End of Hand.";
        playerText += "\n" + "Tienes: " + playerMoney;
        PlayerHistorial.setText(playerText);
        JOptionPane.showMessageDialog(this, "Acaba la mano\nTienes $" + playerMoney);

        if (playerMoney <= 0) {
            int seleccion = JOptionPane.showOptionDialog(this, "Has Perdido!", "Better Luck At Next", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    new Object[]{"Try Again", "Quit"}, "Try Again");
            if (seleccion != -1) {
                if (seleccion == 0) {
                    playerMoney = 100;
                    PlayerMoney.setText("$" + playerMoney);
                    drawCards(PlayerCard1);
                    drawCards(PlayerCard2);
                    drawCards(DealerCard1);
                    drawCards(DealerCard2);
                    PlayerValue.setText("0");
                    DealerValue.setText("0");
                    playerText = "Bienvenid@ a BlackJack!";
                    PlayerHistorial.setText(playerText);
                    endRound = false;
                } else {
                    System.exit(0);
                }
            }
        } else {
            playerText += "\n" + "Apuesta de nuevo!";
            PlayerHistorial.setText(playerText);
        }
    }//GEN-LAST:event_StandActionPerformed

    private void ApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApostarActionPerformed
        System.out.println("dimensiones: " + this.getWidth() + "x" + this.getHeight());
        DealerValue.setText("0");
        playerText = "";
        PlayerHistorial.setText(playerText);
        boolean noError = true;
        playerBet = 0;
        try {
            playerBet = Integer.parseInt(Apuesta.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite unicamente números como apuesta");
            noError = false;
        }

        if (playerBet <= playerMoney && playerBet > 0 && noError) {
            playerText += "\n" + "Repartiendo...";
            PlayerHistorial.setText(playerText);

            //Player gets two cards
            playerCards.draw(playingDeck);
            playerCards.draw(playingDeck);

            //Dealer gets two cards
            dealerCards.draw(playingDeck);
            dealerCards.draw(playingDeck);

            //set some cards in JFrame
            drawCards(playerCards.getCard(0).toString(), PlayerCard1);
            drawCards(playerCards.getCard(1).toString(), PlayerCard2);

            drawCards(dealerCards.getCard(0).toString(), DealerCard1);
            drawCards(DealerCard2);

            playerText += "\n" + "Tus Cartas:" + playerCards.toString();
            PlayerHistorial.setText(playerText);

            //Display Value
            playerText += "\n" + "El valor de tu mano es de: " + playerCards.cardsValue();
            PlayerHistorial.setText(playerText);
            PlayerValue.setText("" + playerCards.cardsValue());

            //Display dealer cards
            playerText += "\n" + "Cartas del Repartidos: " + dealerCards.getCard(0).toString() + " y [Oculta]";
            PlayerHistorial.setText(playerText);

            //playerText += "\n" + "Pide otra carta [Hint] o quedate [Stand]";
            //PlayerHistorial.setText(playerText);
            JOptionPane.showMessageDialog(this, "Pide otra carta o quedate");

        } else if (playerBet > playerMoney && noError) {
            JOptionPane.showMessageDialog(this, "Apuesta imposible");
        }
    }//GEN-LAST:event_ApostarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void PlayerValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayerValueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        putBackCards();
        playerMoney = 100;
        Game.setVisible(false);
        Entrance.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apostar;
    private javax.swing.JTextField Apuesta;
    private javax.swing.JLabel Capital;
    private javax.swing.JButton DealerCard1;
    private javax.swing.JButton DealerCard2;
    private javax.swing.JButton DealerValue;
    private javax.swing.JPanel Entrance;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JPanel Game;
    private javax.swing.JButton Hint;
    private javax.swing.JButton PlayerCard1;
    private javax.swing.JButton PlayerCard2;
    private javax.swing.JTextArea PlayerHistorial;
    private javax.swing.JButton PlayerMoney;
    private javax.swing.JButton PlayerValue;
    private javax.swing.JLabel Puntajes;
    private javax.swing.JButton Stand;
    private javax.swing.JButton Start;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jscrollpane;
    // End of variables declaration//GEN-END:variables
}
