/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjbubble3;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjBubble3 {
       static int Size = 5;//Set size
    public static void main(String[] args) {
        
        String[] Names = new String[Size];//Declare array
        
        for (int intIndex = 0; intIndex < Size ; intIndex++)
        {
            Names[intIndex] = JOptionPane.showInputDialog("Enter a name :");
        }
        
        bubbleSort(Names);
        
        
        
        
    }
    
    private static void bubbleSort(String[] names)
    {
        String strTemp = "";
        
        for (int Index = 0; Index < Size ; Index++)
        {
            for (int Index2 = 0 ; Index2 < Size - 1; Index2++)
            {
                if (names[Index2].compareToIgnoreCase(names[Index2 + 1]) > 0)
                {
                    strTemp = names[Index2 + 1];
                    names[Index2 + 1] = names[Index2];
                    names[Index2 ] = strTemp;
                }
                
                
            }
        }
        
        display_Names(names);
    }
    
    private static void display_Names(String[] names)
    {
        String strMessage = "Sorted Array in ASC Order.\n ~~~~~~~~~~~~~~~~~~~\n";
        
        for (int Index = 0; Index < Size ; Index++)
        {
            strMessage += "Position " + (Index + 1) + " : " + names[Index] + "\n"; 
        }
        
        JOptionPane.showMessageDialog(null, strMessage);
    }
}
