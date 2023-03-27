/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garbage_collect;
import java.util.Scanner;
/**
 *
 * @author willbarnes
 */
public class CheckAgeClass {
    
    public void validateAge(int age) throws InvalidAgeException {
        if (age <= 100 && age > 0) {
            System.out.println("y're good2go bud");
        } else {
            //System.out.println("wut");
            throw new InvalidAgeException("invalid");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age: ");
        int age = sc.nextInt();
        
        CheckAgeClass ck = new CheckAgeClass();
        
        try {
            ck.validateAge(age);
        } catch(InvalidAgeException ia) {
            System.out.println("nope. wrong. an oopsie, even. " + ia.getMessage());
        }
    }
}
