/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheretance2;

/**
 *
 * @author DrxpS
 */
public class OvertimeEmployee extends Employee{
    
    private int iOvertimeHours;
    private double dOvertimeRate;

    public OvertimeEmployee(int iOvertimeHours, double dOvertimeRate, String strName, double dblBaseSalary) {
        super(strName, dblBaseSalary);
        this.iOvertimeHours = iOvertimeHours;
        this.dOvertimeRate = dOvertimeRate;
    }

   @Override
   public double calculatePay()
   {
       return super.calculatePay() + (iOvertimeHours * dOvertimeRate);
   }
    
    
}
