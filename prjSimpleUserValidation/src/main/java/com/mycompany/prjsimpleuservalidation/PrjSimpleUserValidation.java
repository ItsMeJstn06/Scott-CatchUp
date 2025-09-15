/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjsimpleuservalidation;

import java.util.Scanner;

/**
 *
 * @author DrxpS
 */
public class PrjSimpleUserValidation {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        
        System.out.print("Enter your name : ");
        String sUser = Scan.nextLine();
        
        System.out.print("Enter your Age : ");
        int iAge = Scan.nextInt();
        
        if (!isNameValid(sUser)){
            System.out.println("Name cannot be empty");
        }
        else if (!isAgeValid(iAge)){
            System.out.println("Age must be between 13 and 120");
        }
        else
        {
            System.out.println("Welcome : " + sUser + "! you are " + iAge + " years old");
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
   
   public static boolean isAgeValid(int iAge){
       return iAge > 12 && iAge < 121;
   }
}
