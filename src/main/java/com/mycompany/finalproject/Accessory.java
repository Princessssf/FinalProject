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
    
    Accessory(ImageIcon icon, String name, double price) {
        super(icon, name, price);
    }
    
    Accessory(ImageIcon icon, String name, double price, String color) {
        super(icon, name, price);
        super.name = super.name + "-" + color;
    }
    
}
