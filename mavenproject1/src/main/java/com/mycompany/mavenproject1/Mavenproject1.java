/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class Mavenproject1 {

    public static void main(String[] args) {
   
        int irows = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows"));
        int middel = irows / 2;

        
        for (int i = 0; i <= middel; i++) {
            for (int j = 0; j < middel - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = middel - 1; i >= 0; i--) {
            for (int j = 0; j < middel - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

       
       
    

