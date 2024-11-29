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
public class Accessory extends Product{
    
    private int amount;
    private double total;
    
    Accessory(ImageIcon icon, String name, double price, int amount) {
        super(icon, name, price);
        this.amount = amount;
        this.total = price * amount;
    }
    
    public void setColor(String color) {
        super.name = super.name + color;
    }
    
    public void addAmount(int amount) {
        this.amount += amount;
        this.total = this.price * this.amount;
    }
    
    public void decreamentAmount() {
        this.amount--;
        this.total = this.price * this.amount;
    }
    
    public int getAmount() {
        return this.amount;
    }
    
    public double getTotal() {
        return this.total;
    }
    
}
