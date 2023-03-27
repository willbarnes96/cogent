/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2;

/**
 *
 * @author willbarnes
 */

import java.util.Scanner;

public class CalcAverage {
    
    static double averageN;
    static BankAccount acc = new BankAccount();       
    
    public static void avgFirstN(int N) throws IllegalArgumentException {
        
        double avg = 0;
        
        if (N > 0 && N <= 1000) {
            for (int i = 1; i <= N; i++) {
                avg += i;
            }
            averageN = (avg/N);
        } else {
            throw new IllegalArgumentException("invalid");
        }

    }
    
    public static void validateDeposit(float amt) throws NegativeAmount {
        if (amt > 0) {
            System.out.println("deposited " + amt);
        } else {
            //System.out.println("wut");
            throw new NegativeAmount("amt must be positive.");
        }
    }
    
    public static void validateWithdraw(float bal, float amt) throws Exception {
        if (bal < 1000) {
            //System.out.println("wut");
            throw new InsufficientFunds("not enough in the bank.");
        } else if (amt < 0) {
            throw new NegativeAmount("amt must be positive.");
        }
    }
    
    public static void validateBalance(float bal) throws LowBalanceException {
        if (acc.getAccType().equals("savings") && bal < 5000) {
            throw new LowBalanceException("low savings balance.");
        } else if (acc.getAccType().equals("checking") && bal < 1000) {
            throw new LowBalanceException("low checking balance.");
        }
    }
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Number nums = new Number();
        //BankAccount acc = new BankAccount(100,"william","savings",5000f);
        
        
        do {
            System.out.println("*****************Menu*****************");
            System.out.println("1: Bank");
            System.out.println("2: Arithmetic");
            System.out.println("3: Exit. ");
            System.out.println("");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch(choice) { 
                case 1: //bank
                    
                    System.out.print("accNo: ");
                    acc.setAccNo(sc.nextInt());
                    System.out.print("customer name: ");
                    acc.setCustName(sc.next());
                    System.out.print("acctype?: 1 for savings, 2 for checking: ");
                    if (sc.nextInt()==1) {
                        acc.setAccType("savings");
                    } else if (sc.nextInt()==2) {
                        acc.setAccType("checking");
                    }
                    
                    System.out.print("balance?: ");
                    acc.setBalance(sc.nextFloat());
                    
                    do {
                        System.out.println("");
                        System.out.println("*****************Bank*****************");
                        System.out.println("1: Deposit");
                        System.out.println("2: Withdraw");
                        System.out.println("3: Get Balance");
                        System.out.println("4: Exit. ");
                        System.out.println("");
                        System.out.print("Enter choice: ");
                        choice = sc.nextInt();
                        float amt;
            
                        switch(choice) {
                            case 1:
                    
                                System.out.print("amt to deposit: ");
                                amt = sc.nextFloat();
                    
                            try {
                                 validateDeposit(amt);
                                    acc.deposit(amt);
                                } catch(NegativeAmount e) {
                                    System.out.println("no." + e.getMessage());
                                } finally {
                                    System.out.println("");
                                }
                    
                    
                                break;
                    
                            case 2:
                                System.out.print("amt to withdraw: ");
                                amt = sc.nextFloat();
                    
                                try {
                                    validateWithdraw(acc.balance,amt);
                                    acc.withdraw(amt);
                                } catch(Exception e) {
                                    System.out.println("no." + e.getMessage());
                                } finally {
                                    System.out.println("");
                                }
                    
                                break;
                    
                            case 3:
                    
                                try {
                                 validateBalance(acc.getBalance());
                                 System.out.println("balance: " + acc.balance);
                             } catch(LowBalanceException e) {
                                 System.out.println("nop." + e.getMessage());
                             } finally {
                                  System.out.println("");
                                }
                       
                                break;
                            case 4:
                                System.exit(0);
                        }
                    } while (choice != 5);
                        
                case 2:     
                    do {
                        System.out.println("");
                        System.out.println("*****************Math*****************");
                        System.out.println("1: Add");
                        System.out.println("2: Subtract");
                        System.out.println("3: Multiply");
                        System.out.println("4: Divide");
                        System.out.println("5: AvgN");
                        System.out.println("6: Exit. ");
                        System.out.println("");
                        System.out.print("Enter choice: ");
                        choice = sc.nextInt();
            
                        switch(choice) {
                            case 1:
                                System.out.print("First num: ");
                                //int f_num = sc.nextInt();
                                nums.setFirst_num(sc.nextInt());
                                System.out.print("Second num: ");
                                //int s_num = sc.nextInt();
                                nums.setSecond_num(sc.nextInt());
                                nums.add();
                                System.out.println(nums.getResult());
                                break;

                            case 2:
                                System.out.print("First num: ");
                                //int f_num = sc.nextInt();
                                nums.setFirst_num(sc.nextInt());
                                System.out.print("Second num: ");
                                //int s_num = sc.nextInt();
                                nums.setSecond_num(sc.nextInt());
                                nums.sub();
                                System.out.println(nums.getResult());
                                break;

                            case 3:
                                System.out.print("First num: ");
                                //int f_num = sc.nextInt();
                                nums.setFirst_num(sc.nextInt());
                                System.out.print("Second num: ");
                                //int s_num = sc.nextInt();
                                nums.setSecond_num(sc.nextInt());
                                nums.mul();
                                System.out.println(nums.getResult());
                                break;

                            case 4:
                                System.out.print("First num: ");
                                //int f_num = sc.nextInt();
                                nums.setFirst_num(sc.nextInt());
                                System.out.print("Second num: ");
                                //int s_num = sc.nextInt();
                                nums.setSecond_num(sc.nextInt());
                                

                                try {
                                    nums.div();
                                    System.out.println(nums.getResult());
                                } catch(Exception e) {
                                    e.printStackTrace();
                                }
                                
                                break;
                                
                            case 5:
                                System.out.print("Enter natural number: ");
                                
                                try {
                                    avgFirstN(sc.nextInt());
                                    System.out.println(averageN);
                                } catch(Exception e) {
                                    System.out.println("not a valid number: " + e.getMessage());
                                } finally {
                                    System.out.println("");
                                }
                                
                                
                                
                                break;

                            case 6:
                                System.exit(0);
                        }

                    } while (choice!=5);
                
                        }
            
        } while (choice != 3);
        
        
        
        
        /*
        
        
        */
        
        /*
        Number nums = new Number(3,2);
        
        try {
            //System.out.println(avgFirstN(13));
            nums.div();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        */
        
    }
    
}
