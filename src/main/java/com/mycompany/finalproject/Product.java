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
public class Product {
    
    String name;
    private double price;
    private ImageIcon icon;
    private int amount;
    private double total;
    
    Product(ImageIcon icon, String name, double price) {
        this.name = name;
        this.icon = icon;
        this.price = price;
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
    
    public double getProductPrice() {
        return this.price;
    }
    
    public String getProductName() {
        return this.name;
    }
    
    public ImageIcon getProductIcon() {
        return this.icon;
    }
    
}
