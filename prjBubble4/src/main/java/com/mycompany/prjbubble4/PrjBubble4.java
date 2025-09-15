/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjbubble4;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjBubble4 {

    public static void main(String[] args) {
        int[] Nums = {900, 300 , 700};
        
        int Temp;
        
        String strMessage = "Numbers BEFORE bubble Sort\n ~~~~~~~~~~~~~~~~~~~~~\n";
        
        display_numbers(Nums , strMessage);
        
        int Count = Nums.length;
        
        for (int i = 0 ; i < Count - 1 ; i++)
        {
            for (int x = 0 ; x < Count - 1 - i ; x++)
            {
                if (Nums[x] < Nums[x + 1])
                {
                    Temp = Nums[x];
                    Nums[x] = Nums[x + 1];
                    Nums[x + 1] = Temp;
                }
            }
        }
        
        strMessage = "Numbers After Bubble Sort \n ~~~~~~~~~~~~~~~~~~~~\n";
        display_numbers(Nums , strMessage);
    }
    
    private static void display_numbers(int[] Nums , String strMessage)
    {
        for (int j = 0 ; j < Nums.length ; j++)
        {
            strMessage += "Position " + (j + 1) + " : " + Nums[j] + "\n";
        }
        JOptionPane.showMessageDialog(null, strMessage);
    }
}
