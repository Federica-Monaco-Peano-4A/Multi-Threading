/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author monaco.federica
 */
public class Hello extends Thread{
    
    Hello (){
        System.out.println("Oggetto Hello istanziato");
    }
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hello.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
