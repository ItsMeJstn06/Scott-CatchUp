/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarrays3;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjArrays3 {

    public static void main(String[] args) {
        Students[] arrStudent = new Students[5];
        
        for (int i = 0; i < arrStudent.length ; i++)
        {
            int iID = Integer.parseInt(JOptionPane.showInputDialog(null , "Plaese enter student ID" + (i + 1) + ""));
            
            String sName = (JOptionPane.showInputDialog(null , "Plaese enter student name" + (i + 1) + ""));
            
            double dblMarks = Double.parseDouble(JOptionPane.showInputDialog(null , "Plaese enter student mark" + (i + 1) + ""));
            
            arrStudent[i] = new Students(iID , sName , dblMarks);
        }
        
        for(Students s : arrStudent)
        {
            JOptionPane.showMessageDialog(null , "Student ID : " + s.getID() + " is linked to " + s.getName() + " and their mark is " + s.getMark() + "%");
        }
    }
}
