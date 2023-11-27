package front;


import java.awt.*;
import javax.swing.*;

public class Admin extends JFrame {

    public void admin() {

        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JLabel admin = new JLabel("ADMIN");
        admin.setFont(new Font("Arial", Font.BOLD, 20));
        admin.setBounds(60, 10, 100, 50);

        JButton button1 = new JButton("SALES");
        button1.setBounds(18, 90, 150, 40);
        
        JButton button2 = new JButton("STAFFS");
        button2.setBounds(18, 160, 150, 40);
        
        JButton button3 = new JButton("ADD STAFFS");
        button3.setBounds(18, 230, 150, 40);
        
        JButton button4 = new JButton("MANAGER");
        button4.setBounds(18, 300, 150, 40);
        
        JButton button5 = new JButton("ADD MANAGER");
        button5.setBounds(18, 370, 150, 40);
        
        JButton button6 = new JButton("EDIT EMPLOYEE");
        button6.setBounds(18, 440, 150, 40);

        JPanel jp1 = new JPanel();
        jp1.setLayout(null);
        jp1.add(admin);
        jp1.add(button1);
        jp1.add(button2);
        jp1.add(button3);
        jp1.add(button4);
        jp1.add(button5);
        jp1.add(button6);
        
        jp1.setBackground(Color.WHITE);
        jp1.setBounds(0, 0, 180, 600);
        
        JPanel jp2 = new JPanel();
        jp2.setLayout(null);
        
        jp2.setBackground(Color.GRAY);
        jp2.setBounds(180, 0, 700, 600);

        add(jp1);
        add(jp2);
    }
}
