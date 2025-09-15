/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheretance1;

/**
 *
 * @author DrxpS
 */
public class Sports {
    
    final private double dblTennis = 500;
    final private double dblCricket = 350;
    final private double dblGolf = 750;
    final private double dblSoccer = 385;
     private String strSportEvent = "";

    public Sports(String sEvent) 
    {
        strSportEvent = sEvent.toLowerCase();
    }


    public double getFee()
    {
        double dFee = 0.0;
        
        if (strSportEvent.equals("tennis"))
        {
            dFee = dblTennis;
        }
        if (strSportEvent.equals("golf"))
        {
            dFee = dblGolf;
        }
        if (strSportEvent.equals("soccer"))
        {
            dFee = dblSoccer;
        }
        if (strSportEvent.equals("cricket"))
        {
            dFee = dblCricket;
        }
        return dFee;
    }
    
     
     
    
}
