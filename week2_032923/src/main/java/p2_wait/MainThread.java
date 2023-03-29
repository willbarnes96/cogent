/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_wait;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author willbarnes
 */
public class MainThread {
    public static void main(String[] args) {
        
        MyThread t = new MyThread();
        t.start();
        
        synchronized (t) {
            System.out.println("main thread waiting");
            
            try {
                t.wait(); //wait and notify work together.
            } catch (InterruptedException ex) {
                Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("main notified");
            System.out.println(t.total);
        }
    }
}
