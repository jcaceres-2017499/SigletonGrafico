
package org.juancaceres.clases;

import javax.swing.JFrame;
import org.juancaceres.system.Login;


public class LoginSigleton {
    private static JFrame log;
    
    private LoginSigleton() {
        
    }
    
    public static JFrame getInsatance(){
        if (log == null)
            log = new Login();
        return log;
    }
    
}
