/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prj2darrays;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class Prj2DArrays {

    public static void main(String[] args) {
        int[][] rents = {{400,450,510},{500,560,630},{625,676,740},{1000,1250,1600}};
        
        int floor , bedroom ;
        
        floor = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your floor number"));
        
        bedroom = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your room number"));
        
        JOptionPane.showMessageDialog(null,"The rent for a " + bedroom + " bedroom apartment on floor " + floor + " is R" + rents[floor][bedroom]);
        
        
    }
}
