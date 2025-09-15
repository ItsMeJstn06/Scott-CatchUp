/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prj2d3;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class Prj2D3 {
    private static String[][] products = new String[5][2];
    
    public static void main(String[] args) {
        
        loadArray();
        searchArray();
    }
    
    private static void loadArray()
    {
        products[0][0] = "X500";
        products[0][1] = "5000";
        products[1][0] = "C500";
        products[1][1] = "3000";
        products[2][0] = "K990";
        products[2][1] = "8000";
        products[3][0] = "L120";
        products[3][1] = "2000";
        products[4][0] = "M789";
        products[4][1] = "9000";
    }
    
    private static void searchArray()
    {
        String Product = JOptionPane.showInputDialog(null,"Enter the product ID to search");
        
        boolean Found = false;
        
        for (int i = 0 ; i < 5 ; i++)
        {
            for (int x = 0; x < 1 ; x++)
            {
                if (Product.toLowerCase().equals(products[i][x].toLowerCase()))
                {
                    int Quantity = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Quantity for " + Product));
                    
                    JOptionPane.showMessageDialog(null, "Product ID :  " + Product.toUpperCase() + "\nProduct Cost : R" + Double.parseDouble(products[i][1]) * Quantity);
                    Found = true;
                    break;
                }
            }
        }
        
        if (!Found)
        {
             JOptionPane.showMessageDialog(null,"No such product on this list"); 
        }
    }
}
