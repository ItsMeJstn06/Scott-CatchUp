/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjloops3;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjLoops3 {

    public static void main(String[] args) {
       
        boolean bCorrectNumber = true;
        
        while (bCorrectNumber){
            String strDisplay = "";
            int iNum = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number between 1 and 12"));
            
            if (iNum > 12 || iNum < 1){
                JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 12 only!");
            }
            else
            {
                int iCount = 1;
                while (iCount <= 12){
                    strDisplay += iCount + " x " + iNum + " = " + (iCount * iNum) + "\n";
                    iCount++;
                }
                JOptionPane.showMessageDialog(null, strDisplay);
                
                int iChoice = JOptionPane.showConfirmDialog(null,"Would you like to continue", "Continue?" ,JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
                
                if (iChoice == JOptionPane.NO_OPTION){
                   bCorrectNumber = false; 
                }
                
            }
        }
    }
}
