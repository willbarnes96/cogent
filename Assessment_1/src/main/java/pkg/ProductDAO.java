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
public class ProductDAO {
    
    Scanner sc = new Scanner(System.in);
    
    public void create(Product product[], int i) { //just has user input them all
            Product p = new Product();
            product[i] = p;
        
            System.out.print("Enter Product ID [int]: ");
            product[i].setID(sc.nextInt());
            System.out.print("Enter Product Name [String]: ");
            product[i].setName(sc.next());
            System.out.print("Enter Product price [Float]: ");
            product[i].setPrice(sc.nextFloat());
            System.out.println("");
        
        
    }
    
    public void read(Product product[]) {
        if (product.length == 0 || product == null){
            System.out.println("no products yet.");
            System.out.println("");
            return;
        }
        
        for (Product p: product) {
            if (p == null){  
                continue;
            }
                System.out.println("Product ID [int]: " + p.getID());
                System.out.println("Product name [String]: " + p.getName());
                System.out.println("Product price [float]: " + p.getPrice());
                System.out.println("");
        }
    }
    
    public void update(Product product[]) {
        if (product == null){
            System.out.println("no products yet.");
            System.out.println("");
            return;
        }
        
        System.out.print("Enter Product ID: ");
        int tempID = sc.nextInt();
        System.out.println("");
        
        for (Product p: product) {
            if (p.getID() == tempID) {
                System.out.print("New name: ");
                p.setName(sc.next());
                System.out.print("New price: ");
                p.setPrice(sc.nextFloat());
                System.out.println("");
            }
        }
    }
    
    public void delete(Product product[]) {
        if (product == null){
            System.out.println("no products yet.");
            System.out.println("");
            return;
        }
        
        System.out.print("Enter product ID: ");
        int tempID = sc.nextInt();
        System.out.println("");
        
        for (int i=0; i<product.length; i++) {
            if (product[i].getID() == tempID) {
                product[i]=null;
                
                System.out.println(tempID + " deleted.");
            }
        }
    }
    
}
