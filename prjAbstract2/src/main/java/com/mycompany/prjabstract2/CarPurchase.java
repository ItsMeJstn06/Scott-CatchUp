/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstract2;

/**
 *
 * @author DrxpS
 */
class CarPurchase extends Car {
    public CarPurchase(String carChoice) 
    {
        super(carChoice);
    }

    @Override
    public double getPrice() 
    {
        return price;
    }
}
