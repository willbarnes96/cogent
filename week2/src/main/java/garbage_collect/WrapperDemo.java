/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garbage_collect;

/**
 *
 * @author willbarnes
 */
public class WrapperDemo {
   
    public static void main(String[] args) {
        //ex. 1
        int x = 100; //primitive
        Integer y = Integer.valueOf(x); //boxing
        int z = y.intValue(); //unboxing
        
        //ex. 2
        byte a = 100;
        String s = Byte.toString(a);
        byte k = Byte.parseByte(s);
        
        //ex. 3
        long l = 1000;
        Long l2 = Long.valueOf(l);
        String i = l2.toString();
        Long l3 = Long.valueOf(i);
        
    }
    
}
