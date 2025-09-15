/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prj2dact;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class Prj2DAct {
    
     private static String[][] students = {
                            {"ST10470255" , "Justin" , "78"},
                            {"ST10487112" , "Clayton" , "59"},
                            {"ST10469872" , "Scott" , "98"}};

    public static void main(String[] args) {
        
        int Choice = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for all details , 2 for individual details"));
        
        if (Choice == 1)
        {
            printAll();
        }else
        {
            printIndividual();
        }
        
    }
    
    private static void printAll()
    {
        String all = "All Details\n~~~~~~~~~~~\n";
        double avg = 0;
        
        for (int i = 0 ; i < 3 ; i ++)
        {
            for (int x = 0 ; x < 3 ; x++)
            {
                all += students[i][x] + "\n";
            }
            
            avg += Double.parseDouble(students[i][2]);
        }
        
        JOptionPane.showMessageDialog(null, all + "\n" + (avg/3));
    }
    
    private static void printIndividual()
    {
        String ID = JOptionPane.showInputDialog("Enter the StudentID you want to find");
        String Individual = "Individual details\n~~~~~~~~~~~~~~~~~~\n";
        boolean Found = false;
        int count = 0;
        
        while(!Found)
        {
         
            if (ID.toLowerCase().equals(students[count][0].toLowerCase()))
            {
                JOptionPane.showMessageDialog(null, "StudentID : " +  students[count][0] +
                                              "\nStudent Name : " + students[count][1] + 
                                               "\nStudent Mark : " + students[count][2]);
                Found = true;
            }
          
            count++;
        }
        
        if (!Found)
        {
            JOptionPane.showMessageDialog(null, "No such student ID exists");
        }
    }
}
