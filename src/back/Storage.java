/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;

import java.util.ArrayList;

/**
 *
 * @author cdgan
 */
public class Storage {
    public static ArrayList <String> users = new ArrayList<String>();
    public static ArrayList <String> passwords = new ArrayList<String>();
    
    public Storage(){
        users.add("user1");
        users.add("user2");
        users.add("user3");
        
        passwords.add("password1");
        passwords.add("password2");
        passwords.add("password3");
    }
}
