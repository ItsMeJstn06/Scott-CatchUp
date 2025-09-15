/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjifexample;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjIfExample {

    public static void main(String[] args) {
        String sID = "";
        int iNumSold = 0;
        final int iHigh = 25;
        
        sID = JOptionPane.showInputDialog(null, "Enter employee ID");
        iNumSold = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter amount of policies sold"));
        
        if (iNumSold > iHigh) {
            JOptionPane.showMessageDialog(null,"Employee : " + sID + " is a high performer");
        }
        
        
        
    }
}
