/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjstringmanipulation;

import java.util.Scanner;

/**
 *
 * @author DrxpS
 */
public class PrjStringManipulation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a sentence");
        String sSentence = scan.nextLine().toLowerCase();
        
        int iNCount = 0 , iVCount = 0;
        
        for (int iCount = 0 ; iCount < sSentence.length() ; iCount++)
        {
            if (sSentence.substring(iCount , iCount + 1).equals("a")||
                     sSentence.substring(iCount , iCount + 1).equals("e")||
                     sSentence.substring(iCount , iCount + 1).equals("u")||
                     sSentence.substring(iCount , iCount + 1).equals("o")||
                     sSentence.substring(iCount , iCount + 1).equals("i"))
             {
                iVCount += 1;
             }
            else
            {
                iNCount += 1;
            }
        }
        
        System.out.println("Characters : " +  sSentence.length());
        System.out.println("Vowels : " +  iVCount);
        System.out.println("Non Vowels : " +  iNCount);
    }
}
