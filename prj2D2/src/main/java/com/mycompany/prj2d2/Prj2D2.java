/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prj2d2;

import java.util.Scanner;

/**
 *
 * @author DrxpS
 */
public class Prj2D2 {

    public static void main(String[] args) {
        int[][] prodDetails = new int[4][3];
        
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 4 ; i ++)
        {
            System.out.print("Enter Product Code : ");
            prodDetails[i][0] = scan.nextInt();
            
            System.out.print("Enter Product Price : ");
            prodDetails[i][1] = scan.nextInt();
            
            System.out.print("Enter Product Quantity : ");
            prodDetails[i][2] = scan.nextInt();
        }
        int Total = 0;
        
        for (int j = 0 ; j < 4 ; j++)
        {
            Total += prodDetails[j][1] * prodDetails[j][2];
        }
        
        System.out.println("Total stock of cost on hand is R" + Total);
    }
}
