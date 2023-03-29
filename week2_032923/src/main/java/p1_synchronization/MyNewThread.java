/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_synchronization;

import p1_synchronization.DisplayMessage;

/**
 *
 * @author willbarnes
 */
public class MyNewThread extends Thread {
    
    DisplayMessage dm;
    String name;
    
    public MyNewThread(DisplayMessage dm, String name) {
        this.dm = dm;
        this.name = name;
    }

    @Override
    public void run() {
        dm.sayHello(name);
    }
    
    
    
}
