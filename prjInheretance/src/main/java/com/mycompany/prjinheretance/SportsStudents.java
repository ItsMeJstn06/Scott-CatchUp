/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheretance;

/**
 *
 * @author DrxpS
 */
public class SportsStudents extends Student{

    public SportsStudents(String fName) {
        super(fName);
    }
    
    public void playSport()
    {
        System.out.println(strName + " is playing soccer for the school team");
    }
    
}
