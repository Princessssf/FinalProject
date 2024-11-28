/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package com.mycompany.finalproject;

import java.util.ArrayList;

/**
 *
 * @author YTAC
 */
public class AddToCartDialogForAccessories extends java.awt.Dialog {

    /**
     * Creates new form AddToCartDialogForAccessories
     */
    
    Product product;
    ArrayList<Accessory> cart;
    boolean isDLTE = false;
    Main parent;
    
    public AddToCartDialogForAccessories(java.awt.Frame parent, boolean modal, Product product, ArrayList<Accessory> cart) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.parent = (Main) parent;
        setTitle(product.getProductName());
        icon.setIcon(product.getProductIcon());
        icon.repaint();
        icon.revalidate();
        name.setText(product.getProductName());
        price.setText(String.format(
                "Price: %.2f Pesos",
                product.getProductPrice()
        ));
        this.cart = cart;
        this.product = product;
        if (product.getProductName().equals("HYPERPLAYER DONT LET THE ENEMY")) {
            isDLTE = true;
            silver.setEnabled(true);
            black.setEnabled(true);
            yellow.setEnabled(true);
            red.setEnabled(true);
            brown.setEnabled(true);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        silver = new javax.swing.JRadioButton();
        red = new javax.swing.JRadioButton();
        black = new javax.swing.JRadioButton();
        yellow = new javax.swing.JRadioButton();
        brown = new javax.swing.JRadioButton();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FOB.png"))); // NOI18N

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("AccessoryName");

        price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        price.setForeground(new java.awt.Color(0, 0, 0));
        price.setText("Price");

        name2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name2.setForeground(new java.awt.Color(0, 0, 0));
        name2.setText("AMOUNT:");

        add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add.setText("Add to cart");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        silver.setForeground(new java.awt.Color(0, 0, 0));
        silver.setText("Silver");
        silver.setEnabled(false);
        silver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silverActionPerformed(evt);
            }
        });

        red.setForeground(new java.awt.Color(0, 0, 0));
        red.setText("Red");
        red.setEnabled(false);
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });

        black.setForeground(new java.awt.Color(0, 0, 0));
        black.setText("Black");
        black.setEnabled(false);
        black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackActionPerformed(evt);
            }
        });

        yellow.setForeground(new java.awt.Color(0, 0, 0));
        yellow.setText("Yellow");
        yellow.setEnabled(false);
        yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowActionPerformed(evt);
            }
        });

        brown.setForeground(new java.awt.Color(0, 0, 0));
        brown.setText("Brown");
        brown.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(icon)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(add)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amount)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(red)
                                            .addComponent(silver)
                                            .addComponent(black))
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(yellow)
                                            .addComponent(brown)))
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 31, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name)
                        .addGap(18, 18, 18)
                        .addComponent(price)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(silver)
                            .addComponent(yellow))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(red)
                            .addComponent(brown))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(black)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icon)
                        .addGap(20, 20, 20)))
                .addComponent(add)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    private void deselectAll() {
        red.setSelected(false);
        brown.setSelected(false);
        black.setSelected(false);
        yellow.setSelected(false);
        silver.setSelected(false);
    }
    
    private void silverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silverActionPerformed
        
        deselectAll();
        silver.setSelected(true);
    }//GEN-LAST:event_silverActionPerformed

    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed
        
        deselectAll();
        red.setSelected(true);
    }//GEN-LAST:event_redActionPerformed

    private void blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackActionPerformed
       
        deselectAll();
        black.setSelected(true);
    }//GEN-LAST:event_blackActionPerformed

    private void yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowActionPerformed
        
        deselectAll();
        yellow.setSelected(true);
    }//GEN-LAST:event_yellowActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        int intAmount;
        String color = "";
        
        try {
            intAmount = Integer.parseInt(amount.getText());
        } catch (Exception e) {
            return;
        }
        
        if (isDLTE && !red.isSelected() 
                && !yellow.isSelected() && !black.isSelected()
                && !brown.isSelected() && !silver.isSelected()) {
            return;
        }
        
        if (red.isSelected()) 
            color = " - RED";
        
        if (yellow.isSelected()) 
            color = " - YELLOW";
        
        if (black.isSelected()) 
            color = " - BLACK";
        
        if (brown.isSelected()) 
            color = " - BROWN";
        
        if (silver.isSelected())
            color = " - SILVER";
        
        for (Accessory acc: cart) {
            
            if (acc.getProductName().equals(product.getProductName())) {
                acc.addAmount(intAmount);
                parent.renderCartPanel();
                return;
            }
            
        }
        
        Accessory accessory = new Accessory(
                product.getProductIcon(), 
                product.getProductName(), 
                product.getProductPrice(),
                intAmount);
        accessory.setColor(color);
        
        cart.add(accessory);
        parent.renderCartPanel();
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_addActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField amount;
    private javax.swing.JRadioButton black;
    private javax.swing.JRadioButton brown;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel price;
    private javax.swing.JRadioButton red;
    private javax.swing.JRadioButton silver;
    private javax.swing.JRadioButton yellow;
    // End of variables declaration//GEN-END:variables
}
