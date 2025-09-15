/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjpolymorphism;

/**
 *
 * @author DrxpS
 */
public class Pizza {
    
    public void Order(String ToppingA)
    {
        System.out.println("Topping on the pizza is " + ToppingA);
    }
    
    public void Order(String ToppingA , String ToppingB)
    {
        System.out.println("Topping on the pizza is " + ToppingA + " and " + ToppingB);
    }
    
    public void Order()
    {
         System.out.println("Plain Pizza");
    }
    
    public void Order(int qty)
    {
         System.out.println(qty + " Plain Pizzas");
    }
}
