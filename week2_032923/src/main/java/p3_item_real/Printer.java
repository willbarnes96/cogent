/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3_item_real;

/**
 *
 * @author willbarnes
 */
public class Printer extends Thread {
    
    boolean valueSet;
    int count;
    Storage s = new Storage(count);

    public Printer(int count, boolean valueSet) {
        this.count = count;
        this.valueSet = valueSet;
        new Thread(this, "Printer").start();
    }

    @Override
    public void run() {
        
        while (!valueSet) {
            
        }
        
        System.out.println("printing: " + count);
    }
    
    
    
}
