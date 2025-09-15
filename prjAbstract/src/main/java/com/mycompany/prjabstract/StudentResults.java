/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstract;

/**
 *
 * @author DrxpS
 */
public class StudentResults extends Student{
    
    private String strName;
    private double dblResult;
    
    @Override
      public void setName(String strName)
      {
          this.strName = strName;
      }
    @Override
      public String getName()
      {
          return this.strName;
      }
    @Override
      public void setResults(double dblResult)
      {
          this.dblResult = dblResult;
      }
    @Override
      public double getResult()
      {
          return this.dblResult;
      }
      
      
      public double getNewResults()
      {
          return this.dblResult += this.dblResult * 0.15;
      }
      
      
    
}
