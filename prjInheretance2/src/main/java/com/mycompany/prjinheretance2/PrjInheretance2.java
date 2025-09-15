/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheretance2;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjInheretance2 {

    public static void main(String[] args) {
        String strType = JOptionPane.showInputDialog(null,"Enter Employee type : \n1 - Normal Emplyee \n2 - Overtime Employee");
        
        String sName = JOptionPane.showInputDialog(null,"Enter Employee Name");
        
        double dblBaseSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Base salary"));
        
        Employee emp;
        
        if (strType.equals("2"))
        {
            int iHours = Integer.parseInt(JOptionPane.showInputDialog(null , "Enter Overtime hours"));
            double dRate = Double.parseDouble(JOptionPane.showInputDialog(null , "Enter Overtime rate"));
            
            
            emp = new OvertimeEmployee(iHours , dRate , sName, dblBaseSalary  );
        }
        else
        {
            emp = new Employee(sName, dblBaseSalary);
        }
        
        JOptionPane.showMessageDialog(null, "Name : " + sName + "\nBase Salary : R" + dblBaseSalary + "\nOvertime Pay : R" + (emp.calculatePay() - dblBaseSalary)
                                       + "\nTotal Pay : R" + emp.calculatePay());
    }
}
