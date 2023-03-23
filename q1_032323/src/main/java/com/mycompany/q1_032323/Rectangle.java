/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1_032323;

/**
 *
 * @author willbarnes
 */
public class Rectangle {
    
    float length;
    float breadth;
    float area = 0;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }
    
    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calcArea() {
        area = length * breadth;
    }
    
    public void display() {
        System.out.println("len: " + length + ", bre: " + breadth + ", area: " + area + ".");
    }
    
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
    
}
