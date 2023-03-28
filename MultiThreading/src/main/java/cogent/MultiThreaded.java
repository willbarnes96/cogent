/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cogent;

/**
 *
 * @author willbarnes
 */
public class MultiThreaded extends Thread {
    public static void main(String[] args) {
        
        MultiThreaded mt0 = new MultiThreaded();
        mt0.setPriority(MAX_PRIORITY);
        mt0.setName("Shiva");
        mt0.start();
        
        MultiThreaded mt1 = new MultiThreaded();
        mt1.setPriority(MIN_PRIORITY);
        mt1.setName("John");
        mt1.start();
        
        
    }
    
    @Override
    public void run() {
        System.out.println("thread name: " + Thread.currentThread().getName());
    }
}
