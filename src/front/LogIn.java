/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package front;

import back.Storage;
import back.checkEP;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author cdgan
 */
public class LogIn extends JFrame {

    Storage s;
    checkEP checkph = new checkEP();
    JPanel panel = new JPanel();

    JLabel title = new JLabel("LOG IN");
    JLabel tU = new JLabel("User:");
    JLabel tP = new JLabel("Password:");

    public JTextField gU = new JTextField();
    JPasswordField gP = new JPasswordField();

    JRadioButton showP = new JRadioButton("Show Password");

    JButton logIn = new JButton("LOG IN");

    public LogIn() {
        s = new Storage();
        design();
        
        showP.addActionListener(e -> {
            if (showP.isSelected()) {
                gP.setEchoChar((char) 0);
            } else {
                gP.setEchoChar('*');
            }
        });

        logIn.addActionListener(e -> {
            boolean flag = checkph.compareUser(gU.getText(), gP.getText());
            if (flag == true) {
                System.out.println(gU.getText());
            }
        });
    }

    void design() {
        setLayout(null);
        setTitle("Log In");
        setSize(400, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        add(panel);
        panel.setLayout(null);
        panel.setBounds(1, 10, 400, 470);
        panel.setVisible(true);

        panel.add(tU);
        panel.add(tP);
        panel.add(title);

        title.setBounds(160, 5, 100, 20);
        title.setFont(new Font("Arial", Font.BOLD, 20));

        tU.setBounds(60, 220, 100, 20);
        tP.setBounds(60, 270, 100, 20);
        tU.setFont(new Font("Arial", Font.PLAIN, 14));
        tP.setFont(new Font("Arial", Font.PLAIN, 14));

        panel.add(gU);
        panel.add(gP);

        gU.setBounds(140, 220, 180, 20);
        gP.setBounds(140, 270, 180, 20);

        panel.add(showP);
        showP.setBounds(130, 300, 120, 20);

        panel.add(logIn);
        logIn.setBounds(140, 360, 120, 20);
    }
}
