/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheretance;

/**
 *
 * @author DrxpS
 */
public class ArtStudents extends Student{

    public ArtStudents(String fName) {
        super(fName);
    }
    
    public void paint()
    {
        System.out.println(strName + " is painting a landscape");
    }
    
}
