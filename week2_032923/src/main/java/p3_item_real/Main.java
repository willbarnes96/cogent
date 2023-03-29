/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3_item_real;

/**
 *
 * @author willbarnes
 */
public class Main {

    static boolean valueSet = false;

    public static void main(String[] args) {

        Storage s = new Storage(0);
        Counter c = new Counter(s.i, valueSet);
        Printer p = new Printer(c.count, valueSet);

        c.start();
        //p.start();

    }

}
