/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjbubble1;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjBubble1 {

    public static void main(String[] args) {
        final int Size = 10;
        int[] array = new int[Size];
        int Index = 0;
        int Index2 = 0;
        int Temp;
        String strDisplay = "";
        
        for (Index = 0; Index < Size ; Index++)
        {
            array[Index]= Integer.parseInt(JOptionPane.showInputDialog("Please enter the number for position " + Index));
        }
        
       
        
        for (Index2 = 0;Index2 < Size - 1;Index2++)
        {
           Index = 0; 
            for(Index = 0 ; Index < Size - 1;Index++)
            {
                if (array[Index] < array[Index + 1])
                {
                    Temp = array[Index + 1];
                    array[Index + 1] = array[Index];
                    array[Index] = Temp;
                }
                
            }
            
        }
       for(Index = 0 ; Index < Size - 1;Index++)
       {
           strDisplay += array[Index] + "\n";
       }
       
       JOptionPane.showMessageDialog(null, strDisplay);
    }
}
