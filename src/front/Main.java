/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package front;

import javax.swing.JFrame;

/**
 *
 * @author cdgan
 */
public class Main{

    Main(){
        new LogIn();
    }
    
    public static void main (String[] args) {
//        Main m = new Main();
        Admin a = new Admin();
        a.admin();
    }
    
}
