/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjifexample2;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjIfExample2 {

    public static void main(String[] args) {
        String sName , sTown ;
        
        sName = JOptionPane.showInputDialog(null,"Enter your name");
        sTown = JOptionPane.showInputDialog(null,"Enter your Town name");
      
        if (sTown.toLowerCase().equals("woodstock") || (sTown.toLowerCase().equals("wonderlake")){
             JOptionPane.showMessageDialog(null,"You can carpool");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"You cannot carpool");
        }
        
       /* if (sTown.toLowerCase().equals("woodstock")){
            JOptionPane.showMessageDialog(null,"You can carpool" );
        }
        else if (sTown.toLowerCase().equals("wonderlake"))
        {
            JOptionPane.showMessageDialog(null,"You can carpool" );
        }
        else
        {
             JOptionPane.showMessageDialog(null,"You cannot carpool" );
        }    *\         
    }
}
