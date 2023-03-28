/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author willbarnes
 */

class MyThread extends Thread {
//class MyThread extends Thread {
    
    /*
    MyThread() {
        super("Demo");
        System.out.println("child is: "+this);
        start();
        
    }
    */
    
    @Override //use with extends
    public void run() {
        for (int i = 5; i>0; i--){
            System.out.println("child thread: "+i);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        System.out.println("exiting child (cool)");
    }
  
}

public class ThreadDemo extends Thread {
    
    
    
    public static void main(String[] args) {
        
        
        MyThread mt0 = new MyThread();
        mt0.setPriority(MAX_PRIORITY);
        mt0.start();
        
        MyThread mt1 = new MyThread();
        mt1.setPriority(MIN_PRIORITY);
        mt1.start();
        
        
        for (int i=5; i > 0; i--) {
            System.out.println("maine tho: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("exiting maine (no more lobster)");
        
        ThreadDemo m = new ThreadDemo();
        m.start();
        
        try {
            m.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Thread m0 = new Thread();
        m0.setPriority(MAX_PRIORITY);
        m0.start();
        
        
    }

   
    
        
        
        
    
            
}
