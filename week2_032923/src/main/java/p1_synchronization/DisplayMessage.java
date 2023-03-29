/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_synchronization;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author willbarnes
 * 
 * members of object class: wait(), notify(), notifyAll()
 */
public class DisplayMessage {
    
    public synchronized void sayHello(String name) {
        
        for (int i = 0; i <= 10; i++) {
            
            System.out.println("yo " + name + ".");
            
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(DisplayMessage.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }  
    }
}
