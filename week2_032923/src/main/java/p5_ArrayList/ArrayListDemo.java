/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5_ArrayList;

/**
 *
 * @author willbarnes
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        Student st = new Student();
        st.setNames("William");
        st.setNames("Guy");
        System.out.println("");
        st.printNames();
        System.out.println("");
        st.searchName("Guy");
        st.searchName("Bob");
        System.out.println("");
        st.removeName("Guy");
        st.removeName("Bob");
        System.out.println("");
        st.searchName(0);
        st.searchName(99);
        
    }
}
