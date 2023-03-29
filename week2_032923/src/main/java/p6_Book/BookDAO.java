/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6_Book;

import java.util.ArrayList;

/**
 *
 * @author willbarnes
 */
public interface BookDAO {
    
    abstract void createBook(ArrayList<Book> List, Book book);
    abstract void updateBook(ArrayList<Book> List, int tempId);
    abstract void deleteBook(ArrayList<Book> List, int tempId);
    abstract void findBook(ArrayList<Book> List, int tempId);
    abstract void printBook(ArrayList<Book> List);
    
}
