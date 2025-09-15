/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjexamples3;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjExamples3 {

    public static void main(String[] args) {
        double dblTest1 , dblTest2 , dblAvg;
        
        dblTest1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your mark for Test 1"));
        dblTest2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your mark for Test 2"));
        
        dblAvg = (dblTest1 + dblTest2) / 2;
        
        if (dblAvg >= 60){
            JOptionPane.showMessageDialog(null,"You passed");
        }
        else
        {
           JOptionPane.showMessageDialog(null,"You failed"); 
        }
    }
}
