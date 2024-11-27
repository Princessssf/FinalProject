/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

import javax.swing.ImageIcon;

/**
 *
 * @author YTAC
 */
public class Top extends Product{
    
    private String size;
    private int amount;
    private double total;
    
    Top(ImageIcon icon, String name, double price, int amount, String size) {
        super(icon, name, price);
        this.size = size;
        this.amount = amount;
        this.total = this.price * this.amount;
    }
    
    public void addAmount(int amount) {
        this.amount += amount;
        this.total = this.price * this.amount;
    }
    
    public int getAmount() {
        return this.amount;
    }
    
    public double getTotal() {
        return this.total;
    }
    
    public String getSize() {
        return this.size;
    }
    
}
