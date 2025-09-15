/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjabstract;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjAbstract {

    public static void main(String[] args) {
        
        StudentResults SR = new StudentResults();
        
        String strName = JOptionPane.showInputDialog(null, "Enter your name");
        double dblResult = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your Result"));
        
        SR.setName(strName);
        SR.setResults(dblResult);
        
        JOptionPane.showMessageDialog(null,"Name : " + SR.getName() 
                                      + "\nResult : " + SR.getResult() 
                                      + "% \nNew Result : " + SR.getNewResults() 
                                      + "% \nStatus : " + SR.getStatus());
       
    }
}
