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
public class AddToCartDialog extends java.awt.Dialog {

    /**
     * Creates new form AddToCartDialog
     */
    
    ArrayList<Top> cart;
    Product product;
    Main parent;
    
    public AddToCartDialog(java.awt.Frame parent, boolean modal, Product product, ArrayList<Top> cart) {
        super(parent, modal);
        initComponents();
        this.parent = (Main) parent;
        this.setTitle(product.getProductName());
        setLocationRelativeTo(null);
        shirtIcon.setIcon(product.getProductIcon());
        shirtname.setText(product.getProductName());
        price.setText(String.format(
                "Price: %.2f Pesos", 
                product.getProductPrice()));
        this.cart = cart;
        this.product = product;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shirtIcon = new javax.swing.JLabel();
        small = new javax.swing.JRadioButton();
        medium = new javax.swing.JRadioButton();
        large = new javax.swing.JRadioButton();
        addbtn = new javax.swing.JButton();
        amount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        xlarge = new javax.swing.JRadioButton();
        xsmall = new javax.swing.JRadioButton();
        xxxlarge = new javax.swing.JRadioButton();
        price = new javax.swing.JLabel();
        shirtname = new javax.swing.JLabel();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        shirtIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8ballback.png"))); // NOI18N
        shirtIcon.setToolTipText("");

        small.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        small.setText("Small");
        small.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallActionPerformed(evt);
            }
        });

        medium.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medium.setText("Medium");
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });

        large.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        large.setText("Large");
        large.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeActionPerformed(evt);
            }
        });

        addbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addbtn.setText("Add to cart");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        amount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Amount:");

        xlarge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xlarge.setText("X-Large");
        xlarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xlargeActionPerformed(evt);
            }
        });

        xsmall.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xsmall.setText("X-Small");
        xsmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xsmallActionPerformed(evt);
            }
        });

        xxxlarge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xxxlarge.setText("XXX-Large");
        xxxlarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xxxlargeActionPerformed(evt);
            }
        });

        price.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        price.setText("price");

        shirtname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        shirtname.setText("shirtname");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(shirtIcon))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shirtname, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addbtn)
                    .addComponent(medium)
                    .addComponent(large)
                    .addComponent(xlarge)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(xxxlarge)
                    .addComponent(small)
                    .addComponent(xsmall))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(xsmall)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(small)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medium)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(large)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xlarge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xxxlarge))
                    .addComponent(shirtIcon))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(addbtn)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(shirtname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(price)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        xsmall.setSelected(false);
        small.setSelected(false);
        medium.setSelected(false);
        large.setSelected(false);
        xlarge.setSelected(false);
        xxxlarge.setSelected(false);
    }
    
    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed

    }//GEN-LAST:event_amountActionPerformed

    private void smallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallActionPerformed
        
        
        deselectAll();
        small.setSelected(true);
        
    }//GEN-LAST:event_smallActionPerformed

    private void xsmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xsmallActionPerformed
        
        deselectAll();
        xsmall.setSelected(true);
        
    }//GEN-LAST:event_xsmallActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        int intAmount;
        
        try {
            intAmount = Integer.parseInt(amount.getText());
        } catch (Exception e) {
            return;
        }
        
        String size = null;
        boolean hasSize = false;
        
        if (xsmall.isSelected()) {
            size = "X-Small";
            hasSize = true;
        }
        
        if (small.isSelected()) {
            size = "Small";
            hasSize = true;
        }
        
        if (medium.isSelected()) {
            size = "Medium";
            hasSize = true;
        }
        
        if (large.isSelected()) {
            size = "Large";
            hasSize = true;
        }
        
        if (xlarge.isSelected()) {
            size = "X-Large";
            hasSize = true;
        }
        
        if (xxxlarge.isSelected()) {
            size = "XXX-Large";
            hasSize = true;
        }
        
        if (!hasSize) {
            return;
        }
        
        for (Top orderOnCart: cart) {
            
            if (orderOnCart.getProductName().equals(product.getProductName())
                    && orderOnCart.getSize().equals(size)) {
                
                orderOnCart.addAmount(intAmount);
                
                parent.renderCartPanel();
                setVisible(false);
                dispose();
                return;
            }
            
        }
        
        Top order = new Top(
                product.getProductIcon(), 
                product.getProductName(), 
                product.getProductPrice(),
                intAmount,
                size);
        
        cart.add(order);        
        parent.renderCartPanel();
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_addbtnActionPerformed

    private void mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumActionPerformed
        
        
        deselectAll();
        medium.setSelected(true);
    }//GEN-LAST:event_mediumActionPerformed

    private void largeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeActionPerformed
        
        
        deselectAll();
        large.setSelected(true);
    }//GEN-LAST:event_largeActionPerformed

    private void xlargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xlargeActionPerformed
      
        deselectAll();
        xlarge.setSelected(true);
    }//GEN-LAST:event_xlargeActionPerformed

    private void xxxlargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xxxlargeActionPerformed
       
        deselectAll();
        xxxlarge.setSelected(true);
    }//GEN-LAST:event_xxxlargeActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton large;
    private javax.swing.JRadioButton medium;
    private javax.swing.JLabel price;
    private javax.swing.JLabel shirtIcon;
    private javax.swing.JLabel shirtname;
    private javax.swing.JRadioButton small;
    private javax.swing.JRadioButton xlarge;
    private javax.swing.JRadioButton xsmall;
    private javax.swing.JRadioButton xxxlarge;
    // End of variables declaration//GEN-END:variables
}
