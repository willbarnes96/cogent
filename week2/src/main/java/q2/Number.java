/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2;

/**
 *
 * @author willbarnes
 */

public class Number {
    int first_num;
    int second_num;
    double result;

    public int getFirst_num() {
        return first_num;
    }

    public void setFirst_num(int first_num) {
        this.first_num = first_num;
    }

    public int getSecond_num() {
        return second_num;
    }

    public void setSecond_num(int second_num) {
        this.second_num = second_num;
    }
    
    public double getResult() {
        return result;
    }
    
    public Number(int x, int y) { //constructor
        this.first_num = x;
        this.second_num = y;
    }
    
    public Number() {}
    
    void add() { result = first_num + second_num; }
    void sub() { result = first_num - second_num; }
    void mul() { result = first_num * second_num; }
    
    void div() throws ArithmeticException { 
        
        result = first_num / second_num; 
        
        /*
        try {
            result = first_num / second_num; 
        } catch(Exception e) {
            e.printStackTrace();
        }
        */
        
    }
    
    
}
