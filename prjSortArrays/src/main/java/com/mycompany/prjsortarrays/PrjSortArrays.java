/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjsortarrays;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjSortArrays {

    public static void main(String[] args) {
        int Size = 10;
        int[] array = new int[Size];
        int Index = 0;
        int Temp;
        
        while (Index < Size)
        {
            
          array[Index] = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
          Index++;
          
        }
        
        
        int Index2 = 0;
        
        while (Index2 < Size - 1)
        {
           Index = 0; 
            while(Index < Size - 1)
            {
                if (array[Index] > array[Index + 1])
                {
                    Temp = array[Index + 1];
                    array[Index + 1] = array[Index];
                    array[Index] = Temp;
                }
                Index++;
            }
            Index2++;
        }
        
        Index = Size - 1;
        String sTemp = "";
        
        while (Index >= 0)
        {
            sTemp += array[Index] + " ";
            Index--;
        }
        JOptionPane.showMessageDialog(null, sTemp);
        
    }
}
