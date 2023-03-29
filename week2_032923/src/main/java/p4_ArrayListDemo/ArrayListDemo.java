/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4_ArrayListDemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author willbarnes
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        
        //demo2 runtime polymorphism & important methods
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10) {
            list.add(i);
        }
        System.out.println("cool. " + list);
        list.add(2, 100); //inserts
        System.out.println("cool. after insertion: " + list);
        
        
        list.set(3,300); //replaces
        System.out.println("cool3. " + list);
        
        List<Integer> secondList = new ArrayList<Integer>();
        secondList.add(111);
        secondList.add(222);
        secondList.add(333);
        
        System.out.println("2nd v: " + secondList);
        list.addAll(4, secondList);
        System.out.println("neu: " + list);
        
        if(list.contains(222)) {
            System.out.println("It's in there.");
        } else {
            System.out.println("LOL nope.");
        }
        
        list.remove(5);
        System.out.println(list);
        
        /*demo 1 /*
        ArrayList<Integer> al = new ArrayList<>(); //storing different types is bad practice
        al.add(new Integer(20));
        al.add(Integer.valueOf(40));
        al.add(50); //Auto-Boxing (converts primitive into object automatically)
        //al.add("Auteuil"); //won't work since i added <Integer>
        //al.add("Chateau D'If");
        
        for (Object object : al) {
            String str = object.toString();
            int a = Integer.parseInt(str);
            System.out.println("ayyyy: " + a);
            
        }
        
        //Iterator
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }
        
        System.out.println(al);
        
        */
    }
}
