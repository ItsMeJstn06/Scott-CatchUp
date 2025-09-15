/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjstringmanipulation1;

import java.util.Scanner;

/**
 *
 * @author DrxpS
 */
public class PrjStringManipulation1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         System.out.println("Enter your name");
         String sName = scan.nextLine().trim();
         
         System.out.println("Enter your surname");
         String sSurname = scan.nextLine().trim();
         
         if (sName.length() < 2 && sSurname.length() < 2 )
         {
             System.out.println("Name and surname must be more than 2 characters");
         }
         else
         {
             String sFirst = sName.substring(0,2);
             String sLast = sSurname.substring(sSurname.length() - 2);
             
             String sUsername = sFirst + "_" + sLast;
             
             System.out.println(sUsername);
         }
    }
}
