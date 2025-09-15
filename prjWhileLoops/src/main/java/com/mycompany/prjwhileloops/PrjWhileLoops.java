/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjwhileloops;

/**
 *
 * @author DrxpS
 */
public class PrjWhileLoops {

    public static void main(String[] args) {
        int iYear ,iEndYear;
        final int STARTYEAR = 2015 , INCREMENT = 5;
        
        iYear = STARTYEAR;
        iEndYear = STARTYEAR + 30;
        
        while (iYear <= iEndYear){
            System.out.println(iYear);
            iYear = iYear + INCREMENT;
        }
    }
}
