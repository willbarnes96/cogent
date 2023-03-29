/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3_item_real;

/**
 *
 * @author willbarnes
 */
public class Counter extends Thread {
    
    boolean valueSet;
    int count;
    Storage s = new Storage(count);

    public Counter(int count, boolean valueSet) {
        this.count = count;
        this.valueSet = valueSet;
        new Thread(this, "Counter").start();
    }

    @Override
    public void run() {
        while(valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("interruption");
            }
        }
        this.count = count++;
        valueSet = true;
        System.out.println("counting: " + count);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        notify(); // i think this notifies consumer.
    }
    
    
    
    
    
}
