/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjifexample6;

import java.util.Scanner;

/**
 *
 * @author DrxpS
 */
public class PrjifExample6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please Enter a number for the NATO phonetic alphabet : ");
        int iNumber = scan.nextInt();
        
        ifMethod(iNumber);
        
        switchMethod(iNumber);
    }
    private static void ifMethod(int iNumber){
        System.out.println("Result");
        
        if (iNumber == 1){
            System.out.println("ALPHA");
        }
        else  if (iNumber == 2){
            System.out.println("BRAVO");
        }
        else  if (iNumber == 3){
            System.out.println("CHARLIE");
        }
    }
    private static void switchMethod(int iNumber){
        System.out.println("Result");
        
        switch (iNumber) {
            case 1:
                System.out.println("ALPHA");
                break;
            case 2:
                System.out.println("BRAVO");
                break;
            case 3:
                System.out.println("CHARLIE");
                break;
            default:
                break;
        }
    }
}
