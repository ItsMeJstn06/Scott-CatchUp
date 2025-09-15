/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjarrays3;

/**
 *
 * @author DrxpS
 */
public class Students {
    private int iID;
    private String sName ;
    private double dblMarks;
    
    public Students(int fID , String fName , double fMarks)
    {
        iID = fID;
        sName = fName;
        dblMarks = fMarks;
    }
    
    public String getName()
    {
        return sName;
    }
    public int getID()
    {
        return iID;
    }
    public double getMark()
    {
        return dblMarks;
    }
}
