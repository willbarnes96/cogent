/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_Assessment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author willbarnes
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //int tempId;
        
        EmployeeDAOImpl impl = new EmployeeDAOImpl();
        
        ArrayList<Employee> List = new ArrayList<>();
        
        int choice = 0;
        do {
            
            System.out.println("*****************Menu*****************");
            System.out.println("1: Add Employee. ");
            System.out.println("2: Update Employee. ");
            System.out.println("3: Delete Employee. ");
            System.out.println("4: Print All Employees. ");
            System.out.println("5: Find Employee. ");
            System.out.println("6: Sort Employees by Name. ");
            System.out.println("7: exit. ");
            System.out.println("");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            System.out.println("");
            
            
            
            switch(choice) {
                case 1:
                    int tempId; String tempName; String tempAdd; String tempEmail; double tempSal;
                    System.out.println("Add.");
                    System.out.print("Enter ID: ");
                    tempId = sc.nextInt();
                    System.out.println("");
                    System.out.print("Enter Name: ");
                    tempName = sc.next();
                    System.out.println("");
                    System.out.print("Enter Address: ");
                    tempAdd = sc.next();
                    System.out.println("");
                    System.out.print("Enter Email: ");
                    tempEmail = sc.next();
                    System.out.println("");
                    System.out.print("Enter Salary: ");
                    tempSal = sc.nextDouble();
                    System.out.println("");
                    
                    Employee e = new Employee(tempId,tempName,tempAdd,tempEmail,tempSal);
                    impl.create(List, e);

                    System.out.println("added.");
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.print("ID to update?: ");
                    tempId = sc.nextInt();
                    impl.update(List, tempId);
                    System.out.println("");
                    break;
                    
                case 3:
                    System.out.print("ID to delete?: ");
                    tempId = sc.nextInt();
                    impl.delete(List, tempId);
                    System.out.println("");
                    break;
                    
                      
                case 4:
                    impl.print(List);
                    System.out.println("");
                    break;
                
                case 5:
                    System.out.print("ID to find?: ");
                    tempId = sc.nextInt();
                    impl.find(List, tempId);
                    System.out.println("");
                    break;
 
                case 6:
                    System.out.println("sorting...");
                    impl.sort(List);
                    break;
                    
                case 7:
                    System.exit(0);
            }
            
        } while(choice != 7);
        
        /*
        //Employee e1 = new Employee(int empNo, String empName, String empAddress, String empEmail, int empSalary);
        
        //List.add(new Employee(100, "w", "seattle", "w@gmail.com", 10.00));
        
        Employee e1 = new Employee(100, "w", "seattle", "w@gmail.com", 10.00);
        Employee e2 = new Employee(101, "z", "san diego", "f@gmail.com", 30.00);
        Employee e3 = new Employee(102, "g", "portland", "g@gmail.com", 40.00);
        impl.create(List, e1);
        impl.create(List,e2);
        impl.create(List,e3);
        impl.print(List);
        impl.delete(List, 100);
        impl.print(List);
        //impl.update(List, 101);
        impl.print(List);
        impl.find(List, 102);
        impl.sort(List);
        impl.print(List);
        */
    }
}
