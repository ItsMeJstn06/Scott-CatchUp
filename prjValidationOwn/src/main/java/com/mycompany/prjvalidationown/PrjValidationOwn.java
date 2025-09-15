/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjvalidationown;

import java.util.Scanner;

/**
 *
 * @author DrxpS
 */
public class PrjValidationOwn {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your name :");
        String sName = scan.nextLine();
        
        System.out.print("Enter your e-mail :");
        String sEmail = scan.nextLine();
        
        System.out.print("Enter your age :");
        int iAge = scan.nextInt();
        
        if (!isNameValid(sName)){
          System.out.print("Name cannot be empty");  
        }
        else if (!isEmailValid(sEmail)){
            System.out.print("Invalid email");
        }
        else if (!isAgeValid(iAge)){
            System.out.print("You must be 18 or older");
        }
        else
        {
            System.out.print("You are successfully signed up for the event");
        }
    }
    
    public static boolean isNameValid(String sName){
        String sTrim = sName.trim();
       
       if (sTrim.isEmpty()){
           return false;
       }
       else
       {
           return true;
       }
    }
    
     public static boolean isEmailValid(String sEmail){
         if (sEmail.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")){
             return true;
         }
         else 
         {
             return false;
         }
     }
     
     public static boolean isAgeValid(int iAge){
         return iAge >= 18;
     }
}
