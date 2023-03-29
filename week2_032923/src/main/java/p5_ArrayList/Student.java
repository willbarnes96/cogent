/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author willbarnes
 */
public class Student {
    private ArrayList<String> names = new ArrayList<>();
    
    
    public void setNames(String name) {
        names.add(name);
        System.out.println(name + " added.");
    }
    
    public void searchName(String name) {
        if (names.contains(name)) {
            System.out.println("yup, it's in there. (Stringwise)");
        } else {
            System.out.println("nop lol (Stringwise)");
        }
    }
    
    public void searchName(int index) {
            try {
                System.out.println("stude: " + names.get(index));
            } catch (Exception e) {
                System.out.println("that index isn't real");
            }
    }
    
    public void printNames() {
        System.out.println("Printing...");
        for (String i : names) {
            System.out.println(i);
        }
    }
    
    public void removeName(String stuName) {
        if (names.contains(stuName)) {
            names.remove(stuName);
        }
    }
    
}
