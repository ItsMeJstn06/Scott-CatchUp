/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarrays2;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjArrays2 {
        static String[] arrProducts = new String[5];
        static int[] arrQuantities = new int[5];
    public static void main(String[] args) {
       
       getProductsFromUser();
       getQuantitiesFromUser();
       
       displayProductsAndQuantities();
       displayTotalQuantity();
       searchProducts();
       
        
    }
    
    public static void getProductsFromUser()
    {
        for (int i = 0 ; i < 5 ; i++)
        {
             arrProducts[i] = JOptionPane.showInputDialog("Products : " + (i + 1) + ":");
        }
    }
    public static void getQuantitiesFromUser()
    {
        for (int i = 0 ; i < 5 ; i++)
        {
            arrQuantities[i] = Integer.parseInt(JOptionPane.showInputDialog("Quantity : " + (i + 1) + ":"));
        }
    }
    public static void displayProductsAndQuantities()
    {
       StringBuilder sb = new StringBuilder("Products and their quantities : \n");
        for (int i = 0 ; i < 5 ; i++)
        {
            sb.append(arrProducts[i]).append(": ").append(arrQuantities[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    public static void displayTotalQuantity()
    {
        int iTotal = 0;
        for (int i : arrQuantities)
        {
            iTotal += i;
        }
        JOptionPane.showMessageDialog(null, "The total quantity of all the products is : " + iTotal);
    }
    public static void searchProducts()
    {
        String sSearch = JOptionPane.showInputDialog("Enter product name you wish to search");
      
        for (int i = 0 ; i < arrProducts.length ; i++)
        {
            if (sSearch.equals(arrProducts[i]))
            {
                JOptionPane.showMessageDialog(null, "Product found : " + arrProducts[i] + " at position " + i + "\nQuantity : " + arrQuantities[i]);
               
                break;
            }
        }
        
            JOptionPane.showMessageDialog(null, "Product not found");
       
        
    }
}
