/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiktaktoe;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JFrame;



/**
 *
 * @author 20419
 */
public class TIKTAKTOEForm extends javax.swing.JFrame {

    private String startGame = "X";   
    private int xCount = 0;
    private int oCount = 0;
    private int dCount = 0;
    boolean checker;
    boolean IsEnabledMethodEx;
    
    public TIKTAKTOEForm() {
        initComponents();
    }
    
    private void gameScore(){
        lblPlayerX.setText(String.valueOf(xCount));
        //lblPlayerX can able to count 1 value each winning time
        lblPlayerO.setText(String.valueOf(oCount));   
        //lblPlayerX can able to count 1 value each winning time
        lblPlayerDraw.setText(String.valueOf(dCount));
        //lblPlayerDraw can able to count 1 value each drawing time
    }
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }else{
            startGame = "X";
        }
    }    
    
    private void Stops()
    {   
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        //Disable buttons 1-9
        
    }
    
    private void winningGame()
    {
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        //Allow the button from 1-9 to get text
        
       
        if (b1 ==("X") && b2 == ("X") && b3 == ("X"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player X Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player X Wins" 
             btn1.setBackground(Color.CYAN);
             btn2.setBackground(Color.CYAN);
             btn3.setBackground(Color.CYAN);
             //Set the background color for 3 winning button
             xCount++;
             //Count 1 value into the X label 
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b4 ==("X") && b5 == ("X") && b6 == ("X"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player X Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player X Wins" 
             btn4.setBackground(Color.CYAN);
             btn5.setBackground(Color.CYAN);
             btn6.setBackground(Color.CYAN);
             //Set the background color for 3 winning button
             xCount++;
             //Count 1 value into the X label 
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b7 ==("X") && b8 == ("X") && b9 == ("X"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player X Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player X Wins" 
             btn7.setBackground(Color.CYAN);
             btn8.setBackground(Color.CYAN);
             btn9.setBackground(Color.CYAN);
             //Set the background color for 3 winning button
             xCount++;
             //Count 1 value into the X label 
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b1 ==("X") && b4 == ("X") && b7 == ("X"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player X Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player X Wins" 
             btn1.setBackground(Color.CYAN);
             btn4.setBackground(Color.CYAN);
             btn7.setBackground(Color.CYAN);
             //Set the background color for 3 winning button
             xCount++;
             //Count 1 value into the X label 
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b2 ==("X") && b5 == ("X") && b8 == ("X"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player X Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player X Wins" 
             btn2.setBackground(Color.CYAN);
             btn5.setBackground(Color.CYAN);
             btn8.setBackground(Color.CYAN);
             //Set the background color for 3 winning button
             xCount++;
             //Count 1 value into the X label 
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b3 ==("X") && b6 == ("X") && b9 == ("X"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player X Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player X Wins" 
             btn3.setBackground(Color.CYAN);
             btn6.setBackground(Color.CYAN);
             btn9.setBackground(Color.CYAN);
             //Set the background color for 3 winning button
             xCount++;
             //Count 1 value into the X label 
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b1 ==("X") && b5 == ("X") && b9 == ("X"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player X Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player X Wins" 
             btn1.setBackground(Color.CYAN);
             btn5.setBackground(Color.CYAN);
             btn9.setBackground(Color.CYAN);
             //Set the background color for 3 winning button
             xCount++;
             //Count 1 value into the X label 
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b3 ==("X") && b5 == ("X") && b7 == ("X"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player X Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player X Wins" 
             btn3.setBackground(Color.CYAN);
             btn5.setBackground(Color.CYAN);
             btn7.setBackground(Color.CYAN);
             //Set the background color for 3 winning button
             xCount++;
             //Count 1 value into the X label 
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }

        
        else if (b1 ==("O") && b2 == ("O") && b3 == ("O"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player O Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player O Wins" 
             btn1.setBackground(Color.YELLOW);
             btn2.setBackground(Color.YELLOW);
             btn3.setBackground(Color.YELLOW);
             //Set the background color for 3 winning button
             oCount++;
             //Count 1 value into the O label 
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b4 ==("O") && b5 == ("O") && b6 == ("O"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player O Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player O Wins" 
             btn4.setBackground(Color.YELLOW);
             btn5.setBackground(Color.YELLOW);
             btn6.setBackground(Color.YELLOW);
             //Set the background color for 3 winning button
             oCount++;
             //Count 1 value into the O label
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b7 ==("O") && b8 == ("O") && b9 == ("O"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player O Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player O Wins" 
             btn7.setBackground(Color.YELLOW);
             btn8.setBackground(Color.YELLOW);
             btn9.setBackground(Color.YELLOW);
             //Set the background color for 3 winning button
             oCount++;
             //Count 1 value into the O label
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b1 ==("O") && b4 == ("O") && b7 == ("O"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player O Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player O Wins" 
             btn1.setBackground(Color.YELLOW);
             btn4.setBackground(Color.YELLOW);
             btn7.setBackground(Color.YELLOW);
             //Set the background color for 3 winning button
             oCount++;
             //Count 1 value into the O label
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b2 ==("O") && b5 == ("O") && b8 == ("O"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player O Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player O Wins" 
             btn2.setBackground(Color.YELLOW);
             btn5.setBackground(Color.YELLOW);
             btn8.setBackground(Color.YELLOW);
             //Set the background color for 3 winning button
             oCount++;
             //Count 1 value into the O label
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b3 ==("O") && b6 == ("O") && b9 == ("O"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player O Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player O Wins" 
             btn3.setBackground(Color.YELLOW);
             btn6.setBackground(Color.YELLOW);
             btn9.setBackground(Color.YELLOW);
             //Set the background color for 3 winning button
             oCount++;
             //Count 1 value into the O label
             gameScore();
             Stops();  
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b1 ==("O") && b5 == ("O") && b9 == ("O"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player O Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player O Wins" 
             btn1.setBackground(Color.yellow);
             btn5.setBackground(Color.yellow);
             btn9.setBackground(Color.yellow);
             //Set the background color for 3 winning button
             oCount++;
             //Count 1 value into the O label
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if (b3 ==("O") && b5 == ("O") && b7 == ("O"))//Check the winning condition
        {
            JOptionPane.showMessageDialog(this,"Player O Wins ","Tik Tak Toe",JOptionPane.INFORMATION_MESSAGE);
            //Show the message dialog "Player O Wins" 
             btn3.setBackground(Color.YELLOW);
             btn5.setBackground(Color.YELLOW);
             btn7.setBackground(Color.YELLOW);
             //Set the background color for 3 winning button
             oCount++;
             //Count 1 value into the O label
             gameScore();
             Stops();
             //Disable all the buttons from 1-9 to debug
        }
        
        else if ( !(btn1.isEnabled()) && !(btn2.isEnabled()) && !(btn3.isEnabled()) && !(btn4.isEnabled()) && !(btn5.isEnabled()) && !(btn6.isEnabled()) && !(btn7.isEnabled()) && !(btn8.isEnabled()) && !(btn9.isEnabled()))
        //Check the draw condition
        {
                
                JOptionPane.showMessageDialog(null,"No one wins. This game process will be reset", "TicTacToe",JOptionPane.ERROR_MESSAGE);
                //Show the message dialog "No one wins. This game process will be reset" 
                 dCount++;
                 //Count 1 value into the Draw label
                 gameScore();
                 btnReset.doClick();
                 //The reset button will be clicked when no one win
        }
            
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
        jLabel5 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        spnXO = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPlayerO = new javax.swing.JLabel();
        lblDraw = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        lblPlayerX = new javax.swing.JLabel();
        lblO1 = new javax.swing.JLabel();
        lblPlayerDraw = new javax.swing.JLabel();
        btnNewGame = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        spnXO.setModel(new javax.swing.SpinnerNumberModel(1, 1, 2, 1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel2.setText("TIKTAKTOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        btn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPlayerO.setBackground(new java.awt.Color(255, 255, 255));
        lblPlayerO.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerO.setText("0");
        lblPlayerO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblDraw.setBackground(new java.awt.Color(204, 204, 204));
        lblDraw.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lblDraw.setText("Draw:");

        lblX.setBackground(new java.awt.Color(102, 102, 102));
        lblX.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lblX.setText("Player X:");

        lblPlayerX.setBackground(new java.awt.Color(102, 102, 102));
        lblPlayerX.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerX.setText("0");

        lblO1.setBackground(new java.awt.Color(204, 204, 204));
        lblO1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lblO1.setText("Player O:");

        lblPlayerDraw.setBackground(new java.awt.Color(255, 255, 255));
        lblPlayerDraw.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblPlayerDraw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerDraw.setText("0");
        lblPlayerDraw.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblO1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayerDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblX)
                    .addComponent(lblPlayerX))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblO1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayerO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayerDraw))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        btnNewGame.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnNewGame.setText("New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset)
                            .addComponent(btnExit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        btn3.setText(startGame);
        btn3.setEnabled(false);
        //Disable the button to avoid bugs
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }else{
            checker = false;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        btn6.setText(startGame);
        btn6.setEnabled(false);
        //Disable the button to avoid bugs
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }else{
            checker = false;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        btn9.setText(startGame);
        btn9.setEnabled(false);
        //Disable the button to avoid bugs
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }else{
            checker = false;
        }
        choose_a_Player();
        winningGame();       
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        btn1.setText(startGame);
        btn1.setEnabled(false);
        //Disable the button to avoid bugs
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }else{
            checker = false;
        }
        choose_a_Player();
        winningGame();        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        btn2.setText(startGame);
        btn2.setEnabled(false);
        //Disable the button to avoid bugs
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }else{
            checker = false;
        }
        choose_a_Player();
        winningGame();        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        btn4.setText(startGame);
        btn4.setEnabled(false);
        //Disable the button to avoid bugs
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }else{
            checker = false;
        }
        choose_a_Player();
        winningGame();       
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here: btn1.setText(startGame);
        btn5.setText(startGame);
        btn5.setEnabled(false);
        //Disable the button to avoid bugs
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }else{
            checker = false;
        }
        choose_a_Player();
        winningGame();       
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        btn7.setText(startGame);
        btn7.setEnabled(false);
        //Disable the button to avoid bugs
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }else{
            checker = false;
        }
        choose_a_Player();
        winningGame();      
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        btn8.setText(startGame);
        btn8.setEnabled(false);
        //Disable the button to avoid bugs
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }else{
            checker = false;
        }
        choose_a_Player();
        winningGame();    
    }//GEN-LAST:event_btn8ActionPerformed

    
    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
                
        btn1.setBackground(Color.white);
        btn2.setBackground(Color.white);
        btn3.setBackground(Color.white);
        btn4.setBackground(Color.white);
        btn5.setBackground(Color.white);
        btn6.setBackground(Color.white);
        btn7.setBackground(Color.white);
        btn8.setBackground(Color.white);
        btn9.setBackground(Color.white);
        //set the background color for button 1 to 9
        
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        //enable to click the button from 1 to 9
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        //enable to get text for the button from 1 to 9
        
    }//GEN-LAST:event_btnResetActionPerformed
private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Comfirm it if you want to exit","Tik Tak Toe",
              JOptionPane.YES_NO_OPTION  )== JOptionPane.YES_NO_OPTION) 
            //Show the message dialog
        {
              System.exit(0);
              //Close the game
        }     
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        // TODO add your handling code here:
        
        btn1.setBackground(Color.white);
        btn2.setBackground(Color.white);
        btn3.setBackground(Color.white);
        btn4.setBackground(Color.white);
        btn5.setBackground(Color.white);
        btn6.setBackground(Color.white);
        btn7.setBackground(Color.white);
        btn8.setBackground(Color.white);
        btn9.setBackground(Color.white);
        //set the background color for button 1 to 9
        
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        //enable to click the button from 1 to 9
     
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        //enable to get text for the button from 1 to 9      
                       
        lblPlayerX.setText("0");
        lblPlayerO.setText("0");
        lblPlayerDraw.setText("0");
        //Erase all the result in label X and O
        
        xCount = 0;
        oCount = 0;
        dCount = 0;
        //Set win variables back to 0
    }//GEN-LAST:event_btnNewGameActionPerformed

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
            java.util.logging.Logger.getLogger(TIKTAKTOEForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIKTAKTOEForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIKTAKTOEForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIKTAKTOEForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIKTAKTOEForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDraw;
    private javax.swing.JLabel lblO1;
    private javax.swing.JLabel lblPlayerDraw;
    private javax.swing.JLabel lblPlayerO;
    private javax.swing.JLabel lblPlayerX;
    private javax.swing.JLabel lblX;
    private javax.swing.JSpinner spnXO;
    // End of variables declaration//GEN-END:variables
}
