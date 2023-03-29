/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_wait;

/**
 *
 * @author willbarnes
 */
public class MyThread extends Thread { //child thread here.
    int total;

    @Override
    public void run() 
    {
        System.out.print("Bayou Boogie");
        synchronized (this) 
        {
            for (int i = 1; i <= 100; i++) 
            {
                total+=i;
            }
            System.out.println("");
            this.notify(); //checks current thread waiting, tells it to awake
            //wait and notify work together.
        }
    }
}
