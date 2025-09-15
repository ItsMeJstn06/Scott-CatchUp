/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjabstract2;

import java.util.Scanner;

/**
 *
 * @author DrxpS
 */
public class PrjAbstract2 {

   
    public static void main(String[] args) 
    {
       Scanner scan = new Scanner(System.in);
       
        System.out.println("Choose a car (Car1, Car2, or Car3): ");
        String strChoice = scan.next();
        
        CarPurchase car = new CarPurchase(strChoice);
        
        System.out.println("The price of the selected car is: R" + car.getPrice());
        
        scan.close();
    }
}

