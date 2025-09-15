/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjobjectarraylist;

/**
 *
 * @author DrxpS
 */
public class Pet {
    
    private String strName;
    private int iAge;

    public Pet(String strName, int iAge) {
        this.strName = strName;
        this.iAge = iAge;
    }

    public String getName() 
    {
        return strName;
    }
    
    public String displayPet()
    {
        return strName + " is " + iAge + " years old";
    }
    
    
}
