/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cogent;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author willbarnes
 */
public class JoinDemo extends Thread {
    
    static int n, sum = 0;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();
        
        System.out.println("Son of N...");
        System.out.print("pick yr poison: ");
        JoinDemo.n=sc.nextInt();
        
        JoinDemo jd = new JoinDemo();
        jd.start(); //main thread
        
        try {
            jd.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JoinDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Sum of first " + JoinDemo.n + " numbers is " + JoinDemo.sum);
        long end = System.currentTimeMillis();
        System.out.println("how much of yr life has passed by: " + (end-start)/1000 + " seconds. ouch.");
        
    }

    @Override
    public void run() { //begins upon start() call
        
        for (int i = 1; i <= JoinDemo.n; i++) {
            JoinDemo.sum += i;
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(JoinDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
           
    
    
}
