/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Say;

/**
 *
 * @author monaco.federica
 */
public class Say extends Thread {
    
    String parola;
    public Say (String parola){
        this.parola = parola;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(parola);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Say p1 = new Say("Hi");
            Say p2 = new Say ("Hello");
            p1.start();
            p2.start();
        }
    }
   
