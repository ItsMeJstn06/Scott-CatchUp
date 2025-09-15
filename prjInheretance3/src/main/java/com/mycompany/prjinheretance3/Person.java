/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheretance3;

/**
 *
 * @author DrxpS
 */
public class Person {
    private int intID;
    private String strName;

    public Person(int intID, String strName) 
    {
        this.intID = intID;
        this.strName = strName;
    }

    public int getID() 
    {
        return intID;
    }

    public String getName() 
    {
        return strName;
    }
    
    public void display()
    {
        System.out.println(intID + "" + strName);
    }
    
    public final void dontChangeMe()
    {
        System.out.println("I am a special method that cannot be changed");
    }
    
    
}
