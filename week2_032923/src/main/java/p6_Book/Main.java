
package p6_Book;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author willbarnes
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tempId;
        
        BookDAOImpl impl = new BookDAOImpl();
        
        ArrayList<Book> List = new ArrayList<>();
        
        
        
        
        int choice = 0;
        do {
            
            System.out.println("*****************Menu*****************");
            System.out.println("1: Add Book. ");
            System.out.println("2: Update Book. ");
            System.out.println("3: Delete Book. ");
            System.out.println("4: Find Book. ");
            System.out.println("5: Print List. ");
            System.out.println("6: exit. ");
            System.out.println("");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            System.out.println("");
            
            
            
            switch(choice) {
                case 1:
                   Book book1 = new Book();
                   Book book2 = new Book();
                   //change to manual later
                   book1.setBookId(100);
                   book1.setBookName("heart of darkness");
                   book1.setBookPrice(5.99);
                   
                   impl.createBook(List, book1);
                   
                   book2.setBookId(101);
                   book2.setBookName("crime and punishment");
                   book2.setBookPrice(4.99);
                   
                   impl.createBook(List, book2);
                   
                   System.out.println("done.");
                   System.out.println("");
                   break;
                    
                case 2:
                    System.out.print("ID to update?: ");
                    tempId = sc.nextInt();
                    impl.updateBook(List, tempId);
                    System.out.println("ok.");
                    System.out.println("");
                    break;
                    
                case 3:
                    System.out.print("ID to delete?: ");
                    tempId = sc.nextInt();
                    impl.deleteBook(List, tempId);
                    System.out.println("");
                    break;
                
                case 4:
                    System.out.print("ID to find?: ");
                    tempId = sc.nextInt();
                    impl.findBook(List, tempId);
                    System.out.println("");
                    break;
                
                case 5:
                    impl.printBook(List);
                    System.out.println("");
                    break;
                    
                case 6:
                    System.exit(0);
            }
            
        } while(choice != 6);
        
        
    }
}
