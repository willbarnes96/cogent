/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garbage_collect;

/**
 *
 * @author willbarnes
 */
public class WrapperQ1 {
    
    public static void main(String[] args) {
        
        int a = 1;
        double b = 2.0;
        long c = 3;
        char d = 'd';
        float e = 4f;
        byte f = 5;
        short g = 6;
        boolean h = true;
        
        
        Integer A = Integer.valueOf(a);
        Double B = Double.valueOf(b);
        Long C = Long.valueOf(c);
        Character D = Character.valueOf(d);
        Float E = Float.valueOf(e);
        Byte F = Byte.valueOf(f);
        Short G = Short.valueOf(g);
        Boolean H = Boolean.valueOf(h);
        
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);
        System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + F + " " + G + " " + H);
        
        a = A.intValue();
        b = B.doubleValue();
        c = C.longValue();
        d = D.charValue();
        e = E.floatValue();
        
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        
        String a_ = Integer.toString(a);
        a = Integer.parseInt(a_);
        
        String b_ = Double.toString(b);
        b = Double.parseDouble(b_);
        
        String c_ = Long.toString(c);
        c = Long.parseLong(c_);
        
        
        
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    }
    
}
