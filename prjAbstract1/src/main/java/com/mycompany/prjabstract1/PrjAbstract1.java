/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjabstract1;

import java.util.Scanner;

/**
 *
 * @author DrxpS
 */
public class PrjAbstract1 {

    public static void main(String[] args) {
        String strProduct ;
        double dblPrice;
        int intQty;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter product name : ");
        strProduct = scan.next();
        
        System.out.print("Enter product price : ");
        dblPrice = scan.nextDouble();
        
        System.out.print("Enter product quantity : ");
        intQty = scan.nextInt();
        
        ProcessOrders po = new ProcessOrders(strProduct, dblPrice, intQty);
        
        System.out.println(po.printReport());
        
    }
}
