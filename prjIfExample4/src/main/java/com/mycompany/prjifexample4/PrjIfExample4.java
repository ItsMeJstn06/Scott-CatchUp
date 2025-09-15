/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjifexample4;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjIfExample4 {

    public static void main(String[] args) {
        final int iMin = 30;
        String sWoodType , sColour , sName ;
        int iChar , iFinal , iLengthPrice ;
        
        sName = JOptionPane.showInputDialog(null,"Enter the Customer Name");
        sWoodType = JOptionPane.showInputDialog(null,"Enter the Wood Type : OAK or PINE");
        sColour = JOptionPane.showInputDialog(null,"Enter the Colour : BLACK , WHITE or GOLD");
        iChar = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of characters"));
        
        iFinal = iMin;
        
         if (sWoodType.toUpperCase().equals("OAK")){
            iFinal = iFinal + 15; 
        }
      
        if (sColour.toUpperCase().equals("GOLD"))
        {
            iFinal = iFinal + 12;
        }

        if (iChar > 6)
        {
            iLengthPrice = (iChar - 6) * 3;
            iFinal = iFinal + iLengthPrice;
        }
        
        JOptionPane.showMessageDialog(null,"Customer Name : " + sName + "\nWood Type : " + sWoodType + "\nText Colour : " + sColour
                                      + "\nNumber of Characters : " + iChar + "\nTotal Price : R" + iFinal);
       
    }
}
