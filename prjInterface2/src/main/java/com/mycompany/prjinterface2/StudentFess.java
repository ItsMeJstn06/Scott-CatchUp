/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinterface2;

/**
 *
 * @author DrxpS
 */
public class StudentFess implements Student , StudentDetails{
    private String Name , CourseName ;
    private double Fees;
    

    public StudentFess(double Fees ,String Name, String CourseName) 
    {
        this.Fees = Fees;
        this.Name = Name;
        this.CourseName = CourseName;  
    }
    
    @Override
    public double Status(int iStatus)
    {
        if (iStatus == 1)
        {
            return Fees * 6;
        }
        return Fees * 12;
    }
  
    @Override
    public String getName()
    {
        return Name;
    }
    @Override
    public String getCourse()
    {
        return CourseName;
    }
}
