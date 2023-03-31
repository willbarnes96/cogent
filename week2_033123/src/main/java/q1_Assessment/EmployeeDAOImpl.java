/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_Assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author willbarnes
 */
public class EmployeeDAOImpl implements EmployeeDAO {
    
    Scanner sc = new Scanner(System.in);

    @Override
    public void create(ArrayList<Employee> List, Employee emp) {
        List.add(emp);
    }

    @Override
    public void update(ArrayList<Employee> List, int tempId) {
        System.out.println("Looking for " + tempId + "...");
        
        boolean hasEmp = false;
        Iterator x = List.iterator();
        if (!x.hasNext()) {
            System.out.println("nothing to update here.");
            System.out.println("");
        } else {
            for (Employee i : List) { 
                if (i.getEmpNo() == tempId) {
                    System.out.print("i have it; change name now: ");
                    i.setEmpName(sc.nextLine());
                    System.out.println("");
                    System.out.print("and address: ");
                    i.setEmpAddress(sc.nextLine());
                    System.out.println("");
                    System.out.print("and email: ");
                    i.setEmpEmail(sc.nextLine());
                    System.out.println("");
                    System.out.print("and salary: ");
                    i.setEmpSalary(sc.nextDouble());
                    System.out.println("");
                    System.out.println("updated.");
                    System.out.println("");
                    hasEmp = true;
                    break;
                }
            }
            if (!hasEmp) { System.out.println("No employee with that ID."); }
        }
    }

    @Override
    public void delete(ArrayList<Employee> List, int tempId) {
        System.out.println("Looking for " + tempId + "...");
        
        boolean hasEmp = false;
        Iterator x = List.iterator();
        if (!x.hasNext()) {
            System.out.println("nothing left to destroy here.");
            System.out.println("");
        } else {
            for (Employee i : List) { 
                if (i.getEmpNo() == tempId) {
                    System.out.println("goodbye..");
                    System.out.println("");
                    List.remove(i);
                    hasEmp = true;
                    break;
                }
            }
            if (!hasEmp) { System.out.println("No employee with that ID."); }
        }
        
    }

    @Override
    public void print(ArrayList<Employee> List) {
        
        Iterator x = List.iterator();
        
        if(!x.hasNext()) {
            System.out.println("nothing to print");
        } else {
            System.out.println("printing all...");
            System.out.println("");

            for (Employee e : List) {
                System.out.println("ID: " + e.getEmpNo() + ": " + e.getEmpName() + ", " + e.getEmpAddress() + ", " + e.getEmpEmail() + ", $" + e.getEmpSalary());
            }
        }
    }

    @Override
    public void find(ArrayList<Employee> List, int tempId) {
        boolean hasEmp = false;
        Iterator x = List.iterator();
        if (!x.hasNext()) {
            System.out.println("there is nothing.");
        } else {
            for (Employee i : List) { 
                if (i.getEmpNo() == tempId) {
                    System.out.println("i have it:");
                    System.out.println(i.getEmpName() + ", " + i.getEmpAddress() + ", " + i.getEmpEmail() + ", $" + i.getEmpSalary());
                    hasEmp = true;
                }
            }
            if (!hasEmp) { System.out.println("No employee with that ID."); }
        }
    }

    @Override
    public void sort(ArrayList<Employee> List) { //sort by name
        Iterator x = List.iterator();
        
        if(!x.hasNext()) {
            System.out.println("nothing to sort");
        } else {
            System.out.println("sorting by name...");
            Collections.sort(List,new EmployeeComparator());
        }
        
        
    }
    
    
    
}
