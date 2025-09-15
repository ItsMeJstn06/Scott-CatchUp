/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarrayrevision;

/**
 *
 * @author DrxpS
 */
public class PrjArrayRevision {

    public static void main(String[] args) {
        int[] numbers = {12, 7 ,9, 21, 5, 14};
         int Sum = 0;
        
        System.out.println("The numbers in the array are :");
        
        for (int i = 0 ; i < numbers.length ; i++)
        {
            System.out.println("Index : " + i + " : " + numbers[i]);
            
        }
        
        for (int Num : numbers)
        {
            Sum += Num;
        }
        System.out.println("The sum is : " + Sum);
       
    }
}
