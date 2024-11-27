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
public abstract class Product {
    
    private final String name;
    private final double price;
    private final ImageIcon icon;
    
    Product(ImageIcon icon, String name, double price) {
        this.name = name;
        this.icon = icon;
        this.price = price;
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
