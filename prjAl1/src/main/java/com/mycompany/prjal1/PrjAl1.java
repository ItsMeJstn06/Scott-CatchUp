/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjal1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjAl1 {

    private static ArrayList<Double> Sales = new ArrayList<>();
    private static int Amount = 0;
    
    public static void main(String[] args) {
        
        loadSales();
        printSales();
    }
    
    private static void loadSales()
    {
        boolean bCorrect = false;
        
        while (!bCorrect)
        {
            try 
            {
                String sAmount = JOptionPane.showInputDialog(null , "Enter amount of sales");
                        
                     if (sAmount == null)
                     {
                         JOptionPane.showMessageDialog(null, "Goodbye");
                         System.exit(0);
                     }
                     
                     Amount = Integer.parseInt(sAmount);
                     
                     for (int i = 0 ; i < Amount ; i++)
                     {
                         Sales.add(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter sale " + (i + 1) + " ")));
                     }
                     bCorrect = true;
              
            }
            catch(NumberFormatException nex){
                JOptionPane.showMessageDialog(null, "only numbers");
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "The following error occured :" + ex.toString());
            }
        }
    }
    
    private static void printSales()
    {
        try 
        {
            double dTotal = 0.0;
            
            for (int i = 0 ; i < Amount ; i++)
            {
                dTotal += Sales.get(i);
            }
            JOptionPane.showMessageDialog(null, "Total : " + dTotal + "\nAverage : " + (dTotal/Amount));
            
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, "The following error occured : " + ex.toString());
        }
    }
}
