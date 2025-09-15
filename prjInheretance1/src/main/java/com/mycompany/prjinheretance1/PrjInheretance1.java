/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheretance1;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjInheretance1 {

    public static void main(String[] args) {
        
        
        String strEvent = JOptionPane.showInputDialog("Enter your event");
        
        Sports sport = new Sports(strEvent);
        
        JOptionPane.showMessageDialog(null, "Your event is " + strEvent + " and costs R" + sport.getFee());
    }
    
}
