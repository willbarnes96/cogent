/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_synchronization;

import p1_synchronization.MyNewThread;
import p1_synchronization.DisplayMessage;

/**
 *
 * @author willbarnes
 */
public class SynchronizationDemo {
    public static void main(String[] args) {
        
        DisplayMessage dm = new DisplayMessage();
        MyNewThread t1 = new MyNewThread(dm, "FEAROFDARK");
        MyNewThread t2 = new MyNewThread(dm, "disasterpiece");
        
        t1.start();
        t2.start();
        
    }
}
