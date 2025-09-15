/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjstudentgrades;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjStudentGrades {

    public static void main(String[] args) {
        String sName = JOptionPane.showInputDialog(null, "Enter the Student name");
        double T1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Test 1 Mark"));
        double T2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Test 2 Mark"));
        double T3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Test 3 Mark"));
        
        Student s = new Student(sName , T1 , T2 , T3);
        
        JOptionPane.showMessageDialog(null, "Name : " + s.getName() + "\nTest 1 : " + s.getTest1() + "%" + "\nTest 2 : " + s.getTest2() + "%" + "\nTest 3 : " + s.getTest3() + "%"
                                      + "\nAvarage : " + s.calculateAvarage() + "%");
        
    }
}
