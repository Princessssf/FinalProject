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
    
    Top(ImageIcon icon, String name, double price, int amount, String size) {
        super(icon, name, price);
    }
    
    public String getSize() {
        return this.size;
    }
    
}
