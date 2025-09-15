/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjloops1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjLoops1 {

    public static void main(String[] args) {
       int iStudentNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of students"));
       
       double dblResults = 0.0;
       DecimalFormat df = new DecimalFormat("#.00");
       
       int iCount = 0;
       
       while (iCount < iStudentNumber){
           iCount++;
           dblResults += Double.parseDouble(JOptionPane.showInputDialog(null,"Enter results " + (iCount)));
           
       }
       
       JOptionPane.showMessageDialog(null, "Number of students : " + iStudentNumber + "\n Student Avarage : " + df.format(dblResults/iStudentNumber) + "%");
    }
}
