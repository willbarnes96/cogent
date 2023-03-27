/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2;

/**
 *
 * @author willbarnes
 */
public class BankAccount {
    int accNo;
    String custName;
    String accType;
    float balance;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    public BankAccount() {
        //System.out.println("y're new here i see.");
    }
    
    public BankAccount(int accNo, String custName, String accType, float balance) {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        this.balance = balance;
    }
    
    void deposit(float amt) throws NegativeAmount {
        balance += amt;
    }
    
    void withdraw(float amt) throws Exception {
        balance -= amt;
    }
    
    float getBalance() throws LowBalanceException {
        return balance;
    }
    
    
}
