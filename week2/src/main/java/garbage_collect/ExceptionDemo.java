/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garbage_collect;
import java.util.Scanner;
/**
 *
 * @author willbarnes
 * 
 * 
 */

class Arithmetic {
    
    public void division(int x, int y) throws ArithmeticException {
        int z = x / y;
        System.out.println(z);
    }
    
}



public class ExceptionDemo {
    
    public static void message() { System.out.println("Restore the triforce plz"); }
    
    public static void main(String[] args) {
        
        /*
        try {
            new Arithmetic().division(500, 0);
        } catch(Exception e) {
            e.printStackTrace();
        }
        */
        
        /*
        try { 
            String input = args[0];
            System.out.println("input: " + input);
            int output = Integer.parseInt(input);
            System.out.println("output: " + output);
        }
        catch(Exception e) {
            e.printStackTrace(); 
        }
        finally {
            System.out.println("this is the output of finally");
        }
        */
        
        /*
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("arrayOOB");
        }
        catch(NumberFormatException e) {
            System.out.println("numformatexc");
        }
        */
        
       
        
        
        //ExceptionDemo demo = null; //doesn't throw an error interestingly
        //demo.message();
        //ExceptionDemo.message();
        
        /* arrayoutofboundsexception [compile error]
        
        String names[] = {"Link","Ganondorf","Zelda"};
        
        try {
            System.out.println(names[10]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("too big haha");
        }
        
        System.out.println("you made it gj");
        
        
        */
        
        /* div by 0 exception
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        try { 
            int z = x / y;
            System.out.println("z: " + z);
        } 
        catch(ArithmeticException e) { System.out.println("div by 0");}
        //*/


        System.out.println("Good evening.. (Dracula voice)");
        
        
    }
    
}
