/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinterface2;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjInterface2 {

    public static void main(String[] args) {
        
        
        String strName = JOptionPane.showInputDialog(null,"Enter your name");
        
        String strCourse = JOptionPane.showInputDialog(null,"Enter your Course Name");
        
        double dblFee = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the monthly fee for your course"));

        
        StudentFess sf = new StudentFess(dblFee, strName, strCourse);
        
        int Choice = Integer.parseInt(JOptionPane.showInputDialog(null , "Enter 1) Part Time or 2) for Full Time student"));
        
         
        
        JOptionPane.showMessageDialog(null, "Student Name : " + sf.getName() + "\nCourse : " + sf.getCourse() 
                                      + "\nCourse Price : R" + sf.Status(Choice));
        
    }
}
