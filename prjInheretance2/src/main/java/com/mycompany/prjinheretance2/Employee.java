/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheretance2;

/**
 *
 * @author DrxpS
 */
public class Employee {
    
    private String strName;
    private double dblBaseSalary;

    public Employee(String strName, double dblBaseSalary) {
        this.strName = strName;
        this.dblBaseSalary = dblBaseSalary;
    }

    public String getStrName() {
        return strName;
    }

    public double calculatePay() {
        return dblBaseSalary;
    }
    
    
    
}
