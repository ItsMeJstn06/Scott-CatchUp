/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheretance3;

/**
 *
 * @author DrxpS
 */
public class EmpA extends Person{
    
    
    private double dblSalary;

    public EmpA(int intID, String strName , double dblSalary) {
        super(intID, strName);
        this.dblSalary = dblSalary;
    }

    public double getDblSalary() {
        return dblSalary;
    }
    
    @Override
    public void display()
    {
        System.out.println(getID() + "" + getName() + "" + dblSalary);
    }
    
    /*@Override
     public void dontChangeMe()
    {
        System.out.println("I am a special method that cannot be changed");
    }
    */
    
}
