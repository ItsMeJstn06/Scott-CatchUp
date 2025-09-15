/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheretance;

/**
 *
 * @author DrxpS
 */
public class Student {
    protected String strName;

    public Student(String fName) 
    {
        strName = fName;
    }
    
    public void attendClass()
    {
        System.out.println(strName + " is attending class");
    }
    
    public void submitAssignment()
    {
        System.out.println(strName + " submitted an assignment");
    }

    public String getStrName() {
        return strName;
    }
    
    
    
    
    
}
