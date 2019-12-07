/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinc1000;

import java.io.PrintStream;

/**
 *
 * @author monaco.federica
 */
public class TestInc1000 extends Thread {

    /**
     * @param args the command line arguments
     */
    public static synchronized void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Inc1000 t1 = new Inc1000();
        Inc1000 t2 = new Inc1000();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        
        System.out.println(Inc1000.count);
        }
    }
    

