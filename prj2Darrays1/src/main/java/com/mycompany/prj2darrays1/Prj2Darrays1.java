/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prj2darrays1;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class Prj2Darrays1 {

    public static void main(String[] args) {
        populatetemp();
    }
    
    private static void populatetemp()
    {
        String[][] temps = {{"Cape Town" , "35" , "8"},{"Johannesburg" , "37" , "5"},{"Pretoria" , "37" , "6"}
                          ,{"Bloemfontein" , "38" , "3"},{"Port Elizabeth" , "33" , "10"},{"Durban" , "35" , "12"}};
        printTemp(temps);
    }
    
    private static void printTemp(String[][] temps)
    {
        String Display = "Weather Tempratures\n~~~~~~~~~~~~~~~~~~~~\n";
        
        for (int i = 0; i < temps.length ; i++)
        {
            Display += temps[i][0] + "\nHighest : " + temps[i][1] + "\nLowest : " + temps[i][2] + "\n\n";
        }
        
        JOptionPane.showMessageDialog(null, Display);
    }
}
