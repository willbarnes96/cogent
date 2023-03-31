/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_Assessment;

/**
 *
 * @author willbarnes
 */
public class Employee {
    int empNo;
    String empName;
    String empAddress;
    String empEmail;
    double empSalary;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public Employee(int empNo, String empName, String empAddress, String empEmail, double empSalary) {
        this.empNo = empNo;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empEmail = empEmail;
        this.empSalary = empSalary;
    }
    
    
    
    
    
}
