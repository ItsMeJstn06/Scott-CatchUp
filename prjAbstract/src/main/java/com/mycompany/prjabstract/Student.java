/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstract;

/**
 *
 * @author DrxpS
 */
public abstract class Student {
    
    public abstract void setName(String strName);
    public abstract String getName();
    
    public abstract void setResults(double dblResult);
    public abstract double getResult();
    
    public String getStatus()
    {
        return "This method ran inside the Student class";
    }
    
    
}
