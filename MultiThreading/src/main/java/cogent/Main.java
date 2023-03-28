/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cogent;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author willbarnes
 */
//class MyThread implements Runnable {
class MyThread extends Thread {
    
    
    MyThread() {
        super("Demo");
        System.out.println("child is: "+this);
        start();
        
    }
    
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

public class Main {
    
    public static void main(String[] args) {
        
        //new MyThread();
        MyThread mt = new MyThread(); //child thread
        //Thread th = new Thread(mt);
        //th.start();
       
        for (int i=5; i > 0; i--) {
            System.out.println("maine tho: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("exiting maine (no more lobster)");
        
        //runnable stuff.
        
       
        
        
        
        //Main st = new Main();
        //st.printNumbers();
        
        /*
        for (int j=0; j<=10; j++) {
            System.out.println("j: "+j+"\t");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        */
    }
    
    /*
    public void printNumbers() {
        for (int i=0; i<=200; i++) {
            System.out.println("i: "+i+"\t");
        }
    }
    */
    
}
