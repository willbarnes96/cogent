/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

/**
 *
 * @author willbarnes
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Product p[] = null; //remember to change back to 10 please!!!!!
        ProductDAO dao = new ProductDAO();
        int choice = 0;
        
        do {
            System.out.println("*****************Menu*****************");
            System.out.println("1: Add a Product. ");
            System.out.println("2: Print Products. ");
            System.out.println("3: Update (Product ID required). ");
            System.out.println("4: Delete (Product ID required). ");
            System.out.println("5: Exit. ");
            System.out.println("");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            System.out.println("");
            
            switch(choice) {
                case 1:
                    System.out.println("");
                    System.out.print("How many records to add?: ");
                    int count = sc.nextInt();
                    p = new Product[count];
                    for (int i=0; i<p.length; i++) {
                        dao.create(p,i);
                    }
                    break;
                    
                case 2:
                    if (p == null || p.length == 0) {
                        System.out.println("no products yet.");
                        break;
                    }
                    dao.read(p);
                    break;
                    
                case 3:
                    if (p == null || p.length == 0) {
                        System.out.println("no products yet.");
                        break;
                    }
                    dao.update(p);
                    break;
                    
                case 4:
                    if (p == null || p.length == 0) {
                        System.out.println("no products yet.");
                        break;
                    }
                    dao.delete(p);
                    break;
                    
                case 5:
                    System.exit(0);
                
            }
                
            
        } while (choice != 5);
        
        
    }
}
