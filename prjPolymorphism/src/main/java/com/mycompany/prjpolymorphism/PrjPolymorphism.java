/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjpolymorphism;

/**
 *
 * @author DrxpS
 */
public class PrjPolymorphism {

    public static void main(String[] args) {
        Pizza p = new Pizza();
        
        p.Order();
        p.Order("Bacon");
        p.Order("Bacon" , "Avacado");
        p.Order(5);
        
    }
}
