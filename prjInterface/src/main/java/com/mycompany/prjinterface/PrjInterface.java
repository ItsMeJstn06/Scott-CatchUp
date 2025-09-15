/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinterface;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjInterface {

    public static void main(String[] args) {
        double dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the price"));
        
        int iAmount = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of orders"));
        
        ProcessOrder po = new ProcessOrder();
        
        po.setAmount(iAmount);
        
        po.setPrice(dblPrice);
        
        JOptionPane.showMessageDialog(null, "Total : R" + po.getTotal());
    }
}
