/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6_Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author willbarnes
 */
public class BookDAOImpl implements BookDAO {
    
    int bookId;
    String bookName;
    double bookPrice;
    
    @Override
    public void createBook(ArrayList<Book> List, Book book) {
        List.add(book);
    }
    
    @Override
    public void updateBook(ArrayList<Book> List, int tempId) {
        boolean hasBook = false;
        Scanner sc = new Scanner(System.in);
        Iterator x = List.iterator();
        if (!x.hasNext()) {
            System.out.println("wasteland in here.");
        } else {
            for (Book i : List) { 
                if (i.getBookId() == tempId) {
                    System.out.print("i have it; change name now: ");
                    i.setBookName(sc.nextLine());
                    System.out.println("");
                    System.out.print("and price: ");
                    i.setBookPrice(sc.nextDouble());
                }
            }
            if (!hasBook) { System.out.println("iun have that."); }
        }
    }
    
    @Override
    public void deleteBook(ArrayList<Book> List, int tempId) {
        boolean hasBook = false;
        Iterator x = List.iterator();
        if (!x.hasNext()) {
            System.out.println("nothing left to destroy here.");
        } else {
            for (Book i : List) { 
                if (i.getBookId() == tempId) {
                    System.out.println("goodbye..");
                    List.remove(i);
                    hasBook = true;
                    break;
                }
            }
            if (!hasBook) { System.out.println("iun have that."); }
        }
    }
    
    @Override
    public void findBook(ArrayList<Book> List, int tempId) {
        boolean hasBook = false;
        Iterator x = List.iterator();
        if (!x.hasNext()) {
            System.out.println("there is nothing.");
        } else {
            for (Book i : List) { 
                if (i.getBookId() == tempId) {
                    System.out.println("i have it:");
                    System.out.println(i.getBookName() + ", " + i.getBookPrice());
                }
            }
            if (!hasBook) { System.out.println("iun have that."); }
        }
    }
    
    @Override
    public void printBook(ArrayList<Book> List) {
        Iterator x = List.iterator();
        if (!x.hasNext()) {
            System.out.println("empty.");
        } else {
            System.out.println("printing...");
            System.out.println("");
            int count = 1;
            for (Book i : List) {
                System.out.println("book " + count);
                System.out.println(i.getBookId());
                System.out.println(i.getBookName());
                System.out.println(i.getBookPrice());
                count++;
                System.out.println("");
            }
        }
    }
}
