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
public class q3_Main {
    
    public static void validateDes(String designation) throws NameException {
        if (!designation.equals("Manager") && !designation.equals("Officer") && !designation.equals("Clerk")) {
            throw new NameException("invalid designation.");
        } 
    }
    
    public static void validateBasic(double basic) throws LowSalException {
        if (basic <= 500) {
            throw new LowSalException("low salary.");
        } 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Emp w[] = new Emp[3];
        int index = 0;
        
        do {
            System.out.println("");
            System.out.print("1 to enter a person (3 max), 2 to display them all, 3 to exit: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("id: ");
                    //w[index].setEmpId(sc.nextInt());
                    int temp_id = sc.nextInt();
                    
                    System.out.print("name: ");
                    //w[index].setEmpName(sc.nextLine());
                    String temp_name = sc.next();
                    
                    String temp_des="";
                    System.out.print("designation: ");
                    try {
                        temp_des = sc.next();
                        validateDes(temp_des);
                    } catch(NameException e) {
                        System.out.println("error: " + e.getMessage());
                        System.out.println("choose 1 for officer, 2 for manager or 3 for clerk please: ");
                        
                        switch(sc.nextInt()){
                            case 1: temp_des = ("Officer");
                            case 2: temp_des = ("Manager");
                            case 3: temp_des = ("Clerk");
                        }           
                        System.out.println("");
                    }
            
                    
                    System.out.print("basic: ");
                    int temp_basic;
                    try {
                        temp_basic = sc.nextInt();
                        validateBasic(temp_basic);
                        //w[index].setBasic(sc.nextInt());
                    } catch(LowSalException e) {
                        System.out.println("error: " + e.getMessage() + ". setting to 501");
                        temp_basic = 501;
                    }
                    
                    w[index] = new Emp(temp_id,temp_name,temp_des,temp_basic);
                    index++;
                    break;
                    
                case 2:
                    for (int i = 0; i<index; i++){
                        w[i].printDET();
                    }
                    break;
                    
                case 3:
                    System.exit(0);
            }           
                
    
        } while(choice != 3);
    }   
}      
        /*
        Emp w[] = new Emp[6];
        w[0] = new Emp(100,"william","Manager",1000);      
        w[1] = new Emp(101,"herman","Officer",1000);
        w[2] = new Emp(102,"leo","C",1000);
        w[3] = new Emp(103,"mike","Manager",499);      
        w[4] = new Emp(104,"raph","Officer",499);
        w[5] = new Emp(105,"don","Clerk",499);
        */
        
        /*
        for (Emp i : w) {
            
            try {
                validateDes(i.getDesignation());
                i.printDET();
            } catch(NameException e) {
                System.out.println("error: " + e.getMessage());
                System.out.println("choose 1 for officer, 2 for manager or 3 for clerk please: ");
                switch(sc.nextInt()){
                    case 1: i.setDesignation("Officer");
                    case 2: i.setDesignation("Manager");
                    case 3: i.setDesignation("Clerk");
                }           
                i.printDET();
                System.out.println("");
            }
            
           
            try {
                validateBasic(i.getBasic());
            } catch(LowSalException e) {
                System.out.println("error: " + e.getMessage());
            }
            System.out.println("");
            System.out.println("");
        }
        */
        
        
        

    }
}
