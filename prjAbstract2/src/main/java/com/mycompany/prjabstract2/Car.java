/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstract2;

/**
 *
 * @author DrxpS
 */
public abstract class Car {
 protected double price;

    public Car(String carChoice) {
        if (carChoice.equalsIgnoreCase("Car1")) 
        {
            price = 200000.0;
        } 
        else if (carChoice.equalsIgnoreCase("Car2")) 
        {
            price = 250000.0;
        } 
        else if (carChoice.equalsIgnoreCase("Car3")) 
        {
            price = 300000.0;
        } 
        else 
        {
            price = 0.0;
        }
    }

    public abstract double getPrice();
}

