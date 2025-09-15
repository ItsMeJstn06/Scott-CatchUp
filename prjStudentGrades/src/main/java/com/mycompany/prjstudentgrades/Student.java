/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjstudentgrades;

/**
 *
 * @author DrxpS
 */
public class Student {
    private String sStudentName ;
    private double Test1 , Test2 , Test3;
    
    public Student(String sName , double T1 , double T2 , double T3){
       sStudentName = sName;
       Test1 = T1;
       Test2 = T2;
       Test3 = T3;
       
    }
    
    public String getName(){
        return sStudentName;
    }  
    public double getTest1(){
       return Test1; 
    }
    public double getTest2(){
       return Test2; 
    }
    public double getTest3(){
       return Test3; 
    }
    public double calculateAvarage(){
       return ((Test1 + Test2 + Test3) / 3); 
    }

    public String studentSummary(){
        return "Name : " sStudentName + "\nAvarage : " + calculateAvarage();
    }
    
    public boolean hasPassed(){
        return ((Test1 + Test2 + Test3)/3 ) >= 50;
    }
    
}
