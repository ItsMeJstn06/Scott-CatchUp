/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinsertionsort;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjInsertionSort {
    final static int Size = 5;
    public static void main(String[] args) {
        int[] Nums = {90, 85, 65, 95, 75};
        int i = 0;
        int x = 0;
        int Temp = 0;
        String strMessage = "Unsorted Numbers\n~~~~~~~~~~~~~~\n";
        
        for (int j = 0 ; j < Nums.length ; j++)
        {
             strMessage += "Position " + (j + 1) + " : " + Nums[j] + "\n";
        }
        JOptionPane.showMessageDialog(null, strMessage);
        

        i = 1;
        while (i < Size) {
            Temp = Nums[i];
            x = i - 1;

            while ((x >= 0) && (Nums[x] > Temp)) {
                Nums[x + 1] = Nums[x];
                x = x - 1;
            }
            Nums[x + 1] = Temp;
            i++;
        }
        
        strMessage = "Sorted Numbers\n~~~~~~~~~~~~~~~\n";
        for (int p = 0 ; p < Nums.length ; p++)
        {
             strMessage += "Position " + (p + 1) + " : " + Nums[p] + "\n";
        }
        JOptionPane.showMessageDialog(null, strMessage);
    }
}
