/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author monaco.federica
 */
public class HiHello {
    
    public static void main (String[] args){
        Hi ohi = new Hi();
        Hello ohello = new Hello();
        ohi.start();
        ohello.start();
    }
    
    
}
