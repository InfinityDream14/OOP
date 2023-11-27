/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;

import static back.Storage.*;
import front.LogIn;
import java.lang.System.Logger;

/**
 *
 * @author cdgan
 */
public class Operations {
//    LogIn l = new LogIn();
    public Operations(){

    }
    
    public int checkUP(String username, String password) {
        int flag = 0;
        for (int i = 0; i < users.size(); i++) {
            String user = users.get(i);
            String pass = passwords.get(i);
            if (flag == 1) {
                break;
            } else {
                if (user.equals(username)) {
                    if(pass.equals(password)){
                        return 0;
                    }
                    return 2;
                }
            }
        }
        return 1;
    }
}
