/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package q1_Assessment;

import java.util.ArrayList;

/**
 *
 * @author willbarnes
 */
public interface EmployeeDAO {
    
    abstract void create(ArrayList<Employee> List, Employee emp);
    abstract void update(ArrayList<Employee> List, int tempId);
    abstract void delete(ArrayList<Employee> List, int tempId);
    abstract void print(ArrayList<Employee> List);
    abstract void find(ArrayList<Employee> List, int tempId);
    abstract void sort(ArrayList<Employee> List);
    
    
}