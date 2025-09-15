/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarrays;

/**
 *
 * @author DrxpS
 */
public class PrjArrays {

    public static void main(String[] args) {
        int[] intArray;
        
        intArray = new int[5];
        
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;
        
        int[] intArray2 = new int[5];
        
        int[] intArray3 = {5, 5, 5, 5, 5};
        
        String[] strStudent = new String[20];
        
        String[] strEmployees = {"Joe","Mack", "Molly"};
        
        String[] arrName = new String[5];
        
        arrName[0] = "Justin";
        arrName[1] = "Rian";
        arrName[2] = "Duvan";
        arrName[3] = "Clayton";
        arrName[4] = "Martin";
        
        for (int i = 0 ; i < arrName.length; i++){
            System.out.println("Element at index " + i + " : " + arrName[i]);
        }
        
    }
}
