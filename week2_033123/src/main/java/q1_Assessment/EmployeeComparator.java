/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_Assessment;

import static java.lang.Integer.parseInt;
import java.util.Comparator;

/**
 *
 * @author willbarnes
 */
public class EmployeeComparator implements Comparator<Employee> {
    
    @Override
    public int compare(Employee o1, Employee o2) {
        String temp1 = o1.getEmpName();
        String temp2 = o2.getEmpName();
        return temp1.compareTo(temp2);
        
    }
    
}
