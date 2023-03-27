/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3;
import java.util.Scanner;
/**
 *
 * @author willbarnes
 */
public class Emp {
    
    Scanner sc = new Scanner(System.in);
    int empId;
    String empName;
    String designation;
    double basic;
    final double hra;
    /*
    public static void validateDes(String designation) throws NameException {
        if (designation != "Manager" && designation != "Officer" && designation != "Clerk") {
            throw new NameException("invalid designation.");
        } 
    }

    public static void validateBasic(double basic) throws LowSalException {
        if (basic < 500) {
            throw new LowSalException("low salary.");
        } 
    }
    */
    public Emp(int empId, String empName, String designation, double basic) {
        this.empId = empId;
        this.empName = empName;
        this.basic = basic;
        this.designation = designation;
        /*
        try {
            validateBasic(basic);
        } catch(LowSalException e) {
                System.out.println("error: " + e.getMessage());
        }
        */
        //this.designation = designation;
        /*
        try {
                validateDes(designation);            
            } catch(NameException e) {
                System.out.println("error: " + e.getMessage());
                System.out.println("choose 1 for officer, 2 for manager or 3 for clerk please: ");
                switch(sc.nextInt()){
                    case 1: this.designation = ("Officer");
                    case 2: this.designation = ("Manager");
                    case 3: this.designation = ("Clerk");
                }           

            }
        */
        
        switch (designation) {
            case "Manager":
                this.hra = basic * 0.1;
                break;
            case "Officer":
                this.hra = basic * 0.12;
                break;
            case "Clerk":
                this.hra = basic * 0.05;
                break;
            default: //mandatory to be here but not required i think
                //System.out.println("not a valid response but let's continue");
                this.hra = basic;
                break;
        }
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getBasic() throws LowSalException {
        
        

        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public void printDET() {
        System.out.println("empId: " + this.empId);
        System.out.println("empName: " + this.empName);
        System.out.println("empDesignation: " + this.designation);
        System.out.println("empBasic: " + this.basic);     
        System.out.println("hra: " + this.hra);
    }
    
    
}
