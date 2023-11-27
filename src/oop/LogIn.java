/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author cdgan
 */
public class LogIn extends JFrame {
    
    protected JLabel close = new JLabel("X");
    protected JPanel panel1 = new JPanel();
    protected JLabel email = new JLabel();
    protected JLabel pass = new JLabel();

    public LogIn() {
        setSize(600, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        setVisible(true);
        
        add(close);
        close.setBounds(580,0,100,100);
        close.setForeground(Color.WHITE);

        add(panel1);
        panel1.setVisible(true);
        panel1.setBounds(1, 30, 600, 300);
        panel1.setLayout(null);
        panel1.setBackground(Color.WHITE);
//sample change
        panel1.add(email);
        panel1.add(pass);
        email.setBounds(2, 2, 100, 20);
        email.setBounds(2, 40, 100, 20);
    }
}
