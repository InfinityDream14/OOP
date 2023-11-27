/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;

import static back.Storage.users;
import front.LogIn;
import java.lang.System.Logger;

/**
 *
 * @author cdgan
 */
public class checkEP {
//    LogIn l = new LogIn();
    public checkEP(){

    }
    
    public boolean compareUser(String username, String password) {
        int flag = 0;
        for (int i = 0; i < users.size(); i++) {
            String user = users.get(i);
            if (flag == 1) {
                break;
            } else {
                if (user.equals(username)) {
                    return true;
                }
            }
        }
        return true;
    }
}
