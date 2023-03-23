/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1_032323.pkg2;
import com.mycompany.q1_032323.*;
import java.util.Scanner;
/**
 *
 * @author willbarnes
 */
public class TestRectangle {
    
    
    public static void main(String[] args) {
        Rectangle rct = new Rectangle();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input length: ");
        rct.setLength(sc.nextInt());
        System.out.print("Input Breadth: ");
        rct.setBreadth(sc.nextInt());
        
        rct.calcArea();
        rct.display();
        
    }
}
